import java.util.Scanner;
public class hello {
	public static void main(String[] args) {
      
      

		Scanner sc=new Scanner(System.in);
		
		System.out.println("��������������:");
		int carNumber=sc.nextInt();     //ȷ����������
		
		Car[] carArr=new Car[carNumber];  //��������������������
		//Ϊÿһ��������������ڴ�ռ�
		for(int i=0;i<carNumber;i++){
			carArr[i]=new Car();
		}
		//������������������Ϣ
		for(int i=0;i<carNumber;i++){
			System.out.println("�������һ��������Ϣ��");
			System.out.println("������   ������������  �����ͺģ�");
			carArr[i].tankCapicity=sc.nextFloat();
			carArr[i].oilConsumption=sc.nextFloat();
			carArr[i].carName=sc.nextLine();
		}
		
		//�������������������Ϣ
		for(int i=0;i<carNumber;i++){
			System.out.println("��"+(i+1)+"��������Ϣ��");
			carArr[i].show();
			
		}

		
	
		
		
	}
	
	
	
	
}

//��������Ϣ
	class Car{
		String carName;
		float tankCapicity;
		float oilConsumption;
		
		//�������������Ϣ
		public void show(){
			System.out.println("��������"+carName);
			System.out.println("��������������"+tankCapicity);
			System.out.println("�����ͺģ�"+oilConsumption);
			
		}

		public float gas(float x){
			System.out.println("����������"+x+"����");
			return x;
		}
		public void run(){
			System.out.println("����������");
		}
		
	}



