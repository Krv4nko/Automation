package HM;
import Lesson11.Student;
public class StudentTest2 {
    static void method1 (Student st1, Student st2){
        if (st1.name.equals(st2.name) && st1.course == st2.course && st1.grade == st2.grade)
            System.out.println("Students are equals");
        else
            System.out.println("Students aren`t equals");
    }

    static void method2 (Student st1, Student st2){
        if (st1.name.equals(st2.name)) {
            if (st1.course == st2.course) {
                if (st1.grade == st2.grade) {
                    System.out.println("Students are equals");
                }else
                    System.out.println("Grade error");
            }else
                System.out.println("Course error");
        }else
                    System.out.println("Name error");
    }

    public static void main(String[] args) {
        Student s1 = new Student("Gera",5,6);
        Student s2= new Student("Gera",5,3);
        method1(s1, s2);
        method2(s1, s2);

    }

}
