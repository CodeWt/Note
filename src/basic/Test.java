package basic;

/**
 * @Author: wtt
 * @Date: 20-4-19
 * @Description:
 */
public class Test {
    public static void disCharArr(){
        char[] chars1 = new char[]{
                'a','b','c'
        };
        char[] chars2 = new char[]{
                '1','2','3'
        };
        boolean flag = true;
        int i=0,j=0;
        while ((i<chars1.length)||(j<chars2.length)){
            if (flag){
                System.out.print(chars1[i++]+",");
                flag = false;
            }else {
                System.out.print(chars2[j++]+",");
                flag = true;
            }
        }
    }
    public static void main(String[] args) {
        disCharArr();
    }
}
