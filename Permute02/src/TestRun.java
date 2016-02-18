import java.util.Scanner;


public class TestRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String data;
		while(true) {
			data = in.nextLine();
			permute(data);
			
		}
		
		
	}

	private static void permute(String data) {
		// TODO Auto-generated method stub
		//System.out.println(data);
		char[] charData = data.toCharArray();
		permute(charData, 0 , charData.length -1);
		
	}
	
	
	private static void permute(char[] charData, int start, int end) {
		// TODO Auto-generated method stub
		if(start == end)  {
			System.out.println(charData);
		}
		for(int counter = start; counter  <= end; counter++)  {
			swap(charData, start,  counter );
			permute(charData, start + 1, end);
			swap(charData, start,  counter );
		}
		
	}

	private static void swap(char[] charData, int src, int dest) {
		// TODO Auto-generated method stub
		char temp = charData[src];
		charData[src] = charData[dest];
		charData[dest] = temp;
	}


}
