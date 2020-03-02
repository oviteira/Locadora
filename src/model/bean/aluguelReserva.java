package model.bean;

import java.sql.Date;

public class aluguelReserva {
    private int reservaID;
    private Date dataRetirada;
    private Date dataDevolucao;
    private String carroAlugado;
    private String carroReservado;
    private int clienteID;
    private int carroID;
    private String clienteNome;
    private String carroNome;
    
    public aluguelReserva(){

    }

    public int getReservaID() {
        return reservaID;
    }

    public void setReservaID(int reservaID) {
        this.reservaID = reservaID;
    }

    public Date getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(Date dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public String getCarroAlugado() {
        return carroAlugado;
    }

    public void setCarroAlugado(String carroAlugado) {
        this.carroAlugado = carroAlugado;
    }

    public String getCarroReservado() {
        return carroReservado;
    }

    public void setCarroReservado(String carroReservado) {
        this.carroReservado = carroReservado;
    }

    public int getClienteID() {
        return clienteID;
    }

    public void setClienteID(int clienteID) {
        this.clienteID = clienteID;
    }

    public int getCarroID() {
        return carroID;
    }

    public void setCarroID(int carroID) {
        this.carroID = carroID;
    }

    public String getClienteNome() {
        return clienteNome;
    }

    public void setClienteNome(String clienteNome) {
        this.clienteNome = clienteNome;
    }

    public String getCarroNome() {
        return carroNome;
    }

    public void setCarroNome(String carroNome) {
        this.carroNome = carroNome;
    }
    
    
}
