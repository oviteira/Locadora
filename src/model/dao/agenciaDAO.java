package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.agencia;

public class agenciaDAO {    
    public List<agencia> read() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<agencia> a = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM agencia");
            rs = stmt.executeQuery();

            while (rs.next()) {
                agencia Agencia = new agencia();
                
                Agencia.setAgenciaID              (rs.getInt   ("agenciaID"));
                Agencia.setAgenciaNome            (rs.getString("agenciaNome"));
                Agencia.setAgenciaTipo            (rs.getString("agenciaTipo"));
                Agencia.setAgenciaValorRegularUtil(rs.getDouble("agenciaValorRegularUtil"));
                Agencia.setAgenciaValorFielUtil   (rs.getDouble("agenciaValorFielUtil"));
                Agencia.setAgenciaValorRegularFDS (rs.getDouble("agenciaValorRegularFDS"));
                Agencia.setAgenciaValorFielFDS    (rs.getDouble("agenciaValorFielFDS"));
                
                a.add(Agencia);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return a;
    }

    public void update(agencia Agencia) {
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE agencia SET agenciaNome = ?, agenciaTipo = ?, agenciaValorRegularUtil = ?, agenciaValorFielUtil = ?, agenciaValorRegularFDS = ?, agenciaValorFielFDS = ? WHERE agenciaID = ?");
            
            stmt.setString(1, Agencia.getAgenciaNome());
            stmt.setString(2, Agencia.getAgenciaTipo());
            stmt.setDouble(3, Agencia.getAgenciaValorRegularUtil());
            stmt.setDouble(4, Agencia.getAgenciaValorFielUtil());
            stmt.setDouble(5, Agencia.getAgenciaValorRegularFDS());
            stmt.setDouble(6, Agencia.getAgenciaValorFielFDS());
            stmt.setInt   (7, Agencia.getAgenciaID());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
}
