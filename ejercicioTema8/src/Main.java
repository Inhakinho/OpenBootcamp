
public class Main {

    public static void main(String[] args) {
        //creacion objeto persona
        Persona persona= new Persona();

        //uso del set para añadir datos
        persona.setEdad(25);
        persona.setNombre("Ramon");
        persona.setTelefono("669696969");

        //creacion de variables para mostrar con gets
        int edad= persona.getEdad();
        String nombre= persona.getNombre();
        String telefono= persona.getTelefono();

        //salida por pantalla
        System.out.println(edad);
        System.out.println(nombre);
        System.out.println(telefono);
    }


}
//creacion clase Persona
class Persona{

    private int edad;
    private String nombre;
    private String telefono;

    //sets
    public void setEdad(int edad){
        this.edad= edad;
    }

    public void setNombre(String nombre){
        this.nombre= nombre;
    }

    public void setTelefono(String telefono){
        this.telefono= telefono;
    }
    //gets

    public int getEdad(){
        return this.edad;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getTelefono(){
        return this.telefono;
    }

}