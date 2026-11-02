package ec.espoch.edu.proyectociclista.objetos;

public class TeamCyclit {
    
    // array atributo agregar
    private String teamName;
    private float additionRace = 0.0f;
    private String teamCountry;

    public TeamCyclit(String teamName, String teamCountry) {
        this.teamName = teamName;
        this.teamCountry = teamCountry;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public float getAdditionRace() {
        return additionRace;
    }

    public void setAdditionRace(float additionRace) {
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
        return "TeamCyclit{" + "teamName=" + teamName + ", additionRace=" + additionRace + ", teamCountry=" + teamCountry + '}';
    }
    
    
}
