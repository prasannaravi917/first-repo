import java.util.Scanner;

interface Student1 {
}

class Parent {
    String parentName;
    String parentContact;

    void parents(Scanner sc) {
        System.out.print("Enter the parent name: ");
        parentName = sc.nextLine();
        System.out.print("Enter the parent contact number: ");
        parentContact = sc.nextLine();
    }
}

class Student extends Parent implements Student1 {
    String studentName;
    String id;
    int age;
    int branch;
    String a; 

    public void studentDetails(Scanner sc) {
        System.out.print("Enter the student name: ");
        studentName = sc.nextLine();
        System.out.print("Enter the student ID: ");
        id = sc.nextLine();
        System.out.print("Enter the student age: ");
        age = sc.nextInt();

        System.out.println("Choose the branch:");
        System.out.println("1. AI&DS");
        System.out.println("2. CSE");
        System.out.println("3. AI&ML");
        branch = sc.nextInt();

        switch (branch) {
            case 1:
                a = "AI&DS";
                break;
            case 2:
                a = "CSE";
                break;
            case 3:
                a = "AI&ML";
                break;
            default:
                a = "Invalid branch";
        }
    }

    void printAll() {
        System.out.println("\n--- Student & Parent Details ---");
        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + id);
        System.out.println("Student Age: " + age);
        System.out.println("Student Branch : " + a);
        System.out.println("Parent Name: " + parentName);
        System.out.println("Parent Contact: " + parentContact);
    }
}

public class College2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        s.studentDetails(sc);
        s.parents(sc);
        s.printAll();
    }
}
