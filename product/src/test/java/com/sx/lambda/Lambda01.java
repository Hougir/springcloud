package com.sx.lambda;

import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;

import javax.validation.constraints.NotNull;
import java.lang.reflect.Array;
import java.time.Instant;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * @author huang hao
 * @version 1.0
 * @date 2021/3/29 9:42
 */
@Slf4j
public class Lambda01 {
    /**
     * 并行计算
     */
    @Test
    public void t1(){
        //Instant start = Instant.now();
        long start = System.nanoTime();
        Long sum = LongStream.rangeClosed(0L, 100_0000_0000L)
                .parallel()
                .sum();
        long end = System.nanoTime();
        log.info("总和: {},耗时: {}",sum,(end  - start) / 1000000);//2608
    }
    /*
	  	1.	给定一个数字列表，如何返回一个由每个数的平方构成的列表呢？
		，给定【1，2，3，4，5】， 应该返回【1，4，9，16，25】。
	 */
    @Test
    public void t2(){
        Integer[] is = {1,2,3,4,5};
        List<Integer> integers = Arrays.asList(is);
        integers.stream().map(x -> x*x).collect(Collectors.toList()).forEach(System.out::print);
    }
    /*
	 2.	怎样用 map 和 reduce 方法数一数流中有多少个Employee呢？
	 */
    @Test
    public void t3(){
        List<Employee> emps = Arrays.asList(
                new Employee(102, "李四", 59, 6666.66, Employee.Status.BUSY),
                new Employee(101, "张三", 18, 9999.99, Employee.Status.FREE),
                new Employee(103, "王五", 28, 3333.33, Employee.Status.VOCATION),
                new Employee(104, "赵六", 8, 7777.77, Employee.Status.BUSY),
                new Employee(104, "赵六", 8, 7777.77, Employee.Status.FREE),
                new Employee(104, "赵六", 8, 7777.77, Employee.Status.FREE),
                new Employee(105, "田七", 38, 5555.55, Employee.Status.BUSY)
        );
        Integer sum = emps.stream().map(s -> 1).reduce(Integer::sum).get();
       log.info("有{}个Employee",sum);
    }

    List<Transaction> transactions = null;

    @Before
    public void before(){
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
    }

    /**
     * 1. 找出2011年发生的所有交易， 并按交易额排序（从低到高）
     */
    @Test
    public void t4(){
        transactions.stream().filter(t -> t.getYear() == 2011).sorted(Comparator.comparingInt(Transaction::getValue)).collect(Collectors.toList()).forEach(System.out::println);
    }
    //2. 交易员都在哪些不同的城市工作过？
    @Test
    public void t5(){
        transactions.stream().map(t ->t.getTrader().getCity()).distinct().collect(Collectors.toList()).forEach(System.out::println);


    }
    //3. 查找所有来自剑桥的交易员，并按姓名排序
    @Test
    public void t6(){
        transactions.stream().filter(t -> t.getTrader().getCity().equalsIgnoreCase("Cambridge"))
                .map(Transaction::getTrader).sorted(Comparator.comparing(Trader::getName)).distinct().forEach(System.out::println);
    }

    //4. 返回所有交易员的姓名字符串，按字母顺序排序
    @Test
    public void t7(){
        //transactions.stream().map(t -> t.getTrader().getName()).sorted().distinct().forEach(System.out::println);
        //System.out.println(transactions.stream().map(t -> t.getTrader().getName()).distinct().sorted().reduce("",String::concat));
        transactions.stream().map(t -> t.getTrader().getName()).flatMap(Lambda01::stringHandle).sorted((s1,s2) -> s1.compareToIgnoreCase(s2)).forEach(System.out::print);
    }
    public static Stream<String> stringHandle(String str){
        List<String> list = new ArrayList<>();

        for (Character ch : str.toCharArray()) {
            list.add(ch.toString());
        }

        return list.stream();
    }
    //5. 有没有交易员是在米兰工作的？
    @Test
    public void t8(){
        boolean cambridge = transactions.stream().anyMatch(s -> s.getTrader().getCity().equalsIgnoreCase("Milan"));
        log.info("有没有交易员是在米兰工作的?:{}",cambridge ? "有!" : "没有!");
    }
    //6. 打印生活在剑桥的交易员的所有交易额
    @Test
    public void  t9(){
        Integer reduce = transactions.stream().filter(s -> s.getTrader().getCity().equalsIgnoreCase("Cambridge")).map(Transaction::getValue).reduce(0, Integer::sum);
        log.info("生活在剑桥的交易员的所有交易额:{}",reduce);
    }
    //7. 所有交易中，最高的交易额是多少
    @Test
    public void t10(){
        Optional<Integer> max = transactions.stream().map(Transaction::getValue).max(Integer::compare);
        log.info("所有交易中，最高的交易额是:{}",max.get());
    }
    //8. 找到交易额最小的交易
    @Test
    public void t11(){
        //Optional<Transaction> min = transactions.stream().sorted(Comparator.comparingInt(Transaction::getValue)).findFirst();
        Optional<Transaction> min = transactions.stream().min(Comparator.comparing(Transaction::getValue));
        log.info("交易额最小的交易 : {}",min.get());
    }

    //Predicate<T> 断言型接口：
    @Test
    public void test4(){
        List<String> list = Arrays.asList("Hello", "atssso", "Lambda", "www", "ok");
        filterStr(list, (s) -> s.contains("o")).forEach(System.out::println);
    }
    //需求：将满足条件的字符串，放入集合中
    public List<String> filterStr(List<String> list, Predicate<String> pre){
        return list.stream().filter(s -> pre.test(s)).collect(Collectors.toList());
    }

    //Function<T, R> 函数型接口：
    @Test
    public void test3(){
        String newStr = strHandler("我大中国", (str) -> str.concat("威武"));
        System.out.println(newStr);

        String subStr = strHandler(newStr, (str) -> str.substring(newStr.length()-2, newStr.length()));
        System.out.println(subStr);
    }

    //需求：用于处理字符串
    public static String strHandler(String str, Function<String, String> fun){
        return fun.apply(str);
    }

    //Supplier<T> 供给型接口 :
    @Test
    public void test2(){
        getNumList(20, () -> (int)(Math.random() * 100)).stream().map(s -> {
            return s + ",";
        }).forEach(System.out::print);
    }

    //需求：产生指定个数的整数，并放入集合中
    public List<Integer> getNumList(Integer num, Supplier<Integer> sup){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            Integer n = sup.get();
            list.add(n);
        }
        return list;
    }

    //Consumer<T> 消费型接口 :
    @Test
    public void test1(){
        happy(10000, (m) -> System.out.println("你们刚哥喜欢大宝剑，每次消费：" + m + "元"));
    }

    public void happy(double money, Consumer<Double> con){
        con.accept(money);
    }
}
