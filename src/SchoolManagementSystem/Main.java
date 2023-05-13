package SchoolManagementSystem;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Teacher Bill = new Teacher(1,"Bill",500);
        Teacher Bob = new Teacher(2,"Bob",700);
        Teacher Joe = new Teacher(3,"Joe",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Bill);
        teacherList.add(Bob);
        teacherList.add(Joe);

        Student Tim = new Student(1,"Tim",4);
        Student Tom = new Student(2,"Tom",12);
        Student Tam = new Student(3,"Tam",5);
        List<Student> studentList = new ArrayList<>();

        studentList.add(Tim);
        studentList.add(Tom);
        studentList.add(Tam);

        School ghs = new School(teacherList,studentList);

        Teacher Jen = new Teacher(6,"Jen", 900);

        ghs.addTeacher(Jen);

        Tim.payFees(5000);
        Tom.payFees(6000);
        System.out.println("GHS has earned $" + ghs.getTotalMoneyEarned());

        System.out.println("----Making School Pay Salary----");
        Bill.receiveSalary(Bill.getSalary());
        System.out.println("GHS has spent for salary to " + Bill.getName()
                + " and now has $" + ghs.getTotalMoneyEarned());

        Joe.receiveSalary(Joe.getSalary());
        System.out.println("GHS has spent for salary to " + Joe.getName()
                + " and now has $" + ghs.getTotalMoneyEarned());

        System.out.println(Tom);

        Bob.receiveSalary(Bob.getSalary());

        System.out.println(Bob);

    }
}