package serviceImplimentation;

import enums.Orientation;
import service.Direction;

public class DirectionImpl implements Direction {

	public Orientation oritntation;

	public Orientation getOritntation() {
		return oritntation;
	}

	public void setOritntation(Orientation oritntation) {
		this.oritntation = oritntation;
	}

	public DirectionImpl(Orientation oritntation) {
		super();
		this.oritntation = oritntation;
	}

	public Orientation right() {
		return directionMatching(this.oritntation.getRight());
	}

	public Orientation left() {
		return directionMatching(oritntation.getLeft());
	}

	public String stringValue() {
		return oritntation.getCurrent();
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
