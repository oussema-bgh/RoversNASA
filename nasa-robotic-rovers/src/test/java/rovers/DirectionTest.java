package rovers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import enums.Orientation;
import model.Coordinate;
import model.Grid;
import model.Rover;
import serviceImplimentation.DirectionImpl;

class DirectionTest {

	private DirectionImpl direction = new DirectionImpl(Orientation.NORTH);
	private Coordinate coordinate = new Coordinate(0, 0);
	private Grid grid = new Grid(10, 10);
	private Rover rover = new Rover(grid,coordinate,direction);

	@ParameterizedTest
	@CsvSource({ "R, 0-0-E", "RR, 0-0-S", "RRR, 0-0-W", "RRRR, 0-0-N" })
	void turn_right(String command, String position) {
		assertEquals(rover.execute(command), position);

	}

//
	@ParameterizedTest
	@CsvSource({ "L, 0-0-W", "LL, 0-0-S", "LLL, 0-0-E", "LLLL, 0-0-N" })
	void turn_left(String command, String position) {
		assertEquals(rover.execute(command), position);
	}


}
