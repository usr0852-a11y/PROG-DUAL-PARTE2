package net.salesianoslacuesta.quimico;

import java.util.ArrayList;

import net.salesianoslacuesta.investigador.Investigador;
import net.salesianoslacuesta.quimico.Quimico;

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
    
}
