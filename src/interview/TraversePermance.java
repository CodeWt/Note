package interview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: wtt
 * @Date: 20-4-13
 * @Description:
 */
public class TraversePermance {
    public static long testForeach(List<String> list){
        long start = System.nanoTime();
        for (String string:list);
        long end = System.nanoTime();
        return end - start;
    }

    public static long testIterator(List<String> list){
        long start = System.nanoTime();
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String s = iterator.next();
        }
        long end = System.nanoTime();
        return end - start;
    }

    public static long testFor(List<String> list){
        long start = System.nanoTime();
        for (int i=0;i<list.size();i++){
            String s = list.get(i);
        }
        long end = System.nanoTime();
        return end - start;
    }

    public static void averageTraverseTime(List<String> list){
        long sum1 = 0;
        for (int j=0;j<3;j++){
            sum1 += testFor(list);
        }
        System.out.println("For average : " + sum1/3);
        long sum2 = 0;
        for (int j=0;j<3;j++){
            sum2 += testForeach(list);
        }
        System.out.println("Foreach average : " + sum2/3);
        long sum3 = 0;
        for (int j=0;j<3;j++){
            sum3 += testIterator(list);
        }
        System.out.println("Iterator average : " + sum3/3);
    }

    public static long testArrFor(String[] strings){
        long start = System.nanoTime();
        for (int i=0;i<strings.length;i++){
            String s = strings[i];
        }
        long end = System.nanoTime();
        return end - start;
    }

    public static long testArrForeach(String[] strings){
        long start = System.nanoTime();
        for (String s:strings);
        long end = System.nanoTime();
        return end - start;
    }

    public static void main(String[] args) {
//        //初始化
//        List<String> list1 = new ArrayList<String>();
//        List<String> list2 = new LinkedList<String>();
//        for (int i=0;i<100000;i++){
//            list1.add(String.valueOf(i));
//            list2.add(String.valueOf(i));
//        }
//        System.out.println("For 遍历 Arraylist ： " + testFor(list1));
//        System.out.println("foreach 遍历 ArrayList : " + testForeach(list1));
//        System.out.println("iterator 遍历 ArrayList : " + testIterator(list1));
//        System.out.println("------------------------");
//        System.out.println("For 遍历 Linkedlist ： " + testFor(list2));
//        System.out.println("foreach 遍历 LinkedList : " + testForeach(list2));
//        System.out.println("iterator 遍历 LinkedList : " + testIterator(list2));
//        averageTraverseTime(list2);
        //初始化数组
        String[] strings = new String[10000000];
        for (int i=0;i<strings.length;i++){
            strings[i] = String.valueOf(i);
        }
        System.out.println("--------array length : "+strings.length);
        System.out.println("For 遍历 数组 ： " + testArrFor(strings));
        System.out.println("Foreach 遍历 数组 ："+testArrForeach(strings));
    }
}
/*
For 遍历 Arraylist ： 　　7218742
foreach 遍历 ArrayList : 5603385
iterator 遍历 ArrayList :5814949
------------------------
For 遍历 Linkedlist ： 14809177516
foreach 遍历 LinkedList : 　4833899
iterator 遍历 LinkedList：  1900432

*/

/*
遍历ArrayList平均用时
For average: 　　　3385889
Foreach average : 3130375
Iterator average: 3008121
-------------------
遍历LinkedList平均用时
For average : 13928169799
Foreach average : 2564201
Iterator average　:2073109
*/
//--For&Foreach遍历数组效率比较--
/*
--------array length : 1　0000
For 遍历 数组 ：     24127
Foreach 遍历 数组 ：100864
--------array length : 10　0000
For 遍历 数组 ：     365067
Foreach 遍历 数组 ：1738302
--------array length : 100　0000
For 遍历 数组 ：    2222105
Foreach 遍历 数组 ：2175856
--------array length : 1000　0000
For 遍历 数组 ：    1722269
Foreach 遍历 数组 ：1746932
*/