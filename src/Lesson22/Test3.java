package Lesson22;

public class Test3 {
    public static void main(String[] args) {
        doctor doc = new doctor();
        doc.name = "Ivan";
        doc.age = 50;
        doc.experience = 25;
        doc.eat();
        doc.specializaciya = "xirurg";
        doc.sleep();
        doc.lechit();

    }
}

class Employee {
    String name;
    int age;
    int experience;
    void eat (){System.out.println("Kushat"); }
    void sleep (){System.out.println("Spat"); }
}

class doctor extends Employee {
    String specializaciya;
    void lechit (){System.out.println("lechit"); }
}

class teacher extends Employee {
    int kolichestvoUchenikov;
    void uchit (){System.out.println("Uchit"); }
}

class Driver extends Employee{
    String nazvanieMashinu;
    void vodit (){System.out.println("Vodit"); }
}

