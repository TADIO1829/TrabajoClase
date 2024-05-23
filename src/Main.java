//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estudiantes[] estudiante = new Estudiantes[5];
        int opcion = 0;
        while (opcion != 5) {
            System.out.println("EPN");
            System.out.println("1. Ingresar Datos Estudiante");
            System.out.println("2. Imprimir Datos y Notas del estudiente");
            System.out.println("3. Imprimir Nota máxima y minima");
            System.out.println("4. Imprimir Promedio");
            System.out.println("5. Salir");
            System.out.println("Ingrese su opcion");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    for (int i = 0; i < 1; i++) {
                        System.out.println("Ingresar Datos Estudiante");
                        System.out.println("Ingresar Nombre: ");
                        String nombre = sc.next();
                        System.out.println("Ingresar Cedula: ");
                        String cedula = sc.next();
                        System.out.println("Ingresar Correo: ");
                        String correo = sc.next();
                        System.out.println("Ingresar semestre: ");
                        String semestre = sc.next();
                        System.out.println("Ingresar Codigo Unico: ");
                        String codigoUnico = sc.next();
                        for (int j = 0; j < 5; j++) {
                            System.out.println("Ingrese el nombre de la materia:");
                            String materia = sc.next();
                            System.out.println("Ingrese la nota de la materia:");
                            Double nota = sc.nextDouble();
                            estudiante[j] = new Estudiantes(nombre, cedula, correo, semestre, codigoUnico, materia, nota);
                        }
                    }
                        break;

                case 2:
                    for (int i = 0; i < 1; i++) {
                        System.out.println("\t-----Notas-----");
                        if (estudiante[0] == null) {
                            System.out.println("No existe ningun  registro.");
                        } else {
                            for (int j = 0; j < 1; ++j) {
                                if (estudiante[j] != null) {
                                    System.out.println("\nNotas del estudiante: " + (j + 1));
                                    estudiante[j].imprimirDatos();
                                    for(int k=0;k<5;k++) {
                                        estudiante[k].imprimirNotas();
                                    }
                                }
                            }
                        }
                    }
                break;
                case 3:
                    break;
                case 4:
                    System.out.println("El promedio del estudiante es: ");
                    estudiante[1].promedioNotas();

                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Error, Digite un número valido...");


            }

        }
    }
}