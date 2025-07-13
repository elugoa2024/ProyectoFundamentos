package trabajoClase;

public class GranjaManantial {
    public static void main(String[] args) {
        
        int cantidadSecciones, arbolesSeccion, capacidadFruta, frutas, lluvia, frutaPrecio, seccionActual, totalFrutas, arbol, frutaGanancia, totaMango, totalNaranja, bono, frutasRecolectadas, frutasNoRecolectadas;
        String tipoFruta;

        utilitarios.Utils.limpiarConsola();
        cantidadSecciones = utilidades.leerEntero("Ingrese la cantidad de secciones de la granja: ");
        arbolesSeccion = utilidades.leerEntero("Ingrese la cantidad de árboles por sección: ");
        capacidadFruta = utilidades.leerEntero("Ingrese la capacidad maxima de la canasta: ");

        seccionActual = 1;
        totalFrutas = 0;
        totaMango = 0;
        totalNaranja = 0;
        lluvia = 4;

        while (seccionActual<=cantidadSecciones && lluvia>3 && capacidadFrutas>totalFrutas) {
           
            int lluvia = Utils.generarNumeroAleatorioEntre(1, 100);
            if (lluvia>3) {
                tipoFruta = utilidades.leerString("Ingrese el tipo de fruta en la seccion: ");
                arbol = 1;
                while (arbol<=arbolesSeccion) {

                     int frutas = Utils.generarNumeroAleatorioEntre(3, 10);

                     totalFrutras = totalFrutas + frutas;
                     if (capacidadFrutas<totalFrutas) {
                        frutasRecolectadas = totalFrutas - frutas;
                        frutasNoRecolectadas = frutas + 1;
                     } else {
                        frutasRecolectadas = totalFrutas;
                        if (tipoFruta == "Mango") {
                            totalMango = totaMango + frutas;
                        } else {
                            totalNaranja = totalNaranja + frutas;
                        }
                        arbol = arbol + 1;
                     }

                }

            } else {
                System.out.println("Lluvia intensa, la cosecha se detiene.");
            }

            seccionActual = seccionActual + 1;

        }

        frutaPrecio = 200;
        frutaGanancia = frutasRecolectadas * frutaPrecio;

        if (totalMango > 50 || totalNaranja > 50) {
            bono = 3000;
            System.out.println("Ha recibido el bono");
        } else {
            bono = 0;
            System.out.println("No ha recibido el bono");
        }

        System.out.println("La ganancia total fué: " + frutaGanancia + bono);
        System.out.println("Frutas no recolectadas: " + totalFrutas - frutasRecolectadas);
        System.out.println("El total de mangos recolectados fué de: " + totalMango);
        System.out.println("El total de naranjas recolectados fué de: " + totalNaranja);
    }
}