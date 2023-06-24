package Sorting;

public class InsertionSort {
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int []arr ={7,8,3,1,2};

        //insertion sort
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            int j=i-1;
            while(j>=0 && curr<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }

            //placement
            arr[j+1]=curr;
        }
        printArray(arr);
    }   
}
