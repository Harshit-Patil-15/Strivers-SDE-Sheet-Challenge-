
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
	public static ArrayList<Integer> kMaxSumCombination(ArrayList<Integer> a, ArrayList<Integer> b, int n, int k) {
	
		ArrayList<Integer>temp = new ArrayList<Integer>();

		
		for (int i = 0; i < n; i++) {
	
			for (int j = 0; j < n; j++) {
				int currentSum = a.get(i) + b.get(j);
				
				temp.add(currentSum);
			}
		}

		Collections.sort(temp, Collections.reverseOrder());
		ArrayList<Integer> result = new ArrayList<Integer>();
		result.addAll(temp.subList(0, k));

		return result;
	}
}
//brute force 