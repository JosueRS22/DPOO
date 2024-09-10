import java.util.Scanner;

public class Actividad1 {

public static void promediop(int[] calificaciones, int[] creditos) {
    int sumapromedio = 0;
    int sumacreditos = 0;
    
        System.out.println("Créditos  Calificación  Total ");
    for (int i = 0; i < calificaciones.length; i++){
        int calif = calificaciones[i];
        int cred = creditos[i];
        sumapromedio += calif*cred; 
        sumacreditos += cred;
        System.out.println("   "+ cred + "   x        " + calif + "    =  " + cred*calif);
    }

    double ponderado = (double) sumapromedio / sumacreditos;
    System.out.println("   "+ sumacreditos + "         Entre       "+ sumapromedio);
    System.out.println("El promedio ponderado es: " + ponderado);
}

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Dame el tamaño del arreglo");
    int tamaño = scanner.nextInt();

    int[] calificaciones = new int[tamaño];
    int[] creditos = new int[tamaño];

    System.out.println("Ingrese calificaciones para el arreglo:");
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Calificacion: " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextInt();
        }
    
    System.out.println("Ingrese creditos para el arreglo:");
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Creditos para la calificación: " + (i + 1) + ": ");
            creditos[i] = scanner.nextInt();
        }

    promediop(calificaciones, creditos);
       
    }
}
