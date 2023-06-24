package Lec11;
import java.util.*;
public class Trapping_Rain_Water {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0; i < T; i++) {
			int n = sc.nextInt();
			int [] arr = new int[n];
			
			for(int j = 0; j < arr.length; j++) {
				arr[j] = sc.nextInt();
			}
			RainWater(arr);
		}
		

	}
	public static void RainWater(int [] arr) {
		int[] Left = new int[arr.length];
		int[] Right= new int[arr.length];
		Left[0] = arr[0];
		for(int i= 1; i < arr.length; i++) {
			Left[i]=Math.max(Left[i-1],arr[i]);
		}
		Right[arr.length-1] = arr[arr.length-1];
		for(int i = arr.length-2;i >= 0; i--) {
			Right[i]=Math.max(Right[i+1], arr[i]);
		}
		int ans = 0;
		for(int i = 0; i < arr.length; i++) {
			ans += Math.min(Left[i], Right[i]) - arr[i];
		}
		System.out.println(ans);
	}

}
