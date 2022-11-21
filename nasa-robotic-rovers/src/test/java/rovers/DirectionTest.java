package rovers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import enums.Orientation;
import model.Coordinate;
import model.Grid;
import model.Rover;
import service.DirectionImpl;

class DirectionTest {

	private DirectionImpl direction = new DirectionImpl(Orientation.NORTH);
	private Coordinate coordinate = new Coordinate(0, 0);
	private Grid grid = new Grid(5, 5);
	private Rover rover = new Rover(grid, coordinate, direction);

	@ParameterizedTest
	@CsvSource({ "R, 0-0-E", "RR, 0-0-S", "RRR, 0-0-W", "RRRR, 0-0-N" })
	void turn_right(String command, String position) {
		assertEquals(rover.execute(command), position);

	}

	@ParameterizedTest
	@CsvSource({ "L, 0-0-W", "LL, 0-0-S", "LLL, 0-0-E", "LLLL, 0-0-N" })
	void turn_left(String command, String position) {
		assertEquals(rover.execute(command), position);
	}

	@ParameterizedTest
	@CsvSource({ "N, NORTH" , "S, SOUTH", "E, EAST", "W, WEST" })
	void get_orientation(String command, String position) {
		assertEquals(Orientation.orientationMatching(command).toString(), position);
	}
	
	@ParameterizedTest
	@CsvSource({ "M, 0-1-N", "MMM, 0-3-N", })
	void move_up(String command, String position) {
		assertEquals(rover.execute(command), position);
	}

	@ParameterizedTest
	@CsvSource({ "MRRM, 0-0-S", "MMMMMRRMMM, 0-2-S" })
	void move_down(String command, String position) {
		assertEquals(rover.execute(command), position);
	}

	@ParameterizedTest
	@CsvSource({ "RM, 1-0-E", "RMMMMM, 5-0-E" })
	void move_right(String command, String position) {
		assertEquals(rover.execute(command), position);
	}

	@ParameterizedTest
	@CsvSource({ "RMRRM, 0-0-W", "RMMMMRR, 4-0-W" })
	void move_left(String command, String position) {
		assertEquals(rover.execute(command), position);
	}

	@ParameterizedTest
	@CsvSource({ "MMMMMMMMMM, 0-5-N", "MMMMMMMMMMMMMMM, 0-5-N" })
	void wrap_from_top_to_bottom(String command, String position) {
		assertEquals(rover.execute(command), position);
	}

	@ParameterizedTest
	@CsvSource({ "RRM, 0-5-S", "RRMMMMM, 0-1-S" })
	void wrap_from_bottom_to_top(String command, String position) {
		assertEquals(rover.execute(command), position);
	}

	@ParameterizedTest
	@CsvSource({ "RMMMMMMMMMM, 5-0-E", "RMMMMMMMMMMMMMMM, 5-0-E" })
	void wrap_from_right_to_left(String command, String position) {
		assertEquals(rover.execute(command), position);
	}

	@ParameterizedTest
	@CsvSource({ "LM, 5-0-W", "LMMMMM, 1-0-W" })
	void wrap_from_left_to_right(String command, String position) {
		assertEquals(rover.execute(command), position);
	}
	
	
}
