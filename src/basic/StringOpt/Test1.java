package basic.StringOpt;

/**
 * @Author: wtt
 * @Date: 20-4-19
 * @Description:
 * https://mp.weixin.qq.com/s?__biz=MjM5NzMyMjAwMA==&mid=2651486944&idx=2&sn=f1cc1aece77fd1f9f42bf1fc74c795b4&chksm=bd25169f8a529f89b580114fee56745cd4c2d822639e17c2a84d3a976a0927a11aedd7416a30&mpshare=1&scene=1&srcid=&sharer_sharetime=1587273600827&sharer_shareid=d8d01ec03a50ed2ec6963fbe8828f621&exportkey=AaKBfUqr6OTo5eM5OQ5UaNI%3D&pass_ticket=UTlsWW%2FY7HzHrhlbm9BkgIBwic8ZmnIrOJZCGhEWtSH7FPMhuOWlXwnCclT%2BTHYV#rd
 */
public class Test1 {
    public static void main(String[] args) {
        String st1 = "abc";
        String st2 = "abc";
        System.out.println(st1 == st2);//true
        System.out.println(st1.equals(st2));//true
        System.out.println("1---------------");
        String st3 = new String("abc");
//        String st3 = new String("abc").intern();
        String st4 = "abc";
        System.out.println(st3 == st4);//false
        System.out.println(st3.equals(st4));//true
        System.out.println("2---------");
        String str5 = "a" + "b"+"c";
        String str6 = "abc";
        System.out.println(str5 == str6);//true
        System.out.println(str5.equals(str6));//true
        System.out.println("3----------");
        String st7 = "ab";
        String st8= "abc";
        String st9 = st7 + "c";
        System.out.println(st8 == st9);//false
        System.out.println(st8.equals(st9));//true

    }
}
