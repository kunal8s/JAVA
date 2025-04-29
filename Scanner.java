import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: "); //just print take input on same line but print ln on next line
        String name = input.nextLine();

        System.out.println("Enter your Age: ");
        int age = input.nextInt();

        System.out.println("Enter your gpa: ");
        double gpa = input.nextDouble();

        System.out.println("Hello "+ name);
        System.out.println("You are "+ age +" years old.");
        System.out.println("Yur gpa is: "+ gpa);

        
        input.close();
    }
}


public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter your favourite color: ");
        String color = scanner.nextLine();

        System.out.println("You are "+ age +" years old.");
        System.out.println("Your favourite color is "+ color);
    }
}
