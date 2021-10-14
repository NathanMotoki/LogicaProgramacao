package somarDigitos;

public class SomarDigitos {
    
    public void somar(int numero) {
        
        int soma = 0;

        while(numero>0) {
            soma += (numero%10);
            numero /= 10;
        }

        System.out.println("Somando seus digitos: " + soma);

    }

}
