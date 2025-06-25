class Person{
    String name;
    int age;
    String address;

    Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    void sayHello() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old" + " and my address is " + address);
    }

    void setAge(int newAge){
        this.age = newAge;
    }
}

class Book{
    String name;
    int price;
    Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    void sayInfo(){
        System.out.println("Book name is "+ name + ", price is "+ price);
    }
}
public class oop {
    public static void main(String[] args) {
        Person person = new Person("小明", 20, "Taiwan");
        person.sayHello();
        Book book = new Book("Java Book", 500);
        book.sayInfo();
    }
}
