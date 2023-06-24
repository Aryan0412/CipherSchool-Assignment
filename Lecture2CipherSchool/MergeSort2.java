package Revision;
import java.util.*;

public class MergeSort2 {
        public static void main(String[] args) {
            List<Integer> nums = Arrays.asList(1, 2, 3, 4, 4, 4, 5, 6);
            int target = 4;

            List<Integer> result = searchRange(nums, target);

            System.out.println("First Occurrence: " + result.get(0));
            System.out.println("Last Occurrence: " + result.get(1));
        }
    public static int firstOccurrence(List<Integer> nums, int target) {
        int size = nums.size();
        int start = 0;
        int last = size - 1;
        int index = -1;
        while (start <= last) {
            int mid = start + (last - start) / 2;
            if (nums.get(mid) == target) {
                index = mid;
                last = mid - 1;
            } else if (nums.get(mid) > target) {
                last = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return index;
    }

    public static int lastOccurrence(List<Integer> nums, int target) {
        int size = nums.size();
        int start = 0;
        int last = size - 1;
        int index = -1;
        while (start <= last) {
            int mid = start + (last - start) / 2;
            if (nums.get(mid) == target) {
                index = mid;
                start = mid + 1;
            } else if (nums.get(mid) > target) {
                last = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return index;
    }

    public static List<Integer> searchRange(List<Integer> nums, int target) {
        int firstOcc = firstOccurrence(nums, target);
        int secondOcc = lastOccurrence(nums, target);
        return Arrays.asList(firstOcc, secondOcc);
    }
}
