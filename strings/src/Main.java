// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String series=" ";
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
           series=series+ch;
        }
        System.out.println(series);

    }
}