public class counter {
    static int count;

    public counter() {
        count++;
    }

    public void display() {
        System.out.println("total object is:" + count);
    }

    public static void main(String[] args) {
        // int obj;
        counter c1 = new counter();
        c1.display();
    }
}