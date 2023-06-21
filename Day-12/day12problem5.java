import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{


public static class Pair{
	int lino;
	int idx;
	int val;
   Pair(int lino,int idx,int val){
	   this.lino=lino;
	   this.idx=idx;
	   this.val=val;
   }
}

	public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> kArrays, int k)
	{
		ArrayList<Integer> ans=new ArrayList<>();
		Queue<Pair> pq=new PriorityQueue<>((a,b)->(a.val-b.val));
		for(int i=0;i<k;i++){
			pq.offer(new Pair(i,0,kArrays.get(i).get(0)));
		}
		while(!pq.isEmpty()){
			Pair temp=pq.poll();
			ans.add(temp.val);
			temp.idx++;
			if(temp.idx<kArrays.get(temp.lino).size()){
				temp.val=kArrays.get(temp.lino).get(temp.idx);
				pq.add(temp);
			}
		}
		return ans;
		// Write your code here.
	}
}
