package basic.concurrent.exector;

import basic.concurrent.LiftOff;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: wtt
 * @Date: 20-4-20
 * @Description:
 */
public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i=0;i<5;i++)
            exec.execute(new LiftOff());
        exec.shutdown();

        ExecutorService exec1 = Executors.newFixedThreadPool(5);
        for (int j=0;j<5;j++)
            exec1.submit(new LiftOff());
        exec1.shutdown();

        ExecutorService exec2 = Executors.newSingleThreadExecutor();
        for (int k = 0;k<5;k++){
            exec2.execute(new LiftOff());
        }
        exec2.shutdown();
    }
}
