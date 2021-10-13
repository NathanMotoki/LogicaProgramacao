package equacaoSegGrau;

public class EquacaoSeg {
    
    public void ResolverEquacao(double a, double b, double c) {
        double delta = (b * b) - (4 * a * c);
        double x1 = (-b + Math.sqrt(delta))/ (2 * a);
        double x2 = (-b - Math.sqrt(delta))/ (2 * a);

        System.out.println(delta);
        System.out.println("x1: " + x1);
        System.out.println("x2: " + x2);
    }
}
