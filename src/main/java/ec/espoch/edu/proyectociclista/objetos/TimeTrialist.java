package ec.espoch.edu.proyectociclista.objetos;

public class TimeTrialist extends Cyclit{
    
    private float maximumSpeed;

    public TimeTrialist(float maximumSpeed, int identifier, String cyclitsName) {
        super(identifier, cyclitsName);
        this.maximumSpeed = maximumSpeed;
    }

    public float getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(float maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    @Override
    public String toString() {
        return "TimeTrialist{" + "maximumSpeed=" + maximumSpeed + '}';
    }
    
    

}   
