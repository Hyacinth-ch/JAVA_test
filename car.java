import java.util.Scanner;
public class hello {
	public static void main(String[] args) {
      
      

		Scanner sc=new Scanner(System.in);
		
		System.out.println("请输入汽车数量:");
		int carNumber=sc.nextInt();     //确定汽车数量
		
		Car[] carArr=new Car[carNumber];  //定义汽车对象类型数组
		//为每一个汽车对象分配内存空间
		for(int i=0;i<carNumber;i++){
			carArr[i]=new Car();
		}
		//输入汽车对象属性信息
		for(int i=0;i<carNumber;i++){
			System.out.println("请输入第一辆汽车信息：");
			System.out.println("汽车名   汽车油箱容量  汽车油耗：");
			carArr[i].tankCapicity=sc.nextFloat();
			carArr[i].oilConsumption=sc.nextFloat();
			carArr[i].carName=sc.nextLine();
		}
		
		//输出各汽车对象属性信息
		for(int i=0;i<carNumber;i++){
			System.out.println("第"+(i+1)+"辆汽车信息：");
			carArr[i].show();
			
		}

		
	
		
		
	}
	
	
	
	
}

//汽车类信息
	class Car{
		String carName;
		float tankCapicity;
		float oilConsumption;
		
		//输出汽车属性信息
		public void show(){
			System.out.println("汽车名："+carName);
			System.out.println("汽车油箱容量："+tankCapicity);
			System.out.println("汽车油耗："+oilConsumption);
			
		}

		public float gas(float x){
			System.out.println("给汽车加了"+x+"升油");
			return x;
		}
		public void run(){
			System.out.println("汽车已启动");
		}
		
	}



