import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class FindSums {
	
	public static void main(String[] args) {
		Integer[] array = {20, 10, 30, 40};
		
		Arrays.sort(array, new ListComparator());
//		/Collections.sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		List<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(20);
		arrayList.add(10);
		arrayList.add(30);
		arrayList.add(40);
		Collections.sort(arrayList);
		System.out.println(arrayList);
		Comparator<Integer> listComparator = new ListComparator();
		Collections.sort(arrayList, new ListComparator());
		System.out.println(arrayList);
		
		String[] stringArray = {"Mayank", "Shivangi", "Saranya" };
		Arrays.sort(stringArray);
		for(int i = 0; i< stringArray.length; i++) {
			System.out.println(stringArray[i]);
		}
		
		Arrays.sort(stringArray, new StringComparator());
		for(int i = 0; i< stringArray.length; i++) {
			System.out.println(stringArray[i]);
		}
		
		Arrays.sort(stringArray, new StringLengthComarator());
		for(int i = 0; i< stringArray.length; i++) {
			System.out.println(stringArray[i]);
		}
		//System.out.println(stringArray);
	}


}

