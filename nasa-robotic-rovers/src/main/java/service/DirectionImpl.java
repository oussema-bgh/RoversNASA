package service;

import enums.Orientation;

public class DirectionImpl  {

	private Orientation orientation;

	public DirectionImpl(Orientation orientation) {
		super();
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

	public Orientation directionMatching(String value) {
		for (Orientation obj : Orientation.values()) {
			if (obj.getCurrent().equals(value)) {
				return obj;
			}
		}
		return null;
	}

	public Orientation getOrientation() {
		return this.orientation;
	}

	public void setOrientation(Orientation orientation) {
		this.orientation = orientation;
	}

	@Override
	public String toString() {
		return orientation.getCurrent();
	}

}