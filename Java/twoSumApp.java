
import java.util.Arrays;

class twoSumApp {
    public static void main(String[] args) {
        twoSum sumtwo = new twoSum();

        int[] numbers = {1, 3, 5, 6, 8, 9, 19, 25};

        int[] result = sumtwo.twoSum(numbers, 12);
        System.out.println("Indices are: " + Arrays.toString(result));
    }
}