package antecessorSucessor;

import java.util.*;

public class SucessorAntecessor {

    public SucessorAntecessor() {}

    public void retornaValor() {
        Scanner entrada = new Scanner(System.in);
        int valor;
        int aux;

        System.out.println("Insira um valor: ");
        valor = entrada.nextInt();

        aux = valor;

        System.out.println("Sucessor: " + ++valor);
        System.out.println("Antecessor: " + --aux);

        entrada.close();
    }
}
