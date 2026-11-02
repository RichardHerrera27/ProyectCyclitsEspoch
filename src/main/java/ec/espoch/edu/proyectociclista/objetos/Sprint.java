package ec.espoch.edu.proyectociclista.objetos;

public class Sprint extends Cyclit {

    private double averagePower;
    private double averageSprint;

    public Sprint(double averagePower, double averageSprint, int identifier, String cyclitsName) {
        super(identifier, cyclitsName);
        this.averagePower = averagePower;
        this.averageSprint = averageSprint;
    }

}
