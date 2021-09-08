package lab07;

interface controllable
{
	void play();
	void stop();
}
public class Test implements controllable {
	
	public void play() {
		System.out.println("play() 호출");
	}
	public void stop() {
		System.out.println("stop() 호출");
	}

	public static void main(String[] args) {
		Test test = new Test();
		test.play();
		test.stop();
		
		controllable c = new controllable() {
			public void play() {
				System.out.println("무명 클래스 play() 호출");
			}
			public void stop() {
				System.out.println("무명 클래스 stop() 호출");
			}
		};
		c.play();
		c.stop();
	}
}