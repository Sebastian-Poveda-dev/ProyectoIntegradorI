import java.util.Scanner;
/**
 * Clase que se encarga de controlar el sistema de registro y asignación de buses.
 * @author Juan Sebastian Poveda
 * @version 1.0 08/20/2024
 */
public class Main{
        public static void main(String[] args) {
            /**
             * Declaración de la clase Scanner para leer por consola.
             * Mensajes de bienvenida y solicitud de nombre
             */
            Scanner scanner = new Scanner(System.in);
            System.out.println("¡Bienvenido voluntario a la aplicación de rutas ecológicas");
            System.out.println("¿Cuál es su nombre?: ");
            /**
             * Inicialización de variable "name" que almacena el nombre digitado por el usuario leído con el objeto Scanner
             */
            String name = scanner.nextLine();
            /**
             * Mensaje de solicitud de documento de identidad
             * Inicialización variable "cc" que almacena el número digitado por el usuario leído con el objeto Scanner
             */
            System.out.println("Por favor digite su cédula: ");
            int cc = scanner.nextInt();
            scanner.nextLine();

            /**
             * Mensaje de bienvenida para el usuario empleando el nombre que digitó anteriormente, además solicitud de la ruta
             * Inicialización de variable "ruta" que almacena  el texto digitado por el usuario, además se convierte a minúscula para evitar posibles errores
             */
            System.out.printf("¡Bienvenido, %s! ¿Qué ruta registrarás el día de hoy?: \n", name);
            String route = scanner.nextLine().toLowerCase();


            /**
             * Código encargado de la proveer la información adecuada de acuerdo con la ruta que el usuario digitó
             */
            routescall(route);
            
            /**
             * Mensaje que solicita la cantidad de participantes que asisten al evento
             * Inicialización variable "participants" que almacena la cantidad declarada de participantes declarada por el usuario leída con el objeto Scanner
             */
            System.out.println("¿Cuántos participantes acudirán a la caminata de hoy?: ");
            int participants = scanner.nextInt();
            scanner.nextLine();

            /**
             * Mensaje que solicita la cantidad de guías que acudirán al evento 
             * Inicialización de variable "guides" que almacena la cantidad de guías declarada por el usuario, leída con el objeto Scanner
             */
            System.out.println("¿Cuántos guías acudirán a la caminata de hoy?: ");
            int guides = scanner.nextInt();
            scanner.nextLine();

            /**
             * Mensaje que solicita la temperatura actual en grados centigrados
             * Inicialización de variable "temp" que almacena la temperatura, leída con el objeto Scanner
             */
            System.out.println("Ingrese la temperatura en grados centígrados °C");
            double temp = scanner.nextDouble();
            
            /**
             * Mensaje que solicita el porcentaje de humedad relativa
             * Inicialización de variable "humidity" 
             */
            System.out.println("Ingrese el porcentaje de humedad relativa");
            double humidity = scanner.nextDouble();

            /**
             * Evaluación de temperatura y humedad para la emisión de un mensaje positivo de acuerdo con las condiciones climáticas
             */
            if (temp >= 20 && temp <= 25 && humidity >= 40 && humidity <= 60) {
                System.out.println("¡Hace un buen día para caminar por Cali!");                
            }
            
            /**
             * Declaración de variable "buses"
             * Inicialización de variable "totalPeople" que representa la suma de los participantes y los guías
             */
            int buses;
            int totalPeople = participants + guides;

            /**
             * Cálculo de los buses necesarios para el transporte de las personas teniendo en cuenta que cada bus cuenta con una capacidad de 25 personas, asignado a la varible "buses"
             */
            buses = totalBuses(totalPeople);
            
            /**
             * Mensajes con formato que recuerdan la cantidad total de personas que hacen parte de la actividad y muestra la cantidad de buses necesaria para su transporte
             */
            System.out.printf("Al ser un total de %d personas que harán parte de la actividad, se necesitará un total de: \n ", totalPeople);
            System.out.printf("%d buses para llevarla a cabo de manera exitosa. ¡Nos vemos en la COP16!", buses);

            scanner.close();
    }
      
          /**
         * La función calcula la cantidad de buses necesarias para que la totalidad que el usuario digite se puedan transportar,
         * devuelve la cantidad de buses teniendo en cuenta que cada bus tiene una capacidad de 25 personas
         * 
         * @param people : cantidad de personas totales que asistirán al evento
         * @return : Cantidad de buses necesaria para las personas que asistirán al evento 
         */
        public static int  totalBuses (int people){
            int buses;
            buses = (int) Math.ceil(people / 25);
            return buses;
         }

        public static void routescall (String route) {
              /**
             * Código encargado de la proveer la información adecuada de acuerdo con la ruta que el usuario digitó
             */
            switch (route) {
                case "ladera" : System.out.println("¡Excelente! La Ruta Ladera tiene como punto de encunetro Bulevar del Río iniciando a las 7:00 a.m., y termina a la 1:30 p.m.");
                break;
                case "oriente" : System.out.println("¡Excelente! La Ruta del oriente tiene como punto de encuentro Bulevar del Río iniciando a las 7:00 a.m., y termina a la 1:00 p.m.");
                break;
                case "farallones" : System.out.println("¡Excelente! La Ruta de los Farallones tiene como punto de encuentro Calle 16 - Universidad del Valle iniciando a las 6:40 am, y termina a las 4:00 pm.");
                break;
            }
        }
}