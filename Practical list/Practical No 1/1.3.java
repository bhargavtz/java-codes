import java.util.*;

class hotel1 {
    private int Rno;
    private String name;
    private int tarrif;
    private int days;
    int total_amount;

    public void check_in() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rno:");
        Rno = sc.nextInt();
        System.out.println("enter name:");
        sc.nextLine();
        name = sc.nextLine();
        System.out.println("enter tarrif:");
        tarrif = sc.nextInt();
        System.out.println("enter how many no of days stay:");
        days = sc.nextInt();
    }

    public int calculate() {
        total_amount = days * tarrif;
        return total_amount;
    }

    public void display() {
        System.out.println("Rno:" + Rno);
        System.out.println("name:" + name);
        System.out.println("tarrif:" + tarrif);
        System.out.println("no of days stay:" + days);
        System.out.println("totaal_amount:" + calculate());
    }
}

public class hotel {
    public static void main(String[] args) {
        hotel1 h1 = new hotel1();
        h1.check_in();
        h1.display();
    }
}