public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        System.out.print(" " + number[0] + " ");
        System.out.print(" " + number[1] + " ");
        System.out.print(" " + number[2] + " ");
        System.out.println();
        double[] fractionalNumber = {1.57, 7.654, 9.986};
        System.out.print(" " + fractionalNumber[0] + " ");
        System.out.print(" " + fractionalNumber[1] + " ");
        System.out.print(" " + fractionalNumber[2] + " ");
        System.out.println();
        int[] own = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println(own[i]);
        }

        System.out.println("Задача 2");
        int[] car = {1, 5, 15, 30};
        int[] airplane = {2, 6, 12, 24};
        int[] motorbike = {10, 20, 30};
        for (int r = 0; r < 4; r++) {
            System.out.print(" " + car[r] + " ");
        }
        System.out.println();
        {
            for (int e = 0; e < 4; e++) {
                System.out.print(" " + airplane[e] + " ");
            }
            System.out.println();
            {
                for (int t = 0; t < 3; t++) {
                    System.out.print(" " + motorbike[t] + " ");
                }
                System.out.println();
            }
        }

        System.out.println("Задача 3");
        int[] pumber = new int[3];
        pumber[0] = 1;
        pumber[1] = 2;
        pumber[2] = 3;
        System.out.print(" " + pumber[2] + " ");
        System.out.print(" " + pumber[1] + " ");
        System.out.print(" " + pumber[0] + " ");
        System.out.println();
        double[] fractionalPumber = {1.57, 7.654, 9.986};
        System.out.print(" " + fractionalPumber[2] + " ");
        System.out.print(" " + fractionalPumber[1] + " ");
        System.out.print(" " + fractionalPumber[0] + " ");
        System.out.println();

        System.out.println("Задача 4");
        int[] massif = new int[]{1, 3, 35};
        for (int x = 0; x < massif.length; x++) {
            if (massif[x] % 2 != 0) {
                massif[x] = massif[x] + 1;
            }
            System.out.print(" " + massif[x] + " ");
        }
    }
}
