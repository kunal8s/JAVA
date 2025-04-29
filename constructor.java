class dog{
    String Name;
    int Age;

    dog(){
        System.out.println("Dog is created default in constructor"); //default constructor
    }

    dog(String dName, int dAge){ //parameterized constructor
        Name = dName;
        Age = dAge;
        System.out.println("Dog name is: " + Name);
        System.out.println("Dog age is: " + Age);

    }

    dog(dog c){ //copy constructor
        Name = c.Name;
        Age = c.Age;
        System.out.println("Dog name is: " + Name);
        System.out.println("Dog age is: " + Age);
    }

    void dogee(){
        System.out.println("Dog name is: " + Name);
        System.out.println("Dog age is: " + Age);
    }
}

public class Main{
    public static void main(String[] args) {
        dog d1 = new dog();// default constructor
        

        dog d3 = new dog("Bobby", 3); //parameterized constructor

        dog d4 = new dog(d3); //copy constructor
    }
}

// if we use single constructur then it is case of normal 
// but if we use more than one type of constructor in same class then it is case of constructor overloading


