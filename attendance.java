import java.util.*;
public class attendance {
    public static void processinput(){
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        scan.nextLine();
        int m = scan.nextInt();
        scan.nextLine();
        int i =0;
        numbers.add(x);
        while(true){
            numbers.add(m);
            if(m==numbers.get(i)){
                break;
            }
            i++;
            m = scan.nextInt();
            scan.nextLine();
        }
        
        double sum =0;
        for(int j :numbers){
            sum+=j;
        }
        System.out.println(sum/numbers.size());
    }
    public static void main(String[] args) {
        processinput();
    }
}
