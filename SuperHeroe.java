        /* 3 métodos para crear un nombre de super heroe
        
        1.- Recibiera un nombre: Super <nombre>
        2.- Recibiera un nombre y un color: Super <nombre> <color>
        3.- Recibiera un nombre, color y habilidad: Super <nombre> <color> <habilidad>
        
        TAREA METODOS Y SOBRECARGA
          */


public class SuperHeroe {
    
    public static void nombreSuperHeroe(String nombre) {
        System.out.println("Eres: Super "+nombre);
    }

    public static void nombreSuperHeroe(String nombre, String color) {
        System.out.println("Eres: Super "+nombre+" "+color);
    }

    public static String nombreSuperHeroe(String nombre, String color, String habilidad) {
        return ("Eres: Super "+nombre+" "+color+" "+habilidad);
    }
    
    

}
