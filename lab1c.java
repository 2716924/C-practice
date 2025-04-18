import java.util.*;
public class lab1c {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        int sum =0;
        ArrayList<Integer>numbers = new ArrayList<>();

        boolean duplicate = false;
        while(true) {
            int x = scan.nextInt();
            scan.nextLine();
            for (int i = 0; i < numbers.size() - 1; i++) {
                if (numbers.get(i) == x) {
                    break;
                }
            }
            sum = sum+x;
            numbers.add(x);

        }
        double average = (double)sum/numbers.size();

    
}

}

