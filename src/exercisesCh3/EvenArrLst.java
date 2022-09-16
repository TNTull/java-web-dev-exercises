package exercisesCh3;

import java.util.ArrayList;


public class EvenArrLst {
    public static void main(String[] args) {

        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(18);
        arrList.add(10);
        arrList.add(41);
        arrList.add(85);
        arrList.add(26);
        arrList.add(12);
        arrList.add(9);
        arrList.add(2);
        arrList.add(33);
        arrList.add(76);

        int evenTotal = sumEven(arrList);

        System.out.println(evenTotal);
    }
        public static int sumEven(ArrayList<Integer> arrList) {
        int total = 0;
        for (int intTemp : arrList) {
            if (intTemp % 2 == 0) {
                total += intTemp;
            }
        }
            return total;
        }

}
