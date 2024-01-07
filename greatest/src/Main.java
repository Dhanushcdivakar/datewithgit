import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("enter the number of element you want to enter ");
        Scanner S=new Scanner(System.in);
        int num =S.nextInt();
        System.out.println("enter the elements");
        int []arr=new int[10];
        for(int i=0;i<num;i++)
        {
         arr[i]=S.nextInt();
        }
        int max=arr[0];
        for(int i=0;i<num;i++){
            if(arr[i]>=max)
                max=arr[i];
        }
        System.out.println("the greatest is"+max);

    }
}