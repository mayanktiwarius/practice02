import java.util.Scanner;


public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Denomination denomination = new Denomination();
		int ways = denomination.getAllChanges(6);
		System.out.println(ways);
		Scanner in =  new Scanner(System.in);
		String strInput;
		int intInput;
		while(true) {
			strInput = in.nextLine();
			intInput = Integer.parseInt(strInput);
			System.out.println(denomination.getAllChanges(intInput));
		}

	}

}
