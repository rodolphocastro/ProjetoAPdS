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
public class JanelaDespesas extends javax.swing.JFrame {

    /**
     * Creates new form JanelaCadastroGasto
     */
    public JanelaDespesas() {
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

        buttonCadastrarDespesaLimpar1 = new javax.swing.JButton();
        buttonCadastrarDespesaAdicionar1 = new javax.swing.JButton();
        buttonCadastrarDespesaCancelar1 = new javax.swing.JButton();
        mainTabbedPane = new javax.swing.JTabbedPane();
        panelCadastrarDespesa = new javax.swing.JPanel();
        labelCadastrarDespesalAviso = new javax.swing.JLabel();
        panelCadastrarDespesaDados = new javax.swing.JPanel();
        labelCadastrarDespesaDesc = new javax.swing.JLabel();
        labelCadastrarDespesaValor = new javax.swing.JLabel();
        fieldInputCadastrarDespesaDesc = new javax.swing.JTextField();
        fieldInputCadastrarDespesaValor = new javax.swing.JFormattedTextField();
        panelCadastrarDespesaData = new javax.swing.JPanel();
        labelCadastrarDespesaDia = new javax.swing.JLabel();
        labelCadastrarDespesaMes = new javax.swing.JLabel();
        labelCadastrarDespesaAno = new javax.swing.JLabel();
        spinnerCadastrarDespesaDia = new javax.swing.JSpinner();
        spinnerCadastrarDespesaMes = new javax.swing.JSpinner();
        spinnerCadastrarDespesaAno = new javax.swing.JSpinner();
        buttonCadastrarDespesaLimpar = new javax.swing.JButton();
        buttonCadastrarDespesaAdicionar = new javax.swing.JButton();
        buttonCadastrarDespesaCancelar = new javax.swing.JButton();
        panellRemoverDespesa = new javax.swing.JPanel();
        labelRemoverDespesalAviso = new javax.swing.JLabel();
        panelRemoverrDespesaDados = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        panelRemoverrDespesaData1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSpinner4 = new javax.swing.JSpinner();
        jSpinner5 = new javax.swing.JSpinner();
        jSpinner6 = new javax.swing.JSpinner();
        panelBuscarDespesa = new javax.swing.JPanel();

        buttonCadastrarDespesaLimpar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/24px_limpar.png"))); // NOI18N
        buttonCadastrarDespesaLimpar1.setText("Limpar");
        buttonCadastrarDespesaLimpar1.setToolTipText("Limpar os campos da tela.");

        buttonCadastrarDespesaAdicionar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/24px_ok.png"))); // NOI18N
        buttonCadastrarDespesaAdicionar1.setText("Adicionar");
        buttonCadastrarDespesaAdicionar1.setToolTipText("Cadastrar a despesa no banco de dados.");

        buttonCadastrarDespesaCancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/24px_cancelar.png"))); // NOI18N
        buttonCadastrarDespesaCancelar1.setText("Cancelar");
        buttonCadastrarDespesaCancelar1.setToolTipText("Cancelar o cadastro.");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelCadastrarDespesalAviso.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelCadastrarDespesalAviso.setText("Insira os dados da despesa a ser cadastrada:");
        labelCadastrarDespesalAviso.setToolTipText("");

        panelCadastrarDespesaDados.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Dados"));

        labelCadastrarDespesaDesc.setText("Descrição:");

        labelCadastrarDespesaValor.setText("Valor:");

        fieldInputCadastrarDespesaDesc.setToolTipText("Uma breve descrição da despesa a ser cadastrada.");

        fieldInputCadastrarDespesaValor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        fieldInputCadastrarDespesaValor.setText("R$ 1.000,00");
        fieldInputCadastrarDespesaValor.setToolTipText("O valor da despesa.");

        javax.swing.GroupLayout panelCadastrarDespesaDadosLayout = new javax.swing.GroupLayout(panelCadastrarDespesaDados);
        panelCadastrarDespesaDados.setLayout(panelCadastrarDespesaDadosLayout);
        panelCadastrarDespesaDadosLayout.setHorizontalGroup(
            panelCadastrarDespesaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastrarDespesaDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCadastrarDespesaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCadastrarDespesaValor, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelCadastrarDespesaDesc, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCadastrarDespesaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldInputCadastrarDespesaDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldInputCadastrarDespesaValor, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCadastrarDespesaDadosLayout.setVerticalGroup(
            panelCadastrarDespesaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastrarDespesaDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCadastrarDespesaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCadastrarDespesaDesc)
                    .addComponent(fieldInputCadastrarDespesaDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCadastrarDespesaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCadastrarDespesaValor)
                    .addComponent(fieldInputCadastrarDespesaValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelCadastrarDespesaData.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Data"));

        labelCadastrarDespesaDia.setText("Dia:");

        labelCadastrarDespesaMes.setText("Mês:");

        labelCadastrarDespesaAno.setText("Ano:");

        spinnerCadastrarDespesaDia.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));
        spinnerCadastrarDespesaDia.setToolTipText("O dia em que a despesa ocorreu.");

        spinnerCadastrarDespesaMes.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        spinnerCadastrarDespesaMes.setToolTipText("O mês em que a despesa ocorreu.");

        spinnerCadastrarDespesaAno.setModel(new javax.swing.SpinnerNumberModel(2000, 2000, 2020, 1));
        spinnerCadastrarDespesaAno.setToolTipText("O ano em que a despesa ocorreu.");

        javax.swing.GroupLayout panelCadastrarDespesaDataLayout = new javax.swing.GroupLayout(panelCadastrarDespesaData);
        panelCadastrarDespesaData.setLayout(panelCadastrarDespesaDataLayout);
        panelCadastrarDespesaDataLayout.setHorizontalGroup(
            panelCadastrarDespesaDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastrarDespesaDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCadastrarDespesaDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCadastrarDespesaDia, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelCadastrarDespesaMes, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelCadastrarDespesaAno, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(panelCadastrarDespesaDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spinnerCadastrarDespesaAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinnerCadastrarDespesaMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinnerCadastrarDespesaDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panelCadastrarDespesaDataLayout.setVerticalGroup(
            panelCadastrarDespesaDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastrarDespesaDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCadastrarDespesaDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCadastrarDespesaDia)
                    .addComponent(spinnerCadastrarDespesaDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCadastrarDespesaDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCadastrarDespesaMes)
                    .addComponent(spinnerCadastrarDespesaMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCadastrarDespesaDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCadastrarDespesaAno)
                    .addComponent(spinnerCadastrarDespesaAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        buttonCadastrarDespesaLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/24px_limpar.png"))); // NOI18N
        buttonCadastrarDespesaLimpar.setText("Limpar");
        buttonCadastrarDespesaLimpar.setToolTipText("Limpar os campos da tela.");

        buttonCadastrarDespesaAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/24px_ok.png"))); // NOI18N
        buttonCadastrarDespesaAdicionar.setText("Adicionar");
        buttonCadastrarDespesaAdicionar.setToolTipText("Cadastrar a despesa no banco de dados.");

        buttonCadastrarDespesaCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/24px_cancelar.png"))); // NOI18N
        buttonCadastrarDespesaCancelar.setText("Cancelar");
        buttonCadastrarDespesaCancelar.setToolTipText("Cancelar o cadastro.");

        javax.swing.GroupLayout panelCadastrarDespesaLayout = new javax.swing.GroupLayout(panelCadastrarDespesa);
        panelCadastrarDespesa.setLayout(panelCadastrarDespesaLayout);
        panelCadastrarDespesaLayout.setHorizontalGroup(
            panelCadastrarDespesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastrarDespesaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCadastrarDespesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panelCadastrarDespesaLayout.createSequentialGroup()
                        .addComponent(buttonCadastrarDespesaCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonCadastrarDespesaAdicionar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCadastrarDespesaLayout.createSequentialGroup()
                        .addComponent(labelCadastrarDespesalAviso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonCadastrarDespesaLimpar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCadastrarDespesaLayout.createSequentialGroup()
                        .addComponent(panelCadastrarDespesaDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelCadastrarDespesaData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCadastrarDespesaLayout.setVerticalGroup(
            panelCadastrarDespesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastrarDespesaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCadastrarDespesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCadastrarDespesalAviso)
                    .addComponent(buttonCadastrarDespesaLimpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCadastrarDespesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelCadastrarDespesaData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelCadastrarDespesaDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCadastrarDespesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCadastrarDespesaAdicionar)
                    .addComponent(buttonCadastrarDespesaCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainTabbedPane.addTab("Cadastrar", panelCadastrarDespesa);

        labelRemoverDespesalAviso.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelRemoverDespesalAviso.setText("Insira os dados da despesa a ser cadastrada:");
        labelRemoverDespesalAviso.setToolTipText("");

        panelRemoverrDespesaDados.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Dados"));

        jLabel6.setText("Descrição:");

        jTextField2.setToolTipText("Uma breve descrição da despesa a ser cadastrada.");

        javax.swing.GroupLayout panelRemoverrDespesaDadosLayout = new javax.swing.GroupLayout(panelRemoverrDespesaDados);
        panelRemoverrDespesaDados.setLayout(panelRemoverrDespesaDadosLayout);
        panelRemoverrDespesaDadosLayout.setHorizontalGroup(
            panelRemoverrDespesaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRemoverrDespesaDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRemoverrDespesaDadosLayout.setVerticalGroup(
            panelRemoverrDespesaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRemoverrDespesaDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRemoverrDespesaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelRemoverrDespesaData1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Data"));

        jLabel8.setText("Dia:");

        jLabel9.setText("Mês:");

        jLabel10.setText("Ano:");

        jSpinner4.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));
        jSpinner4.setToolTipText("O dia em que a despesa ocorreu.");

        jSpinner5.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        jSpinner5.setToolTipText("O mês em que a despesa ocorreu.");

        jSpinner6.setModel(new javax.swing.SpinnerNumberModel(2000, 2000, 2020, 1));
        jSpinner6.setToolTipText("O ano em que a despesa ocorreu.");

        javax.swing.GroupLayout panelRemoverrDespesaData1Layout = new javax.swing.GroupLayout(panelRemoverrDespesaData1);
        panelRemoverrDespesaData1.setLayout(panelRemoverrDespesaData1Layout);
        panelRemoverrDespesaData1Layout.setHorizontalGroup(
            panelRemoverrDespesaData1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRemoverrDespesaData1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRemoverrDespesaData1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(panelRemoverrDespesaData1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panelRemoverrDespesaData1Layout.setVerticalGroup(
            panelRemoverrDespesaData1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRemoverrDespesaData1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRemoverrDespesaData1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRemoverrDespesaData1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRemoverrDespesaData1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panellRemoverDespesaLayout = new javax.swing.GroupLayout(panellRemoverDespesa);
        panellRemoverDespesa.setLayout(panellRemoverDespesaLayout);
        panellRemoverDespesaLayout.setHorizontalGroup(
            panellRemoverDespesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panellRemoverDespesaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panellRemoverDespesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelRemoverDespesalAviso)
                    .addGroup(panellRemoverDespesaLayout.createSequentialGroup()
                        .addComponent(panelRemoverrDespesaDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelRemoverrDespesaData1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panellRemoverDespesaLayout.setVerticalGroup(
            panellRemoverDespesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panellRemoverDespesaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelRemoverDespesalAviso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panellRemoverDespesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRemoverrDespesaDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRemoverrDespesaData1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        mainTabbedPane.addTab("Remover", panellRemoverDespesa);

        javax.swing.GroupLayout panelBuscarDespesaLayout = new javax.swing.GroupLayout(panelBuscarDespesa);
        panelBuscarDespesa.setLayout(panelBuscarDespesaLayout);
        panelBuscarDespesaLayout.setHorizontalGroup(
            panelBuscarDespesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 485, Short.MAX_VALUE)
        );
        panelBuscarDespesaLayout.setVerticalGroup(
            panelBuscarDespesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 231, Short.MAX_VALUE)
        );

        mainTabbedPane.addTab("Buscar", panelBuscarDespesa);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(mainTabbedPane))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 259, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(mainTabbedPane))
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
            java.util.logging.Logger.getLogger(JanelaDespesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaDespesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaDespesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaDespesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaDespesas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCadastrarDespesaAdicionar;
    private javax.swing.JButton buttonCadastrarDespesaAdicionar1;
    private javax.swing.JButton buttonCadastrarDespesaCancelar;
    private javax.swing.JButton buttonCadastrarDespesaCancelar1;
    private javax.swing.JButton buttonCadastrarDespesaLimpar;
    private javax.swing.JButton buttonCadastrarDespesaLimpar1;
    private javax.swing.JTextField fieldInputCadastrarDespesaDesc;
    private javax.swing.JFormattedTextField fieldInputCadastrarDespesaValor;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JSpinner jSpinner6;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel labelCadastrarDespesaAno;
    private javax.swing.JLabel labelCadastrarDespesaDesc;
    private javax.swing.JLabel labelCadastrarDespesaDia;
    private javax.swing.JLabel labelCadastrarDespesaMes;
    private javax.swing.JLabel labelCadastrarDespesaValor;
    private javax.swing.JLabel labelCadastrarDespesalAviso;
    private javax.swing.JLabel labelRemoverDespesalAviso;
    private javax.swing.JTabbedPane mainTabbedPane;
    private javax.swing.JPanel panelBuscarDespesa;
    private javax.swing.JPanel panelCadastrarDespesa;
    private javax.swing.JPanel panelCadastrarDespesaDados;
    private javax.swing.JPanel panelCadastrarDespesaData;
    private javax.swing.JPanel panelRemoverrDespesaDados;
    private javax.swing.JPanel panelRemoverrDespesaData1;
    private javax.swing.JPanel panellRemoverDespesa;
    private javax.swing.JSpinner spinnerCadastrarDespesaAno;
    private javax.swing.JSpinner spinnerCadastrarDespesaDia;
    private javax.swing.JSpinner spinnerCadastrarDespesaMes;
    // End of variables declaration//GEN-END:variables
}
