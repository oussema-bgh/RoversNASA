package rovers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import main.Run;

class RunTest {
	@ParameterizedTest
	@CsvSource({ "1 3 N\r\n" + "5 1 E" })
	void test_Main(String output) {
		String[] args = { "C:\\Users\\Input.txt" };

		Run.main(args);
	}

	@ParameterizedTest
	@CsvSource({ "program failed with error: " })
	void test_Main_with_No_File(String output) {
		String[] args = { "C:\\Users\\Input.txt" };
		Run.main(args);
	}
}
