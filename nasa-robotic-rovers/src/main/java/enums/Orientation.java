package enums;

public enum Orientation {

	NORTH("N", "W", "E"), EAST("E", "N", "S"), SOUTH("S", "E", "W"), WEST("W", "S", "N");

	private final String current;
	private final String left;
	private final String right;

	Orientation(String current, String left, String right) {
		this.current = current;
		this.left = left;
		this.right = right;
	}

	public String getCurrent() {
		return current;
	}

	public String getLeft() {
		return left;
	}

	public String getRight() {
		return right;
	}

}
