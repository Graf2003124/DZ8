public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int[] one = new int[3];
        one[0] = 1;
        one[1] = 2;
        one[2] = 3;
        double[] two = {1.57, 7.654, 9.986};
        int[] three = new int[3];
        three[0] = 10;
        three[1] = 15;
        three[2] = 20;

        System.out.println("Задача 2");
        for (int i = 0; i < one.length - 1; i++) {
            System.out.print(one[i] + ", ");
        }
        System.out.print(one[one.length - 1]);
        System.out.println();

        for (int i = 0; i < two.length - 1; i++) {
            System.out.print(two[i] + ", ");
        }
        System.out.print(two[two.length - 1]);
        System.out.println();

        for (int i = 0; i < three.length - 1; i++) {
            System.out.print(three[i] + ", ");
        }
        System.out.print(three[three.length - 1]);
        System.out.println();

        System.out.println("Задача 3");
        for (int i = one.length - 1; i >= 0; i--) {
            System.out.print(one[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = two.length - 1; i >= 0; i--) {
            System.out.print(two[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = three.length - 1; i >= 0; i--) {
            System.out.print(three[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Задача 4");
        for (int i = 0; i < one.length; i++) {
            if (one[i] % 2 != 0) {
                one[i] += 1;
            }
            System.out.print(" " + one[i] + " ");
        }
    }
}
