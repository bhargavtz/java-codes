import java.util.Scanner;

class participant {
    int pid, cpoint, total, i_id;
    String si_name, pname, cat;
    int contact;
    String i_name[];
    int score[];
    int i_score[];
    static String city = "Surat";

    participant() {
        i_name = new String[5];
        score = new int[5];
        i_name[0] = "bmiit";
        i_name[1] = "cgpit";
        i_name[2] = "mtics";
        i_name[3] = "scrimca";
        i_name[4] = "pharmacy";
        i_score = new int[5];
        total = 0;
    }

    public void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the participant id:");
        pid = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the participant name:");
        pname = sc.nextLine();
        System.out.println("Enter the participant contact number:");
        contact = sc.nextInt();
        System.out.println("Enter five tournament marks :");
        for (int i = 0; i < 5; i++) {
            score[i] = sc.nextInt();
        }
        System.out.println("Enter the participant institute id:");
        i_id = sc.nextInt();
        System.out.println("Enter the participant institute name:");
        sc.nextLine();
        si_name = sc.nextLine();
    }

    public void test() {
        for (int i = 0; i < 5; i++) {
            if (si_name.equals(i_name[i])) {
                total = 0;
                for (int j = 0; j < 5; j++) {
                    total += score[j];
                }
                i_score[i] = total / 5;
                cpoint = i_score[i];
            }
        }
    }

    public void catagory() {
        if (cpoint > 90) {
            cat = "Winner";
        } else if (cpoint > 70) {
            cat = "Runner up";
        } else if (cpoint < 30) {
            cat = "Loser";
        } else {
            cat = "Mid-range";
        }
    }

    public void cata(int index) {
        catagory();
    }public void display() 
    {
System.out.println("\nName: " + pname + "\nID: " + pid + "\nCity: " + city + "\nInstitute name: " + si_n
ame
+ "\nInstitute ID: " + i_id + "\nCategory: " + cat);
}

    public static void compare(participant[] ps) {
        int[] itotal = new int[5];
        for (int i = 0; i < 5; i++) {
            itotal[i] = 0;
        }
        for (int j = 0; j < ps.length; j++) {
            participant p = ps[j];
            for (int i = 0; i < 5; i++) {
                if ((p.si_name == null && ps[0].i_name[i] == null)
                        || (p.si_name != null && p.si_name.equals(ps[0].i_name[i]))) {
                    itotal[i] += p.cpoint;
                    break;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Total Credit Points for " + ps[0].i_name[i] + ": " + itotal[i]);
        }
        int maxTotal = itotal[0];
        int maxIndex = 0;
        for (int i = 1; i < 5; i++) {
            if (itotal[i] > maxTotal) {
                maxTotal = itotal[i];
                maxIndex = i;
            }
        }
        System.out.println(ps[0].i_name[maxIndex] + " has the highest total credit points.");
    }
}

class festival {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of partisipants:");
        int num = sc.nextInt();
        participant[] p1 = new participant[num];
        for (int i = 0; i < num; i++) {
            p1[i] = new participant();
            p1[i].getdata();
            p1[i].test();
            p1[i].cata(i);
            p1[i].display();
        }
        participant.compare(p1);
    }
}