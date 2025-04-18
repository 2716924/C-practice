import java.util.*;
public class countofsmallernumbers{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.nextLine();
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=0;i<num;i++){
            int input = scan.nextInt();
            scan.nextLine();
            numbers.add(input);
        }
        int compare = scan.nextInt();
        scan.nextLine();

        int count = 0;

        for(int i:numbers){
            if(i<=compare){
                count++;
            }
        }
        System.out.println(count);
        scan.close();
    }
}