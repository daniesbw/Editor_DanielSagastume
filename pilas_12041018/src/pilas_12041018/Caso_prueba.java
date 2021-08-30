package pilas_12041018;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Caso_prueba {

    Scanner leer = new Scanner(System.in);

    public void prueba() {
        Pila p = new Pila();
        p = leerPila();//Agregar el caracter a la pila
        Editor e = new Editor(p);
        e.EditorTexto();
    }

    public Pila leerPila() {
        Pila w = new Pila();
        char resp = 's';
        while (resp == 's' || resp == 'S') {
            System.out.println("Ingrese un caracter: ");
            char c;
            c = leer.next().charAt(0);
            w.agregar(c);
            System.out.println("Desea Agregar otra letra[s/n]: ");
            resp = leer.next().charAt(0);
        }
        return w;
    }
}
