package trocarVariavel;

public class trocarVariavel {

    public static void main(String[] args) {
        int a = 99;
        int b = 55;
        int aux = 0;

        aux = a;
        a = b;
        b = aux;

        System.out.println(a);
        System.out.println(b);
    }

}
