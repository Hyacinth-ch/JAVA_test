package singsong;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
//点歌用户类
public class Player {
	
	static ArrayList<Song> listSong=new ArrayList<Song>(); //定义歌曲序列
	//用户构造函数
	public Player() {
		System.out.println("用户点歌:");
	}
	
	Scanner sc=new Scanner(System.in);
	
	//向歌曲序列中加入歌曲
	public boolean addSong() {
		/*通过录入对象sc向歌曲序列手动录入歌名、歌手、歌曲时长信息
		 *歌名、歌手为String类型，歌曲时长为double类型
		 *若歌曲添加成功返回true否则返回false */
		Song s=new Song();
		System.out.println("请输入要点的歌曲名");
		s.setSongName(sc.next());
		System.out.println("请输入要点歌曲的演唱歌手");
		s.setSinger(sc.next());
		System.out.println("请输入所点歌曲的演唱时长");
		s.setSongTime(sc.nextDouble());
		if(listSong.add(s)) {
			return true;
		}else {
			return false;
		}
		
	}
	
	//用户请求播放歌曲序列中歌曲
    public void play() {
    	/*定义歌曲列表的迭代器，如果当前列表有歌曲则开始播放
    	 *显示当前播放歌曲的歌名、歌手、时长等信息
    	 *如果列表中已没有歌曲则显示无可播放歌曲 */
		Iterator it=listSong.iterator();
		while(it.hasNext()) {
			Song s=(Song)it.next();
			System.out.println("当前播放歌曲名："+s.getSongName());
			System.out.println("当前播放歌曲歌手名："+s.getSinger());
			System.out.println("当前播放歌曲曲长："+s.getSongTime());
		}
	}
    
    //用户请求播放指定歌曲
    public void  play_s() {
    	/*用户输入要播放歌曲名，利用for循环在歌曲列表中匹配歌名
    	 *如果匹配到相同的歌名则播放并显示当前播放歌曲信息
    	 *否则显示找不到该歌曲 */
    	System.out.println("要播放歌曲名：");
    	String songName=sc.next();
    	System.out.println(listSong.size());
		for(int x=0;x<listSong.size();x++) {
			Song ss=(Song)listSong.get(x);
			if(ss.getSongName().equalsIgnoreCase(songName)) {
				System.out.println("当前播放歌曲名："+ss.getSongName());
				System.out.println("当前播放歌曲歌手名："+ss.getSinger());
				System.out.println("当前播放歌曲曲长："+ss.getSongTime());
				break;
			}else if(x==2){
				System.out.println("找不到该歌曲");
			}
			
		}
		
	}

}