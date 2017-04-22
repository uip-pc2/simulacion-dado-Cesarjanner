package app;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            int opcion = 0;

            System.out.println("\n***VAMOS A TIRAR UN DADO***");
            System.out.println("\nQue deseas hacer:");
            System.out.println("1. Tirar dado");
            System.out.println("2. Salir");
            try {
                System.out.print("OPCION:");
                opcion = Integer.parseInt(br.readLine());
            } catch (Exception e){
                System.out.println("ERROR: Opcion invalida.");
            }

            switch (opcion) {
                case 1:
                    Dado p = new Dado();
                    int esdada = p.tirar();
                    break;
                case 2:
                    System.exit(0);
                    break;
                default:
                    System.out.println("ERROR; Opcion invalida. ");
            }
        }
    }
}




