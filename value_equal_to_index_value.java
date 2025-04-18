import java.util.*;

public class value_equal_to_index_value{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        ArrayList<Integer> number = new ArrayList<>();
        scan.nextLine();

        for(int i=0;i<num;i++){
            int numbers = scan.nextInt();
            scan.nextLine();
            number.add(numbers);
        }
        int index = number.get(num-1);
        //System.out.println(index);
        for(int i : number){
            if(i<index){
                index  = i;
            }
        }
        System.out.println(index);
        scan.close();
    }
}