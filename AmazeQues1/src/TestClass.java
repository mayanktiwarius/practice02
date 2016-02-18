import java.util.Scanner;


public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question question = new Question();
		Solution solution = new Solution();
		Scanner in =  new Scanner(System.in);
		String strInput;
		int intInput;
		int pattern;
		String data;
		while(true) {
			strInput = in.nextLine();
			pattern =Integer.parseInt(strInput);
			strInput = in.nextLine(); 
			data = strInput;
			System.out.println(solution.firstRepeatingThreeCharacterSubstring(pattern, data));
			//intInput = Integer.parseInt(strInput);
			//System.out.println(denomination.getAllChanges(intInput));
		}
	}

}
