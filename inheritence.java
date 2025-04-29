class Animal{
    void sound(){
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Dog barks");
    }
}

public class Main{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.bark();
    }
}


// below is the example of method overriding
class Animal{
    void sound(){
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}

public class Main{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}



// multiple inheritance 

class Animal{
    void sound(){
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Dog barks");
    }
}

class puppy extends Dog{
    void weep(){
        System.out.println("Puppy weeps");
    }
}
public class Main{
    public static void main(String[] args) {
        puppy d = new puppy();
        d.sound();
        d.weep();
    }
}
