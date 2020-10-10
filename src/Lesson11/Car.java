package Lesson11;

public class Car {
    String color;
    String engine;
    int doorsCount;

    Car (String color, String engine, int doorsCount){
        this.color = color;
        this.engine = engine;
        this.doorsCount = doorsCount;
    }

}
class CarTest {
    void changeDoorsCount (Car c, int doorsCount){
        c.doorsCount = doorsCount;
    }
    void changeColor (Car c1, Car c2){
        String color = c1.color;
        c1.color = c2.color;
        c2.color = color;
    }

    public static void main(String[] args) {
        CarTest ct = new CarTest();
        Car car1 = new Car("red", "V6",4);
        Car car2 = new Car("Yellow", "V4", 2);

        ct.changeDoorsCount(car1, 6);
        ct.changeColor(car1,car2);

        System.out.println("cvet mashinu: " + car1.color + "  motor: " + car1.engine + "  dveri: " + car1.doorsCount);
        System.out.println("cvet mashinu: " + car2.color + "  motor: " + car2.engine + "  dveri: " + car2.doorsCount);



    }



}