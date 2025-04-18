import java.util.Scanner;
public class fizzbuzz {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    if(num%5==0 && num%3==0){ //move the most important conditions up and the genric ones with follow
        System.out.println("fizzbuzz");
    } 
    else if(num%5==0){
        System.out.println("Fizz");
    }
    else if(num%3==0){
        System.out.println("Buzz");
    }   

    else{
        System.out.println(num);
    }
    }
}
