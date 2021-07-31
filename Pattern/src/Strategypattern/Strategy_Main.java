package Strategypattern;

public class Strategy_Main {

	public static void main(String[] args) {
		Strategy_Root robot1 = new Strategy_Root();
		Strategy_RunningRoot robot2 = new Strategy_RunningRoot();
		
		robot1.move();
		robot2.move();
	}

}
