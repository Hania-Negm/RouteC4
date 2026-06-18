package dayFive;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
//        Person p1 = new Person();
//        Person p2 = new Person("Hanya" , 25 , 'F');
//        p2.printData();

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your balance");
//        double balance = sc.nextDouble();
//        BankAccount b1 = new BankAccount(balance);
//        b1.getBalance();
//
//        System.out.println("Enter your amount");
//        double amount = sc.nextDouble();
//        b1.deposit(amount);
//        b1.getBalance();

//        Dog dog = new Dog();
//        dog.eat();
//        dog.bark();

//        MathUtils m1 = new MathUtils();
//        m1.sum(5,5);
//        m1.sum(10.5,10.5);
//        System.out.println(m1.sum(5,5));
//        System.out.println(m1.sum(10.5,10.5));

//        Dog dog = new Dog();
//        dog.sound();

        Shape[] shapes = {new Circle() , new Square() , new Triangle()};

        for (Shape shape : shapes){
            shape.draw();
        }

        System.out.println("-------------------------------------------------------------");

        int i = 0;
        do {
            shapes[i].draw();
            i++;
        }while (i < shapes.length);
    }
}
