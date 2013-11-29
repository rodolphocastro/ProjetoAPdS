/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author Thiago Matos
 */
public class JanelaGanhos extends javax.swing.JFrame {

    /**
     * Creates new form JanelaGanhos
     */
    public JanelaGanhos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainTabbedPane = new javax.swing.JTabbedPane();
        panelCadastrarDespesa = new javax.swing.JPanel();
        labelCadastrarGanhoAviso = new javax.swing.JLabel();
        panelCadastroGanhoData = new javax.swing.JPanel();
        labelDia = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        labelMes = new javax.swing.JLabel();
        labelAno = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jSpinner3 = new javax.swing.JSpinner();
        panelCadastroGanhoDados = new javax.swing.JPanel();
        labelDescrição = new javax.swing.JLabel();
        labelValor = new javax.swing.JLabel();
        fieldInputDescrição = new javax.swing.JTextField();
        formattedFieldInputValor = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        paneRemoverDespesa = new javax.swing.JPanel();
        paneBuscarDespesa = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("[SGF - 2014] Ganhos");
        setLocationByPlatform(true);
        setResizable(false);

        labelCadastrarGanhoAviso.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelCadastrarGanhoAviso.setText("Insira os dados do ganho a ser cadastrado:");

        panelCadastroGanhoData.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Data"));

        labelDia.setText("Dia:");

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));
        jSpinner1.setToolTipText("Insira o dia componente da data.");

        labelMes.setText("Mês:");

        labelAno.setText("Ano:");

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        jSpinner2.setToolTipText("Insira o mês componente da data.");

        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(2000, 2000, 2020, 1));
        jSpinner3.setToolTipText("Insira o ano componente da data.");

        javax.swing.GroupLayout panelCadastroGanhoDataLayout = new javax.swing.GroupLayout(panelCadastroGanhoData);
        panelCadastroGanhoData.setLayout(panelCadastroGanhoDataLayout);
        panelCadastroGanhoDataLayout.setHorizontalGroup(
            panelCadastroGanhoDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastroGanhoDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCadastroGanhoDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelDia, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelMes, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelAno, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(panelCadastroGanhoDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panelCadastroGanhoDataLayout.setVerticalGroup(
            panelCadastroGanhoDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastroGanhoDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCadastroGanhoDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDia)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCadastroGanhoDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMes)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCadastroGanhoDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAno)
                    .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelCadastroGanhoDados.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Dados"));

        labelDescrição.setText("Descrição:");

        labelValor.setText("Valor:");

        fieldInputDescrição.setToolTipText("Insira uma descrição dos dados.");

        formattedFieldInputValor.setToolTipText("Insira o valor dos dados.");

        javax.swing.GroupLayout panelCadastroGanhoDadosLayout = new javax.swing.GroupLayout(panelCadastroGanhoDados);
        panelCadastroGanhoDados.setLayout(panelCadastroGanhoDadosLayout);
        panelCadastroGanhoDadosLayout.setHorizontalGroup(
            panelCadastroGanhoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastroGanhoDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCadastroGanhoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelValor, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelDescrição, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCadastroGanhoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldInputDescrição)
                    .addGroup(panelCadastroGanhoDadosLayout.createSequentialGroup()
                        .addComponent(formattedFieldInputValor, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 79, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelCadastroGanhoDadosLayout.setVerticalGroup(
            panelCadastroGanhoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastroGanhoDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCadastroGanhoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDescrição)
                    .addComponent(fieldInputDescrição))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCadastroGanhoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formattedFieldInputValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelValor))
                .addContainerGap())
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/24px_limpar.png"))); // NOI18N
        jButton1.setText("Limpar");
        jButton1.setToolTipText("Limpar os campos da tela.");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/24px_cancelar.png"))); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.setToolTipText("Cancelar o cadastro.");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/24px_adicionar.png"))); // NOI18N
        jButton3.setText("Adicionar");
        jButton3.setToolTipText("Cadastrar o ganho no banco de dados.");

        javax.swing.GroupLayout panelCadastrarDespesaLayout = new javax.swing.GroupLayout(panelCadastrarDespesa);
        panelCadastrarDespesa.setLayout(panelCadastrarDespesaLayout);
        panelCadastrarDespesaLayout.setHorizontalGroup(
            panelCadastrarDespesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastrarDespesaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCadastrarDespesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadastrarDespesaLayout.createSequentialGroup()
                        .addComponent(panelCadastroGanhoDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelCadastroGanhoData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadastrarDespesaLayout.createSequentialGroup()
                        .addComponent(labelCadastrarGanhoAviso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadastrarDespesaLayout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)))
                .addContainerGap())
        );
        panelCadastrarDespesaLayout.setVerticalGroup(
            panelCadastrarDespesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastrarDespesaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCadastrarDespesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCadastrarGanhoAviso)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(panelCadastrarDespesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelCadastroGanhoData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelCadastroGanhoDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCadastrarDespesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        mainTabbedPane.addTab("Cadastrar", panelCadastrarDespesa);

        javax.swing.GroupLayout paneRemoverDespesaLayout = new javax.swing.GroupLayout(paneRemoverDespesa);
        paneRemoverDespesa.setLayout(paneRemoverDespesaLayout);
        paneRemoverDespesaLayout.setHorizontalGroup(
            paneRemoverDespesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 473, Short.MAX_VALUE)
        );
        paneRemoverDespesaLayout.setVerticalGroup(
            paneRemoverDespesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 232, Short.MAX_VALUE)
        );

        mainTabbedPane.addTab("Remover", paneRemoverDespesa);

        javax.swing.GroupLayout paneBuscarDespesaLayout = new javax.swing.GroupLayout(paneBuscarDespesa);
        paneBuscarDespesa.setLayout(paneBuscarDespesaLayout);
        paneBuscarDespesaLayout.setHorizontalGroup(
            paneBuscarDespesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 473, Short.MAX_VALUE)
        );
        paneBuscarDespesaLayout.setVerticalGroup(
            paneBuscarDespesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 232, Short.MAX_VALUE)
        );

        mainTabbedPane.addTab("Buscar", paneBuscarDespesa);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainTabbedPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainTabbedPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JanelaGanhos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaGanhos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaGanhos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaGanhos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaGanhos().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fieldInputDescrição;
    private javax.swing.JFormattedTextField formattedFieldInputValor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JLabel labelAno;
    private javax.swing.JLabel labelCadastrarGanhoAviso;
    private javax.swing.JLabel labelDescrição;
    private javax.swing.JLabel labelDia;
    private javax.swing.JLabel labelMes;
    private javax.swing.JLabel labelValor;
    private javax.swing.JTabbedPane mainTabbedPane;
    private javax.swing.JPanel paneBuscarDespesa;
    private javax.swing.JPanel paneRemoverDespesa;
    private javax.swing.JPanel panelCadastrarDespesa;
    private javax.swing.JPanel panelCadastroGanhoDados;
    private javax.swing.JPanel panelCadastroGanhoData;
    // End of variables declaration//GEN-END:variables
}
