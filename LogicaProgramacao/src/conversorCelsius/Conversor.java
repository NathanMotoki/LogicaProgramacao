package conversorCelsius;

public class Conversor {
    
    public void ConverterCelsius(double celsius) {
        double fahrenheit = celsius * 1.8 + 32;
        System.out.println("Transformando " + celsius + "C, para fahrenheit fica: " + fahrenheit + "f");
    }
}
