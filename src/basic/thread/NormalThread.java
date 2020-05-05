package basic.thread;

import java.util.concurrent.*;

/**
 * @Author: wtt
 * @Date: 20-4-19
 * @Description:
 * https://mp.weixin.qq.com/s?__biz=MzI3MDE0NzYwNA==&mid=2651437770&idx=1&sn=200982ac696c19278825c0766f5c1b87&chksm=f12893b1c65f1aa7b41926b9b91539195d6b6a636f3badd6b1a9e1d72f1aef31a8ed14c0e93e&mpshare=1&scene=1&srcid=&sharer_sharetime=1587273592363&sharer_shareid=d8d01ec03a50ed2ec6963fbe8828f621&exportkey=AbDI%2FR4m4aN%2FaW3t7vGB%2Bjo%3D&pass_ticket=UTlsWW%2FY7HzHrhlbm9BkgIBwic8ZmnIrOJZCGhEWtSH7FPMhuOWlXwnCclT%2BTHYV#rd
 */
public class NormalThread implements Runnable {
    private int shareValue = 0;
    ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

    @Override
    public void run() {
        shareValue +=1;
        threadLocal.set(shareValue);
        System.out.println(Thread.currentThread().getName()+"-----shareValue: "+shareValue+" threadLocal: "+threadLocal.get());
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"====="+shareValue+" threadLocal: "+threadLocal.get());

    }
}
class MutiThreadUtil{
    private static int core_pool_size = 4;
    private static int max_pool_size = 10;
    private static long keep_alive_time = 0L;
    private static BlockingQueue queue = new SynchronousQueue();
    private static ArrayBlockingQueue<Integer> arrayBlockingQueue = new ArrayBlockingQueue(1);
    public static ExecutorService initThreadPool(){
        ExecutorService executorService = new ThreadPoolExecutor(
                core_pool_size,max_pool_size,
                keep_alive_time,TimeUnit.SECONDS,
                queue
        );
        return executorService;
    }
}
class Test{
    public static void main(String[] args) {
        NormalThread normalThread = new NormalThread();
        ExecutorService executorService = MutiThreadUtil.initThreadPool();
        for (int i=0;i<10;i++){
            executorService.execute(normalThread);
        }
        executorService.shutdown();
    }
}