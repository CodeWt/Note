package basic;

/**
 * @Author: wtt
 * @Date: 20-4-19
 * @Description:
 * https://mp.weixin.qq.com/s?__biz=MjM5NzMyMjAwMA==&mid=2651486963&idx=2&sn=6385c072645a222e7c5515d1f89861ab&chksm=bd25168c8a529f9ae67a9b7240072e9ede61309c0b6efe73156b4b3dc9690e0544f86d44bcf3&mpshare=1&scene=1&srcid=&sharer_sharetime=1587273568529&sharer_shareid=d8d01ec03a50ed2ec6963fbe8828f621&exportkey=AdsOLCSnxavGCjrrCUdAHWw%3D&pass_ticket=UTlsWW%2FY7HzHrhlbm9BkgIBwic8ZmnIrOJZCGhEWtSH7FPMhuOWlXwnCclT%2BTHYV#rd
 */
interface Action{
    void doSomething();
}

interface Parser{
    Action findAction(String userInput);
}

class MyParser implements Parser{
    private static Action DO_NOTHING = new Action() {
        @Override
        public void doSomething() {

        }
    };
    public Action findAction(String userInput){
        if (userInput == "1"){
            return DO_NOTHING;
        }else {
            return new Action() {
                @Override
                public void doSomething() {
                    System.out.println("do some things that you think meaningful");
                }
            };
        }
    }
}
public class Null {
    public static void main(String[] args) {
        new MyParser()
                .findAction("1")
                .doSomething();
    }
}
