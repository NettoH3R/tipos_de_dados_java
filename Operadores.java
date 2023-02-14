import java.util.Scanner; // Importa a classe para coletar os dados do teclado

public class Operadores {
    public static void main(String[] args) {
        // int idade;
        // idade = 12;

        // idade++;

        // System.out.println(idade);
        // idade++;

        // System.out.println(idade);

        // idade+=4;
        Scanner entrada = new Scanner(System.in/* System.in pega os dados da entrada padrão*/); /* Cria um novo objeto para pegar os dados do teclado, o nome nn pode ser repetido */
        Scanner entrada2 = new Scanner(System.in);
        
        int n1;
        int n2;

        System.out.print("Digite o primeiro Número: ");
        n1 =  entrada2.nextInt();

        System.out.print("Digite o Segundo número Número: ");
        n2 = entrada.nextInt();

        int soma = n1 + n2;

        System.out.println("a Soma dos números é: " + soma);



        
    }

}


