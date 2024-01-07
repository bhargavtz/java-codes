import java.util.*;

class customer1 {
    int cid;
    String cname;
    String city;
    int contactno;
    int purchaces[];
    int total_purchaces;
    int average_purchaces;
    int discount;
    int bill;

    customer1() {
        purchaces = new int[5];
        // 18total_purchaces=0;
        average_purchaces = 0;
    }

    public void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter customer id:");
        cid = sc.nextInt();
        System.out.println("enter customer name:");
        cname = sc.nextLine();
        System.out.println("enter customer city:");
        city = sc.nextLine();
        System.out.println("enter customer contact number:");
        contactno = sc.nextInt();
        System.out.println("enter customer last five purchase amount:");
        for (int i = 0; i < 5; i++) {
            purchaces[i] = sc.nextInt();
        }
    }

    public int calculate() {
        for (int i = 0; i < 5; i++) {
            total_purchaces += purchaces[i];
        }
        return total_purchaces;
    }

    public int calculateavg() {
        average_purchaces = total_purchaces / 5;
        return average_purchaces;
    }

    public int discount1() {
        if (average_purchaces >= 50000) {
            discount = 5000;
            purchaces[4] -= discount;
        } else if (average_purchaces >= 35000 && average_purchaces < 50000) {
            discount = 3500;
            purchaces[4] -= discount;
        } else if (average_purchaces >= 20000 && average_purchaces < 35000) {
            discount = 2000;
            purchaces[4] -= discount;
        } else {
            discount = 0;
        }
        bill = purchaces[4];
        return discount;
    }

    public void display() {
        System.out.println("coustomer id:" + cid);
        System.out.println("coustomer name:" + cname);
        System.out.println("coustomer city:" + city);
        System.out.println("coustomer contact number:" + contactno);
        System.out.println("coustomer total purchaces:" + calculate());
        System.out.println("coustomer average purchaces:" + calculateavg());
        System.out.println("coustomer discount:" + discount1());
        System.out.println("bill:" + bill);
    }public class customer
{
 public static void main(String[] args)
{
   int total;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter total customer:");
    total = sc.nextInt();
    customer1[] c1 =new customer1[total];
    for(int i=0;i<total;i++)
{
c1[i]=new customer1();
c1[i].getData();
c1[i].display();
}
}
}
}