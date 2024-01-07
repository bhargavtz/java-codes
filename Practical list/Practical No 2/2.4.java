import java.util.*;

class book1 {
    String bookTitle, bookTitle1;
    String author, author1;
    int price;
    String publicer;
    int stock;
    int requirement;
    int total;

    /*
     * book1(String b,String a,int p,String pu,int s)
     * {
     * this.bookTitle=b;
     * this.author=a;
     * this.price=p;
     * this.publicer=pu;
     * this.stock=s;
     * }
     */
    void ogetdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter book title:");
        bookTitle = sc.nextLine();
        System.out.println("enter author name:");
        author = sc.nextLine();
        System.out.println("enter publicer name:");
        publicer = sc.nextLine();
        System.out.println("enter price of:" + bookTitle);
        price = sc.nextInt();
        System.out.println("enter stock of:" + bookTitle);
        stock = sc.nextInt();
    }

    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter book title:");
        bookTitle1 = sc.nextLine();
        System.out.println("enter author name:");
        author1 = sc.nextLine();
    }

void displayo()System.out.println(" book title:" + bookTitle1);
System.out.println(" author name:" + author1);
System.out.println(" publicer name:" + publicer);
System.out.println(" price of" +bookTitle +":"+ price);
System.out.println(" total avilable book:"+stock);
Scanner sc = new Scanner(System.in);
System.out.println("enter total book you require:");
requirement=sc.nextInt();
}

    void calculate() {
        if (requirement > stock) {
            System.out.println("stock is not availabel!!");
        } else {
            stock = stock - requirement;
            total = requirement * price;
        }
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
        int total;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter total book you have in your shop:");
        total = sc.nextInt();
        book1[] b11 = new book1[total];
        for (int i = 0; i < total; i++) {
            b11[i] = new book1();
            b11[i].ogetdata();
        }
        System.out.println("enter total book you waant to buy :");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            b11[i].getdata();
            if (b11[i].bookTitle1 == b11[i].bookTitle && b11[i].author1 == b11[i].author) {
                b11[i].displayo();
                b11[i].calculate();
                b11[i].display();
            } else {
                System.out.println("book was not available!!");
            }
        }
    }
}