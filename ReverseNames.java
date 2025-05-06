import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Take a list of student names, and print them in reverse order.
public class ReverseNames {
    public static void main(String[] args) {
        List<String>names=new ArrayList<>(Arrays.asList("David","Sara","Cole","Ariana"));
       for(int i=names.size()-1;i>=0;i--){
           System.out.print(names.get(i)+" ");
        }

    }
}
