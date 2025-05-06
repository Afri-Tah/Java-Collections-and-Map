import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
//Add 10 integers to a HashSet, including duplicates. Print the unique values.
public class UniqueNums {
    public static void main(String[] args) {
        Set<Integer>numbers=new HashSet<>(Arrays.asList(1,2,2,2,3,4,5,7,8,9));
        System.out.println(numbers);
    }
}
