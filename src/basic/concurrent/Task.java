package basic.concurrent;

/**
 * @Author: wtt
 * @Date: 20-4-19
 * @Description:
 */
public class Task implements Runnable {
    private String startMsg;
    private String endMsg;
    public Task(String startMsg,String endMsg){
        this.startMsg = startMsg;
        this.endMsg = endMsg;
    }
    @Override
    public void run() {
        System.out.println(startMsg);
        for (int i=0;i<3;i++){
            System.out.println(Thread.currentThread().getName()+ " print index Msg "+i);
            Thread.yield();
        }
        System.out.println(endMsg);
    }
}
class TaskTest{
    public static void main(String[] args) {
        for (int i=0;i<5;i++){
            new Thread(
                    new Task(
                        new StringBuffer("No.").append(i).append(" Task Start !").toString(),
                        new StringBuffer("No.").append(i).append(" Task End !").toString()
                    )
            ).start();
        }
    }
}