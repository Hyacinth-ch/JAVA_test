package singsong;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//主持人类
public class Master{
	
    //主持人无参构造函数
	public Master()	{
		System.out.println("主持人来播放歌曲:");
	}
	
	//主持人响应用户播放歌曲序列中歌曲请求
	public void play_m() {
		Player p=new Player();
		p.play();
	
	}
	
	//主持人响应用户播放指定歌曲请求
	public void play_n() {
		Player p=new Player();
		p.play_s();
	
	}
	
}
