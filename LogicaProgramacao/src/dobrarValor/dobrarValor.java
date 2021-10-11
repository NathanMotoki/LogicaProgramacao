package dobrarValor;

import java.util.*;

public class dobrarValor {
    
    public void valorDuplicado() {
        Scanner entrada = new Scanner(System.in);
        int valor;

        System.out.println("Insira um valor: ");
        valor = entrada.nextInt();
        valor *= 2;

        System.out.println(valor);

        entrada.close();
    }
}
