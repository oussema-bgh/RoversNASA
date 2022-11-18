package service;

import enums.Orientation;

public class DirectionImpl implements Direction {

	private Orientation orientation;

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