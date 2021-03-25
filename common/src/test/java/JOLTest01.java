import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.openjdk.jol.info.ClassLayout;

/**
 * @author huang hao
 * @version 1.0
 * @date 2021/3/24 11:39
 */
public class JOLTest01 {
    @Data
    @Setter
    @Getter
    public static class A {
        //private B b;
        //private String name;
        //private short age;
    }
    @Data
    @Setter
    @Getter
    public static class B {
        private String name;
        private String sex;
    }
    public static void main(String[] args) {
        long start = System.nanoTime();

        A a = new A();
        B b = new B();
        b.setName("呼宝翼");
        b.setSex("男");
        //a.setB(b);
        //a.setName("张三");
        //a.setAge((short) 1);

        synchronized (a){
            System.out.println(ClassLayout.parseInstance(a).toPrintable());
        }

        System.out.println(System.nanoTime() - start);
    }
}
