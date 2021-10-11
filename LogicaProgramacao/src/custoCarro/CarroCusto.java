package custoCarro;

public class CarroCusto {
    
    public void CustoFinal(double custoFabrica) {
        double custoFinal;

        custoFinal = custoFabrica + (custoFabrica * 0.28) + (custoFabrica * 0.45);

        System.out.println(custoFinal);
    }
}
