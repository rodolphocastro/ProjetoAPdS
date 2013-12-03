/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

/**
 *
 * @author AlvesRC
 */
public class WizardGraficoDois extends javax.swing.JFrame {

    /**
     * Creates new form WizardGraficoDois
     */
    public WizardGraficoDois() {
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

        labelAviso = new javax.swing.JLabel();
        panelDataInicial = new javax.swing.JPanel();
        labelDataInicialDia = new javax.swing.JLabel();
        labelDataInicialMes = new javax.swing.JLabel();
        labelDataInicialAno = new javax.swing.JLabel();
        spinnerDataInicialAno = new javax.swing.JSpinner();
        spinnerDataInicialMes = new javax.swing.JSpinner();
        spinnerDataInicialDia = new javax.swing.JSpinner();
        panelDataFinal = new javax.swing.JPanel();
        labelDataFinalDia = new javax.swing.JLabel();
        labelDataFinalMes = new javax.swing.JLabel();
        labelDataFinalAno = new javax.swing.JLabel();
        spinnerDataFinalAno = new javax.swing.JSpinner();
        spinnerDataFinalMes = new javax.swing.JSpinner();
        spinnerDataFinalDia = new javax.swing.JSpinner();
        buttonAnterior = new javax.swing.JButton();
        buttonPlotar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("[SGF - 2014] Gerar Gráfico (2 / 2)");

        labelAviso.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelAviso.setText("Selecione abaixo o período a ser plotado:");

        panelDataInicial.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Data Inicial"));

        labelDataInicialDia.setText("Dia:");

        labelDataInicialMes.setText("Mês:");

        labelDataInicialAno.setText("Ano:");

        spinnerDataInicialAno.setToolTipText("O ano inicial do período.");

        spinnerDataInicialMes.setToolTipText("O mês inicial do período.");

        spinnerDataInicialDia.setToolTipText("O dia inicial do período.");

        javax.swing.GroupLayout panelDataInicialLayout = new javax.swing.GroupLayout(panelDataInicial);
        panelDataInicial.setLayout(panelDataInicialLayout);
        panelDataInicialLayout.setHorizontalGroup(
            panelDataInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDataInicialLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDataInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDataInicialLayout.createSequentialGroup()
                        .addComponent(labelDataInicialAno)
                        .addGap(22, 22, 22)
                        .addComponent(spinnerDataInicialAno))
                    .addGroup(panelDataInicialLayout.createSequentialGroup()
                        .addGroup(panelDataInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelDataInicialLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(labelDataInicialDia)
                                .addGap(22, 22, 22)
                                .addComponent(spinnerDataInicialDia))
                            .addGroup(panelDataInicialLayout.createSequentialGroup()
                                .addComponent(labelDataInicialMes)
                                .addGap(22, 22, 22)
                                .addComponent(spinnerDataInicialMes, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 24, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelDataInicialLayout.setVerticalGroup(
            panelDataInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDataInicialLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDataInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDataInicialDia)
                    .addComponent(spinnerDataInicialDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDataInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDataInicialMes)
                    .addComponent(spinnerDataInicialMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(panelDataInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDataInicialAno)
                    .addComponent(spinnerDataInicialAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelDataFinal.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Data Final"));

        labelDataFinalDia.setText("Dia:");

        labelDataFinalMes.setText("Mês:");

        labelDataFinalAno.setText("Ano:");

        spinnerDataFinalAno.setToolTipText("O ano final do período.");

        spinnerDataFinalMes.setToolTipText("O mês final do período.");

        spinnerDataFinalDia.setToolTipText("O dia final do período.");

        javax.swing.GroupLayout panelDataFinalLayout = new javax.swing.GroupLayout(panelDataFinal);
        panelDataFinal.setLayout(panelDataFinalLayout);
        panelDataFinalLayout.setHorizontalGroup(
            panelDataFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDataFinalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDataFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDataFinalLayout.createSequentialGroup()
                        .addComponent(labelDataFinalAno)
                        .addGap(22, 22, 22)
                        .addComponent(spinnerDataFinalAno))
                    .addGroup(panelDataFinalLayout.createSequentialGroup()
                        .addGroup(panelDataFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelDataFinalLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(labelDataFinalDia)
                                .addGap(22, 22, 22)
                                .addComponent(spinnerDataFinalDia))
                            .addGroup(panelDataFinalLayout.createSequentialGroup()
                                .addComponent(labelDataFinalMes)
                                .addGap(22, 22, 22)
                                .addComponent(spinnerDataFinalMes, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 24, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelDataFinalLayout.setVerticalGroup(
            panelDataFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDataFinalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDataFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDataFinalDia)
                    .addComponent(spinnerDataFinalDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDataFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDataFinalMes)
                    .addComponent(spinnerDataFinalMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(panelDataFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDataFinalAno)
                    .addComponent(spinnerDataFinalAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/24px_previous.png"))); // NOI18N
        buttonAnterior.setText("Anterior");
        buttonAnterior.setToolTipText("Voltar à etapa anterior na criação do gráfico.");

        buttonPlotar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/24px_grafico.png"))); // NOI18N
        buttonPlotar.setText("Plotar");
        buttonPlotar.setToolTipText("Gerar e exibir o gráfico.");
        buttonPlotar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlotarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonAnterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonPlotar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelAviso)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                        .addComponent(panelDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelAviso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(panelDataInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDataFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAnterior)
                    .addComponent(buttonPlotar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonPlotarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlotarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonPlotarActionPerformed

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
            java.util.logging.Logger.getLogger(WizardGraficoDois.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WizardGraficoDois.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WizardGraficoDois.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WizardGraficoDois.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WizardGraficoDois().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAnterior;
    private javax.swing.JButton buttonPlotar;
    private javax.swing.JLabel labelAviso;
    private javax.swing.JLabel labelDataFinalAno;
    private javax.swing.JLabel labelDataFinalDia;
    private javax.swing.JLabel labelDataFinalMes;
    private javax.swing.JLabel labelDataInicialAno;
    private javax.swing.JLabel labelDataInicialDia;
    private javax.swing.JLabel labelDataInicialMes;
    private javax.swing.JPanel panelDataFinal;
    private javax.swing.JPanel panelDataInicial;
    private javax.swing.JSpinner spinnerDataFinalAno;
    private javax.swing.JSpinner spinnerDataFinalDia;
    private javax.swing.JSpinner spinnerDataFinalMes;
    private javax.swing.JSpinner spinnerDataInicialAno;
    private javax.swing.JSpinner spinnerDataInicialDia;
    private javax.swing.JSpinner spinnerDataInicialMes;
    // End of variables declaration//GEN-END:variables
}
