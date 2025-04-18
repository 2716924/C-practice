import java.util.*;
public class alternate_elements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int num = scan.nextInt();
        scan.nextLine();
        for(int i =0;i<num;i++){
            int number = scan.nextInt();
            scan.nextLine();
            numbers.add(number);
        }
        for(int i=0;i<numbers.size();i++){
            if(i%2==0){
                System.out.println(numbers.get(i));
            }
        }
        scan.close();
    }
}
