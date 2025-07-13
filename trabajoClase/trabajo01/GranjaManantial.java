package trabajo01;

public class GranjaManantial {
    public static void main(String[] args) {

         int cantidadSecciones, arbolesSeccion, capacidadFruta, frutas, lluvia, frutaPrecio, seccionActual, totalFrutas, arbol, frutaGanancia, totalMango, totalNaranja, bono, frutasRecolectadas, frutasNoRecolectadas;
         int tipoFruta;

        utilitarios.Utils.limpiarConsola();
        cantidadSecciones = utilitarios.Utils.leerEntero("Ingrese la cantidad de secciones de la granja: ");
        arbolesSeccion = utilitarios.Utils.leerEntero("Ingrese la cantidad de árboles por sección: ");
        capacidadFruta = utilitarios.Utils.leerEntero("Ingrese la capacidad maxima de la canasta: ");

        frutas = 0;
        totalFrutas = 0;
        totalMango = 0;
        totalNaranja = 0;
        frutasRecolectadas = 0;
        frutasNoRecolectadas = 0;
        lluvia = 4;
        seccionActual = 1;

        while (seccionActual <= cantidadSecciones && lluvia > 3 && capacidadFruta > totalFrutas) {

            lluvia = utilitarios.Utils.generarNumerosEntre(1, 100);
            
            System.out.println("El nivel de lluvia actual es: " + lluvia);

            if (lluvia > 3) {
                System.out.println("Ingrese el tipo de fruta en la seccion");
                tipoFruta = utilitarios.Utils.leerEntero("1 = Mango 2 = Naranja: ");

                arbol = 1;

                while (arbol <= arbolesSeccion) {

                    frutas = utilitarios.Utils.generarNumerosEntre(3, 10);
                    System.out.println("Cantidad de frutas: " + frutas);

                    totalFrutas = totalFrutas + frutas;

                    if (capacidadFruta < totalFrutas) {                       
                        frutasRecolectadas = capacidadFruta; //Cambio
                        frutasNoRecolectadas = totalFrutas - capacidadFruta;
                        arbol = arbol + 1;
                        break;
                        
                    } else {
                        
                        frutasRecolectadas = totalFrutas;

                        if (tipoFruta == 1) {

                            totalMango = totalMango + frutas;

                            

                        } else {

                            totalNaranja = totalNaranja + frutas;
                            
                        }

                        arbol++;                       
                    }
                }

            } else {
                System.out.println("Lluvia intensa, la cosecha se detiene.");
                frutasNoRecolectadas = capacidadFruta - frutasRecolectadas;
            }

            seccionActual = seccionActual + 1;

        }

        frutaPrecio = 200;
        frutaGanancia = frutasRecolectadas * frutaPrecio;

        if (totalMango > 50 || totalNaranja > 50) {
            bono = 3000;
            System.out.printf("%-30s : %s%n", "Bono", "Ha recibido el bono");
        } else {
            bono = 0;
            System.out.printf("%-30s : %s%n", "Bono", "No ha recibido el bono");
        }

        System.out.println("\n===== Resumen de la cosecha =====");
        System.out.printf("%-30s : %5d%n", "Frutas recolectadas", frutasRecolectadas);
        System.out.printf("%-30s : %5d%n", "  - Mangos", totalMango);
        System.out.printf("%-30s : %5d%n", "  - Naranjas", totalNaranja);
        System.out.printf("%-30s : %5d%n", "Frutas no recolectadas", frutasNoRecolectadas);
        System.out.printf("%-30s : ₡%,8.2f%n", "Ganancia total", (double)(frutaGanancia + bono));
    }
}