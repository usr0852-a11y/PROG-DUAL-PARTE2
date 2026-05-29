import net.salesianoslacuesta.investigador.Investigador;
import net.salesianoslacuesta.biologo.Biologo;

public class Biologo extends Investigador {
    private ArrayList<String> especimenes;

    public Biologo(String nombre, double sueldo) {
        super(nombre, "Biólogo", sueldo);
        this.especimenes = new ArrayList<>();
    }
}
