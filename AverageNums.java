import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Write a program that reads 5 integers, stores them in a list, and finds the average.
public class AverageNums {

    public static void main(String[] args) {
        List<Integer>num=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int sum=0;
        for(int i=0;i<5;i++){
            System.out.println("Enter a number: ");
            int n=sc.nextInt();
           num.add(n);
            System.out.println(num);
            sum+=n;

        }
        int average=sum/5;
        System.out.println("Sum: "+sum);
        System.out.println("Average: "+average);
    }
}
