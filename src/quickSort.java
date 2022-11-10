public class quickSort {
    public static int partition(int[] arr, int start, int end)
    {
        int pivot = arr[end];

        for(int i=start; i<end; i++){
            if(arr[i]<pivot){
                int temp= arr[start];
                arr[start]=arr[i];
                arr[i]=temp;
                start++;
            }
        }

        int temp = arr[start];
        arr[start] = pivot;
        arr[end] = temp;

        return start;
    }
    static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int partition = partition(arr, start, end);
            quickSort(arr, start, partition - 1);
            quickSort(arr, partition + 1, end);


        }

    }
    static void printArr (int []arr, int size){
        for (int i =0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main (String[]args){
        int []arr = {19, 7, 200, 5, 29, 12, 18};
        int size= arr.length;
        quickSort t =new quickSort();
        t.quickSort(arr,0, size-1);
        printArr(arr,size);
    }
}
