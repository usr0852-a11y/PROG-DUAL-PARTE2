package net.salesianoslacuesta.quimico;

import net.salesianoslacuesta.investigador.Investigador;
import net.salesianoslacuesta.quimico.Quimico;

public class Quimico extends Investigador{
    private ArrayList<String> elementos;

    public Quimico(String nombre, double sueldo) {
        super(nombre, "Químico", sueldo);
        this.elementos = new ArrayList<>();
    }
}
