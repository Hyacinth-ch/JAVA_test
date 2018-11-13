package thread_test;

import java.util.List;

public class ThreadSafeDemo3 implements Runnable {

    private List<String> list;

    public ThreadSafeDemo3(List<String> list){
        this.list = list;
    }

    @Override
    public void run() {
    	synchronized(this) {
    		while(true){
    			if(list.size()>0){
    				list.remove(0);
    				System.out.println("É¾³ýÒ»¸öºó³ß´ç£º"+list.size());
    			}
    			try {
    				Thread.sleep(200);
    			} catch (InterruptedException e) {
    				e.printStackTrace();
    			}
    		}
    	}
    }
}
