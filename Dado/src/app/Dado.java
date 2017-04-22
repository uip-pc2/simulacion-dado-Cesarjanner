package app;

public class Dado {


    private int numero;

    public Dado() {
        this.numero = (int) (Math.random()*6+1);


    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    // Acciones de la clase
    public int tirar() {
        System.out.println("Tirando el dado");
        System.out.println("\nTu puntaje es: " +getNumero());

return 0;
    }
}
