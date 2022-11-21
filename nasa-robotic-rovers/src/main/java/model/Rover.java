package model;

import constants.Const;
import service.Direction;

public class Rover {

	private Grid grid;
	private Coordinate coordinate;
	private Direction direction;

	public Rover(Grid grid, Coordinate coordinate, Direction direction) {
		this.grid = grid;
		this.coordinate = coordinate;
		this.direction = direction;
	}

	public String execute(String commands) {
		for (char c : commands.toCharArray()) {

			switch (c) {
			case Const.TURN_RIGHT:
				direction.updateOrientation(direction.right());
				break;
			case Const.TURN_LEFT:
				direction.updateOrientation(direction.left());
				break;
			case Const.MOVE:
				coordinate = grid.nextCellPosition(coordinate, direction.returnOrientation());
				break;
			default:
				break;
			}

		}
		return coordinate.getX() + "-" + coordinate.getY() + "-" + direction.displayDirection();
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

	@Override
	public String toString() {
		return coordinate.toString() + " " + direction.displayDirection();
	}

}
