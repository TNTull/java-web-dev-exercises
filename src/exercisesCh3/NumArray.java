package exercisesCh3;

public class NumArray {
    public static void main(String[] args) {

        int[] numArray = {1, 1, 2, 3, 5, 8};

        System.out.println("for each loop: ");
        for (int tempArr : numArray) {
            System.out.println(tempArr);
        }

        System.out.println("for loop: ");
        for (int i = 0; i < numArray.length; i++) {
            System.out.println(numArray[i]);
        }
        System.out.println("odd numbers: ");
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i]%2!=0){
                System.out.println(numArray[i]);
            }
        }
    }
}
