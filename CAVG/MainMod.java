import java.util.Scanner;

class MainMod {
    public static void main(String[] args) {
        ejecutarPrograma();
    }
    public static void ejecutarPrograma() {
        Scanner sc = new Scanner(System.in);
        Modulo m = new Modulo();

        try {
            System.out.println("(^w^) Bienvenido a Modulo (*o*)/");
            System.out.println("¿Quieres calcular el modulo de dos numeros?");
            System.out.println("1. Si");
            System.out.println("2. No");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el primer numero");
                    m.setMod1(sc.nextInt());
                    System.out.println("Ingrese el segundo numero");
                    m.setMod2(sc.nextInt());
                    System.out.println("El resultado es " + (m.getMod1() % m.getMod2()));
                    break;
                case 2:
                    System.out.println("Gracias por usar Modulo (*o*)/");
                    break;
                default:
                    System.out.println("xX Opcion invalida, debe ser 1 o 2 Xx");
                    ejecutarPrograma();
            }
        }catch (Exception e) {
        }
    }
}