package model;

import service.DirectionImpl;

public class Rover {

	private Grid grid;
	private Coordinate coordinate;
	private DirectionImpl direction;

	public Rover(Grid grid, Coordinate coordinate, DirectionImpl direction) {
		this.grid = grid;
		this.coordinate = coordinate;
		this.direction = direction;
	}

	public String execute(String commands) {
		for (char c : commands.toCharArray()) {
			if (c == 'R') {
				direction.setOrientation(direction.right());
			}
			if (c == 'L') {
				direction.setOrientation(direction.left());
			}
			if (c == 'M') {
				coordinate = grid.nextCellPosition(coordinate, direction.getOrientation());
			}
		}
		return coordinate.getX() + "-" + coordinate.getY() + "-" + direction.stringValue();
	}

	public Grid getGrid() {
		return grid;
	}

	public void setGrid(Grid grid) {
		this.grid = grid;
	}

	public Coordinate getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(Coordinate coordinate) {
		this.coordinate = coordinate;
	}

	public DirectionImpl getDirection() {
		return direction;
	}

	public void setDirection(DirectionImpl direction) {
		this.direction = direction;
	}

	@Override
	public String toString() {
		return   coordinate.toString() + " " + direction.toString()  ;
	}

}
