package basic.concurrent;

import java.util.ArrayList;
import java.util.concurrent.*;

/**
 * @Author: wtt
 * @Date: 20-4-19
 * @Description:
 */
public class TaskWithResult implements Callable<String> {
    private int id;
    public TaskWithResult(int id){
        this.id = id;
    }
    public String call(){
        return "result of TaskWithResult "+id;
    }
}
class CallableDemo{
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        ArrayList<Future<String>> results = new ArrayList<>();
        for(int i=0;i<10;i++){
            results.add(service.submit(new TaskWithResult(i)));
        }
        for (Future<String> fs : results){
            //get blocks until completion
            try {
                System.out.println(fs.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
    }
}
