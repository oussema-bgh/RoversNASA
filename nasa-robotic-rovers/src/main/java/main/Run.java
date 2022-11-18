package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import enums.Orientation;
import model.Coordinate;
import model.Grid;
import model.Rover;
import service.Direction;
import service.DirectionImpl;

public class Run {

	public static void main(String[] args) {

		if (args != null && args.length != 0) {

			String fileName = args[0];

			try {
				List<String> list = Files.readAllLines(Paths.get(fileName));
				if (null != list && !list.isEmpty()) {
					Grid grid = new Grid(Integer.valueOf(list.get(0).split(" ")[0]),
							Integer.valueOf(list.get(0).split(" ")[1]));

					for (int i = 1; i < list.size() - 1; i += 2) {
						Coordinate cord = new Coordinate(Integer.valueOf(list.get(i).split(" ")[0]),
								Integer.valueOf(list.get(i).split(" ")[1]));

						Orientation or = Orientation.orientationMatching(list.get(i).split(" ")[2]);

						Direction direction1 = new DirectionImpl(or);

						Rover rover = new Rover(grid, cord, direction1);

						String instraction = list.get(i + 1);
						rover.execute(instraction);

						System.out.println(rover.toString());
					}

				}
			} catch (IOException e) {
				System.out.println(e.toString());
			}

		}
	}

}
