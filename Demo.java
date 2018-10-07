import java.util.List;
import java.util.ArrayList;


public class Demo {
    public static void main(String[] args) {
	
    	List<Integer> list=new ArrayList<>(1);
    	Integer integer=new Integer(10);
    	list.add(integer);
    	Integer integer1=list.get(0);
    	System.out.println(integer1); //10
    	integer1=3;
    	System.out.println(list.get(0));  //10
    	
   	  
    }
}





