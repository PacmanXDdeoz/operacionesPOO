import java.util.Scanner;

class MainD {
    public static void main(String[] args) {
        ejecutarPrograma();
    }
    public static void ejecutarPrograma() {
        Scanner sc = new Scanner(System.in);
        Division d = new Division();

        try {
            System.out.println("(^w^) Bienvenido a Division (*o*)/");
            System.out.println("¿Quieres dividir dos numeros?");
            System.out.println("1. Si");
            System.out.println("2. No");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el primer numero");
                    d.setDiv1(sc.nextDouble());
                    System.out.println("Ingrese el segundo numero");
                    d.setDiv2(sc.nextDouble());
                    System.out.println("El resultado es " + (d.getDiv1() / d.getDiv2()));
                    break;
                case 2:
                    System.out.println("Gracias por usar Division (*o*)/");
                    break;
                default:
                    System.out.println("xX Opcion invalida, debe ser 1 o 2 Xx");
                    ejecutarPrograma();
            }
        }catch (Exception e) {
        }
    }
}