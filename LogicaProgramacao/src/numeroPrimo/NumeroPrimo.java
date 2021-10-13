package numeroPrimo;

public class NumeroPrimo {

    public void descobrirNumero(int valor) {

        int naoPrimo = 0;

        if (valor > 1) {
        for (int i = 2; i < valor; i++) {
            if (valor%i == 0 && valor%valor == 0 && valor%1 == 0) {
                ++naoPrimo;
                }
            }
        }

        if (naoPrimo>0) {
            System.out.println("Não é primo");
        } else{
            System.out.println("Primo");
        }
    }
}