package pilas_12041018;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Editor {

    Scanner leer = new Scanner(System.in);

    Pila p = new Pila();

    public Editor(Pila pPila) {
        this.p = pPila;
    }

    public void EditorTexto() {
        Pila pilaFiltrada = new Pila();
        System.out.println(p.getP().size());
        for (int i = 0; i < p.getP().size(); i++) {
            char c = (char) p.getP().get(i);

            if (c == '#') {
                pilaFiltrada.SACA();
            } else if (c == '@') {
                pilaFiltrada.ANULA();
            } else {
                pilaFiltrada.METE(p.getP().get(i));
            }
        }

        pilaFiltrada.IMPRIMIR();
    }

}
