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
			case Const.turn_Right:
				direction.updateOrientation(direction.right());
				break;
			case Const.turn_Left:
				direction.updateOrientation(direction.left());
				break;
			case Const.move:
				coordinate = grid.nextCellPosition(coordinate, direction.returnOrientation());
				break;
			default:
				break;
			}

		}
		return coordinate.getX() + "-" + coordinate.getY() + "-" + direction.toString();
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
		return coordinate.toString() + " " + direction.toString();
	}

}
