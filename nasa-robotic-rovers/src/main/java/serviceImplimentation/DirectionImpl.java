package serviceImplimentation;

import enums.Orientation;
import service.Direction;

public class DirectionImpl implements Direction {

	public Orientation orientation;

	public Orientation getOrientation() {
		return this.orientation;
	}

	public void setOrientation(Orientation orientation) {
		this.orientation = orientation;
	}

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

	private Orientation directionMatching(String value) {
		for (Orientation obj : Orientation.values()) {
			if (obj.getCurrent().equals(value)) {
				return obj;
			}
		}
		return null;
	}
}