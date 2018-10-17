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
	
	//月份输入函数
	static int scanf() throws MyException{
		Scanner in=new Scanner(System.in);
		int m=in.nextInt();
		if(m<1||m>12) {
			throw new MyException();
		}
		else return m;
	}
	
	
	public static void main(String[] args) throws FileNotFoundException {
		

		
		//HashMap,存储每个月的公司员工工资总支出
	    HashMap<Integer,Integer> salaryMap=new HashMap<>();
	   
	    int month=1;
		do {
			System.out.println("请选择发工资月份：");
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
					System.out.println("月份是1-12月，请输入正确月份");
				}
			}
			
			//通过switch语句确定每个月的工资发放情况
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
				 * 定义三个Arraylist型集合 gsList、mList、shList分别存储公司各员工对象
				 */
				List gsList=new ArrayList();
				List mList=new ArrayList();
				List shList=new ArrayList();
	
				//通过指定文件路径实例化File对象，读取txt文件中公司员工信息
				File file=new File("./src/payroll/staff information.txt");
				if(!file.exists()) {  //判断文件是否存在
					System.out.println("节点基本信息文件未找到");
					System.exit(0);
				}
				
				Scanner s=new Scanner(file);
				
				for(int i=0;i<15;i++) {
					//按照txt文件中员工信息存储格式，逐行循环读取信息
					String staffName=s.next();
					String staffCate=s.next();
					int  staffBirth=s.nextInt();
					
					//根据各员工类别创建各员工对象并确定员工工资发放情况
					if(staffCate.equals("A")) {
						
						stockHolder sh=new stockHolder();
						sh.name=staffName;
						sh.birthday=staffBirth;
						sh.staffCategory=staffCate;
						
						System.out.println("股东： "+sh.name);
						sh.setShares();	
					
						shList.add(sh);
					}
					else if(staffCate.equals("B")) {
						manager m=new manager();
						
						m.name=staffName;
						m.birthday=staffBirth;
						m.staffCategory=staffCate;
						
						System.out.println("经理： "+m.name);
						m.addtionSalary=m.setAddtionSalary();
						m.monthSalary=m.calcuMonthSalary(month);
						mList.add(m);
						
						
					}
					else if(staffCate.equals("C")) {
						generalStaff gs=new generalStaff();
						gs.name=staffName;
						gs.birthday=staffBirth;
						gs.staffCategory=staffCate;
						
						System.out.println("员工： "+gs.name);
						
						gs.monthSalary=gs.calcuMonthSalary(month);
						gsList.add(gs);
						
							
					}
				}
				
				//输出该月份公司员工工资信息发放情况
				System.out.println(month+"月公司员工工资信息：");
				
				int monthExpenditure=0;  //定义月工资总支出变量
				
				////通过迭代器循环打印各员工工资信息并加到月工资总支出中
				for(int i=0;i<gsList.size();i++) {
					Iterator it=gsList.iterator();
					while(it.hasNext()) {
					generalStaff  g=(generalStaff)it.next();
					
					//本月员工工资信息
					System.out.println("姓名："+g.name+"  工资"+g.monthSalary);
					
					monthExpenditure=monthExpenditure + g.monthSalary;
					}
				}
				
				for(int i=0;i<mList.size();i++) {
					Iterator it=mList.iterator();
					while(it.hasNext()) {
						manager  m=(manager)it.next();
						
					//本月经理工资信息
					System.out.println("姓名："+m.name+"  工资"+m.monthSalary);
					
					monthExpenditure=monthExpenditure + m.monthSalary;
					}
				}
				
				
				System.out.println(month+"月工资总支出为：");
				System.out.println(monthExpenditure);
				//将月工资总支出存到HashMap中
				salaryMap.put(month, monthExpenditure);
				
				//十二月份即年终时根据公司全年营业额及年工资总支出计算公司年利润并给股东分红
				while(month==12) {
					
					int yearExpenditure=0;   //全年工资总支出
					int annualProfit=0;      //全年利润
					Iterator it=salaryMap.keySet().iterator();
					while(it.hasNext()) {
						
						int m=(int)it.next();
						yearExpenditure=yearExpenditure+salaryMap.get(m);
						
					}
						System.out.println("全年工资总支出： "+yearExpenditure);
						
						Scanner sc=new Scanner(System.in);
						System.out.println("本年公司总营业额为：");
						int annualTurnover=sc.nextInt();
						annualProfit=annualTurnover-yearExpenditure;
						System.out.println("本公司全年利润为：");
						System.out.println(annualProfit);
						
				    //打印出年终股东分红情况
					Iterator i=shList.iterator();
					while(i.hasNext()) {
						stockHolder sH=(stockHolder)i.next();
						System.out.println("股东年终分红情况：");
						System.out.println("姓名： "+sH.name+"  分红："+sH.shares*annualProfit);
								
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
