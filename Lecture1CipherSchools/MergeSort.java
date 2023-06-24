package Lecture1CipherSchools;

public class MergeSort {
    public static void main(String[] args) {
        int [] arr = {4,8,5,1,5,2,3,4,5};
        int [] SortedArray = MergeSort(arr,0,arr.length-1);
        for(int i = 0; i < SortedArray.length;i++) {
            System.out.print(SortedArray[i]+" ");
        }

    }
    public static int [] MergeSort(int [] arr, int lo , int hi) {
        if(lo == hi) {
            int [] a = new int[1];
            a[0] = arr[lo];
            return a;
        }


        int mid = (lo + hi)/2;

        int [] fp = MergeSort(arr,lo,mid);
        int [] sp = MergeSort(arr,mid+1,hi);
        return MergingTwoSortedArrays(fp,sp);
    }
    public static int [] MergingTwoSortedArrays(int [] a, int [] b) {
        int i = 0;
        int j = 0;
        int k = 0;
        int [] Merge = new int[a.length+b.length];
        while(i < a.length && j < b.length) {
            if(a[i]>b[j]) {
                Merge[k] = b[j];
                k++;
                j++;
            }
            else {
                Merge[k] = a[i];
                k++;
                i++;
            }
        }

        if(i < a.length) {
            for(int idx1 = i ; idx1 < a.length;idx1++) {
                Merge[k] = a[idx1];
                k++;
            }
        }
        if(j < b.length) {
            for(int idx1 = j ; idx1 < b.length;idx1++) {
                Merge[k] = b[idx1];
                k++;
            }
        }
        return Merge;
    }
}
