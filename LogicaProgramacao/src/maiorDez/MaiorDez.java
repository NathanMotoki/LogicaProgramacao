package maiorDez;

public class MaiorDez {
    
    public void descobrirValor(double valor) {
        if (valor > 10) {
            System.out.println("Numero maior que 10!");
        } else if (valor == 10) {
            System.out.println("Numero igual a 10!");
        } else {
            System.out.println("Numero menor que 10!");
        }
    }

}
