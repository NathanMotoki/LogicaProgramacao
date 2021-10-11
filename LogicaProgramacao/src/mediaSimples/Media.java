package mediaSimples;

public class Media {

    public void CalcularMedia() {
        int[] lista = {1, 1, 1};
        int cont = 0;
        int res;

        for (int i = 0; i <= lista.length; i++) {
            lista[i] += cont;
        }

        res = cont/lista.length;

    }
}
