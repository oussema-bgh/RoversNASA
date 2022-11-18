package service;

import enums.Orientation;

public class Direction {

	private Orientation orientation;

	public Direction(Orientation orientation) {
		this.orientation = orientation;
	}

	public Orientation right() {
		return directionMatching(this.orientation.getRight());
	}

	public Orientation left() {
		return directionMatching(orientation.getLeft());
	}

	public String stringValue() {
		return orientation.getCurrent();
	}

	private Orientation directionMatching(String value) {
		for (Orientation obj : Orientation.values()) {
			if (obj.getCurrent().equals(value)) {
				return obj;
			}
		}
		return null;
	}

	public Orientation getOrientation() {
		return orientation;
	}

	public void setOrientation(Orientation orientation) {
		this.orientation = orientation;
	}

	public String toString() {
		return orientation.getCurrent();
	}

}