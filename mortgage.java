import java.util.Scanner;
public class mortgage{
    public static void main(String[]args){
        double Principal,n,mortgage,r;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Principal amount");
        Principal = scanner.nextDouble();
        System.out.println("Enter the number of years");
        n = scanner.nextDouble();
        System.out.println("Enter the interest");
        r = scanner.nextDouble();
        r = r/100/12;
        mortgage = Principal*((r*Math.pow(1+r,n))/(Math.pow(1+r,n)-1));
        System.out.println(mortgage);
    }
}