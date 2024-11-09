
public class binary {

    // Método para realizar la búsqueda binaria
    public static int busquedaBinaria(int[] arreglo, int valorBuscado) {
        int inicio = 0;
        int fin = arreglo.length - 1;

        // Mientras haya elementos en el rango de búsqueda
        while (inicio <= fin) {
            int mitad = inicio + (fin - inicio) / 2;

            // Si el valor está en la mitad, se ha encontrado
            if (arreglo[mitad] == valorBuscado) {
                return mitad;  // Devuelve el índice donde se encuentra el valor
            }

            // Si el valor buscado es menor, ignoramos la mitad derecha
            if (arreglo[mitad] > valorBuscado) {
                fin = mitad - 1;
            }
            // Si el valor buscado es mayor, ignoramos la mitad izquierda
            else {
                inicio = mitad + 1;
            }
        }

        // Si no se encontró el valor
        return -1;
    }

    // Método principal para probar la búsqueda binaria
    public static void main(String[] args) {
        int[] arreglo = {1, 3, 5, 7, 9, 11, 13, 15, 17,19, 21, 27,47,56,69,72,84,96,102};
        int valorBuscado = 11;

        int resultado = busquedaBinaria(arreglo, valorBuscado);

        if (resultado == -1) {
            System.out.println("El valor no fue encontrado en el arreglo.");
        } else {
            System.out.println("El valor " + valorBuscado + " fue encontrado en el índice: " + resultado);
        }
    }
}

    

