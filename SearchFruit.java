import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
//Check if a set contains a specific value.
public class SearchFruit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Set<String>fruits=new HashSet<>(Arrays.asList("Apple","Banana","Mango"));
        System.out.println("Enter a fruit that you want to search: ");
        String f= sc.nextLine();
        System.out.println("Contains "+f+"?"+fruits.contains(f));
    }
}
