package service;

import enums.Orientation;

public interface Direction {
	Orientation right();
	Orientation left();
	Orientation returnOrientation(); 

	void updateOrientation(Orientation orientation);  

	String displayDirection();
}
