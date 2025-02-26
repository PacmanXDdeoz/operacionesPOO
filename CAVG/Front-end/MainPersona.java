import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class MainPersona{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        List<Persona> lista = new ArrayList<Persona>();

        while(true){
            
            lista.add(new Persona());
            int id = lista.size()+1;
            lista.get(lista.size()-1).setId(id);

            System.out.println("Escribe tu nombre: ");
            lista.get(lista.size()-1).setNombre(sc.nextLine());

            System.out.println("Escribe tu edad: ");
            lista.get(lista.size()-1).setEdad(sc.nextInt());
            sc.nextLine();

            System.out.println("Escribe tu profesion: ");
            lista.get(lista.size()-1).setProfesion(sc.nextLine());

            System.out.println("Agregar otra persona? s/n");
            String opcion = sc.nextLine();

            if(opcion.equals("n")){
                break;
            }
        }

        for(Persona p:lista){
            System.out.println(p.getNombre());
            System.out.println(p.getId());
            System.out.println(p.getEdad());
            System.out.println(p.getProfesion());
        }
    }
}