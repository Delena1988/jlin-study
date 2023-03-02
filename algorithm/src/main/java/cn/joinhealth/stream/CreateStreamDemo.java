package cn.joinhealth.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author linjian
 * @date 2022/8/23 14:09
 */
public class CreateStreamDemo {


    public static void main(String[] args) {
        System.out.println("creatMethod1:");
        creatMethod1().forEach(System.out::println);

        System.out.println();
        System.out.println("creatMethod2:");
        creatMethod2().forEach(System.out::println);

        System.out.println();
        System.out.println("creatMethod3:");
        creatMethod3().forEach(System.out::println);
    }

    /**
     * 通过Arrays.stream()创建流
     *
     * @return
     */
    public static Stream<String> creatMethod1() {
        String[] arr = new String[]{"武汉加油", "中国加油", "世界加油"};
        Stream<String> stream = Arrays.stream(arr);
        return stream;
    }

    /**
     * 通过Stream.of()创建流
     * 方法内部其实是调用了Arrays.stream(values)方法
     *
     * @return
     */
    public static Stream<String> creatMethod2() {
        Stream<String> stream = Stream.of("武汉加油", "中国加油", "世界加油");
        return stream;
    }

    /**
     * 使用stream()创建流
     *
     * @return
     */
    public static Stream<String> creatMethod3() {
        List<String> list = new ArrayList<>();
        list.add("武汉加油");
        list.add("中国加油");
        list.add("世界加油");
        Stream<String> stream = list.stream();
        return stream;
    }

}
