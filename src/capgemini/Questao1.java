package capgemini;

import java.util.Scanner;

/** @author Alexia Nadine
 * @version 1.0.1
 * @since 19.02.2022
 */

public class Questao1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int aux = n;



        for (int i = 0; i < n; i++) {
            while (aux > 0) {
                System.out.print(" ");
                aux--;
            }
            aux = (n - 1) - i;

            for (int c = aux; c < n; c++) {
                System.out.print("*");
            }
            System.out.println();
        }







        }
    }


