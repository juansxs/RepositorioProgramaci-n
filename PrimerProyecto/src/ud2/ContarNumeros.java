package ud2;

import java.util.Scanner;

public class ContarNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número: ");
        int n = sc.nextInt();
        sc.close();

        for (int i = 0; i < n; i++ ) {
            System.out.println(i + 1);
        }

    }

}
