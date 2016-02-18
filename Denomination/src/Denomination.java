
public class Denomination {
	
	public int getAllChanges(int amount) {
		int [] denominations = { 25, 10, 5, 1};
		return getAllChanges(amount, denominations, 0);
	}

	private int getAllChanges(int amount, int[] denominations, int index) {
		// TODO Auto-generated method stub
		if( index >= denominations.length -1) {
			return 1;
		}
		
		int denomination = denominations[index];
		int amountRemaining = 0;
		int ways = 0;
		
		for (int i = 0; i* denomination <= amount; i++) {
			amountRemaining = amount - i* denomination;
			
			ways += getAllChanges(amountRemaining, denominations, index + 1);
		}
		return ways;
	}
	

}
