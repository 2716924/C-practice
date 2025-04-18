
import java.util.Scanner;
class lab1b {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int c = 0;
        for(int j =0;j<=i;j++){
            c = c+j;
            //System.out.println(j);

        }
        System.out.println(c);
    }
}