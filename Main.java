public class Main {
    public static void main(String [] args){
    //declaramos un objeto  como jose
        Persona jose;
        //y lo instanciamos a nuestro objeto persona le dimos el nombre de jose
        jose = new Persona();
        //ponemos un nombre
        jose.setsNombre("Raul Perez");
        //a qui llamamos al objeto jose su funcion
        // de asignar nombre y le enviamos el dato
        // de que se va ha llamar Raul Perez
        jose.caminar();
        //aqui a nuestro objeto jose le llamamos
        // la funcion caminar y la muestra
        System.out.println(jose.getsNombre());
        System.out.println(jose.sNombre);
    }
}
