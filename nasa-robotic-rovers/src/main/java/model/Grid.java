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

		switch (orientation) {
		case NORTH:
			y = ((y + 1) - maxHeight > 0) ? ((y + 1) % maxHeight) : y + 1;
			break;
		case SOUTH:
			y = (y == 0) ? maxHeight : y - 1;
			break;
		case EAST:
			x = ((x + 1) - maxLength > 0) ? ((x + 1) % maxLength) : x + 1;
			break;
		case WEST:
			x = (x == 0) ? maxLength : x - 1;
			break;
		default:
			break;
		}

		return new Coordinate(x, y);
	}
}
