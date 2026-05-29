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

    // Getter

    public int[][] getResultadosActuales() {
        return resultadosActuales;
    }

    // Setter
    public void setResultadosActuales(int[][] matrizInicial) {
        this.resultadosActuales = matrizInicial;
    }

    public void trabajar(int numero) {
        System.out.println("Multriplanco la matriz por: " + numero + "...");

        for (int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                resultadosActuales[i][j] *=numero;
            }
        }
    }

    public void trabajar(int[][] otraMatriz) {
        System.out.println("Sumando matrices...");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                resultadosActuales[i][j] += otraMatriz[i][j];
            }
        }
    }

    @Override

    public String estadoSueldo() {
        if (sueldo < 1800) {
            return "Sueldo insuficiente.Solicita aumento";
        }
        return " Sueldo correcto!!";
    }

    @Override

    public void trabajar() {
        System.out.println("Para que el matemático trabaje necesita parámetros (int o matriz)");
    }
    
    public void mostrarMatriz() {
        System.out.println("Resultados actuales: ");

        for (int i = 0 ; i < resultadosActuales.length; i++) {
            for (int j = 0; resultadosActuales[i].length; j++) {
                System.out.println(resultadosActuales[i][j] + " ");
            }
        }
    }
}
