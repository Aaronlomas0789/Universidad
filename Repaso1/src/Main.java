import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Universidad

        System.out.println(" Ingrese el nombre de la universidad: ");
        String nombreuni = scanner.nextLine();
        System.out.println("Ingrese la direccion");
        String nombredirec = scanner.nextLine();
        System.out.println(" Ingrese el precio ");
        String valorprecio = scanner.nextLine();

        Universidad universidad = new Universidad(nombreuni,nombredirec,valorprecio) ;

        // Estudiantes

        System.out.println("Ingrese el nombre del estudiante: ");
        String nombreEst = scanner.nextLine();
        System.out.println("Ingrese la carrera: ");
        String nombreCarpeta = scanner.nextLine();
        System.out.println("Ingrese el Correo: ");
        String correo = scanner.nextLine();

        Estudiantes estudiantes = new Estudiantes(nombreEst,nombreCarpeta,correo);

        // Curso

        System.out.println("Ingrese Curso1 :");
        String curso1 = scanner.nextLine();
        System.out.println("Ingrese Curso2 :");
        String curso2 = scanner.nextLine();
        System.out.println("Ingrese curso3 :");
        String curso3 = scanner.nextLine();

        Curso curso = new Curso(curso1,curso2,curso3);

        System.out.println("Informacion Universidades : \n ");
        System.out.println(universidad.datalleUni());

        System.out.println("Informacion Estudiantes : \n ");
        System.out.println(estudiantes.detalleEstu());

        System.out.println("Informacion Curso : \n ");
        System.out.println(curso.detalleCurso());





    }
}