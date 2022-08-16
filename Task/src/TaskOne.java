import java.util.*;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class TaskOne {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestMethod mUtil = new TestMethod();
        List<String> batterList = new ArrayList<>();
        List<String> innerBatterMap = new ArrayList<>();
		
        batterList.add("alpha");
        batterList.add("beta");
        innerBatterMap.add("delta");
	System.out.println(batterList);
	System.out.println(innerBatterMap);
	System.out.println(mUtil.buildInnerMap(batterList));
	System.out.println(mUtil.buildInnerMap(innerBatterMap));

//		Map<Integer, Map<Integer, String>> testMap = new HashMap<>();
//		
//		testMap.put(1, new HashMap<Integer, String>() {
//		    {
//		        put(1, "Dark Chocolate");
//		    }
//		});
		
//		System.out.println(testMap);

//		featureEvent={
//			events:
//			{
//			openingSequence:[
//			{
//			duration: '10:00:05',
//			start: '00:00:01',
//			end: '10:00:05',
//			startinsecs: '45323424',
//			endinsecs: '23543534'
//			}
//			],
//			recapPreviousSeason: [
//			{
//			duration: '12:00:07',
//			start: '00:00:07',
//			end: '12:00:07',
//			startinsecs: '645234234',
//			endinsecs: '567566433'
//
//			}
//			]
//			}
//			}


}
}