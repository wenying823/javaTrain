public class MathTool {
    public static int square(int number) {
        return number * number;
    }

    public static double avg(int num1, int num2, int num3){
        return (double)(num1 + num2 + num3) / 3;
    }

    public static String getInfo(String name, int age){
        return "姓名: " + name + ", 年齡: " + age;
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        int result = square(5);
        System.out.println("5的平方是: " + result);
        double avg = avg(11, 122, 15);
        System.out.println("11, 122, 15的平均值是: " + avg);
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("請輸入姓名: ");
        String name = scanner.nextLine();
        System.out.print("請輸入年齡: ");
        int age = scanner.nextInt();
        String info = getInfo(name, age);
        System.out.println(info);


        
    }
}
