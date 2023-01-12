package exercises.ch3;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {

    public static void main(String[] args) {
        ArrayList<Integer> numberToSum = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        ArrayListPractice.sumAllEvenValues(numberToSum);
//        numberToSum.add(1);
//        numberToSum.add(2);
//        numberToSum.add(3);
//        numberToSum.add(4);
//        numberToSum.add(5);
//        numberToSum.add(6);
//        numberToSum.add(7);
//        numberToSum.add(8);
//        numberToSum.add(9);
//        numberToSum.add(10);
//
    }

    public  static Integer sumAllEvenValues(ArrayList<Integer> valueToSum) {
        for (int i = 0; i < valueToSum.size(); i++) {
            if (valueToSum.get(i) % 2 == 0) {
                System.out.println(valueToSum.get(i));
            }
        }
        return 0;
    }
}
