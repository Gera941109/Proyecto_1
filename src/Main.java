// Projec 1. Primera parte
// Creando una funcion con tres parametros que sean numeros entre si.
//Luego llamar a la funcion en el main y darle valores.
public class Main {
    public static void main(String[] args) {
        int resultado = 0;
        resultado = suma(4, 5, 6);
        System.out.println("resultado de suma: " + resultado);

        coche miCoche = new coche();
        miCoche.agregarPuerta();
        System.out.println("Numero de puertas: " + miCoche.puerta);
    }
    public static int suma(int x, int y, int z) {
        return x + y + z;
    }

}
// Segunda parte.
    /* -Crear clase coche.
        -Dentro de la clase coche, una variable numerica que almacene el
         numero de puertas que tiene el coche.
        -Crear un objeto miCoche en el main y añadirle una puerta.
        -Mostrar el numero de puertas que tiene el objeto.
     */
class coche {
    public int puerta = 0;
    public void agregarPuerta(){
        this.puerta++;
    }
}