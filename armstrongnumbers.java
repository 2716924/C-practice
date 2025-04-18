import java.util.Scanner;
import java.math.*;
public class armstrongnumbers{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.nextLine();
        String number = Integer.toString(num);
        int length = number.length();
        double sum = 0;
        for(int i=0;i<length;i++){
            char character = number.charAt(i);
            //System.out.println(character);
            int man = character - '0';
            //System.out.println(man);
            sum = Math.pow(man,3) + sum;
            //System.out.println(sum);
        }
        if (sum==num){
            System.out.println("True");
        }
        else{
           System.out.println("False");
        }
        scan.close();
    }
}