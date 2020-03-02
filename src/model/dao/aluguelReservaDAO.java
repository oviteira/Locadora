package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.aluguelReserva;

public class aluguelReservaDAO {
    public void create(aluguelReserva ar){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO reserva (dataRetirada, dataDevolucao, carroAlugado, carroReservado, clienteID, carroID) VALUES (?, ?, ?, ?, ?)");
            
            stmt.setDate  (1, ar.getDataRetirada());
            stmt.setDate  (2, ar.getDataDevolucao());
            stmt.setString(3, ar.getCarroAlugado());
            stmt.setString(4, ar.getCarroReservado());
            stmt.setInt   (5, ar.getClienteID());
            stmt.setInt   (6, ar.getCarroID());
                       
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        } finally {
            ConnectionFactory.closeConnection((com.mysql.jdbc.Connection) con, stmt);
        }
    }
    
    public List<aluguelReserva> read() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<aluguelReserva> ar = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM reserva");
            rs = stmt.executeQuery();

            while (rs.next()) {
                aluguelReserva AluguelReserva = new aluguelReserva();
                
                AluguelReserva.setReservaID     (rs.getInt   ("reservaID"));
                AluguelReserva.setDataRetirada  (rs.getDate  ("dataRetirada"));
                AluguelReserva.setDataDevolucao (rs.getDate  ("dataDevolucao"));
                AluguelReserva.setCarroAlugado  (rs.getString("carroAlugado"));
                AluguelReserva.setCarroReservado(rs.getString("carroReservado"));
                AluguelReserva.setClienteID     (rs.getInt   ("clienteID"));
                AluguelReserva.setCarroID       (rs.getInt   ("carroID"));
                
                ar.add(AluguelReserva);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return ar;
    }
    
    public List<aluguelReserva> readForNome(String carro) {
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<aluguelReserva> ar = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM cliente WHERE clienteNome LIKE ?");
            stmt.setString(1, "%"+carro+"%");
            
            rs = stmt.executeQuery();

            while (rs.next()) {
                aluguelReserva AluguelReserva = new aluguelReserva();
                
                AluguelReserva.setReservaID     (rs.getInt   ("reservaID"));
                AluguelReserva.setDataRetirada  (rs.getDate  ("dataRetirada"));
                AluguelReserva.setDataDevolucao (rs.getDate  ("dataDevolucao"));
                AluguelReserva.setCarroAlugado  (rs.getString("carroAlugado"));
                AluguelReserva.setCarroReservado(rs.getString("carroReservado"));
                AluguelReserva.setClienteID     (rs.getInt   ("clienteID"));
                AluguelReserva.setCarroID       (rs.getInt   ("carroID"));
                
                ar.add(AluguelReserva);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return ar;
    }
    
    public void delete(aluguelReserva AluguelReserva) {
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM reserva WHERE reservaID = ?");
            stmt.setInt(1, AluguelReserva.getReservaID());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
