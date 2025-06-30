package Mi_practica03;  
public class Escape_room {
    public static void main(String[] args) {
        utilitarios.Utils.limpiarConsola();
        String nombre;
        int opcionAlmacen;
        int codigoCajaFuerte;
        

        System.out.println("La infeccion lo cambió todo. Ya casi no queda nadie con vida. Buscando refugio te adentras en una antigua casa abandonada.");

        System.err.println("Pero no es un lugar seguro.Su dueño la convertió en una fortaleza llena de trampas y enigmas.!Estas atrapado¡ !Los zombies no estan lejos¡");

        System.out.println("Solo resolviendo los acertijos podrás escapar...o te unirás a ellos? Bienvenido a Escape Room.");

        nombre = utilitarios.Utils.leerString("Para comenzar, por favor ingrese su nombre: ");
        System.out.println(nombre + ", este es tu primer objetivo: Buscar suministros en el almacén. Está cerrado con llave, y solo tienes 2 intentos para encontrarla." );

        switch (utilitarios.Utils.leerEntero("¿Donde desea buscar? \n1. Dentro de un jarron. \n2. Gaveta de escritorio. \n3. Armario. \n4. Debajo de la alfombra.\n")) {
            case 1:
                opcionAlmacen = 1;
                break;
            case 2:
                opcionAlmacen = 2;
                break;
            case 3:
                opcionAlmacen = 3;
                break;
            case 4:
                opcionAlmacen = 4;
                break;
            default:
                opcionAlmacen = 0;
        }// Fin del switch

        if (opcionAlmacen == 4) {
            System.out.println("¡Buen trabajo! Tu instinto no falla. Ya tienes la llave y la esperanza en tus manos." + "Lograste entrar al almacen.");
            System.out.println("Segundo objetivo: Dentro del almacen, una caja fuerte bloquea tu camino en el cual sólo un código la abrirá. Pista: En los espejos del baño decía: ´Dos numeros que sumen 6´");
            System.out.println("Afuera, los zombis golpean la puerta con furia, pum pum… arh arh…¿Podrás descubrir el código oculto antes que los zombis rompan la puerta?");
            codigoCajaFuerte = utilitarios.Utils.leerEntero("Ingrese el código de la caja fuerte: ");

            if (codigoCajaFuerte == 42 || codigoCajaFuerte == 24) {
                System.out.println("¡Felicidades!Abriste la caja fuerte con precisión, tomaste el arma que allí se encontraba y acabaste con los zombis sin titubear.");
                System.out.println("La amenaza ha sido eliminada. Fin del juego.");

                
            } else {
                System.out.println("¡Código incorrecto!Estas frente a tu ultima oportunidad... los zombies ya estan acercandose; decide bien tu proximo numero si quieres vivir.");
                codigoCajaFuerte = utilitarios.Utils.leerEntero("Ingrese el código de la caja fuerte: ");

                if (codigoCajaFuerte == 42 || codigoCajaFuerte == 24) {
                    System.out.println("¡Felicidades!Abriste la caja fuerte con precisión, tomaste el arma que allí se encontraba y acabaste con los zombis sin titubear.");
                    System.out.println("La amenaza ha sido eliminada. Fin del juego.");
                    
                } else {
                    System.out.println("El segundo intento fue tu sentencia.Y así termina tu historia... Ni la lógica ni la suerte te acompañaron. Gracias por facilitarles la cena. Los zombies te lo agradecen… a su manera.");
                } 
                
            }


            
        } else {
            System.out.println("Aquí no está, te queda un intento.");
            switch (utilitarios.Utils.leerEntero("¿Donde desea buscar? \n1. Dentro de un jarron. \n2. Gaveta de escritorio. \n3. Armario. \n4. Debajo de la alfombra.\n")) {
            case 1:
                opcionAlmacen = 1;
                break;
            case 2:
                opcionAlmacen = 2;
                break;
            case 3:
                opcionAlmacen = 3;
                break;
            case 4:
                opcionAlmacen = 4;
                break;
            default:
                opcionAlmacen = 0;
            }// Fin del switch

            if (opcionAlmacen == 4) {
                System.out.println("Vaya, que suerte tienes! Has ingresado al almacén.");
                System.out.println("Segundo objetivo: Dentro del almacen, una caja fuerte bloquea tu camino en el cual sólo un código la abrirá. Pista: En los espejos del baño decía: ´Dos numeros que sumen 6´");
                System.out.println("Afuera, los zombis golpean la puerta con furia, pum pum… arh arh…¿Podrás descubrir el código oculto antes que los zombis rompan la puerta?");
                codigoCajaFuerte = utilitarios.Utils.leerEntero("Ingrese el código de la caja fuerte: ");
                if (codigoCajaFuerte == 42 || codigoCajaFuerte == 24) {
                    System.out.println("¡Felicidades!Abriste la caja fuerte con precisión, tomaste el arma que allí se encontraba y acabaste con los zombis sin titubear.");
                    System.out.println("La amenaza ha sido eliminada. Fin del juego.");                   
                } else {
                    System.out.println("¡Código incorrecto!Estas frente a tu ultima oportunidad... los zombies ya estan acercandose; decide bien tu proximo numero si quieres vivir.");
                    codigoCajaFuerte = utilitarios.Utils.leerEntero("Ingrese el código de la caja fuerte: ");
                    if (codigoCajaFuerte == 42 || codigoCajaFuerte == 24) {
                        System.out.println("¡Felicidades!Abriste la caja fuerte con precisión, tomaste el arma que allí se encontraba y acabaste con los zombis sin titubear.");
                        System.out.println("La amenaza ha sido eliminada. Fin del juego.");

                        
                    } else {
                        System.out.println("El segundo intento fue tu sentencia.Y así termina tu historia... Ni la lógica ni la suerte te acompañaron. Gracias por facilitarles la cena. Los zombies te lo agradecen… a su manera.");
                        
                    }
                    
                }

                
            } else {
                System.out.println("Fallaste los 2 intentos, la llave sigue oculta y los peligros acechan. Regresa al inicio y prueba otra vez.");               
            }
        System.out.println(nombre + "¡Gracias por su tiempo!");   
        }

    }// Ciierre del main

}