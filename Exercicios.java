public class Exercicios {
    public static void main(String[] args) {

        // Execício 1
        System.out.println("Execício 1");

        for (int i = 150; i <= 300; i++) {
            System.out.println(i);
        }

        System.out.println("\n");

        // Execício 2

        System.out.println("Execício 2");

        int soma = 0;

        for (int n = 0; n <= 1000; n++) {

            soma = n + soma;

        }

        System.out.println(soma);
        System.out.println("\n");

        // Exercício 3
        System.out.println("Exercicio 3");

        for (int md3 = 0; md3 <= 100; md3 += 3) {
            System.out.println(md3);
        }

        System.out.println("\n");

        // Exercício 4

        System.out.println("Exercicio 4");

        for (int fatNum = 10; fatNum >= 0; fatNum--) {
            int fatResult = 1;

            for (int fat = fatNum; fat > 1; fat--) {

                if (fat == 0) {
                    fatResult = 1;
                    break;
                } else {
                    fatResult = fat * fatResult;
                }
            }

            System.out.println(fatNum + "! = " + fatResult);
        }
    }
}