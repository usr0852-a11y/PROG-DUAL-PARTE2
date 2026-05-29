package net.salesianoslacuesta.biologo;

import net.salesianoslacuesta.investigador.Investigador;

import java.util.ArrayList;

import net.salesianoslacuesta.biologo.Biologo;

public class Biologo extends Investigador implements TrabajoDual {
    private ArrayList<String> especimenes;

    public Biologo(String nombre, double sueldo) {
        super(nombre, "Biólogo", sueldo);
        this.especimenes = new ArrayList<>();
    }

    //Getter

    public ArrayList<String> getEspecimenes() {
        return especimenes;
    }

    //Setter

    public void setEspecimenes(ArrayList<String> especimenes) {
        this.especimenes = especimenes;
    }

    public void añadirEspecimen(String especimen) {
        especimenes.add(especimen);
    }

    @Override
    public String estadoSueldo() {
        if(sueldo < 1500) {
            return "Sueldo insuficiente. Solicitud de aumento OBLIGATORIO.";
        }
        return "Sueldo correcto.";
    }

    @Override
    public void trabajar() {
        if(especimenes.isEmpty()) {
            System.out.println("No hay especímenes para trabajar");
            return;
        }
    int indiceMayor = 0;
        
    for (int i = 1; i < especimenes.size(); i++) {
        if (especimenes.get(i).length() > especimenes.get(indiceMayor).length()) {
            indiceMayor = i;
        }
    }
    String eliminado = especimenes.remove(indiceMayor);
    
    System.out.println("Se ha eliminado el espécimen con más caracteres: " + eliminado);

    }

    @Override
    public void trabajoDual() {
        if (especimenes.isEmpty()) {
            System.out.println("No hay especímenes para trabajo dual");
            return;
        }

        int izquierda = 0;
        int derecha = especimenes.size() - 1;

        while (izquierda < derecha) {
            String temporal2 = especimenes.get(izquierda);
            especimenes.set(izquierda, especimenes.get(derecha));
            especimenes.set(derecha, temporal2);

            izquierda++;
            derecha--;

        }
        System.out.println("Trabajo dual del biólogo: lista invertidaaa");
    }

    @Override

    public void mostrarEspecimenes() {
        System.out.println("Especímenes actuales:");
        for(int i = 0; i < especimenes.size(); i++) {
            System.out.println("- " + especimenes.get(i));
        }
    }


}
