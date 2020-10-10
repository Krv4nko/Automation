package HM;

public class Lesson6 {
    int sum (){
        int result = 0;
        System.out.println(result);
        return result;
    }
    int sum (int b) {
       int result1 = b;
        System.out.println("summaChisel: " + result1);
        return result1;
    }
    int sum (int c, int d){
        int result2 = c+d;
        System.out.println("summaChisel: " + result2);
        return result2;
    }
    int sum (int e, int r, int z){
        int result3 = e+r+z;
        System.out.println("summaChisel: " + result3);
       return e+r+z;
    }
    int sum (int x, int y, int i, int I){
        int result4 = x+y+i+I;
        System.out.println("summaChisel: " + result4);
        return result4;
    }
}

class Lesson6TEST {
    public static void main(String[] args) {
     Lesson6 l6 = new Lesson6();
     l6.sum(0);
     l6.sum(6);
     l6.sum(9, 12);
     l6.sum(2,4,9);
     l6.sum(12,8,3,13);
    }

}
