import java.util.Scanner;
public class LoopSum {
    public static void main(String[] args) {
        // int sum = 0;
        // for(int i = 1; i<101; i++) {
        //     sum += i;
        // }
        // System.out.println("1到100的總和是: " + sum);
        int i = 1;
        while(i < 11){
            System.out.println(i);
            i++;
        }
        
        for(int j=1; j<=9; j++){
            for(int k=1; k<=9; k++){
                System.out.print(k + "*" + j + "=" + (k*j) + " ");
            }
            System.out.println();
        }

        Scanner sc = new Scanner(System.in);
        int input;
        do{
            System.out.print("請輸入一個數字: ");
            input = sc.nextInt();
        }while(input!=0);
        System.out.println("你終於輸入0");
    }
}
