import java.util.HashMap;
import java.util.Map;


public class Solution {
    static int firstRepeatingThreeCharacterSubstring(int length, String input) {
    	Map<String, Integer> occurence = new HashMap<String, Integer>();
    	int limit = input.length() - length + 1;
    	for(int i = 0; i < limit; i++) {
    		String substring = input.substring(i, i + length);
    		if(occurence.containsKey(substring)) { // It is the second occrence of that string
    			return occurence.get(substring);
    		} else {
    			occurence.put(substring, i);
    		}
    	}
    	

    	return -1;
    }

}
