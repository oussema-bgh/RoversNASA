package model;

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

}
