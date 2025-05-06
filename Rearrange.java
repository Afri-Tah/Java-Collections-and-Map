import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

//Take input of 5 strings and store in a TreeSet. Display in alphabetical order.
public class Rearrange {
    public static void main(String[] args) {
        Set<String> words=new TreeSet<>();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("Enter a word: ");
            words.add(sc.nextLine());
        }
        System.out.println("Sorted words: "+words);
    }
}
