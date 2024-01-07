
import java.util.*;

class criketer1 {
    int cid;
    String cname;
    String speci;
    int score[];
    double total_score;
    double strate;
    public String category;

    criketer1() {
        score = new int[5];
        total_score = 0;
    }

    public void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter criketer id:");
        cid = sc.nextInt();
        System.out.println("enter criketer name:");
        sc.nextLine();
        cname = sc.nextLine();
        System.out.println("enter criketer specialization:");
        speci = sc.nextLine();
        System.out.println("enter criketer last five tournament:");
        for (int i = 0; i < 5; i++) {
            score[i] = sc.nextInt();
        }
    }

    public double calculate() {
        for (int i = 0; i < 5; i++) {
            total_score = total_score + score[i];
        }
        // total_score=5000;
        strate = total_score * 100 / 500;
        return strate;
    }

    public String dicategory() {
        if (strate >= 90.00) {
            category = "platinum";
        } else if (strate >= 70.00 && strate < 90.00) {
            category = "gold";
        } else if (strate >= 60.00 && strate < 70.00) {
            category = "silver";
        } else {
            category = "bronze";
        }
        return category;
    }

    public void display() {
        System.out.println("cricketer id:" + cid);
        System.out.println("cricketer name:" + cname);
        System.out.println("cricketer specialization:" + speci);
        System.out.println("cricketer last five tournament total score:" + total_score);
        System.out.println("cricketer strike rate:" + calculate());
        System.out.println("cricketer category:" + dicategory());
    }
}

public class cricketer {
    public static void main(String[] args) {
        int total;
        // String cat;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter total criketer you insert value");
        total = sc.nextInt();
        criketer1[] c1 = new criketer1[total];
        criketer1 c2 = new criketer1();
        // String category1=criketer1.category;
        // c2.category=cat;
        for (int i = 0; i < total; i++) {
            c1[i] = new criketer1();
            c1[i].dicategory();
            if (c1[i].dicategory() == "platinum") {
                c1[i].display();
            }
        }
    }
}