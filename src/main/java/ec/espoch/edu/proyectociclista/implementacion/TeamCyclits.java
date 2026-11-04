package ec.espoch.edu.proyectociclista.implementacion;

public class TeamCyclits {
    
    private int[] identifier;
    private String teamName;
    private float[] additionRace;
    private String teamCountry;

    public TeamCyclits(int[] identifier, String teamName, float[] additionRace, String teamCountry) {
        this.identifier = identifier;
        this.teamName = teamName;
        this.additionRace = additionRace;
        this.teamCountry = teamCountry;
    }

    public int[] getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int[] identifier) {
        this.identifier = identifier;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public float[] getAdditionRace() {
        return additionRace;
    }

    public void setAdditionRace(float[] additionRace) {
        this.additionRace = additionRace;
    }

    public String getTeamCountry() {
        return teamCountry;
    }

    public void setTeamCountry(String teamCountry) {
        this.teamCountry = teamCountry;
    }

    @Override
    public String toString() {
        return "TeamCyclits{" + "identifier=" + identifier + ", teamName=" + teamName + ", additionRace=" + additionRace + ", teamCountry=" + teamCountry + '}';
    }
    
    
}
