package singsong;

//������
public class Song {

	private String songName;  //��������
	private String singer;    //����
	private double songTime;  //����ʱ��
	
	//�����޲ι���
	public Song() {} 
	
	//�����вι���
	public Song(String songName,String singer,double songTime) {
		this.songName=songName;
		this.singer=singer;
		this.songTime=songTime;
	}
	
	//��ȡ����
	public String getSongName() {
		return songName;
	}
	
	//д�����
	public void setSongName(String songName) {
		this.songName=songName;
	}
	
	//��ȡ����
	public String getSinger() {
		return singer;
	}
	
	//д�����
	public void setSinger(String singer) {
		this.singer=singer;
	}
	
	//��ȡ����ʱ��
	public double getSongTime() {
		return songTime;
	}
	
	//д�����ʱ��
	public void setSongTime(double songTime) {
		this.songTime=songTime;
	}
	
}