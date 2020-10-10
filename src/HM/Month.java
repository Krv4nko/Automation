package HM;

public class Month {
  static  void Mcount (int month) {
        switch (month) {
            case 1:
            case 2:
            case 3:
                System.out.println("month has 30 days");
                break;
            case 4:
            case 5:
                System.out.println("month has 29 days");
                break;
            case 6:
                System.out.println("month has 31 days");
                break;
            default:
                System.out.println("incorrect month");

        }

    }

    public static void main(String[] args) {
        Mcount(3);
    }
}
