package service;

import enums.Orientation;

public class DirectionImpl implements Direction {

	Orientation orientation;

	public DirectionImpl(Orientation orientation) {
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
		// return North by default
		return Orientation.NORTH;
	}

	public Orientation returnOrientation() {
		return orientation;
	}

	public void updateOrientation(Orientation orientation) {
		this.orientation = orientation;
	}

	public String displayDirection() {
		return orientation.getCurrent();
	}

}