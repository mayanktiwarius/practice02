
import java.util.*;
public class Solution {
	
//    static void StairCase(int n) {
//        StringBuffer buffer ;
//        int spaceCount = 0;
//        
//        for(int step = 0 ; step < n; step++) {
//        	buffer = new StringBuffer();
//            spaceCount = n - step - 1;
//            for(spaceCount = n - step - 1; spaceCount >0; spaceCount--) {
//            	buffer.append(" ");
//            }
//            for(spaceCount = 0; spaceCount <= step; spaceCount++)  {
//            	buffer.append("#");
//            }
//            System.out.println(buffer);
//        }
//
//    }
//    
//    static long sumOfIntegers(int[] arr) {
//        long sum = 0;
//        for(int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//        System.out.println(sum);
//        
//
//    }
	
	
    static int getHandshakeDistance(List<Set<Integer>> network, int person) {
    	 List<Integer>  visited = new ArrayList<Integer> ();
    	 return getDistance(network, 0, person, visited);
    }
    
    static int getDistance(List<Set<Integer>> network, int fromPerson, int toPerson,List<Integer>  visited ) {
    	int distance = -1;
    	if (fromPerson == toPerson ) return 0; // Same person
    	Set<Integer> handShakePersons = network.get(fromPerson);
    	if(handShakePersons.size() == 0) { // reached deadend
    		return -1;
    	}
    	visited.add(fromPerson);
    	for (Integer handShakePerson : handShakePersons) {
    		if(toPerson == handShakePerson) return 1; // Found the link
    		if(visited.contains(handShakePerson)) {
    			continue; // Already visited ignore him
    		}
			distance = getDistance(network,handShakePerson, toPerson, visited);
			if(distance != -1) { // Connection found
				return distance + 1;
			}
		}
    	
    	return -1;
    }

}
