import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Take n integers from user input and find the maximum value.
public class MaxValue {
    public static void main(String[] args) {
        List<Integer>nums=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total number of integers: ");
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            System.out.println("Enter the numbers: ");
            nums.add(sc.nextInt());
        }
        int max= nums.get(0);
        for(int i=0;i<n;i++){
            if(nums.get(i)>max){
                max= nums.get(i);
            }

        }
        System.out.println("Maximum value: "+max);
    }
}
