package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.carro;

public class carroDAO {
    public void create(carro c){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO carro (carroNome, agenciaID) VALUES (?, ?)");
            
            stmt.setString(1, c.getCarroNome());
            stmt.setInt(2, c.getAgenciaID());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        } finally { 
            ConnectionFactory.closeConnection((com.mysql.jdbc.Connection) con, stmt);
        }
    }
    
    public List<carro> read() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<carro> c = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM carro");
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                carro Carro = new carro();
                
                Carro.setCarroID   (rs.getInt   ("carroID"));
                Carro.setCarroNome (rs.getString("carroNome"));
                Carro.setAgenciaID(rs.getInt    ("agenciaID"));
                                
                if(rs.getInt("agenciaID") == 1) {
                    Carro.setIdAgencia("NorthCar");
                } else if(rs.getInt("agenciaID") == 2) {
                    Carro.setIdAgencia("SouthCar");
                } else if(rs.getInt("agenciaID") == 3) {
                    Carro.setIdAgencia("WestCar");
                }
                c.add(Carro);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return c;
    }
    
    public List<carro> readForNome(String nome) {
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<carro> c = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM carro WHERE carroNome LIKE ?");
            stmt.setString(1, "%"+nome+"%");
            
            rs = stmt.executeQuery();

            while (rs.next()) {
                carro Carro = new carro();
                
                Carro.setCarroID   (rs.getInt   ("carroID"));
                Carro.setCarroNome (rs.getString("carroNome"));
                //Carro.setAgenciaID(rs.getString("agenciaID"));
                
                switch (rs.getInt("agenciaID")) {
                    case 1:{
                        Carro.setIdAgencia("NorthCar");
                        break;
                    }
                    case 2:{
                        Carro.setIdAgencia("SouthCar");
                        break;
                    }
                    case 3:{
                        Carro.setIdAgencia("SouthCar");
                        break;
                    }
                    default:{
                        break;
                    }
                }
                c.add(Carro);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return c;
    }

    public void update(carro Carro) {
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE carro SET carroNome = ?, agenciaID = ? WHERE carroID = ?");
            
            stmt.setString(1, Carro.getCarroNome());
            stmt.setInt   (2, Carro.getAgenciaID());
            stmt.setInt   (3, Carro.getCarroID());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    public void delete(carro Carro) {
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM carro WHERE carroID = ?");
            stmt.setInt(1, Carro.getCarroID());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
