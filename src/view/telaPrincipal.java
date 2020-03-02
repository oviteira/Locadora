package view;

public class telaPrincipal extends javax.swing.JFrame {

    public telaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBCadCarro = new javax.swing.JButton();
        jBCadCliente = new javax.swing.JButton();
        jBAlugarVeiculo = new javax.swing.JButton();
        jBReservaAluguel = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMAlteraValor = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Locadora de Veículos");
        setMaximumSize(new java.awt.Dimension(314, 250));
        setMinimumSize(new java.awt.Dimension(314, 250));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jBCadCarro.setText("Cadastrar Veículos");
        jBCadCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadCarroActionPerformed(evt);
            }
        });

        jBCadCliente.setText("Cadastrar Clientes");
        jBCadCliente.setActionCommand("");
        jBCadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadClienteActionPerformed(evt);
            }
        });

        jBAlugarVeiculo.setText("Alugar Veículo");
        jBAlugarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAlugarVeiculoActionPerformed(evt);
            }
        });

        jBReservaAluguel.setText("Reservas e Aluguéis");
        jBReservaAluguel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBReservaAluguelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBCadCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBAlugarVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBReservaAluguel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBCadCarro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(83, 83, 83))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jBCadCarro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(41, 41, 41)
                .addComponent(jBCadCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(39, 39, 39)
                .addComponent(jBAlugarVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(39, 39, 39)
                .addComponent(jBReservaAluguel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(35, 35, 35))
        );

        jMenu1.setText("Editar");

        jMAlteraValor.setText("Editar Lojas");
        jMAlteraValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMAlteraValorActionPerformed(evt);
            }
        });
        jMenu1.add(jMAlteraValor);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBCadCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadCarroActionPerformed
        //Assim que clicar no botão ele chama a tela de cadastrar os veículos e fecha a tela principal.
        
        telaCadVeiculo TelaCadVeiculo = new telaCadVeiculo();
        TelaCadVeiculo.show();
        
        dispose();
    }//GEN-LAST:event_jBCadCarroActionPerformed

    private void jBCadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadClienteActionPerformed
        //Assim que clicar no botão ele chama a tela de cadastrar os clientes e fecha a tela principal.
        
        telaCadCliente TelaCadCliente = new telaCadCliente();
        TelaCadCliente.show();
        
        dispose();
    }//GEN-LAST:event_jBCadClienteActionPerformed

    private void jBAlugarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlugarVeiculoActionPerformed
        //Assim que clicar no botão ele chama a tela de alugar os veículos e fecha a tela principal.
        
        telaAlugarVeiculo TelaAlugarVeiculo = new telaAlugarVeiculo();
        TelaAlugarVeiculo.show();
        
        dispose();
    }//GEN-LAST:event_jBAlugarVeiculoActionPerformed

    private void jMAlteraValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMAlteraValorActionPerformed
        // Chama a tela para alterar os valores dos carros nas agências e fecha a janela principal.
        
        telaEditarLojas TelaAlteraValor = new telaEditarLojas();
        TelaAlteraValor.show();
        
        dispose();
    }//GEN-LAST:event_jMAlteraValorActionPerformed

    private void jBReservaAluguelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBReservaAluguelActionPerformed
        // Chama a tela para consultar os aluguéis e reservas dos veículos.
        
        telaReservaAluguel TelaReservaAluguel = new telaReservaAluguel();
        TelaReservaAluguel.show();
        
        dispose();
    }//GEN-LAST:event_jBReservaAluguelActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAlugarVeiculo;
    private javax.swing.JButton jBCadCarro;
    private javax.swing.JButton jBCadCliente;
    private javax.swing.JButton jBReservaAluguel;
    private javax.swing.JMenuItem jMAlteraValor;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
