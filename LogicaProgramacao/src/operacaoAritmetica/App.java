package operacaoAritmetica;

import java.util.*;

public class App {
    public static void main(String[] args) {
        int numeroUm;
        int numeroDois;
        int opc;

        Scanner entrada = new Scanner(System.in);

        Operacoes calculadora = new Operacoes();

        System.out.println("***** Calculadora *****");
        System.out.println("Insira o primeiro Numero: ");
        numeroUm = entrada.nextInt();
        System.out.println("Insira o Segundo Numero: ");
        numeroDois = entrada.nextInt();
        
        System.out.println("*** Escolha ***");
        System.out.println("1 - Somar ");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        opc = entrada.nextInt();

        switch(opc) {
            case 1:
                calculadora.Somar(numeroUm, numeroDois);
            break;

            case 2:
                calculadora.Subtrair(numeroUm, numeroDois);
            break;

            case 3:
                calculadora.Multiplicar(numeroUm, numeroDois);
            break;

            case 4:
                calculadora.Dividir(numeroUm, numeroDois);
            break;

            default:
                System.out.println("Escolha Inválida, tente novamente!");
            break;
        }

        entrada.close();
    }
}
