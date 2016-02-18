import java.util.LinkedList;
import java.util.Queue;


public class QueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<Integer>();
		for(int i = 0; i< 10; i++) {
			queue.add(i);
		}
		while(!queue.isEmpty()) {
			System.out.println(queue.remove());
		}
	}

}
