//Teresa Tull created this 10-1-2022 ch 7 exercises

package exercisesCh7.technology;


public class Main {
    public static void main(String[] args) {

        Computer computer1 = new Computer(true, 1000, 16);
        System.out.println(computer1);

        Laptop laptop1 = new Laptop(true, 1000, 16, 5.3);
        System.out.println(laptop1);

        SmartPhone smartPhone1 = new SmartPhone(true, 152, 16,
                20);
        System.out.println(smartPhone1);

    }


}
