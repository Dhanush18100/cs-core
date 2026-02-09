public class oops_introduction {
    public static void main(String[] args) {

        // Without class

        // Data of 5 students: {roll no,name, marks}
        int[] rollno = new int[5];
        String[] name = new String[5];
        int marks[] = new int[5];

        // suppose if a person told to store name of 5 students we can store it in string array, if we have more information like student name , marks etc during that time instead of creating saperate array for every single type we can store it in class

        Student[] students = new Student[5];

        // creating object
         Student student1 = new Student(13, "Dhanush N", 90);

        // assigning

        // student1.rollno=11;
        // student1.name="Dhanush";
        // student1.marks=90;
        // acessing

        System.out.println(student1.rollno);// 0
        System.out.println(student1.name);// null
        System.out.println(student1.marks);// 0.0

        // student1.changeName("Dhanush Nayak");
        // student1.greeting();
    }
    // Creating class
}

class Student {
    int rollno;
    String name;
    int marks;

    void greeting(){
        System.out.println("Hello!"+this.name);
    }

    void changeName(String newName){
        name=newName;
    }

    // creating constructor
    // Student() {
    //     this.rollno = 11;
    //     this.name = "Dhanush";
    //     this.marks = 90;
    // }

    Student(){
        this(11,"Hello",100);
    }

   Student(int rno, String name, int marks) {
        this.rollno = rno;
        this.name = name;
        this.marks = marks;
    }
}
