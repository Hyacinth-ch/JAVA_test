package collection_test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class Demo {
	//生成随机数
	private static Random random = new Random();
	public static void main(String[] args) {
		//定义集合类型
		ArrayList<String> arraylist=new ArrayList();
		LinkedList<String> linkedlist =new LinkedList();
		HashSet<String> set=new HashSet();
		TreeSet<String> tree=new TreeSet();
		
		//确定集合大小，控制时间复杂度
		for(int i=0;i<1000000;i++) {
			String r=randomString();
			arraylist.add(r);
			linkedlist.add(r);
			set.add(r);
			tree.add(r);
		}
		
		//显示集合dax
		System.out.println("arraylist size "+arraylist.size());
		System.out.println("linkedlist size "+arraylist.size());
		System.out.println("set size "+arraylist.size());
		System.out.println("tree size "+arraylist.size());
		
		System.out.println("-----------");
		

		//ArrayList类型
		long begin=System.currentTimeMillis();  //开始时间
		//for循环查询数据
		for(int j=0;j<arraylist.size();j++) {
			arraylist.contains(arraylist.get(j));
		}
		//输出查询所用时间
		System.out.println("arraylist time "+(System.currentTimeMillis()-begin));

		//LinkedList类型
		begin=System.currentTimeMillis();  //开始时间
		//for循环查询数据
		for(int j=0;j<arraylist.size();j++) {
			linkedlist.contains(arraylist.get(j));
		}
		//输出查询所用时间
		System.out.println("linkedlist time "+(System.currentTimeMillis()-begin));
		
		
		//Hashset类型
		begin =System.currentTimeMillis();  //开始时间
		//for循环查询数据
		for(int i=0;i<100;i++) {
			for(int j=0;j<arraylist.size();j++) {
				set.contains(arraylist.get(j));
			}
		}
		//输出查询所用时间
		System.out.println("set time "+(System.currentTimeMillis()-begin));
		
		//HashTree类型
		begin =System.currentTimeMillis();  //开始时间
		//for循环查询数据
		for(int i=0;i<100;i++) {
			for(int j=0;j<arraylist.size();j++) {
				tree.contains(arraylist.get(j));
			}
		}
		//输出查询所用时间
		System.out.println("tree time "+(System.currentTimeMillis()-begin));
		
	}
	private static String randomString() {
		//返回在使用第二个参数指定的基数(36进制)时第一个参数的字符串表示形式
		return Long.toString(random.nextLong(),36); 
	}

}
