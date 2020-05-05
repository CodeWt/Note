package basic.concurrent;

/**
 * @Author: wtt
 * @Date: 20-4-20
 * @Description:
 */
public class LiftOff implements Runnable {
    protected int countDown = 10;
    protected static int taskCount = 0;
    private final int id = taskCount++;
    public LiftOff(){}
    public LiftOff(int countDown){
        this.countDown = countDown;
    }
    public String status()
    {
        return "#"+id+"("+
                (countDown>0 ? countDown : "Liftoff!")
                + "),";
    }

    @Override
    public void run() {
        while (countDown-- > 0){
            System.out.println(status());
            Thread.yield();
        }
    }
}
class MainThread{
    public static void main(String[] args) {
        LiftOff off = new LiftOff();
        off.run();
        System.out.println("**********");
    }
}
