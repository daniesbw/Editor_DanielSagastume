package pilas_12041018;

import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class Lista {

    protected ArrayList lista = new ArrayList();

    public void SUPRIME(int p, ArrayList L) {

        for (int i = 0; i < L.size(); i++) {
            if (p == i) {
                L.remove(i);
            }
        }

    }

    public int PRIMERO(ArrayList L) {
        int ret = 0;
        if (L == null) {
            ret = 1;//Fin(L) si esta vacio
        } else {
            ret = 1;
        }
        return ret;
    }

    public void INSERTA(Object x, int p, ArrayList L) {
        if (L == null) {
            L.add(x);
        } else {
            L.add(p, x);
        }

    }

    public int FIN(ArrayList L) {
        return L.size() + 1;
    }

}
