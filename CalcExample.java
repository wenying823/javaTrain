public class CalcExample {
    public static void main(String[] args) {
        // int a = 10;
        // int b = 3;
        // System.out.println("The sum is: " + (a + b));
        // System.out.println("The division is: " + ((double)a / b));
        System.out.println("Question one");
        String name = "Todd";
        int age = 20;
        boolean isAdult = age >= 18;
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Is Adult: " + isAdult);
        System.out.println("Question two");
        int number = 20;
        boolean isEven = number % 2 == 0;
        System.out.println("Number: " + number + " Is " + isEven);
        System.out.println("Question three");
        int number_1 = 1;
        int number_2 = 2;
        if(number_1 > number_2) {
            System.out.println("Number 1 > Number 2");
        } else if(number_1 < number_2) {
            System.out.println("Number 1 < Number 2");
        } else {
            System.out.println("Number 1 = Number 2");
        }

    }
}
