package HM;

public class hm8_2 {
    static final double pi = 3.14;

    public double ploschad(double radius){
        double pl = pi * radius * radius;
        return pl;
    }

    public static double dlina (double radius2){
        double dl = 2 * pi * radius2;
        return dl;
    }

    public void info (double radius3){
        System.out.println("ploscahdkruga :" + ploschad(radius3));
        System.out.println("dlinnaokrujnosti :" + dlina(radius3));
        System.out.println("radiuskruga :" + radius3 );
    }
}
class hm8_2test{
    public static void main(String[] args) {
        hm8_2 obj1 = new hm8_2();
        obj1.ploschad (7);
        hm8_2.dlina(16);
        obj1.info(19);

    }
}
