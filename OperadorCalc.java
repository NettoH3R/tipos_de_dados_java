import java.util.Scanner;

public class OperadorCalc {
    // Colete dois numeros e eralize as 4 operações matemáticas
    public static void main(String[] args) {
        double n1;
        double n2;

        Scanner entrada1 = new Scanner(System.in);
        System.out.print("Digite um Número: ");
        n1= entrada1.nextInt();

        Scanner entrada2 = new Scanner(System.in);
        System.out.print("Digite outro Número: ");
        n2= entrada2.nextInt();

        double soma = n1 + n2;
        double sub = n1 - n2;
        double mult = n1 * n2;
        
        // if(n1>n2){
        //     double troca = n1;
        //     n1 = n2;
        //     n2 = troca;
        // }

        double div = n1 / n2;
        double resto = n1 % n2;

        System.out.println("O resultado da adição é: " + soma);
        System.out.println("O resultado da Subtração é: " + sub);
        System.out.println("O resultado da Multiplição é: " + mult);
        System.out.println("O resultado da Divisão é: " + div);
        System.out.println("O Resto da Divisão é: " + resto);
    }
}
