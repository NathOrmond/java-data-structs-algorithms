package sorting.analysis;

import java.util.List;
import java.util.Map;

public class RunSortingTests {

	public static void main(String[] args) {
		SortingSizesTest test = new SortingSizesTest(10, 100000);
		Map<String, List<Map<String, String>>> Results = test.getResults();
		
		// do something with output: either a file or stdoutput or something
		
	}

}
