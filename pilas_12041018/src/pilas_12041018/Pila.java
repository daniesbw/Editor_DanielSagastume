package pilas_12041018;

import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class Pila extends Lista {

    public void ANULA() {
        lista.clear();
        System.out.println("P Vaciado");
    }

    public void SACA() {
        SUPRIME(PRIMERO(lista) - 1, lista);
    }

    public void METE(Object x) {
        INSERTA(x, PRIMERO(lista) - 1, lista);
    }

    public ArrayList getP() {
        return this.lista;
    }

    public void setP(ArrayList p) {
        this.lista = p;
    }

    public void agregar(Object x) {
        lista.add(x);
    }

    public void IMPRIMIR() {
        System.out.println(this.lista.size());
        System.out.println("===============IMPRIMIR PILA===============");
        System.out.print("Pila: " + '[');
        for (int i = lista.size() - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(lista.get(i) + " ");
            } else {
                System.out.print(lista.get(i));
            }

        }
        System.out.println("]");
        System.out.println("===============FIN IMPRIMIR===============");
    }
}
