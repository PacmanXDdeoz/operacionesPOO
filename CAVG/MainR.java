import java.util.Scanner;

class MainR {
    public static void main(String[] args) {
        ejecutarPrograma();
    }
    public static void ejecutarPrograma() {
        Scanner sc = new Scanner(System.in);
        Resta r = new Resta();

        try {
            System.out.println("(^w^) Bienvenido a Resta (*o*)/");
            System.out.println("¿Quieres restar dos numeros?");
            System.out.println("1. Si");
            System.out.println("2. No");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el primer numero");
                    r.setResta1(sc.nextInt());
                    System.out.println("Ingrese el segundo numero");
                    r.setResta2(sc.nextInt());
                    System.out.println("El resultado es " + (r.getResta1() - r.getResta2()));
                    break;
                case 2:
                    System.out.println("Gracias por usar Resta (*o*)/");
                    break;
                default:
                    System.out.println("xX Opcion invalida, debe ser 1 o 2 Xx");
                    ejecutarPrograma();
            }
        }catch (Exception e) {
        }
    }
}