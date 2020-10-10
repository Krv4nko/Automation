package HM;

public class Student {
    int studentID;
    String name;
    String surname;
    int course;
    double mathAverageGrade;
    double economicsAverageGrade;
    double foreingLanguageAverageGarde;

    Student (int studentID2, String name2, String surname2, int course2, double mathAverageGrade2,
             double economicsAverageGrade2, double foreingLanguageAverageGarde2){
      this (studentID2, name2, surname2, course2);
        mathAverageGrade = mathAverageGrade2;
        economicsAverageGrade = economicsAverageGrade;
        foreingLanguageAverageGarde = foreingLanguageAverageGarde2;
    }
    Student (int studentID3, String name3, String surname3, int course3){
        studentID = studentID3;
        name = name3;
        surname = surname3;
        course = course3;
    }
    Student (){
    }
}

class StudentTest {

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(2, "Harold", "Petuhovski", 4);
        Student s3 = new Student(7, "Jake", "Kogan", 3, 8,
                7, 9);
        System.out.println(s3);


    }

}
