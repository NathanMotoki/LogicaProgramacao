package jurosSimples;

public class Juros {
    
    public void CalcularJuros(double capital, double taxa, int periodo) {

        double juros = capital * taxa * periodo;

        System.out.println(juros);
    }
}
