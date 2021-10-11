package reajusteSalario;

public class Reajuste {
    
    public void ReajusteSalario(double salario, double reajuste) {

        double reajustando = salario * reajuste;
        double totalSalario = salario + reajustando;

        System.out.println(totalSalario);

    }
}
