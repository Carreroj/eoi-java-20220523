public class Counter {
    public static void main(String[] args) {

        for (int i = 0;i < 1000;++i) {
            System.out.println(i);
        }
    }

    public static void printThousand() {
        for (int i = 0;i < 1000;++i) {
            if (i%2==0)
                System.out.println("El número es par");
            else
                System.out.println("El número es impar");
            System.out.println(i);
        }
    }
}
