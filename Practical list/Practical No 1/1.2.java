import java.util.Scanner;

class Student {
    int id, sem, total;
    String name, grade;
    int marks[];
    double per;

    Student() {
        total = 0;
        per = 0;
        marks = new int[5];
    }

    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Student’s ID:");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("\nEnter the Student’s Name:");
        name = sc.nextLine();
        System.out.println("\nEnter the Semester:");
        sem = sc.nextInt();
        System.out.print("\nEnter the 5 Subjects Marks (60/Mark):- ");
        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
        }
    }

    public void calculat() {
        for (int i = 0; i < 5; i++) {
            total += marks[i];
        }
        per = (total * 100) / 300;
    }

    public void grade() {
        if (per < 35) {
            System.out.println("you are fail");
            grade = "F";
        } else {
            if (per >= 70) {
                grade = "A";
            } else if (per >= 60 && per < 70) {
                grade = "B";
            } else if (per >= 50 && per < 60) {
                grade = "C";
            } else {
                grade = "D";
            }
        }
    }

    void display() {
        /*
         * System.out.println("The mane of the student is :"+name);
         * System.out.println("Semester is : "+sem);
         * System.out.println("Total Marks is : "+total+"\n");
         * System.out.println("Percentage is : "+per +"%");
         * System.out.println("Grade is : "+grade);
         */
        System.out.print(id + "\t " + name + "\t " + sem + "\t " + total + "\t " + per + "\t " + grade + "\n");
    }
}

class Result {
    public static void main(String[] args) {
        int f;
        f = 2;
        Student[] stu = new Student[f];
        for (int i = 0; i < f; i++) {
            stu[i] = new Student();
        }
        /*
         * stu[0]=new Student();
         * stu[1]=new Student();
         * stu[2]=new Student();
         * stu[3]=new Student();
         * stu[4]=new Student();
         */
        int i;
        for (i = 0; i < f; i++) {
            System.out.println("insert value for student" + i);
            stu[i].getdata();
            stu[i].calculat();
            stu[i].grade();
        }
        for (i = 0; i < f; i++) {
            stu[i].display();
        }
    }
}
