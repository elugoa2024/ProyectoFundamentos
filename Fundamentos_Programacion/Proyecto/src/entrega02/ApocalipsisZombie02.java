package entrega02;

import utilitarios.Utils;

public class ApocalipsisZombie02 {
    public static void main(String[] args) {
        Utils.limpiarConsola();

        //Declarar Variables e inicializarlas
        String nombre = "", pistasEncontradas = "";
        int opcionAlmacen = 0, codigoCajaFuerte = 0, valorPistas = 0 , objeto = 0;
        int intentosAlmacen = 0, intentosCajaFuerte = 0, intentosFinales = 0;
        int turno = 1;

        // ==============================================================
        //Interaccion #1: Introduccion e intentar abrir el almacen.
        // ==============================================================
        System.out.println("La infeccion lo cambió todo. Ya casi no queda nadie con vida. Buscando refugio te adentras en una antigua casa abandonada."); // Descripción del escenario
        System.out.println("Pero no es un lugar seguro.Su dueño la convertió en una fortaleza llena de trampas y enigmas.¡Estas atrapado! ¡Los zombies no estan lejos!"); // Mensaje de peligro
        System.out.println("Solo resolviendo los acertijos podrás escapar...o te unirás a ellos? Bienvenido a Escape Room."); // Mensaje de bienvenida

        nombre = Utils.leerString("\nPara comenzar, por favor ingrese su nombre: "); // Solicita el nombre del jugador.
        System.out.println(nombre + ", este es tu primer objetivo: Buscar suministros en el almacén. Está cerrado con llave, y solo tienes 2 intentos para encontrarla." ); // Mensaje de objetivo
        
        //Bucle para intentar encontrar la llave (maximo 2 intentos)
        while (intentosAlmacen < 2) {
            intentosAlmacen ++; //Incrementa el contador de intentos
            opcionAlmacen = Utils.leerEntero("Esta es tu oportunidad ¿Donde desea buscar (Ingrese un numero del 1 al 4)? \n1. Dentro de un jarron. \n2. Gaveta de escritorio. \n3. Armario. \n4. Debajo de la alfombra.\n");// Solicita al jugador donde buscar la llave

            if (opcionAlmacen == 4) { //Condicional que contiene la respuesta correcta.
                System.out.println("\n¡Buen trabajo! Tu instinto no falla. Ya tienes la llave y la esperanza en tus manos." + "\nLograste entrar al almacen."); // Mensaje de éxito al encontrar la llave

                // ==============================================================
                //Interaccion #2: Abrir la caja fuerte
                // ==============================================================
                System.out.println("Dentro del almacen, una caja fuerte bloquea tu camino en el cual sólo un código la abrirá. Tienes 2 intentos para lograrlo. Pista: En los espejos del baño decía: Dos numeros que sumen 6."); // Mensaje del segundo objetivo
                System.out.println("Afuera, los zombis golpean la puerta con furia, pum pum... arh arh...¿Podrás descubrir el código oculto antes que los zombis rompan la puerta?"); // Mensaje de peligro
                //Bucle para intentar encontrar el codigo de la caja fuerte (maximo 2 intentos)
                while (intentosCajaFuerte < 2) {
                    codigoCajaFuerte = utilitarios.Utils.leerEntero("\nIngrese el código de la caja fuerte: "); // Solicita al jugador el código de la caja fuerte
                    intentosCajaFuerte ++;

                    if (codigoCajaFuerte == 42 || codigoCajaFuerte == 24) { //Condicional que contiene el codigo correcto de la caja fuerte.
                        System.out.println("\n¡Felicidades!Abriste la caja fuerte con precisión, tomaste el arma que allí se encontraba y acabaste con los zombis sin titubear."); // Mensaje de éxito al abrir la caja fuerte
                        System.out.println("La amenaza ha sido eliminada... por ahora!\n");

                        // ==============================================================
                        //Interaccion #3: Exploracion del laberinto (5 turnos)
                        // ==============================================================
                        System.out.println("\nGracias a esto logras tener un momento de tranquilidad y encuentras una especie de laberinto lleno de objetos misteriosos y un letrero que decía: ");
                        System.out.println("5 OPORTUNIDADES DE ELEGIR, ESCOGE BIEN Y SERÁS LIBRE");
                        while (turno <= 5) { //Ciclo para las 5 elecciones.
                            System.out.println("\nTurno: " + turno);
                            objeto = Utils.leerEntero("\nElige uno de estos objetos: \n1.Triangulo \n2.Reloj \n3.Cuadro \n4.Florero \n5.Juguete \n6.Cuchara \n7.Llanta\n"); //Solicita al jugador donde buscar las pistas por turno.

                            //Se verifica que objeto elige y agrega pistas
                            if (objeto == 1) {
                                pistasEncontradas = pistasEncontradas + "\nNo encontraste nada en el triangulo."; 
                            }else if (objeto == 2) {
                                pistasEncontradas = pistasEncontradas + "\nEncontraste un numero primo en el reloj.";
                                valorPistas = valorPistas + 6; //valorPistas se incrementa cuando se encuentran pistas útiles.
                            }else if (objeto == 3){
                                pistasEncontradas = pistasEncontradas + "\nNo encontraste nada en el cuadro.";
                            }else if (objeto == 4){
                                pistasEncontradas = pistasEncontradas + "\nNo encontraste nada en el florero.";
                            }else if (objeto == 5){
                                pistasEncontradas = pistasEncontradas + "\nNo encontraste nada en el juguete.";
                            }else if (objeto == 6){
                                pistasEncontradas = pistasEncontradas + "\nEncontraste un color cristalino en la cuchara.";
                                valorPistas = valorPistas + 6; //valorPistas se incrementa cuando se encuentran pistas útiles.
                            }else if (objeto == 7){
                                pistasEncontradas = pistasEncontradas + "\nNo encontraste nada en la llanta.";
                            }
                            turno ++; //Incremento de los turnos por cada intento.
                        } 
                        System.out.println("\nSe acabaron los turnos.");
                        System.out.println("Resumen detallado de tus pistas:");
                        System.out.println(pistasEncontradas); //Muestra los resultados, segun los numeros de los turnos escogidos por el usuario.
                        
                        // ==============================================================
                        // Interacción #4: Intento final para escapar de la habitación
                        // ==============================================================
                        System.out.println("\nTe encuentras con la puerta final, solo podrás abrirla si hiciste todo correctamente. ¡Vamos a analizarlo!");
                        while (intentosFinales < 2) { //ciclo que detalla los 2 posibles intentos

                            if (opcionAlmacen == 4 && (codigoCajaFuerte == 42 ||codigoCajaFuerte == 24) && valorPistas >= 6) { //Condicionales para salir.
                                System.out.println("Luego de un analisis de tu recorrido pudimos observar que cumpliste con los requisitos necesarios.");
                                System.out.println("\n¡Felicidades! Lograste salir de la habitacion.");
                                System.out.println("Fin del juego.");//Mensaje de finalizacion del codigo al cumplir las 3 condiciones. 
                                return;
                            }else{ // Si no cumple con los requisitos
                                intentosFinales ++;
                                if (intentosFinales < 2) {
                                    System.out.println("Lo sentimos, luego de nuestro analisis observamos que no cumples con los requisitos necesarios para salir.");
                                }else{ //Usuario intenta salir a las malas de la habitacion.
                                    System.out.println("En tu segundo intento tratas de salir forcejeando la puerta sin cumplir los requisitos, pero...esto no funciona así la puerta se ha bloqueado.");
                                    System.out.println("Fin del juego."); 
                                    return;
                                }
                            }
                        }
                    } else {
                        System.out.println("Intento fallido!"); //Fallo en el intento de la caja fuerte.
                    } 
                }
                System.out.println("Has fallado al abrir la caja fuerte. ¡Los zombis han acabado contigo! Fin del juego."); //Mensaje final si no logra adivinar el codigo de la caja fuerte luego de los 2 intentos.
                return;
            } else {
                System.out.println("\nFallaste..."); //Opcion incorrecta al tratar de buscar la llave.
            }
        }
        System.out.println("No lograste encontrar la llave del almacen. Fin del juego."); //Mensaje final si no logra encontrar la llave despues de los 2 intentos
    }
}