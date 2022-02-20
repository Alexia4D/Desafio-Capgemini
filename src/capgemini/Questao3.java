package capgemini;

import java.util.Scanner;

/** @author Alexia Nadine
 *  @version 1.0.0
 * @since 19.02.2022
 */

public class Questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String palavra = sc.next();
        //String palavra = "ifailuhkqq";

        String aux = palavra;
        int c1 = 0;


        /*Faz foor percorrendo a primeira letra da String 'palavra' na posição 'i', com a posição 'c'.
         *Após, é feito if que verifica a igualdade das letras, é adicionado mais um à variável 'cont'
         *Só é adicionado um ao 'cont' se o if retornar true
         */

        for(int i = 0; i <palavra.length(); i++){
            for(int c = i+1; c<palavra.length(); c++)
                if(palavra.charAt(i) == palavra.charAt(c)) {
                    c1++;
                }
        }

        /*iniciando comparação da string 'palavra' no indice zero, que ira ser comparado
         *com a string 'aux', do primeiro indice(0) e verificar se 'n' caracteres existem
         *Caso a condição seja verdadeira, é adicionado uma unidade a variável 'cont'
         */

        //for(int n = 0; n <palavra.length(); n++) {
            if(palavra.regionMatches(true,0, aux,0,3)) {
                c1++;

            }
            //System.out.println(c1+c2);
        //}
        System.out.println(c1);

            }
        }





