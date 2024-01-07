import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[]arr={3,1,0};

        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] arr) {
        int i=0;

        while(i<arr.length){
            int correct=arr[i];
            if( arr[i]<arr.length &&arr [i]  !=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }

        }
        //search for missing number
        for(int index=0;index<arr.length;i++){
            if(arr[index]!=index){
                return index;
            }

        }
        return arr.length;


    }
     static void swap(int []arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

    }



}