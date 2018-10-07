package singsong;

//歌曲类
public class Song {

	private String songName;  //歌曲名称
	private String singer;    //歌手
	private double songTime;  //歌曲时长
	
	//歌曲无参构造
	public Song() {} 
	
	//歌曲有参构造
	public Song(String songName,String singer,double songTime) {
		this.songName=songName;
		this.singer=singer;
		this.songTime=songTime;
	}
	
	//读取歌名
	public String getSongName() {
		return songName;
	}
	
	//写入歌名
	public void setSongName(String songName) {
		this.songName=songName;
	}
	
	//读取歌手
	public String getSinger() {
		return singer;
	}
	
	//写入歌手
	public void setSinger(String singer) {
		this.singer=singer;
	}
	
	//读取歌曲时长
	public double getSongTime() {
		return songTime;
	}
	
	//写入歌曲时长
	public void setSongTime(double songTime) {
		this.songTime=songTime;
	}
	
}