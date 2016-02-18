import java.util.Comparator;


public class StringLengthComarator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return ((Integer)o2.length()).compareTo(o1.length());
	}

}
