class Robot {
	public void speak(String text) {
		System.out.println(text);

	}

	public void jump(int height) {
		System.out.println("height is:" + height);
	}

	public void move(String Direct, int distance) {
		System.out
				.println("direction is:" + Direct + " Distance is:" + distance);
	}

}

public class App1 {

	public static void main(String[] args) {

		Robot sam = new Robot();
		sam.speak("hello i am there");
		sam.jump(15);
		sam.move("East", 25);
		String ken="hello robot";
		sam.speak(ken);
		int h=35;
		sam.jump(h);
		//sam.move(ken, h);
		String str="west";
		int d=20;
		sam.move(str, d);

	}

}
