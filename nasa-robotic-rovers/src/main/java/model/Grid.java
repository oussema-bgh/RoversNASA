package model;

import enums.Orientation;

public class Grid {

	private final int maxHeight;
	private final int maxLength;

	public Grid(int maxHeight, int maxLength) {
		this.maxHeight = maxHeight;
		this.maxLength = maxLength;
	}

	public int getMaxHeight() {
		return maxHeight;
	}

	public int getMaxLength() {
		return maxLength;
	}

	Coordinate nextCellPosition(Coordinate coordinate, Orientation orientation) {
		int y = coordinate.getY();
		int x = coordinate.getX();
		if (orientation == Orientation.NORTH) {
			y = (y + 1) % maxHeight;
		} else if (orientation == Orientation.SOUTH) {
			y = (y == 0) ? maxHeight - 1 : y - 1;
		} else if (orientation == Orientation.EAST) {
			x = (x + 1) % maxLength;
		} else if (orientation == Orientation.WEST) {
			x = (x == 0) ? maxLength - 1 : x - 1;
		}
		Coordinate newCoordinate = new Coordinate(x, y);
		return newCoordinate;
	}
}
