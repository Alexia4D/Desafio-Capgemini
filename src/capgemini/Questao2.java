package capgemini;

import java.util.Scanner;

/** @author Alexia Nadine
 * @version 1.0.1
 * @since 19.02.2022
 */

public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String senha = sc.next();
        //String senha = "a1";
        int min = 6;

        if (senha.length() < min) {
            System.out.print(min-senha.length());

        }
    }
}
