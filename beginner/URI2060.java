import java.util.Scanner;

/*

Bino e Cino são colegas inseparáveis. Bino gosta de criar desafios matemáticos 
para Cino resolver. Desta vez, Bino gerou uma lista de números e perguntou ao
Cino quantos números da lista são múltiplos de 2, 3, 4 e 5.

Esse desafio pode parecer simples, porém, quando a lista contém muitos números, 
Cino se confunde e acaba errando alguns cálculos. Para ajudar Cino, faça um 
programa para resolver o desafio de Bino.

Entrada

A primeira linha da entrada consiste em um inteiro N (1 ≤ N ≤1000), representando 
a quantidade de números na lista de Bino.

A segunda linha contém N inteiros Li (1 ≤ Li ≤ 100), representando os números 
da lista de Bino.

Saída
Imprima a quantidade de números múltiplos de 2, 3, 4 e 5 presentes na lista. Observe 
a formatação da saída nos exemplos, pois ela deve ser seguida rigorosamente.

Exemplo de Entrada	        Exemplo de Saída
5                           4 Multiplo(s) de 2
2 5 4 20 10                 0 Multiplo(s) de 3
                            2 Multiplo(s) de 4
                            3 Multiplo(s) de 5
*/

public class URI2060 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m2, m3, m4, m5;
        m2 = m3 = m4 = m5 = 0;

        int quantity = scan.nextInt();
        int array[] = new int[quantity];

        for (int i = 0; i < quantity; i++ ) {
            array[i] = scan.nextInt();
        }
        
        int c = 0;

        while (c < quantity) {
            int number = array[c];

            if (number % 2 == 0)
                m2++;
            if (number % 3 == 0)
                m3++;
            if (number % 4 == 0)
                m4++;
            if (number % 5 == 0)
                m5++;
            c++;
        }

        System.out.println(String.format("%s Multiplo(s) de 2", m2));
        System.out.println(String.format("%s Multiplo(s) de 3", m3));
        System.out.println(String.format("%s Multiplo(s) de 4", m4));
        System.out.println(String.format("%s Multiplo(s) de 5", m5));
    }
}