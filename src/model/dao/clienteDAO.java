package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.cliente;

public class clienteDAO{
    public void create(cliente c){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO cliente (clienteNome, clienteCPF, clienteTel, clienteEmail, clienteFiel) VALUES (?, ?, ?, ?, ?)");
            
            stmt.setString(1, c.getClienteNome());
            stmt.setString(2, c.getClienteCPF());
            stmt.setString(3, c.getClienteTel());
            stmt.setString(4, c.getClienteEmail());
            stmt.setString(5, c.getClienteFiel());
                       
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        } finally {
            ConnectionFactory.closeConnection((com.mysql.jdbc.Connection) con, stmt);
        }
    }
    
    public List<cliente> read() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<cliente> c = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM cliente");
            rs = stmt.executeQuery();

            while (rs.next()) {
                cliente Cliente = new cliente();
                
                Cliente.setClienteID   (rs.getInt   ("clienteID"));
                Cliente.setClienteNome (rs.getString("clienteNome"));
                Cliente.setClienteCPF  (rs.getString("clienteCPF"));
                Cliente.setClienteTel  (rs.getString("clienteTel"));
                Cliente.setClienteEmail(rs.getString("clienteEmail"));
                Cliente.setClienteFiel (rs.getString("clienteFiel"));
                
                c.add(Cliente);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return c;
    }
    
    public List<cliente> readForNome(String nome) {
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<cliente> c = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM cliente WHERE clienteNome LIKE ?");
            stmt.setString(1, "%"+nome+"%");
            
            rs = stmt.executeQuery();

            while (rs.next()) {
                cliente Cliente = new cliente();
                
                Cliente.setClienteID   (rs.getInt   ("clienteID"));
                Cliente.setClienteNome (rs.getString("clienteNome"));
                Cliente.setClienteCPF  (rs.getString("clienteCPF"));
                Cliente.setClienteTel  (rs.getString("clienteTel"));
                Cliente.setClienteEmail(rs.getString("clienteEmail"));
                Cliente.setClienteFiel (rs.getString("clienteFiel"));
                
                c.add(Cliente);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return c;
    }

    public void update(cliente Cliente) {
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE cliente SET clienteNome = ?, clienteCPF = ?, clienteTel = ?, clienteEmail = ?, clienteFiel = ? WHERE clienteID = ?");
            
            stmt.setString(1, Cliente.getClienteNome());
            stmt.setString(2, Cliente.getClienteCPF());
            stmt.setString(3, Cliente.getClienteTel());
            stmt.setString(4, Cliente.getClienteEmail());
            stmt.setString(5, Cliente.getClienteFiel());
            stmt.setInt   (6, Cliente.getClienteID());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    public void delete(cliente Cliente) {
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM cliente WHERE clienteID = ?");
            stmt.setInt(1, Cliente.getClienteID());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
