package jianzhiOffer;

public class Offer51 {
    int cnt;
    public int InversePairs(int[] A) {
        int n = A.length - 1;
        cnt = 0;
        if (A == null || n == 0) {
            return 0;
        }
        mergeSortRecursion(A, 0, n );
        return cnt;
    }

    private void mergeSortRecursion(int[] arr, int left, int right) {
       int mid = (left+right)/2;

       if(left<right){
           mergeSortRecursion(arr,left,mid);
           mergeSortRecursion(arr,mid+1,right);
           merge(arr,left,mid,right);
       }

    }



    private void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];//辅助空间
        int index = 0;
        int i = left;
        int j = mid + 1;
       // int inverseNum = 0;//新增，用来累加数组的逆序对
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[index++] = arr[i++];
            } else {
                cnt += (mid - i + 1);
                temp[index++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[index++] = arr[i++];
        }
        while (j <= right) {
            temp[index++] = arr[j++];
        }
        for (int k = 0; k < temp.length; k++) {
            arr[left++] = temp[k];
        }

    }

    public static void main(String[] args) {
        Offer51 o = new Offer51();
        int[] a = {7,5,6,4};
        System.out.println(o.InversePairs(a));
    }
}
