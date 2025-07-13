package trabajoClase;

import utilitarios.Utils;

public class GranjaManantial {

    public static void main(String[] args) {

        Utils.limpiarConsola();
        String nombre = Utils.leerString("Ingrese su nombre: ");
        System.out.println("Bienvenido " + nombre);
    }

}