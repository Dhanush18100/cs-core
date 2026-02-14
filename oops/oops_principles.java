public class oops_principles {
    public static void main(String[] args) {
        // Dog d=new Dog();
        // d.bark();
        // d.eat();
        // Puppy p=new Puppy();
        // p.sleep();
        // p.bark();
        // p.eat();

        // Puppy p=new Puppy();
        // p.sleep();
        // p.eat();

        // Dog d=new Dog();
        // d.bark();
        // d.eat();  
        // Calculators c=new Calculators();
        // System.out.println(c.add(10, 5));
        // System.out.println(c.add(10, 5, 15)); 

        // Animal a=new Dog();
        // a.sound();

        // Student s=new Student();
        // s.setMarks(99);
        // System.out.println(s.getMarks());

        Vehicle v=new Car();
        v.start();
        v.fuelType();
    }
    
}
//Single Inheritence

//  class Animal{
//     void eat(){
//         System.out.println("Animal eats food");
//     }
//  }

//  class Dog extends Animal{
//     void bark(){
//         System.out.println("The Dog Barks.");
//     }
//  }

//Multilevel inheritence
// class Animal{
//     void eat(){
//         System.out.println("Animal eats food");
//     }
// }

// class Dog extends Animal{
//     void bark(){
//         System.err.println("Dog Barks");
//     }
// }

// class Puppy extends Dog{
//     void sleep(){
//         System.out.println("Sleeping");
//     }
// }

//Hirarchical inheritence
// class Animal{
//     void eat(){
//         System.out.println("Animal eats food");
//     }
// }

// class Dog extends Animal{
//     void bark(){
//         System.err.println("Dog Barks");
//     }
// }

// class Puppy extends Animal{
//     void sleep(){
//         System.out.println("Sleeping");
//     }
// }


//Polymorphism ->Method overloading

// class Calculators{
//     int add(int a,int b){
//         return a+b;
//     }
//     int add(int a,int b,int c){
//         return a+b+c;
//     }
// }

// method overriding

// class Animal{
//     void sound(){
//         System.out.println("Animal makes sound");
//     }
// }

// class Dog extends Animal{
//     @Override
//     void sound(){
//         System.out.println("Dog Barks");
//     }
// }

//Encapsulation

// class Student{
//     private int marks;
//     public void setMarks(int m){
//         if(m>=0 &&m<=100){
//             marks=m;
//         }else{
//             System.out.println("Invalid marks");
//         }
//     }
//     public int getMarks(){
//         return marks;
//     }
// }


abstract class Vehicle{
    abstract void start();

    void fuelType(){
         System.out.println("Vehicle needs fuel");
    }
}

class Car extends Vehicle{
    void start(){
        System.out.println("Car starts with key");
    }
}

