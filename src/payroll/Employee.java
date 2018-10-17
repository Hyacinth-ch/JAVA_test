package payroll;

import java.util.HashMap;
import java.util.Scanner;

/**
 *所有员工总的父类
 *属性：员工的姓名、工资和生日月份
 **/

class Employee {
	String name;        //员工姓名		
	int  monthSalary;   //员工工资
	int  birthday;      //员工生日

	
	public Employee() {} 
	
	public Employee(String name,int monthSalary,int birthday) {
		this.name=name;
		this.monthSalary=monthSalary;
		this.birthday=birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getmonthSalary() {
		return monthSalary;
	}

	public void setmonthSalary(int monthSalary) {
		this.monthSalary = monthSalary;
	}

	public int getBirthday() {
		return birthday;
	}

	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}
	
	
}


/**
 * Employee的子类，普通员工类
 * 属性：月薪、生日礼物、员工类别
 * 方法：getMonthSalary()
 * */


class generalStaff extends Employee{
	int monthSalary;           //普通员工月薪
	int birthdayGift=200;      //普通员工生日礼包
	String staffCategory="C";  //员工类别
	

	
	//计算本月员工工资，如果该月员工过生日则加上礼包
	public int calcuMonthSalary(int month) {
		System.out.println("请输入本月该普通员工工资");
		Scanner sc=new Scanner(System.in);
		monthSalary=sc.nextInt();
		
		
		if(month==birthday) {
			return (monthSalary+birthdayGift);
		}
		else {
			return monthSalary;
		}
	}
}


/**
 * Employee的子类，经理类
 * 属性：月薪、奖金、生日礼物、员工类别
 * 方法：getMonthSalary()
 * */
class manager extends Employee{
	int monthSalary;          //经理月薪
	int birthdayGift=500;     //经理生日礼包
	int addtionSalary;        //经理月奖金
	String staffCategory="B"; //员工类别
	
	//计算本月经理工资，工资为基本工资加奖金，如果该月经理过生日则加还要上礼包
	public int calcuMonthSalary(int month) {
		System.out.println("请输入本月该经理月薪：");
		Scanner sc=new Scanner(System.in);
		monthSalary=sc.nextInt();
		
		if(month==birthday) {
			return (monthSalary+addtionSalary+birthdayGift);
		}
		else {
			return (monthSalary+addtionSalary);
		}
	}
	
	public int setAddtionSalary() {
		System.out.println("请输入本月该经理奖金：");
		Scanner sc=new Scanner(System.in);
		int addS=sc.nextInt();
		return addS;
		
	}
	
	
}


/**
 * Employee的子类，股东类
 * 属性：占股比例、员工类别
 * 方法：getAnnualBonus()
 * */
class stockHolder extends Employee{
	double shares;            //股东占股比例
	String staffCategory="A"; //员工类别
	
	public void setShares() {
		Scanner sc=new Scanner(System.in);
		System.out.println("该股东占股比例为：");
		shares=sc.nextDouble();
		this.shares=shares;
	}
	
}







