import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        for(int i = 0; i < numbers.length; i++) {
            System.out.println("數字：" + numbers[i]);
        }
        int min = Arrays.stream(numbers).min().getAsInt();
        System.out.println("最小值是: " + min);
        int max =  Arrays.stream(numbers).max().getAsInt();
        System.out.println("最大值是: " + max);

        
        int[] numbersArray = {1, 2, 3, 4, 5};
        int sum = 0;
        for(int i = 0; i < numbersArray.length; i++) {
            sum = sum + numbersArray[i];
        }
        System.out.println("總和是: " + sum);
    }
}
