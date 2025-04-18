import java.util.*;
public class mc2015bi{
    public static double average(ArrayList<Integer>numbers){
        int n = numbers.size();
        double sum =0;
        for(int i=0;i<numbers.size();i++){
            sum = sum+numbers.get(i);
        }
        return sum/n;
    }
}