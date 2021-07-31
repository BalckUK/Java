package RelStrategypattern;

public class Main {
	public static void main(String[] args) {
		Robot robot = new Robot(new Walk(), new Cold());
		
		robot.move();
		robot.temperature();
	}
}
