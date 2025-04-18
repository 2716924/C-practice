import java.util.*;
public class binary{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String binary = scan.nextLine();
        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)=='1'||binary.charAt(i)=='0'){
                System.out.println("1");
                break;
            }
            else{
                System.out.println("0");
                break;
            }
            
        }
        scan.close();
    }
}