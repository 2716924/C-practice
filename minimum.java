import java.util.Scanner;
import java.util.ArrayList;
public class minimum {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int x;
        int minimum = Integer.MAX_VALUE;
        while(true){
            x = scan.nextInt();
            if(x==-1){
                break;
            }
            if(x<minimum){
                minimum = x;
            }
        }
        System.out.println(minimum);
    }
}
