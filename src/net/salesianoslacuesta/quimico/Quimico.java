package net.salesianoslacuesta.quimico;

import java.util.ArrayList;

import net.salesianoslacuesta.investigador.Investigador;


public class Quimico extends Investigador{
    private ArrayList<String> elementos;

    public Quimico(String nombre, double sueldo) {
        super(nombre, "Químico", sueldo);
        this.elementos = new ArrayList<>();
    }

    // Getter

    public ArrayList<String> getElementos() {
        return elementos;
    }

    // Setter

    public void setElementos(ArrayList<String> elementos) {
        this.elementos = elementos;
    }



    @Override

    public void añadirElemento(String elemento) {
        elementos.add(elemento);
    }
    
    @Override

    public String estadoSueldo() {
        if (sueldo < 1200 ) {
            return "Sueldo insuficiente. SOLICITUD DE AUMENTO OBLIGATORIO!!!!";
        }
        return "Sueldo correcto!!!!";

    }

    @Override
    public void trabajar() {
        
        int izquierda = 0;
        int derecha = elementos.size() -1;

        while(izquierda < derecha) {
            String temporal = elementos.get(izquierda);
            elementos.set(izquierda, elementos.get(derecha));
            elementos.set(derecha, temporal);

            izquierda++;
            derecha--;
        
        }
        System.out.println("La lista ha sido invertida correctamenteeee");

    }

    public void mostrarElementos() {
        System.out.println("Elementos actuales:");
        for(int i = 0 ; i < elementos.size(); i++) {
            System.out.println("- " + elementos.get(i));
        }
    }
}
