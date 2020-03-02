package model.bean;

public class carro {
    private int carroID;
    private String carroNome;
    private int agenciaID;
    private String idAgencia;
    
    public carro(){
        
    }

    public int getCarroID() {
        return carroID;
    }

    public void setCarroID(int carroID) {
        this.carroID = carroID;
    }

    public String getCarroNome() {
        return carroNome;
    }

    public void setCarroNome(String carroNome) {
        this.carroNome = carroNome;
    }

    public int getAgenciaID() {
        return agenciaID;
    }

    public void setAgenciaID(int agenciaID) {
        this.agenciaID = agenciaID;
    }

    public String getIdAgencia() {
        return idAgencia;
    }

    public void setIdAgencia(String idAgencia) {
        this.idAgencia = idAgencia;
    }

    
}
