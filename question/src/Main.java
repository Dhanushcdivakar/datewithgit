// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[]a={2,7,11,15};
        int target = 9;
        int[] result=sum(a,target);
        for(int i=0;i< result.length;i++){
            System.out.println(result[i]);
        }


    }
    public static int[] sum(int[]a,int target){
        int sum;


        for(int i=0;i<a.length-1;i++){
            if(a[i]+a[i+1]==target)
            {
                return new int[]{i,i+1};


            }


        }
        return new int[0];
    }
}