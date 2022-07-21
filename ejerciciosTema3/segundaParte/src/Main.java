
public class Main {


    public static void main(String[] args) {

        coche miCoche = new coche();

        miCoche.añadirPuertas();
        miCoche.añadirPuertas();
        miCoche.añadirPuertas();
        miCoche.añadirPuertas();

        System.out.println(miCoche.numPuertas);


    }

    static class coche{
        public int numPuertas= 0;

        public void añadirPuertas(){
            this.numPuertas++;
        }


    }


}
