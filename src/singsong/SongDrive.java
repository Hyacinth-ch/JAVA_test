package singsong;

class SongDrive{
	Master m;
	Player p;
	public static void main(String[] args) {
		System.out.println("���̨�ѿ���");
		Player p=new Player();
		p.addSong();
		p.addSong();
		p.addSong();
		Master m=new Master();
		m.play_m();
		m.play_n();
		
	}
	
}