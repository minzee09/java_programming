package lab07;

interface controllable
{
	void play();
	void stop();
}
public class Test implements controllable {
	
	public void play() {
		System.out.println("play() ȣ��");
	}
	public void stop() {
		System.out.println("stop() ȣ��");
	}

	public static void main(String[] args) {
		Test test = new Test();
		test.play();
		test.stop();
		
		controllable c = new controllable() {
			public void play() {
				System.out.println("���� Ŭ���� play() ȣ��");
			}
			public void stop() {
				System.out.println("���� Ŭ���� stop() ȣ��");
			}
		};
		c.play();
		c.stop();
	}
}