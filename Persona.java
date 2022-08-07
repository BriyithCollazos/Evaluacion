//objeto persona
public class Persona {
    //tiene 3 atributos
    String sNombre ;
    int iNroBrazos = 2;
    int iNroPiernas = 2;

    // y tiene 3 metodos
    void  setsNombre(String sNOmbre){// el metodo void que no devuelve nada
        this.sNombre = sNOmbre;
        //System.out.println(sNOmbre);
    }
    String getsNombre(){// el metodode tipo String que esta devolviendo un valor de tipo String
        return this.sNombre;
    }
    void  caminar(){
        System.out.println( "caminando......");
    }
    void cantar(){
        System.out.println("Cantando......");
    }
}
