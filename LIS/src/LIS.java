import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class LIS {
	
	public ArrayList<HtWt> getLis(ArrayList<HtWt> items) {
		Collections.sort(items);
		return genLis(items);
	}

	private ArrayList<HtWt> genLis(ArrayList<HtWt> items) {
		// TODO Auto-generated method stub
		ArrayList<HtWt>[] solutions = new ArrayList[items.size()];
		genAllLis(items, solutions,0);
		
		ArrayList<HtWt> bestSequence = null;
		for(int i = 0; i < solutions.length; i++) {
			bestSequence = seqWithMaxLength(bestSequence, solutions[i]);
		}
		
		return bestSequence;
	}

	private ArrayList<HtWt> seqWithMaxLength(ArrayList<HtWt> seq1, ArrayList<HtWt> seq2) {
		// TODO Auto-generated method stub
		if(seq1 == null) return seq2;
		if(seq2 == null) return seq1;
		
		return seq1.size() > seq2.size()? seq1 : seq2;
	}

	private void genAllLis(ArrayList<HtWt> items, ArrayList<HtWt>[] solutions, int currentIndex) {
		// TODO Auto-generated method stub
		if(currentIndex >= items.size() || currentIndex < 0 ) {
			return;
		}
		
		// Find longest increasing subsequence
		ArrayList<HtWt> maxSequence = null;
		for(int i = 0; i < items.size(); i ++) {
			if(items.get(i).isBefore(items.get(currentIndex))) {
				maxSequence = seqWithMaxLength(maxSequence, solutions[i]);
			}
			
		}
		ArrayList<HtWt> newSolution = new ArrayList<HtWt>();
		if(maxSequence != null) {
			newSolution.addAll(maxSequence);
		}
		newSolution.add(items.get(currentIndex));
		solutions[currentIndex] = newSolution;
		genAllLis(items, solutions, currentIndex +1);
		
		
	}
	

}
