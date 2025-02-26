import java.util.Scanner;//libreria para que el usuario pueda ingresar datos

public class MainRR {//nombre de mi clase
    public static void main(String[] args) {//metodo de entrada principal
        Scanner op = new Scanner(System.in);//creacion de mi objeto Scanner
        RestaRecursiva u = new RestaRecursiva();//creacion de mi nuevo objeto de RestaRecursiva
        int f;//declaracion de variable
        do {//comienza el bucle 
            System.out.println("\n===== MENÚ =====");//impresion del menu y sus opciones
            System.out.print("1: Realizar resta\n");
            System.out.println("2: Cerrar");
            System.out.print("Elige una opción: ");
            f = op.nextInt();//la variable declarada se guardara dentro de mi objeto Scanner
            if (f == 1) {//condicion que dira que si es igual igual a 1 que es mi opcion 1, podra ingresar 
                System.out.println("Ingresa tu primer numero");//instruccion al usuario
                u.setN1(op.nextInt());//de mi objeto u se asiganara el valor que coloque en la variable c
                System.out.println("Ingresa el segundo numero");//instruccion al usuario
                u.setN2(op.nextInt());//de mi objeto u se asiganara el valor que coloque en la variable c
                System.out.println("El resultado de tu operacion es: " + (u.getN1() - u.getN2()));//impresion
            }//llave que cierra al if
        } while (f != 2);//termina el bucle cuando la condicion diga que es diferencial o igual a 2

    }
}
// new Scanner(); o new Persona(); = es la instancia de la clase ocupando el metodo constructor o sea creando el objeto 