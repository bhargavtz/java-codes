import java.util.Scanner;

class railway {
    int tnum;
    String name, pepole, source, destination, coach;
    int seat;
    double total, discount;
    int age[];

    railway(int tn, String n, String s, String d) {
        tnum = tn;
        name = n;
        source = s;
        destination = d;
    }

    public void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of coaches in this train:");
        System.out.println("s1 - first AC -260 \ns2 - chair car -180 \ns3 - sleeper coach -75 ");
        coach = sc.nextLine();
        System.out.println("Enter your travelling seat:");
        seat = sc.nextInt();
        age = new int[seat];
        System.out.println("Enter the age of all passangers :");
        for (int i = 0; i < seat; i++) {
            System.out.print("Passanger " + (i + 1) + " Age : ");
            age[i] = sc.nextInt();
        }
    }

    public void calculate() {
        switch (coach) {
            case "s1":
                total = 260 * seat;
                break;
            case "s2":
                total = 180 * seat;
                break;
            case "s3":
                total = 75 * seat;
                break;
        }
        for (int i = 0; i < seat; i++) {
            if (age[i] <= 5) {
                switch (coach) {
                    case "s1":
                        total = total - 260;
                        break;
                    case "s2":
                        total = total - 180;
                        break;
                    case "s3":
                        total = total - 75;
                        break;
                }
            } else if (age[i] >= 40) {
                switch (coach) {
                    case "s1":
                        discount = 260 * 0.5;
                        total = total - discount;
                        break;
                    case "s2":
                        discount = 180 * 0.5;
                        total = total - discount;
                        break;
                    case "s3":
                        discount = 75 * 0.5;
                        total = total - discount;
                        break;
                }
            } else {
                total = total;
            }
        }
    }

    public void display() {
        System.out.println("\nTrain Ticket Details:\nCoach Type :" + coach + "\nNumber Of Seats Booked :"
                + seat
                + "\nTotal Amount To Be Paid :" + total);
    }
}

class Trainticket {
public static void main(String[] args) {
railway r = new railway(10665, "rajdhani express", "delhi", "mathura");
r.getdata();
r.calculate();
r.display();
}