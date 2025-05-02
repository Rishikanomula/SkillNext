import java.util.*;
class Student {
    int rollnumber;
    String name;
    char status;

    public Student(int rollnumber, String name, char status){
        this.rollnumber=rollnumber;
        this.name=name;
        this.status=status;
    }

    public void display(){
        System.out.println("Roll num: "+rollnumber+" Name: "+name+" Status: "+status);
    }
}

public class AttendanceRegister{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Student> attendanceRegister=new ArrayList<>();
        attendanceRegister.add(new Student(1,"Rishika",'P'));
        attendanceRegister.add(new Student(2,"Rishi",'A'));
        attendanceRegister.add(new Student(3,"Risk",'P'));
        attendanceRegister.add(new Student(4,"Risa",'P'));
        attendanceRegister.add(new Student(5,"Rili",'A'));

        // System.out.print("Enter Number of Students: ");
        // int n=sc.nextInt();
        // sc.nextLine();

        // for(int i=0;i<n;i++){
        //     System.out.println("\nEnter Students Name: ");
        //     String name=sc.nextLine();
        //     System.out.println("\nEnter Students' Roll Number: ");
        //     int rollnumber=sc.nextInt();
        //     sc.nextLine();
        //     char status;
        //     while(true){
        //         System.out.println("\nEnter attendance status (P or A): ");
        //         status = sc.nextLine().toUpperCase().charAt(0);
        //         if(status == 'P' || status== 'A'){break;}
        //         System.out.println("Invalid input. Please enter 'P' or 'A'.");
        //     }

        //     attendanceRegister.add(new Student(rollnumber,name, status));
        // }

        // this to make it dynamic 
        while (true) {
            System.out.print("\nEnter Student's Name (or type 'stop' to finish): ");
            String name = sc.nextLine();
            if (name.equalsIgnoreCase("stop")) break;
        
            System.out.print("Enter Student's Roll Number: ");
            int rollnumber = sc.nextInt();
            sc.nextLine(); // consume newline
        
            char status;
            while (true) {
                System.out.print("Enter attendance status (P or A): ");
                status = sc.nextLine().toUpperCase().charAt(0);
                if (status == 'P' || status == 'A') break;
                System.out.println("Invalid input. Please enter 'P' or 'A'.");
            }
        
            attendanceRegister.add(new Student(rollnumber, name, status));
        }
        
        System.out.println("\n------------ Attendance Register ------------");
        // for (Student student : attendanceRegister) {
        //     student.display();
        // }

        //  to display in tabular format:
        System.out.printf("%-12s %-20s %-10s\n", "Roll No", "Name", "Status");
        System.out.println("---------------------------------------------");
        for (Student student : attendanceRegister) {
            System.out.printf("%-12d %-20s %-10c\n", student.rollnumber, student.name, student.status);
        }

        int presentCount=0;
        int absentCount=0;
        for(Student stu:attendanceRegister){
            if(stu.status=='P') presentCount++;
            else if(stu.status=='A') absentCount++;
        }
        System.out.println("Total Present: "+presentCount);
        System.out.println("Total Absent "+absentCount);

        sc.close();
    }
}
