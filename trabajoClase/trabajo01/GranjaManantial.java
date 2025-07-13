package trabajo01;

public class GranjaManantial {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // declaracion de variables  
        int cantidadSecciones, arbolesSeccion, capacidadFruta, frutas, lluvia, frutaPrecio, seccionActual, totalFrutas, arbol, frutaGanancia, totalMango, totalNaranja, bono, frutasRecolectadas, frutasNoRecolectadas, frutasDisponibles;
        int tipoFruta;

        utilitarios.Utils.limpiarConsola();

        // Entradas
        cantidadSecciones = utilitarios.Utils.leerEntero("Ingrese la cantidad de secciones de la granja: ");
        arbolesSeccion = utilitarios.Utils.leerEntero("Ingrese la cantidad de árboles por sección: ");
        capacidadFruta = utilitarios.Utils.leerEntero("Ingrese la capacidad maxima de la canasta: ");
        
        // inicializacion de variables
        frutas = 0;
        totalFrutas = 0;
        totalMango = 0;
        totalNaranja = 0;
        frutasRecolectadas = 0;
        frutasNoRecolectadas = 0;
        lluvia = 4;
        seccionActual = 1;

        // ingresa a cada seccion mientras no se exceda la cantidad de secciones, el nivel de lluvia sea mayor a 3 y no se llene la canasta
        while (seccionActual <= cantidadSecciones && lluvia > 3 && capacidadFruta > totalFrutas) {

            lluvia = utilitarios.Utils.generarNumerosEntre(1, 100); // Genera un nivel de lluvia entre 1 y 100 para cada sección
            
            System.out.println("El nivel de lluvia actual es: " + lluvia);
            
            // Si el nivel de lluvia es mayor a 3, se procede a recolectar frutas
            if (lluvia > 3) {
                
                System.out.println("Ingrese el tipo de fruta en la seccion"); 
                tipoFruta = utilitarios.Utils.leerEntero("1 = Mango 2 = Naranja: "); // Solicita el tipo de fruta en la sección (1 = Mango, 2 = Naranja)

                arbol = 1;// inicializa el contador de arboles en la seccion
                
                // Recorre cada árbol en la sección mientras no se exceda la cantidad de árboles, no se llene la canasta y no se haya recolectado más frutas que la capacidad
                while (arbol <= arbolesSeccion) {
                    frutas = utilitarios.Utils.generarNumerosEntre(3, 10); // Genera una cantidad aleatoria de frutas entre 3 y 10 para cada árbol
                    System.out.println("Cantidad de frutas: " + frutas);
                    frutasDisponibles = frutas;

                    // 
                    if (frutasRecolectadas + frutas > capacidadFruta) { // Calcula las frutas disponibles
                        frutasDisponibles = capacidadFruta - frutasRecolectadas;
                    }

                    frutasRecolectadas += frutasDisponibles; //Calcula frutas recolectadas
                    totalFrutas += frutasDisponibles; // calcula total de las frutas

                    // Sumar al tipo de fruta correspondiente solo lo recolectado
                    if (tipoFruta == 1) {
                        totalMango += frutasDisponibles;
                    } else {
                        totalNaranja += frutasDisponibles;
                    }

                    // Acumular las frutas que no se pudieron recolectar en este árbol
                    frutasNoRecolectadas += frutas - frutasDisponibles;

                    // Si ya se llenó la canasta, salir del ciclo
                    if (frutasRecolectadas >= capacidadFruta) {
                        break;
                    }

                    arbol++;  // Avanza al siguiente árbol en la sección
                }
             
            } else {
                System.out.println("Lluvia intensa, la cosecha se detiene.");
                frutasNoRecolectadas = capacidadFruta - frutasRecolectadas; // Se obtiene la cantidad de frutas no recolectadas
            }

            seccionActual = seccionActual + 1; // Avanza al siguiente a la sección

        }

        frutaPrecio = 200;
        frutaGanancia = frutasRecolectadas * frutaPrecio; //Se obtiene La ganancia por fruta recolectada

        // Verifica si la persona puede obtener el bono.
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