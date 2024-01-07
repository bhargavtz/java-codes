import java.util.Scanner;

class bank {
    Scanner sc = new Scanner(System.in);
    int balance, no, pb;
    String name, type;

    bank(int b, int n, String N, String t) {
        balance = b;
        no = n;
        name = N;
        type = t;
    }

    public float debit(int amount) {
        balance = balance + amount;
        System.out.println("your account is debit with" + amount + " rupees");
        return balance;
    }

    float vidrow(float number) {
        if ((balance - number) < 500) {
            System.out.println(
                    "you cna not withdraw this amount because you have to maintain 500 balance in your account\n");
        } else {
            balance -= number;
            System.out.println("your account is withdraw by " + number + " rupees \n");
        }
        return balance;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bank b = new bank(1000, 0457, "Aelis", "saving");
        System.out.println("Name of the account holder is :" + b.name);
        System.out.println("Account type is :" + b.type);
        System.out.println("Account number is :" + b.no);
        int ch;
        System.out.println("\n1.for debit\n2.for withthdraw \n3.for cheking balance\n4.exit\n");
        do {
            System.out.println("Enter your choice :");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter your amount to debit ");
                    int amount = sc.nextInt();
                    b.debit(amount);
                    break;
                case 2:
                    System.out.println("Enter your amount to withdraw:");
                    int number = sc.nextInt();
                    b.vidrow(number);
                    break;
                case 3:
                    System.out.println("your total amount is :" + b.balance + "\n");
                    break;
                case 4:
                    System.out.println("Exiting.....");
                    break;
                default:
                    System.out.println("Enter right choice");
            }
        } while (ch != 4);
    }
}