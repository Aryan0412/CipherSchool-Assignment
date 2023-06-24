package Revision;
import java.util.*;

public class PowerSet {
    public List<List<Integer>> subsets(int[] arr) {
        List<Integer> ll = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        printsubset(arr,ll,ans,0);
        return ans;
    }
    public static void printsubset(int [] arr,List<Integer>ll, List<List<Integer>> ans,int index) {

        if(index == arr.length) {
            ans.add(new ArrayList<>(ll));
            return;
        }

        printsubset(arr,ll,ans,index+1);
        ll.add(arr[index]);
        printsubset(arr,ll,ans,index+1);
        ll.remove(ll.size()-1);
    }
}
