import java.util.*;

class baby1 {
    String name;
    int date;
    int month;
    int year;
    int date1;
    int month1;
    int year1;
    int pdate;
    int pmonth;
    int pyear;

    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name:");
        name = sc.nextLine();
        System.out.println("enetr date of birth:");
        date = sc.nextInt();
        System.out.println("enetr month of birth:");
        month = sc.nextInt();
        System.out.println("enetr year of birth:");
        year = sc.nextInt();
    }

    void calculatebcg() {
        date1 = date + 60;
        month1 = month;
        year1 = year;
        if (date == 1) {
            month1 = month + 1;
            // date
        } else {
            month1 = month + 2;
        }
        if (month1 > 12) {
            year1++;
        }
    }

    void calculatepolio() {
        pdate = date + 45;
        pmonth = month;
        pyear = year;
        if (date < 15) {
            pmonth = month + 1;
        } else {
            pmonth = month + 2;
        }
        if (pmonth > 12) {
            pyear++;
        }
    }

    public void display() {
        System.out.println("name:" + name);
        System.out.println("date of birth:" + date + month + year);
        System.out.println("bcg injection date:" + date1 + month1 + year1);
        System.out.println("polio date" + pdate + pmonth + pyear);
    }
}

public class baby {
    public static void main(String[] args) {
        baby1 b1 = new baby1();
        b1.getdata();
        b1.calculatebcg();
        b1.calculatepolio();
        ;
        b1.display();
    }
}