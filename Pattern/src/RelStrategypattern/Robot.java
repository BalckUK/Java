package RelStrategypattern;

public class Robot {

	private MoveStrategy moveStrategy;
	private TemperatureStrategy temperatureStrategy;
	
	public Robot(MoveStrategy moveStrategy, TemperatureStrategy temperatureStrategy) {
		this.moveStrategy = moveStrategy;
		this.temperatureStrategy = temperatureStrategy;
	}
	
	public void move() {
		moveStrategy.move();
	}
	
	public void temperature() {
		temperatureStrategy.temperature();
	}
}
