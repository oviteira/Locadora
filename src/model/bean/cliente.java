package model.bean;

public class cliente {
    private int    clienteID;
    private String clienteNome;
    private String clienteCPF;
    private String clienteTel;
    private String clienteEmail;
    private String clienteFiel;

    public cliente(){
        
    }

    public int getClienteID() {
        return clienteID;
    }

    public void setClienteID(int clienteID) {
        this.clienteID = clienteID;
    }

    public String getClienteNome() {
        return clienteNome;
    }

    public void setClienteNome(String clienteNome) {
        this.clienteNome = clienteNome;
    }

    public String getClienteCPF() {
        return clienteCPF;
    }

    public void setClienteCPF(String clienteCPF) {
        this.clienteCPF = clienteCPF;
    }

    public String getClienteTel() {
        return clienteTel;
    }

    public void setClienteTel(String clienteTel) {
        this.clienteTel = clienteTel;
    }

    public String getClienteEmail() {
        return clienteEmail;
    }

    public void setClienteEmail(String clienteEmail) {
        this.clienteEmail = clienteEmail;
    }

    public String getClienteFiel() {
        return clienteFiel;
    }

    public void setClienteFiel(String clienteFiel) {
        this.clienteFiel = clienteFiel;
    }
}
