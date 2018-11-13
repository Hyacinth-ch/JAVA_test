package thread_test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;


public class ThreadSafeDemo1  implements Runnable{
	private List<String> list;

    public ThreadSafeDemo1(List<String> list){
        this.list = list;
    }

    @Override
    public void run() {
        Random random = new Random();
        System.out.println("线程："+ random.nextInt());
        synchronized(this){
            Iterator<String> iterator = list.iterator();
            int cnt = 0;
            String t = null ;
            while(iterator.hasNext()){
                iterator.next();
                t = iterator.next() ;
//                iterator.remove();
                list.remove(t) ;
                cnt++;
                try {
                    TimeUnit.MILLISECONDS.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("移除元素的数量："+cnt);
        }
    }
}
