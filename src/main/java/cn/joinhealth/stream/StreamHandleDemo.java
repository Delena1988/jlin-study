package cn.joinhealth.stream;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author linjian
 * @date 2022/8/23 14:38
 */
@Slf4j
public class StreamHandleDemo {

    public static void main(String[] args) {
        filterStreamDemo();
        mapStreamDemo();
        matchStreamDemo();
        reduceStreamDemo();
        collectStreamDemo();

    }

    public static void filterStreamDemo() {
        System.out.println("filterStreamDemo: ");
        List<String> list = new ArrayList<>();
        list.add("周杰伦");
        list.add("王力宏");
        list.add("林俊杰");
        list.add("陶喆");
        Stream<String> stream = list.stream().filter(element -> element.contains("王"));
        stream.forEach(System.out::println);
        System.out.println();
    }


    public static void mapStreamDemo() {
        System.out.println("mapStreamDemo: ");
        List<String> list = new ArrayList<>();
        list.add("周杰伦");
        list.add("王力宏");
        list.add("林俊杰");
        list.add("陶喆");
        Stream<Integer> stream = list.stream().map(String::length);
        stream.forEach(System.out::println);
        System.out.println();
    }

    public static void matchStreamDemo() {
        System.out.println("matchStreamDemo: ");
        List<String> list = new ArrayList<>();
        list.add("周杰伦");
        list.add("王力宏");
        list.add("林俊杰");
        list.add("陶喆");
        boolean anyMatchFlag = list.stream().anyMatch(element -> element.contains("王"));
        boolean allMatchFlag = list.stream().allMatch(element -> element.length() > 1);
        boolean noneMatchFlag = list.stream().noneMatch(element -> element.endsWith("沉"));
        System.out.println("anyMatchFlag: " + anyMatchFlag);
        System.out.println("allMatchFlag: " + allMatchFlag);
        System.out.println("noneMatchFlag: " + noneMatchFlag);
        System.out.println();
    }

    public static void reduceStreamDemo() {
        System.out.println("reduceStreamDemo: ");
        Integer[] integers = {0, 1, 2, 3};
        List<Integer> list = Arrays.asList(integers);

        Optional<Integer> optional = list.stream().reduce((a, b) -> a + b);
        Optional<Integer> optional1 = list.stream().reduce(Integer::sum);
        System.out.println(optional.orElse(0));
        System.out.println(optional1.orElse(0));

        int reduce = list.stream().reduce(2, (a, b) -> a + b);
        System.out.println(reduce);
        int reduce1 = list.stream().reduce(2, Integer::sum);
        System.out.println(reduce1);

        System.out.println();
    }

    public static void collectStreamDemo() {
        System.out.println("collectStreamDemo: ");
        List<String> list = new ArrayList<>();
        list.add("周杰伦");
        list.add("王力宏");
        list.add("林俊杰");
        list.add("陶喆");

        String[] strArray = list.stream().toArray(String[]::new);
        System.out.println(Arrays.toString(strArray));

        List<Integer> list1 = list.stream().map(String::length).collect(Collectors.toList());
        List<String> list2 = list.stream().collect(Collectors.toCollection(ArrayList::new));
        System.out.println(list1);
        System.out.println(list2);

        String str = list.stream().collect(Collectors.joining(",")).toString();
        System.out.println(str);
    }

}
