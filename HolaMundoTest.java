public class HolaMundoTest {
    
    public static void main(String[] args) {
        int resultado = HolaMundo.suma(3, 4);
        System.out.println("El resultado es: "+resultado);

        double resultadoDoble = HolaMundo.suma(3.14, 1.6);
        System.out.println("El resultado es: "+resultadoDoble);

        int resultadoTriple = HolaMundo.suma(3, 4, 5);
        System.out.println("El resultado es: "+resultadoTriple);
    }
}
