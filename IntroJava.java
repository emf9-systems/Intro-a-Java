// PascaCase  archivos y clases
// camelCase  variables y metodos

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
