import java.util.Scanner;

/*

Faça um programa que leia 6 valores. Estes valores serão 
somente negativos ou positivos (desconsidere os valores nulos). 
A seguir, mostre a quantidade de valores positivos digitados.

Entrada

Seis valores, negativos e/ou positivos.

Saída

Imprima uma mensagem dizendo quantos valores positivos foram lidos.

Exemplo de Entrada	    Exemplo de Saída
7                       4 valores positivos
-5
6
-3.4
4.6
12
*/

public class URI1060 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = 0;
        int np = 0;

        while (i < 6) {
            double num = scan.nextDouble();
            if (num > 0)
                np++;
            i++;
        }
        System.out.println(String.format("%s valores positivos", np));
    }
}