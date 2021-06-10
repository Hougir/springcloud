package com.sx.stream;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.time.StopWatch;
import org.junit.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Copy;
import org.openjdk.jol.info.ClassLayout;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

/**
 * @author huang hao
 * @version 1.0
 * @date 2021/4/29 20:37
 */
@Slf4j
public class StreamTest {
    /**
     * 有如下7个元素黄药师，冯蘅，郭靖，黄蓉，郭芙，郭襄，郭破虏，使用Stream将以郭字开头的元素存入新数组
     */
    @Test
    public void t1(){
        String[] strs = {"黄药师","冯蘅","郭靖","黄蓉","郭芙","郭襄","郭破虏"};
        Arrays.stream(strs).filter(s -> s.startsWith("郭")).collect(Collectors.toList()).forEach(System.out::println);
    }

    /**
     * 已知ArrayList集合中有如下元素{陈玄风、梅超风、陆乘风、曲灵风、武眠风、冯默风、罗玉风}，使用Stream
     * 1、取出前2个元素并在控制台打印输出。
     * 2、取出后2个元素并在控制台打印输出。
     */
    @Test
    public void t2(){
        ArrayList<String> strings = new ArrayList<>();
        strings.add("陈玄风");strings.add("梅超风");strings.add("曲灵风");strings.add("武眠风");strings.add("冯默风");strings.add("罗玉风");
        //1
        strings.stream().limit(2).forEach(System.out::println);
        //2
        strings.stream().skip(4).forEach(System.out::println);
    }

    /**
     * 男演员只要名字为3个字的前三人
     * 女演员只要姓林的，并且不要第一个
     * 把过滤后的男演员姓名和女演员姓名合并到一起
     * 把上一步操作后的元素作为构造方法的参数创建演员对象（实例化一个Actor类，此处尝试使用map），遍历数组
     */
    @Test
    public void t3(){
        long start = System.nanoTime();
        //集合存储元素
        List<String> manArray = new CopyOnWriteArrayList<>();
        manArray.add("刘德华");
        manArray.add("成龙");
        manArray.add("吴彦祖");
        manArray.add("周润发");
        manArray.add("周星驰");
        manArray.add("吴京");

        List<String> womanList = new CopyOnWriteArrayList<>();
        womanList.add("林心如");
        womanList.add("孙俪");
        womanList.add("柳岩");
        womanList.add("林青霞");
        womanList.add("林咩咩");
        womanList.add("张曼玉");

        List<String> ms = manArray.parallelStream().filter(a -> a.length() == 3).limit(3).collect(Collectors.toCollection(CopyOnWriteArrayList::new));
        List<String> ws = womanList.parallelStream().filter(w -> w.startsWith("林")).skip(1).collect(Collectors.toCollection(CopyOnWriteArrayList::new));
        ms.addAll(ws);
        ms.parallelStream().map(Actor::new).forEachOrdered(System.out::println);
        long end = System.nanoTime();
        log.info("耗时:{}",(end - start) / 1000000); // 60毫秒
        /**
         * Actor{name='刘德华'}
         * Actor{name='吴彦祖'}
         * Actor{name='周润发'}
         * Actor{name='林青霞'}
         * Actor{name='林咩咩'}
         */

    }
    @Test
    public void t6(){
        long start = System.nanoTime();
        //集合存储元素
        List<String> manArray = new ArrayList<>();
        manArray.add("刘德华");
        manArray.add("成龙");
        manArray.add("吴彦祖");
        manArray.add("周润发");
        manArray.add("周星驰");
        manArray.add("吴京");

        List<String> womanList = new ArrayList<>();
        womanList.add("林心如");
        womanList.add("孙俪");
        womanList.add("柳岩");
        womanList.add("林青霞");
        womanList.add("林咩咩");
        womanList.add("张曼玉");

        List<String> ms = manArray.stream().filter(a -> a.length() == 3).limit(3).collect(Collectors.toList());
        List<String> ws = womanList.stream().filter(w -> w.startsWith("林")).skip(1).collect(Collectors.toList());
        ms.addAll(ws);
        ms.stream().map(Actor::new).forEach(System.out::println);
        long end = System.nanoTime();
        log.info("耗时:{}",(end - start) / 1000000); // 60毫秒
        /**
         * Actor{name='刘德华'}
         * Actor{name='吴彦祖'}
         * Actor{name='周润发'}
         * Actor{name='林青霞'}
         * Actor{name='林咩咩'}
         */

    }
    class Actor{
        private volatile String name;

        public Actor() {
        }

        public Actor(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Actor{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    /**
     * 对给定单词列表 ["Hello","World"],你想返回列表["H","e","l","o","W","r","d"]
     */
    @Test
    public void t4(){
        String[]  words = new String[]{"Hello","World"};
        // 输出 [Ljava.lang.String;@77caeb3e
        //[Ljava.lang.String;@1e88b3c
        //Arrays.stream(words).map(s -> s.split("")).distinct().collect(Collectors.toList()).forEach(System.out::println);
        //输出  HeloWrd
        Arrays.stream(words).map(s->s.split("")).flatMap(Arrays::stream).distinct().forEach(System.out::print);
    }

    @Test
    public void t5(){
        Object[] objects = new Object[9];
        System.out.println(ClassLayout.parseInstance(objects).toPrintable());
    }
    @Test
    public void t9(){
        StopWatch sw = StopWatch.createStarted();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(sw.getTime());
    }
}
