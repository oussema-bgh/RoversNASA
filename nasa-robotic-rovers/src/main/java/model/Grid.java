package model;

import java.util.Collections;
import java.util.List;

import enums.Orientation;

public class Grid {

	private final int maxHeight;
	private final int maxLength;
	private List<Coordinate> obstacles = Collections.emptyList();

	public Grid(int maxHeight, int maxLength) {
		this.maxHeight = maxHeight;
		this.maxLength = maxLength;
	}

	Grid(int maxHeight, int maxLength, List<Coordinate> obstacles) {
		this(maxHeight, maxLength);
		this.obstacles = obstacles;
	}

}
