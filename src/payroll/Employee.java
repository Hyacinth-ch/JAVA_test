package payroll;

import java.util.HashMap;
import java.util.Scanner;

/**
 *����Ա���ܵĸ���
 *���ԣ�Ա�������������ʺ������·�
 **/

class Employee {
	String name;        //Ա������		
	int  monthSalary;   //Ա������
	int  birthday;      //Ա������

	
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
 * Employee�����࣬��ͨԱ����
 * ���ԣ���н���������Ա�����
 * ������getMonthSalary()
 * */


class generalStaff extends Employee{
	int monthSalary;           //��ͨԱ����н
	int birthdayGift=200;      //��ͨԱ���������
	String staffCategory="C";  //Ա�����
	

	
	//���㱾��Ա�����ʣ��������Ա����������������
	public int calcuMonthSalary(int month) {
		System.out.println("�����뱾�¸���ͨԱ������");
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
 * Employee�����࣬������
 * ���ԣ���н�������������Ա�����
 * ������getMonthSalary()
 * */
class manager extends Employee{
	int monthSalary;          //������н
	int birthdayGift=500;     //�����������
	int addtionSalary;        //�����½���
	String staffCategory="B"; //Ա�����
	
	//���㱾�¾����ʣ�����Ϊ�������ʼӽ���������¾����������ӻ�Ҫ�����
	public int calcuMonthSalary(int month) {
		System.out.println("�����뱾�¸þ�����н��");
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
		System.out.println("�����뱾�¸þ�����");
		Scanner sc=new Scanner(System.in);
		int addS=sc.nextInt();
		return addS;
		
	}
	
	
}


/**
 * Employee�����࣬�ɶ���
 * ���ԣ�ռ�ɱ�����Ա�����
 * ������getAnnualBonus()
 * */
class stockHolder extends Employee{
	double shares;            //�ɶ�ռ�ɱ���
	String staffCategory="A"; //Ա�����
	
	public void setShares() {
		Scanner sc=new Scanner(System.in);
		System.out.println("�ùɶ�ռ�ɱ���Ϊ��");
		shares=sc.nextDouble();
		this.shares=shares;
	}
	
}







