class Animal{
    void speak(){
        System.out.println("動物發出叫聲");
    }
}

class Dog extends Animal{
    void speak(){
        System.out.println("旺旺");
    }
}

class Cat extends Animal{
    void speak(){
        System.out.println("喵喵");
    }
}

class Vehicle {
    void move() {
        System.out.println("交通工具正在移動");
    }
}

class Car extends Vehicle {
    void move() {
        System.out.println("汽車在馬路上行駛");
    }

    void honk() {
        System.out.println("汽車鳴喇叭：嗶嗶！");
    }
}


public class Encapsulation {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.speak();
        Animal b = new Cat();
        b.speak();

        
        Vehicle v = new Vehicle();
        v.move();

        Car c = new Car();
        c.move();
        c.honk();

        Vehicle v2 = new Car();
        v2.move();
    }
}
