package ec.espoch.edu.proyectociclista.objetos;

public abstract class Cyclit {

    private int identifier;
    private String cyclitsName;
    private float timeAccumulated = 0;

    public Cyclit(int identifier, String cyclitsName) {
        this.identifier = identifier;
        this.cyclitsName = cyclitsName;
    }

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public String getCyclitsName() {
        return cyclitsName;
    }

    public void setCyclitsName(String cyclitsName) {
        this.cyclitsName = cyclitsName;
    }

    public float getTimeAccumulated() {
        return timeAccumulated;
    }

    public void setTimeAccumulated(float timeAccumulated) {
        this.timeAccumulated = timeAccumulated;
    }

}
