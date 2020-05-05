package basic.thread;

/**
 * @Author: wtt
 * @Date: 20-4-19
 * @Description:
 */
public class ThreadSharedVal implements Runnable{
    private int val = 0;
    public int getVal(){
        return val;
    }
    @Override
    public synchronized void run() {
        this.val += 1;
    }
}
class Test1{
    public static void main(String[] args) throws InterruptedException {
        ThreadSharedVal test = new ThreadSharedVal();
        for (int i=0;i<100000;i++){
            new Thread(test).start();
        }
        Thread.sleep(2000);
        System.out.println(test.getVal());
    }
}
