package Lesson12;

public class Car {
    int engine;
    int doorsCount;

    Car(int engine, int doorsCount){
        this.engine=engine;
        this.doorsCount=doorsCount;
    }
}

class carTest{
    public static void main(String[] args) {
        Car c1 = new Car(3,4);
        Car c2 = new Car (2,5);

        if (c1.engine>c2.engine)
        if (c1.doorsCount>c2.doorsCount)
            System.out.println(" power of first car is higher");
        System.out.println(" power of second car is higher");
    }

}