import java.util.*;

class book1 {
    String bookTitle;
    String author;
    int price;
    String publicer;
    int stock;
    int requirement;
    int total;

    book1(String b, String a, int p, String pu, int s) {
        this.bookTitle = b;
        this.author = a;
        this.price = p;
        this.publicer = pu;
        this.stock = s;
    }

    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter book title:");
        bookTitle = sc.nextLine();
        System.out.println("enter author name:");
        author = sc.nextLine();
        System.out.println("enter total book you require:");
        requirement = sc.nextInt();
    }

    void calculate() {
        if (requirement > stock) {
            System.out.println("stock is not availabel!!");
        } else {
            stock = stock - requirement;
        }
        total = requirement * price;
    }

    void display() {
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Author name:" + author);
        System.out.println("publicer name:" + publicer);
        System.out.println("total price:" + total);
    }
}

public class book {
    public static void main(String[] args) {
        book1 b1 = new book1("hii", "kem", 1000, "krishna", 10);
        b1.getdata();
        b1.calculate();
        b1.display();
    }
}