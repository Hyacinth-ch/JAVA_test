package singsong;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
//����û���
public class Player {
	
	static ArrayList<Song> listSong=new ArrayList<Song>(); //�����������
	//�û����캯��
	public Player() {
		System.out.println("�û����:");
	}
	
	Scanner sc=new Scanner(System.in);
	
	//����������м������
	public boolean addSong() {
		/*ͨ��¼�����sc����������ֶ�¼����������֡�����ʱ����Ϣ
		 *����������ΪString���ͣ�����ʱ��Ϊdouble����
		 *��������ӳɹ�����true���򷵻�false */
		Song s=new Song();
		System.out.println("������Ҫ��ĸ�����");
		s.setSongName(sc.next());
		System.out.println("������Ҫ��������ݳ�����");
		s.setSinger(sc.next());
		System.out.println("����������������ݳ�ʱ��");
		s.setSongTime(sc.nextDouble());
		if(listSong.add(s)) {
			return true;
		}else {
			return false;
		}
		
	}
	
	//�û����󲥷Ÿ��������и���
    public void play() {
    	/*��������б�ĵ������������ǰ�б��и�����ʼ����
    	 *��ʾ��ǰ���Ÿ����ĸ��������֡�ʱ������Ϣ
    	 *����б�����û�и�������ʾ�޿ɲ��Ÿ��� */
		Iterator it=listSong.iterator();
		while(it.hasNext()) {
			Song s=(Song)it.next();
			System.out.println("��ǰ���Ÿ�������"+s.getSongName());
			System.out.println("��ǰ���Ÿ�����������"+s.getSinger());
			System.out.println("��ǰ���Ÿ���������"+s.getSongTime());
		}
	}
    
    //�û����󲥷�ָ������
    public void  play_s() {
    	/*�û�����Ҫ���Ÿ�����������forѭ���ڸ����б���ƥ�����
    	 *���ƥ�䵽��ͬ�ĸ����򲥷Ų���ʾ��ǰ���Ÿ�����Ϣ
    	 *������ʾ�Ҳ����ø��� */
    	System.out.println("Ҫ���Ÿ�������");
    	String songName=sc.next();
    	System.out.println(listSong.size());
		for(int x=0;x<listSong.size();x++) {
			Song ss=(Song)listSong.get(x);
			if(ss.getSongName().equalsIgnoreCase(songName)) {
				System.out.println("��ǰ���Ÿ�������"+ss.getSongName());
				System.out.println("��ǰ���Ÿ�����������"+ss.getSinger());
				System.out.println("��ǰ���Ÿ���������"+ss.getSongTime());
				break;
			}else if(x==2){
				System.out.println("�Ҳ����ø���");
			}
			
		}
		
	}

}