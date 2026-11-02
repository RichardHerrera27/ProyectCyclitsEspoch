package ec.espoch.edu.proyectociclista.objetos;

public class Climber extends Cyclit{

    private float averageClimber;
    private float supportedSlope;

    public Climber(float averageClimber, float supportedSlope, int identifier, String cyclitsName) {
        super(identifier, cyclitsName);
        this.averageClimber = averageClimber;
        this.supportedSlope = supportedSlope;
    }

    public float getAverageClimber() {
        return averageClimber;
    }

    public void setAverageClimber(float averageClimber) {
        this.averageClimber = averageClimber;
    }

    public float getSupportedSlope() {
        return supportedSlope;
    }

    public void setSupportedSlope(float supportedSlope) {
        this.supportedSlope = supportedSlope;
    }

    @Override
    public String toString() {
        return "Climber{" + "averageClimber=" + averageClimber + ", supportedSlope=" + supportedSlope + '}';
    }
    
    

}
