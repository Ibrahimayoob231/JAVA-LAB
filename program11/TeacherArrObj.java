import java.util.Scanner;
class Person {
    String name;
    String gender;
    String address;
    int age;
    Person() {}
    Person(String name, String gender, String address, int age) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }
}
class Employee extends Person {
    int empid;
    String company_name, qualification;
    float salary;
    Employee() {}
    Employee(String name, String gender, String address, int age,
             int empid, String company_name, String qualification, float salary) {
        super(name, gender, address, age);
        this.empid = empid;
        this.company_name = company_name;
        this.qualification = qualification;
        this.salary = salary;
    }
}
class Teacher extends Employee {
    String subject, department;
    int teacherid;

    Teacher(String name, String gender, String address, int age,
            int empid, String company_name, String qualification,
            float salary, String subject, String department, int teacherid) {

        super(name, gender, address, age, empid, company_name, qualification, salary);
        this.subject = subject;
        this.department = department;
        this.teacherid = teacherid;
    }

    void display() {
        System.out.println("Teacher id: " + teacherid);
        System.out.println("Teacher name: " + name);
        System.out.println("Teacher gender: " + gender);
        System.out.println("Teacher address: " + address);
        System.out.println("Teacher age: " + age);
        System.out.println("Employee id: " + empid);
        System.out.println("Company name: " + company_name);
        System.out.println("Qualification: " + qualification);
        System.out.println("Salary: " + salary);
        System.out.println("Subject: " + subject);
        System.out.println("Department: " + department);
    }
}

public class TeacherArrObjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Teachers: ");
        int n = sc.nextInt();
        Teacher teacher[] = new Teacher[n];
        int tid, age, empid;
        String name, company_name, qualification, gender;
        float salary;
        String address, department, subject;
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Teacher " + (i + 1));
            System.out.println("Enter Teacher id: ");
            tid = sc.nextInt();
            System.out.println("Enter Employee id: ");
            empid = sc.nextInt();
            System.out.println("Enter Teacher name: ");
            name = sc.next();
            System.out.println("Enter Teacher gender: ");
            gender = sc.next();
            System.out.println("Enter Teacher address: ");
            address = sc.next();
            System.out.println("Enter Teacher age: ");
            age = sc.nextInt();
            System.out.println("Enter Company name: ");
            company_name = sc.next();
            System.out.println("Enter Department: ");
            department = sc.next();
            System.out.println("Enter Qualification: ");
            qualification = sc.next();
            System.out.println("Enter Subject: ");
            subject = sc.next();
            System.out.println("Enter Salary: ");
            salary = sc.nextFloat();
            teacher[i] = new Teacher(name, gender, address, age, empid,
                    company_name, qualification, salary, subject, department, tid);
        }
        System.out.println("\nTeachers are:\n");
        for (Teacher x : teacher) {
            x.display();
            System.out.println();
        }
        sc.close();
    }
}
