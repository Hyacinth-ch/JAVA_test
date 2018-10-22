package exception;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Exception_Test {
	public static void main(String[] args) {
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
		List<Date> list = new ArrayList<>(10);
		for(int cnt=1;cnt<10;cnt++) {
			try {
				Date date = dateformat.parse("09-12");
				list.add(date);
			}catch( java.text.ParseException e) {
				e.printStackTrace();
			}
		}
		
		/*try {
			for(int cnt1=0;cnt1<10;cnt1++) {
				Date date = dateformat.parse("09-12");
				list.add(date);
			}
		}catch(java.text.ParseException e) {
			e.printStackTrace();
		}*/
		

	}

}
