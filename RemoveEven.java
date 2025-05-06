//Create a List<Integer> and add 10 numbers. Remove all even numbers.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveEven {
    public static void main(String[] args) {
        List<Integer>nums=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,20,13));
        nums.removeIf(n->n%2==0);
        System.out.println("Odd numbers in the list: "+nums);
    }
}