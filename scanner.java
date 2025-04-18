import java.util.Scanner;
public class scanner{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your first name?");
        String name = scan.nextLine();
        System.out.println("What is youe yearbook quote");
        String yearbookquote = scan.nextLine();
        System.out.println("What is your age");
        int age = scan.nextInt();
        System.out.println("Thank you "+name+"you are "+age+"years old and your senior quote"+yearbookquote);
    }
}