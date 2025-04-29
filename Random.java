import java.util.*;

public class Main{
    public static void main(String[] args) {
        
        Random random = new Random();
        int number1;
        int number2;
        int number3;

        // same for others booleans and doubles 

        number1 = random.nextInt(1,100);
        number2 = random.nextInt(1,100); 
        number3 = random.nextInt(1,100);  // if want number in range
        
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

    }
}

// random function producing function in java
