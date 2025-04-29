class person{
    String name;
    int Age;

    

    person(String name, int Age){
        this.name = name;
        this.Age = Age;
    }
}

class hero extends person{
     String power;

     hero(String name, int Age, String power){
        // earlier we use below method of assigning using this keyword
    //    this.name = name;
    //     this.Age = Age;

        super(name, Age); // this will call the constructor of parent class
        this.power = power; 
        // but we can also use super keyword to assign the values of parent class




     }
}

public class Main{
    public static void main(String[] args) {
        hero h = new hero("Kunal", 21, "Invisibility");
        System.out.println(h.name);
        System.out.println(h.Age);
        System.out.println(h.power);
    }
}
