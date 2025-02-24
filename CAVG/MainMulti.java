import java.util.Scanner;

class MainMulti {
    public static void main(String[] args) {
        ejecutarPrograma();
    }
    public static void ejecutarPrograma() {
        Scanner sc = new Scanner(System.in);
        Multiplicacion m = new Multiplicacion();

        try {
            System.out.println("(^w^) Bienvenido a Multiplicacion (*o*)/");
            System.out.println("¿Quieres multiplicar dos numeros?");
            System.out.println("1. Si");
            System.out.println("2. No");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el primer numero");
                    m.setMult1(sc.nextInt());
                    System.out.println("Ingrese el segundo numero");
                    m.setMult2(sc.nextInt());
                    System.out.println("El resultado es " + (m.getMult1() * m.getMult2()));
                    break;
                case 2:
                    System.out.println("Gracias por usar Multiplicacion (*o*)/");
                    break;
                default:
                    System.out.println("xX Opcion invalida, debe ser 1 o 2 Xx");
                    ejecutarPrograma();
            }
        }catch (Exception e) {
        }
    }
}