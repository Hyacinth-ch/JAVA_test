package collection_test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class Demo {
	//���������
	private static Random random = new Random();
	public static void main(String[] args) {
		//���弯������
		ArrayList<String> arraylist=new ArrayList();
		LinkedList<String> linkedlist =new LinkedList();
		HashSet<String> set=new HashSet();
		TreeSet<String> tree=new TreeSet();
		
		//ȷ�����ϴ�С������ʱ�临�Ӷ�
		for(int i=0;i<1000000;i++) {
			String r=randomString();
			arraylist.add(r);
			linkedlist.add(r);
			set.add(r);
			tree.add(r);
		}
		
		//��ʾ����dax
		System.out.println("arraylist size "+arraylist.size());
		System.out.println("linkedlist size "+arraylist.size());
		System.out.println("set size "+arraylist.size());
		System.out.println("tree size "+arraylist.size());
		
		System.out.println("-----------");
		

		//ArrayList����
		long begin=System.currentTimeMillis();  //��ʼʱ��
		//forѭ����ѯ����
		for(int j=0;j<arraylist.size();j++) {
			arraylist.contains(arraylist.get(j));
		}
		//�����ѯ����ʱ��
		System.out.println("arraylist time "+(System.currentTimeMillis()-begin));

		//LinkedList����
		begin=System.currentTimeMillis();  //��ʼʱ��
		//forѭ����ѯ����
		for(int j=0;j<arraylist.size();j++) {
			linkedlist.contains(arraylist.get(j));
		}
		//�����ѯ����ʱ��
		System.out.println("linkedlist time "+(System.currentTimeMillis()-begin));
		
		
		//Hashset����
		begin =System.currentTimeMillis();  //��ʼʱ��
		//forѭ����ѯ����
		for(int i=0;i<100;i++) {
			for(int j=0;j<arraylist.size();j++) {
				set.contains(arraylist.get(j));
			}
		}
		//�����ѯ����ʱ��
		System.out.println("set time "+(System.currentTimeMillis()-begin));
		
		//HashTree����
		begin =System.currentTimeMillis();  //��ʼʱ��
		//forѭ����ѯ����
		for(int i=0;i<100;i++) {
			for(int j=0;j<arraylist.size();j++) {
				tree.contains(arraylist.get(j));
			}
		}
		//�����ѯ����ʱ��
		System.out.println("tree time "+(System.currentTimeMillis()-begin));
		
	}
	private static String randomString() {
		//������ʹ�õڶ�������ָ���Ļ���(36����)ʱ��һ���������ַ�����ʾ��ʽ
		return Long.toString(random.nextLong(),36); 
	}

}
