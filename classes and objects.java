class intro{
    String Name;
    int Age;

    void info(){
        System.out.println("Welcome " + Name);
        System.out.println("You are " + Age + " years old.");
    }
}

public class Main {

    public static void main(String[] args) {
        intro p1 = new intro();
        p1.Name="Kunal";
        p1.Age=21;

        System.out.println(p1.Name);
        System.out.println(p1.Age);

        intro p2 = new intro();
        p2.Name="Anmol";
        p2.Age=22;

        p2.info();
    }
}
