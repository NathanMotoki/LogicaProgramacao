package mesesDias;

import java.util.Scanner;

public class CalcularDias {
    
    public void calculaMes() {
        int dias;
        int mes;

        Scanner entrada = new Scanner(System.in);

        System.out.println("*** Conversor de DIAS em Meses ***");
        System.out.print("Insira a quantidade de dias: ");
        dias = entrada.nextInt();
        mes = dias/30;

        System.out.println("Meses: " + mes);
        entrada.close();
    }
}
