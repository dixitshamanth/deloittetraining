package day6;

interface Radio
{
	final static int FREQUENCY=100;
	abstract void play();
}

interface MusicPlayer{
	void songsList();
}

interface ModernMusicPlayer extends MusicPlayer
{
	void cloud();
}

class Mobile implements Radio,ModernMusicPlayer
{
	public void play() {
		System.out.println("Radio play");
	}

	
	public void cloud() {
		System.out.println("playing from cloud");
	}

	@Override
	public void songsList() {
		// TODO Auto-generated method stub
		System.out.println("Song list");
	}
}
public class InterfaceDemo {
	public static void main(String[] args) {
		Mobile m=new Mobile();
		m.play();
		m.cloud();
		m.songsList();
	}

}
