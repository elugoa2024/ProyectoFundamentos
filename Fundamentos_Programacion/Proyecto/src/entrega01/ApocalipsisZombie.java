package entrega01;  
public class ApocalipsisZombie {
    public static void main(String[] args) {
        utilitarios.Utils.limpiarConsola();
        String nombre;
        int opcionAlmacen;
        int codigoCajaFuerte;
        
        // Escenario 1
        System.out.println("La infeccion lo cambió todo. Ya casi no queda nadie con vida. Buscando refugio te adentras en una antigua casa abandonada."); // Descripción del escenario

        System.err.println("Pero no es un lugar seguro.Su dueño la convertió en una fortaleza llena de trampas y enigmas.!Estas atrapado¡ !Los zombies no estan lejos¡"); // Mensaje de peligro

        System.out.println("Solo resolviendo los acertijos podrás escapar...o te unirás a ellos? Bienvenido a Escape Room."); // Mensaje de bienvenida

        nombre = utilitarios.Utils.leerString("Para comenzar, por favor ingrese su nombre: "); // Solicita el nombre del jugador
        System.out.println(nombre + ", este es tu primer objetivo: Buscar suministros en el almacén. Está cerrado con llave, y solo tienes 2 intentos para encontrarla." ); // Mensaje de objetivo

        opcionAlmacen = (utilitarios.Utils.leerEntero("¿Donde desea buscar? \n1. Dentro de un jarron. \n2. Gaveta de escritorio. \n3. Armario. \n4. Debajo de la alfombra.\n")); // Solicita al jugador donde buscar la llave
        
        /*Si el jugador elige la opción correcta, avanza al segundo 
        escenario de la caja fuerte. Si no permanece en el primer escenario 
        y tendrá otra oportunidad para seleccionar la opción correcta */
        if (opcionAlmacen == 4) { 
            

            //Escenario 2
            System.out.println("¡Buen trabajo! Tu instinto no falla. Ya tienes la llave y la esperanza en tus manos." + "Lograste entrar al almacen."); // Mensaje de éxito al encontrar la llave
            System.out.println("Segundo objetivo: Dentro del almacen, una caja fuerte bloquea tu camino en el cual sólo un código la abrirá. Pista: En los espejos del baño decía: ´Dos numeros que sumen 6´"); // Mensaje del segundo objetivo
            System.out.println("Afuera, los zombis golpean la puerta con furia, pum pum… arh arh…¿Podrás descubrir el código oculto antes que los zombis rompan la puerta?"); // Mensaje de peligro
            codigoCajaFuerte = utilitarios.Utils.leerEntero("Ingrese el código de la caja fuerte: "); // Solicita al jugador el código de la caja fuerte

            if (codigoCajaFuerte == 42 || codigoCajaFuerte == 24) { // Verifica si el código es correcto
                System.out.println("¡Felicidades!Abriste la caja fuerte con precisión, tomaste el arma que allí se encontraba y acabaste con los zombis sin titubear."); // Mensaje de éxito al abrir la caja fuerte
                System.out.println("La amenaza ha sido eliminada. Fin del juego."); // Mensaje de finalización del juego

                
            } else { // Si el código es incorrecto, da una segunda oportunidad
                System.out.println("¡Código incorrecto!Estas frente a tu ultima oportunidad... los zombies ya estan acercandose; decide bien tu proximo numero si quieres vivir.");
                codigoCajaFuerte = utilitarios.Utils.leerEntero("Ingrese el código de la caja fuerte: ");

                if (codigoCajaFuerte == 42 || codigoCajaFuerte == 24) { // Verifica si el segundo código es correcto
                    System.out.println("¡Felicidades!Abriste la caja fuerte con precisión, tomaste el arma que allí se encontraba y acabaste con los zombis sin titubear.");
                    System.out.println("La amenaza ha sido eliminada. Fin del juego.");
                    
                } else {// Si el segundo código también es incorrecto, termina el juego
                    System.out.println("El segundo intento fue tu sentencia.Y así termina tu historia... Ni la lógica ni la suerte te acompañaron. Gracias por facilitarles la cena. Los zombies te lo agradecen… a su manera.");
                } 
                
            }


        // Continua en el primer escenario
        } else { // Si el jugador no elige la opción correcta, permanece en el primer escenario
            System.out.println("Aquí no está, te queda un intento."); // Mensaje de error al no encontrar la llave
            opcionAlmacen = (utilitarios.Utils.leerEntero("¿Donde desea buscar? \n1. Dentro de un jarron. \n2. Gaveta de escritorio. \n3. Armario. \n4. Debajo de la alfombra.\n")); // Solicita al jugador donde buscar la llave

            if (opcionAlmacen == 4) { // Si el jugador elige la opción correcta en el segundo intento, avanza al segundo escenario
                //Escenario 2
                System.out.println("Vaya, que suerte tienes! Has ingresado al almacén."); // Mensaje de éxito al encontrar la llave en el segundo intento
                System.out.println("Segundo objetivo: Dentro del almacen, una caja fuerte bloquea tu camino en el cual sólo un código la abrirá. Pista: En los espejos del baño decía: ´Dos numeros que sumen 6´"); // Mensaje del segundo objetivo
                System.out.println("Afuera, los zombis golpean la puerta con furia, pum pum… arh arh…¿Podrás descubrir el código oculto antes que los zombis rompan la puerta?"); // Mensaje de peligro
                codigoCajaFuerte = utilitarios.Utils.leerEntero("Ingrese el código de la caja fuerte: "); // Solicita al jugador el código de la caja fuerte
                if (codigoCajaFuerte == 42 || codigoCajaFuerte == 24) { // Verifica si el código es correcto
                    System.out.println("¡Felicidades!Abriste la caja fuerte con precisión, tomaste el arma que allí se encontraba y acabaste con los zombis sin titubear.");// Mensaje de éxito al abrir la caja fuerte
                    System.out.println("La amenaza ha sido eliminada. Fin del juego."); // Mensaje de finalización del juego                   
                } else {// Si el código es incorrecto, da una segunda oportunidad
                    System.out.println("¡Código incorrecto!Estas frente a tu ultima oportunidad... los zombies ya estan acercandose; decide bien tu proximo numero si quieres vivir.");// Mensaje de error al no encontrar el código correcto
                    codigoCajaFuerte = utilitarios.Utils.leerEntero("Ingrese el código de la caja fuerte: ");// Solicita al jugador el código de la caja fuerte nuevamente
                    if (codigoCajaFuerte == 42 || codigoCajaFuerte == 24) {// Verifica si el segundo código es correcto
                        System.out.println("¡Felicidades!Abriste la caja fuerte con precisión, tomaste el arma que allí se encontraba y acabaste con los zombis sin titubear.");// Mensaje de éxito al abrir la caja fuerte en el segundo intento
                        System.out.println("La amenaza ha sido eliminada. Fin del juego.");// Mensaje de finalización del juego

                        
                    } else {// Si el segundo código también es incorrecto, termina el juego
                        System.out.println("El segundo intento fue tu sentencia.Y así termina tu historia... Ni la lógica ni la suerte te acompañaron. Gracias por facilitarles la cena. Los zombies te lo agradecen… a su manera.");// Mensaje de finalización del juego si el segundo código es incorrecto
                        
                    }
                    
                }

            // Pierde el juego
            } else {
                System.out.println("Fallaste los 2 intentos, la llave sigue oculta y los peligros acechan. Regresa al inicio y prueba otra vez.");               
            }
        System.out.println(nombre + "¡Gracias por su tiempo!");   // Mensaje de despedida
        }

    }

}