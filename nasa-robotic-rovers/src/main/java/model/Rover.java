package model;

import serviceImplimentation.DirectionImpl;

public class Rover {

	private Grid grid;
	private Coordinate coordinate;
	private DirectionImpl direction;
	
	public Rover(Grid grid,Coordinate coordinate,DirectionImpl direction) {
		this.grid = grid;
		this.coordinate=coordinate;
		this.direction=direction;
	}

	public String execute(String commands) {
		for (char c : commands.toCharArray()) {
			if (c == 'R') {
				direction.setOritntation(direction.right());
			}
			if (c == 'L') {
				direction.setOritntation(direction.left());
			}

		}
		return coordinate.getX() + "-" + coordinate.getY() + "-" + direction.stringValue();
	}
}
