import java.util.Scanner;

public class Actividad2 {
    public static int findMax(int[] arreglo){
        int maximo = arreglo[0];
        for (int i = 0; i < arreglo.length; i++){
            if (arreglo[i] > maximo) {
                maximo = arreglo[i];
            }
        }
        return maximo;
    }

    public static int findMin(int[] arreglo){
        int minimo = arreglo[0];
        for (int i = 0; i < arreglo.length; i++){
            if (arreglo[i] < minimo) {
                minimo = arreglo[i];
            }
        }
        return minimo;
    }

    public static void printarray(int[] arreglo){
        System.out.print("Los valores del arreglo son: ");
        for (int i = 0; i < arreglo.length; i++){
            System.out.print(arreglo[i]+ " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dame el tamaño del arreglo: ");
        int tamaño = scanner.nextInt();

        int[] arreglo = new int[tamaño];

        System.out.println("Ingrese valores para el arreglo: ");
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Valor " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }

        printarray(arreglo);
        findMax(arreglo);
        findMin(arreglo);
        System.out.println("El valor máximo del arreglo es: "+ findMax(arreglo));
        System.out.println("El valor mínimo del arreglo es: "+ findMin(arreglo));

    }
}
