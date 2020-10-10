package HM;

public class HM8 {

    static int resultumnozhenia (int a, int b, int c){
        return a*b*c;
    }
    static void delenie (int a, int b){
        System.out.println("tseloeCheslo =" + a / b + "; ostatok :" + a % b);
    }
}

class HM8Test {
    public static void main(String[] args) {
        System.out.println(HM8.resultumnozhenia(2,7,21)); HM8.delenie(49,6);
        System.out.println(HM8.resultumnozhenia(5,8,24)); HM8.delenie(24,5);
    }
}

