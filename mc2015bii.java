import java.util.*;
public class mc2015bii {
    public static int common(ArrayList<Integer>s1,ArrayList<Integer>s2){
        int sum = 0;
        for(int i:s1){
            for(int j:s2){
                if (i==j){
                    sum++;
                }
            }
        }
        return sum;
    }
    public static void main(String[]args){
        ArrayList<Integer>s1 = new ArrayList<>();
        ArrayList<Integer>s2 = new ArrayList<>();

        s1.add(2);
        s1.add(3);
        s1.add(4);
        s2.add(2);
        s2.add(4);
        s2.add(1);
        int sum = common(s1, s2);
        System.out.println(sum);

    }
}
