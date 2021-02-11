public class While {
    public static void main(String[] args) {
        int count = 0;
        while (count < 10) {
            System.out.println(++count);
        }
        do {
            System.out.println("Inside the while");
        } while (count < 10);

        for (int i = 0; i < 10; i++) {
            System.out.println("The value of i is " + i);
        }
    }
}
