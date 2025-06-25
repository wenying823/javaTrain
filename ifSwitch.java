import java.util.Scanner;

public class ifSwitch {
    public static void main(String[] args) {
        int age = 20;
        if (age >= 18) {
            System.out.println("已成年");
        } else {
            System.out.println("未成年");
        }
        
        Scanner scan = new Scanner(System.in);
        System.out.print("請輸入月份(1~12):");
        int month = scan.nextInt();
        String season;
        switch (month) {
            case 3: case 4: case 5:
                season = "春天";
                break;
            case 6: case 7: case 8:
                season = "夏天";
                break;
            case 9: case 10: case 11:
                season = "秋天";
                break;
            case 12: case 1: case 2:
                season = "冬天";
                break;
            default:
                season = "輸入錯誤";
        }
        System.out.println("季節：" + season);
    }
}
