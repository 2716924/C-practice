import java.util.*;
public class median{
    public static void main(String[]args){
        ArrayList<Integer> number = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.nextLine();
        for(int i=0;i<num;i++){
            int n = scan.nextInt();
            scan.nextLine();
            number.add(n);
        }
        Collections.sort(number);
        if(num%2!=0){
            System.out.println(number.get(number.size()/2));
        }
        else{
            int num1 = number.get(number.size()/2);
            int num2 = number.get(number.size()/2-1);
            int median = (num1+num2)/2;
            System.out.println(median);
        }
        
        scan.close();
    }
}