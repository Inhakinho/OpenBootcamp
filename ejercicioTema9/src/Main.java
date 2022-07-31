
public class Main {

    public static void main(String[] args) {
        //objeto cliente1
        Cliente cliente1= new Cliente();

        //asignamos datos
        cliente1.edad= 23;
        cliente1.credito= 1500;
        cliente1.nombre= "Jose Luis";
        cliente1.telefono= "669696969";
        //mostramos por pantalla
        System.out.println(cliente1.nombre);
        System.out.println(cliente1.edad);
        System.out.println(cliente1.telefono);
        System.out.println(cliente1.credito);

        System.out.println("\n");
        //objeto trabajador1
        Trabajador trabajador1= new Trabajador();

        //asignamos datos
        trabajador1.edad= 35;
        trabajador1.nombre= "Pedro";
        trabajador1.telefono= "689696969";
        trabajador1.salario= 1100;

        //mostramos por pantalla
        System.out.println(trabajador1.nombre);
        System.out.println(trabajador1.edad);
        System.out.println(trabajador1.telefono);
        System.out.println(trabajador1.salario);

    }

}

//creacion clase Persona
class Persona{
    public int edad;
    public String nombre;
    public String telefono;
}

//creacion clase Cliente heredando de Persona
class Cliente extends Persona{
    public int credito;
}

//creacion clase Trabajador heredando de Persona
class Trabajador extends Persona{
    public int salario;
}
