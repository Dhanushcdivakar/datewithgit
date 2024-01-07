// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[][]matrix={{1 ,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };
        int target=3;
        boolean  ans=searchMatrix(matrix,target);
        System.out.println(ans);
    }
    public static boolean searchMatrix(int[][]matrix,int target){
        int r=0;
        int c= matrix.length;
        while(r< matrix.length&&c>=0){
            if(matrix[r][c]==target) {
                return true;
            }
            if(matrix[r][c]<target){
                r++;

            }else{
                c--;
            }

        }
        return false;

    }
}