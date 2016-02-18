import java.util.*;
public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution = new Solution();
//		Scanner in =  new Scanner(System.in);
//		String strInput;
//		int intInput;
//		while(true) {
//			strInput = in.nextLine();
//			intInput = Integer.parseInt(strInput);
//			solution.StairCase(intInput);
//			//System.out.println(denomination.getAllChanges(intInput));
//		}
		
		List<Set<Integer>> network = new ArrayList<Set<Integer>> ();
		Set<Integer> item = new HashSet<Integer>();
		item.add(1);
		network.add(item);
		item = new HashSet<Integer>();
		item.add(0);
		item.add(2);
		network.add(item);
		item = new HashSet<Integer>();
		item.add(1);
		network.add(item);
		item = new HashSet<Integer>();
		network.add(item);
		System.out.println(solution.getHandshakeDistance(network, 2));
		
	}

}
