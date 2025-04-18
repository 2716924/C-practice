public class dog {
    String name;
    int age;
    public dog(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void bark(){
        System.out.println(name+" woof");
    }
    public static void main(String[]args){
        dog mydog = new dog("Snoopy",15);
        mydog.bark();
    }
}
