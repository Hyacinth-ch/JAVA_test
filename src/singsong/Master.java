package singsong;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//��������
public class Master{
	
    //�������޲ι��캯��
	public Master()	{
		System.out.println("�����������Ÿ���:");
	}
	
	//��������Ӧ�û����Ÿ��������и�������
	public void play_m() {
		Player p=new Player();
		p.play();
	
	}
	
	//��������Ӧ�û�����ָ����������
	public void play_n() {
		Player p=new Player();
		p.play_s();
	
	}
	
}
