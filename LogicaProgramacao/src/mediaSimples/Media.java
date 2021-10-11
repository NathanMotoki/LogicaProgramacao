package mediaSimples;

public class Media {

    public void CalcularMedia() {
        int[] lista = {4, 5, 3};
        int cont = 0;
        int res = 0;

        for (int i = 0; i <= lista.length; i++) {
            cont += lista[i];
            res = cont/lista.length;
        }             
        
        System.out.println(res);
         
    }
}
