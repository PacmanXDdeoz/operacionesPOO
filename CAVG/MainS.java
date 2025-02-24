import java.util.Scanner;

class MainS {
    public static void main(String[] args) {
        ejecutarPrograma();
    }
    public static void ejecutarPrograma() {
        Scanner sc = new Scanner(System.in);
        Suma s = new Suma();

        try {
            System.out.println("(^w^) Bienvenido a Suma (*o*)/");
            System.out.println("¿Quieres sumar dos numeros?");
            System.out.println("1. Si");
            System.out.println("2. No");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el primer numero");
                    s.setSum1(sc.nextInt());
                    System.out.println("Ingrese el segundo numero");
                    s.setSum2(sc.nextInt());
                    System.out.println("El resultado es " + (s.getSum1() + s.getSum2()));
                    break;
                case 2:
                    System.out.println("Gracias por usar Suma (*o*)/");
                    break;
                default:
                    System.out.println("xX Opcion invalida, debe ser 1 o 2 Xx");
                    ejecutarPrograma();
                }
            }catch (Exception e) {
        }
    }
}