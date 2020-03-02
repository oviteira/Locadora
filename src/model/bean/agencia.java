package model.bean;

public class agencia {
    private int agenciaID;
    private String agenciaNome;
    private String agenciaTipo;
    private double agenciaValorRegularUtil;
    private double agenciaValorFielUtil;
    private double agenciaValorRegularFDS;
    private double agenciaValorFielFDS;
    
    public agencia(){
        
    }

    public int getAgenciaID() {
        return agenciaID;
    }

    public void setAgenciaID(int agenciaID) {
        this.agenciaID = agenciaID;
    }

    public String getAgenciaNome() {
        return agenciaNome;
    }

    public void setAgenciaNome(String agenciaNome) {
        this.agenciaNome = agenciaNome;
    }

    public String getAgenciaTipo() {
        return agenciaTipo;
    }

    public void setAgenciaTipo(String agenciaTipo) {
        this.agenciaTipo = agenciaTipo;
    }

    public double getAgenciaValorRegularUtil() {
        return agenciaValorRegularUtil;
    }

    public void setAgenciaValorRegularUtil(double agenciaValorRegularUtil) {
        this.agenciaValorRegularUtil = agenciaValorRegularUtil;
    }

    public double getAgenciaValorFielUtil() {
        return agenciaValorFielUtil;
    }

    public void setAgenciaValorFielUtil(double agenciaValorFielUtil) {
        this.agenciaValorFielUtil = agenciaValorFielUtil;
    }

    public double getAgenciaValorRegularFDS() {
        return agenciaValorRegularFDS;
    }

    public void setAgenciaValorRegularFDS(double agenciaValorRegularFDS) {
        this.agenciaValorRegularFDS = agenciaValorRegularFDS;
    }

    public double getAgenciaValorFielFDS() {
        return agenciaValorFielFDS;
    }

    public void setAgenciaValorFielFDS(double agenciaValorFielFDS) {
        this.agenciaValorFielFDS = agenciaValorFielFDS;
    }
    
    
}
