
public class hello {
	public static void main(String[] args) {
      
      
		int bottleNumber=99;
	
		while(bottleNumber>0) {		
			if (bottleNumber == 1){
				System.out.println(bottleNumber+" bottle of beer on the wall,"+bottleNumber+" bottle of beer");
		}else {
		System.out.println(bottleNumber+" bottles of beer on the wall,"+bottleNumber+" bottles of beer");		}
			System.out.println("Take one down");
			System.out.println("Pass it around");
			bottleNumber=bottleNumber-1;
			
			if(bottleNumber==1) {
				System.out.println(bottleNumber+" bottle of beer on the wall");
				
			}else if(bottleNumber==0) {
				System.out.println("No more bottles of beer on the wall");
				break;
			}else {
			System.out.println(bottleNumber+" bottles of beer on the wall");
			}
		}
		
		
		String a="hello";
		
		String b=a;
		b="world";
		System.out.println(a); //hello
		System.out.println(b); //world
		System.out.println(a==b); //false

		System.out.println(a.hashCode()); //99162322
		System.out.println(b.hashCode()); //113318802
		

	 
	 
	 

	}
	
	
	
	
	
}
