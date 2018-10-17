package payroll;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


class MyException extends Exception{
	MyException(){

	}
}


public class EmploySalaryTest {
	
	//�·����뺯��
	static int scanf() throws MyException{
		Scanner in=new Scanner(System.in);
		int m=in.nextInt();
		if(m<1||m>12) {
			throw new MyException();
		}
		else return m;
	}
	
	
	public static void main(String[] args) throws FileNotFoundException {
		

		
		//HashMap,�洢ÿ���µĹ�˾Ա��������֧��
	    HashMap<Integer,Integer> salaryMap=new HashMap<>();
	   
	    int month=1;
		do {
			System.out.println("��ѡ�񷢹����·ݣ�");
			Scanner in=new Scanner(System.in);
//			month=in.nextInt();
			
			int data=1;
			while(data==1)
			{
				try {
					month=scanf();
					data=0;
				}
				catch(MyException e) {
					System.out.println("�·���1-12�£���������ȷ�·�");
				}
			}
			
			//ͨ��switch���ȷ��ÿ���µĹ��ʷ������
			switch(month) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
			case 11:
			case 12:
				
				/**
				 * ��������Arraylist�ͼ��� gsList��mList��shList�ֱ�洢��˾��Ա������
				 */
				List gsList=new ArrayList();
				List mList=new ArrayList();
				List shList=new ArrayList();
	
				//ͨ��ָ���ļ�·��ʵ����File���󣬶�ȡtxt�ļ��й�˾Ա����Ϣ
				File file=new File("./src/payroll/staff information.txt");
				if(!file.exists()) {  //�ж��ļ��Ƿ����
					System.out.println("�ڵ������Ϣ�ļ�δ�ҵ�");
					System.exit(0);
				}
				
				Scanner s=new Scanner(file);
				
				for(int i=0;i<15;i++) {
					//����txt�ļ���Ա����Ϣ�洢��ʽ������ѭ����ȡ��Ϣ
					String staffName=s.next();
					String staffCate=s.next();
					int  staffBirth=s.nextInt();
					
					//���ݸ�Ա����𴴽���Ա������ȷ��Ա�����ʷ������
					if(staffCate.equals("A")) {
						
						stockHolder sh=new stockHolder();
						sh.name=staffName;
						sh.birthday=staffBirth;
						sh.staffCategory=staffCate;
						
						System.out.println("�ɶ��� "+sh.name);
						sh.setShares();	
					
						shList.add(sh);
					}
					else if(staffCate.equals("B")) {
						manager m=new manager();
						
						m.name=staffName;
						m.birthday=staffBirth;
						m.staffCategory=staffCate;
						
						System.out.println("���� "+m.name);
						m.addtionSalary=m.setAddtionSalary();
						m.monthSalary=m.calcuMonthSalary(month);
						mList.add(m);
						
						
					}
					else if(staffCate.equals("C")) {
						generalStaff gs=new generalStaff();
						gs.name=staffName;
						gs.birthday=staffBirth;
						gs.staffCategory=staffCate;
						
						System.out.println("Ա���� "+gs.name);
						
						gs.monthSalary=gs.calcuMonthSalary(month);
						gsList.add(gs);
						
							
					}
				}
				
				//������·ݹ�˾Ա��������Ϣ�������
				System.out.println(month+"�¹�˾Ա��������Ϣ��");
				
				int monthExpenditure=0;  //�����¹�����֧������
				
				////ͨ��������ѭ����ӡ��Ա��������Ϣ���ӵ��¹�����֧����
				for(int i=0;i<gsList.size();i++) {
					Iterator it=gsList.iterator();
					while(it.hasNext()) {
					generalStaff  g=(generalStaff)it.next();
					
					//����Ա��������Ϣ
					System.out.println("������"+g.name+"  ����"+g.monthSalary);
					
					monthExpenditure=monthExpenditure + g.monthSalary;
					}
				}
				
				for(int i=0;i<mList.size();i++) {
					Iterator it=mList.iterator();
					while(it.hasNext()) {
						manager  m=(manager)it.next();
						
					//���¾�������Ϣ
					System.out.println("������"+m.name+"  ����"+m.monthSalary);
					
					monthExpenditure=monthExpenditure + m.monthSalary;
					}
				}
				
				
				System.out.println(month+"�¹�����֧��Ϊ��");
				System.out.println(monthExpenditure);
				//���¹�����֧���浽HashMap��
				salaryMap.put(month, monthExpenditure);
				
				//ʮ���·ݼ�����ʱ���ݹ�˾ȫ��Ӫҵ��깤����֧�����㹫˾�����󲢸��ɶ��ֺ�
				while(month==12) {
					
					int yearExpenditure=0;   //ȫ�깤����֧��
					int annualProfit=0;      //ȫ������
					Iterator it=salaryMap.keySet().iterator();
					while(it.hasNext()) {
						
						int m=(int)it.next();
						yearExpenditure=yearExpenditure+salaryMap.get(m);
						
					}
						System.out.println("ȫ�깤����֧���� "+yearExpenditure);
						
						Scanner sc=new Scanner(System.in);
						System.out.println("���깫˾��Ӫҵ��Ϊ��");
						int annualTurnover=sc.nextInt();
						annualProfit=annualTurnover-yearExpenditure;
						System.out.println("����˾ȫ������Ϊ��");
						System.out.println(annualProfit);
						
				    //��ӡ�����չɶ��ֺ����
					Iterator i=shList.iterator();
					while(i.hasNext()) {
						stockHolder sH=(stockHolder)i.next();
						System.out.println("�ɶ����շֺ������");
						System.out.println("������ "+sH.name+"  �ֺ죺"+sH.shares*annualProfit);
								
					}
					
					break;
					
				}
			break;
			case 0:break;
			default:
				System.out.println("ERROR");break;
			
			}	
			
		}while(month!=0);
		
	}

}
