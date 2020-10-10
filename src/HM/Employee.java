package HM;

public class Employee {
    int id;
    public String surname;
    int age;
    private double salary;
    String department;

    public Employee (int id2){
        id=id2;
    }
    Employee (String surname2){
        surname=surname2;
    }
    private Employee (double salary2){
        salary=salary2;
    }


    public void GetID (){
        System.out.println("ID =" + id);
    }
    public void Surname (){
        System.out.println("Surname: " + surname);
    }
    public void Salary (){
        System.out.println("Salary: " + salary);
    }



}

class EpmloyeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(7);
        Employee emp2 = new Employee("Kraven");
  //      Employee emp3 = new Employee(23,7);

        emp1.GetID();
        emp1.Surname();

        emp2.GetID();
        emp2.Surname();

        System.out.println(emp1.id);
        System.out.println(emp1.surname);

        System.out.println(emp2.id);
        System.out.println(emp2.surname);


    }

}
