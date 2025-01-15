// PascaCase  archivos y clases
// camelCase  variables y metodos

import java.util.ArrayList;
import java.util.HashMap;
public class IntroJava {

    // Metodo principal / main es lo unico que se ejcuta
    public static void main(String[] args) {
        System.out.println("Hello World");

        // Variable -> definir desde un principio el tipo de dato a utilizar
        // Variables primitivas SOLO guardan el valor
        int numeroEntero = 55;
        double numeroDecimal = 3.14159;
        boolean feliz = true;
        char caracter = 'C';

        // Variables tipo objeto, guardan el valor y tienen metodos
        Integer numeroEnteroDos = 56;
        Double numeroDecimalDos = 1.666666;
        Character otroCaracter = 'D';
        String muchosCaracteres = "ABCD";

        // Usamos primitivas cuando solo nos interesa el valor almacenado y tipo objeto cuando queremos manipular los elementos

        // Cadenas - String
        String cadena = "Buenos dias compañerosss!!!!!";
        System.out.println("La longitud de la cadena es " +cadena.length()); //.length regresa el largo
        char letra = cadena.charAt(2);
        System.out.println(letra);

        int a = cadena.indexOf("Buenos"); //indexOf regresa indice/posicion de la palabra
        int b = cadena.indexOf("dias");
        int c = cadena.indexOf("compañerosss!!!!!");
        System.out.println("Buenos "+a);
        System.out.println("dias "+b);
        System.out.println("compañerosss!!!!! "+c);
        System.out.println(cadena.toLowerCase());
        System.out.println(cadena.toUpperCase());

        String frase1 = "Mi nombre es: ";
        String frase2 = "Quandile Dingle";
        String fraseCompleta = frase1.concat(frase2); //concat concatena 2 textos

        String x = "hola";
        String y = "Hola";
        System.out.println(x.equals(y));
        System.out.println(x.equalsIgnoreCase(y));//Compara ignorando diferencias de mayusculas o minusculas

        if (numeroEntero == 100) {
            System.out.println("Numeros Iguales");
        } else{
            System.out.println("Numeros Dsitintos");
        }
        int edadInfante = 3;
        if(edadInfante <2){
            System.out.println("Es un veve");
        } else if (edadInfante <4){
            System.out.println("Es un todler");
        } else {
            System.out.println("Es un niño");
        }
        boolean estaLloviendo = false;
        int temperatura = 20;
    
        if(temperatura > 18 && !estaLloviendo) {
            System.out.println("Es un lindo dia!!!");
        }

        int edad = 16;
        boolean permisoPadres = true;

        if (edad >= 18 || permisoPadres) {
            System.out.println("Puedes conducir!");
        }
        else{
            System.out.println("No puedes conducir :(((( WEON PENCAAAA MIERDA ANDANTE WAJAJAJAJA");
        }

        int dia = 3;
        switch (dia) {
            case 1: System.out.println("Lunes");
                break;
            case 2: System.out.println("Martes");
                break;
            case 3: System.out.println("Miercoles");
                break;
            case 4: System.out.println("Jueves");
                break;
            case 5: System.out.println("Viernes");
                break;
            case 6: System.out.println("Sabado");
                break;
            case 7: System.out.println("Domingo");
                break;
            default: System.out.println("Solo existen 7 dias");
                break;
        }

        saludo("Quandile");
        saludo("Don Pollo");
        
        System.out.println(sumatoria(numeroEntero, numeroEnteroDos));

        // ARREGLOS/ARRAYS
        int[] arreglo;//DECLARACION
        arreglo = new int[5];
        arreglo[0] = 4;
        arreglo[1] = 8;
        arreglo[2] = 9;
        arreglo[3] = 10;
        arreglo[4] = 5;

        int[] arreglo2 = {4, 8, 9, 10, 5};

        System.out.println(arreglo2);

        ArrayList<Integer> arreglo3 = new ArrayList<Integer>();

        arreglo3.add(8);
        arreglo3.add(6);
        arreglo3.add(99);

        System.out.println(arreglo3);

        ArrayList<String> arreglo4 = new ArrayList<String>();

        arreglo4.add("Quandile");
        arreglo4.add("Dingle");
        arreglo4.add("HERE!");

        System.out.println(arreglo4);


        System.out.println(arreglo4.get(0));
        
        arreglo4.set(2, "WHREHEHEHE!");

        System.out.println(arreglo4);

        // BUCLES / CICLOS
        for(int i=0; i<5; i++) {
            System.out.println("Hola!");
        }

        int j = 0;
        while (j < 5) {
            System.out.println("Hola2!!!");
            j++;
        }

        int inicio = 0;
        int fin = 5;
        while (inicio < fin) {
            System.out.println("oh!");
            inicio++;
            fin--;
        }

        int k = 10;
        do {
            System.out.println("HOLA3!!!");
        } while (k < 5);

        // do {
        // imprime menu
        // } while (no ha escrito salir)

        // Mapas de Hash o HashMaps
        HashMap<String, String> estudiante0 = new HashMap<String, String>();
        estudiante0.put("nombre", "Quandile");
        estudiante0.put("apellido", "Dingle");
        estudiante0.put("lugar", "HERE!!!");

        System.out.println(estudiante0.get("apellido"));
        System.out.println(estudiante0);
        System.out.println(estudiante0.size());

        // Bucle para recorrer arreglo
        for(int w = 0; w < arreglo.length; w++) {
            System.out.println(arreglo[w]);
        }

        HashMap<String, String> estudiante1 = new HashMap<String, String>();
        estudiante1.put("nombre", "Don");
        estudiante1.put("apellido", "Pollo");
        estudiante1.put("lugar", "Un video ma pa peldel el tiempo emepecemo");

        ArrayList<HashMap<String, String>> estudiantes = new ArrayList<HashMap<String, String>>();
        estudiantes.add(estudiante0);
        estudiantes.add(estudiante1);

        System.out.println(estudiantes);
        System.out.println(estudiantes.get(1));

        /* 3 métodos para crear un nombre de super heroe
        
        1.- Recibiera un nombre: Super <nombre>
        2.- Recibiera un nombre y un color: Super <nombre> <color>
        3.- Recibiera un nombre, color y habilidad: Super <nombre> <color> <habilidad>
        
        TAREA METODOS Y SOBRECARGA
          */


    }

    // Permiso: public, private, protected
    // static: es de mi clase(MAS DETALLES EN POO)
    // Tipo de valor de retorno: int, double, string, void
    // Nombre funcion
    // Parametros

    public static int sumatoria(int num1, int num2) {
        // Codigo
        return num1 + num2;
    }

    public static void saludo(String nombre) {
        System.out.println("Hola "+nombre);
    }
}
