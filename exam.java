import java.util.Scanner;
public class exam {
    public static void main(String[] args) {
        System.out.print("請輸入數字");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number>0){
            System.out.println("數字是正數");
        }else if(number<0){
            System.out.println("數字是負數");
        }else{
            System.out.println("數字是零");
        }


        System.out.print("請輸入數字將會從1加到您輸入的數字");
        int num_2 = sc.nextInt();
        int sum=0;
        for(int i = 1; i<=num_2; i++){
            sum = sum+i;
        }
        System.out.println("總合為"+sum);


        int[] array = {1,2,3,4,5};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("陣列最大值為" + max);

        System.out.print("輸入年份判斷是否為閏年: ");
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " 是閏年");
        } else {
            System.out.println(year + " 不是閏年");
        }
        
    }
}
