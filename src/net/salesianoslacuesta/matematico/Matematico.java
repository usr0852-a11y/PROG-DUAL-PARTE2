package net.salesianoslacuesta.matematico;

import net.salesianoslacuesta.matematico.Matematico;
import net.salesianoslacuesta.investigador.Investigador;
import java.util.Arrays;

public class Matematico extends Investigador {
    private int[][] resultadosActuales; // Matriz 

    public Matematico(String nombre, double sueldo, int[][] matrizInicial) {
        super(nombre, "Matemático", sueldo);
        this.resultadosActuales = matrizInicial;
    }
}
