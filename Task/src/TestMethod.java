import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMethod {
	public Map<Integer, String> buildInnerMap(List<String> batterList) {
	     Map<Integer, String> innerBatterMap = new HashMap<Integer, String>();
	     int index = 1;
	     for (String item : batterList) {
	         innerBatterMap.put(index, item);
	         index++;
	     }
	     return innerBatterMap;
	}
}
