/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controle.Controle;
import controle.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author Thiago Matos
 */
public class JanelaCadastroConfirmarSenha extends javax.swing.JFrame {

    //Controle do programa
    private Controle core;
    private Usuario user;
    
    /**
     * Método para definir um controle do programa para esta janela
     * @param newCore O core a ser utilizado pela janela
     */
    public void setCore(Controle newCore){
        core = newCore;
    }
    
    /**
     * Método para definir o usuário atual na janela
     * @param newUser o usuário a ser definido como atual
     */
    public void setUser(Usuario newUser){
        this.user = newUser;
    }
    
    /**
     * Creates new form JanelaCadastroConfirmaçãoSenha
     */
    public JanelaCadastroConfirmarSenha() {
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

        labelDescrição = new javax.swing.JLabel();
        labelSenha = new javax.swing.JLabel();
        fieldInputSenha = new javax.swing.JPasswordField();
        buttonCancelar = new javax.swing.JButton();
        buttonOk = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("[SGF - 2014] Confirmar Senha");
        setLocationByPlatform(true);

        labelDescrição.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelDescrição.setText("Confirme sua senha:");

        labelSenha.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelSenha.setText("Senha:");

        fieldInputSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldInputSenhaActionPerformed(evt);
            }
        });

        buttonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/24px_cancelar.png"))); // NOI18N
        buttonCancelar.setText("Cancelar");
        buttonCancelar.setToolTipText("Retornar a janela anterior");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });

        buttonOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/24px_ok.png"))); // NOI18N
        buttonOk.setText("Ok");
        buttonOk.setToolTipText("Avançar");
        buttonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOkActionPerformed(evt);
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
                        .addComponent(buttonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                        .addComponent(buttonOk, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelDescrição)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelSenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldInputSenha)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelDescrição)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSenha)
                    .addComponent(fieldInputSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCancelar)
                    .addComponent(buttonOk))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldInputSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldInputSenhaActionPerformed

    }//GEN-LAST:event_fieldInputSenhaActionPerformed

    private void buttonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOkActionPerformed
        //Fazendo leitura dos dados informados pelo usuário
        String pswd = new String(this.fieldInputSenha.getPassword());
        //Comparando a senha lida com a senha informada na janela anterior
        if(pswd.equals(user.getPswd())){
            //Senhas são iguais, cadastrar o usuário...
            core.inserirUsuario(user, pswd);
            //Validar o usuário inserido
            if(core.validarUsuario(user.getLogin(), pswd)){
                //Usuário válido, criar próxima janela...
                JanelaMainMenu janelaMainMenu = new JanelaMainMenu();
                //Passando o controle para a próxima janela
                janelaMainMenu.setCore(core);
                //Definindo a próxima janela como visível
                janelaMainMenu.setVisible(true);
                //Descartando a janela atual
                this.dispose();
            }
        }else{
            //Senhas diferentes.
            JOptionPane.showMessageDialog(null, "A senha informada não confere.");
        }
    }//GEN-LAST:event_buttonOkActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        //Criando a próxima janela
        JanelaCadastroUsuario janelaCadastroUsuario = new JanelaCadastroUsuario();
        //Passando o o controle para a próxima janela
        janelaCadastroUsuario.setCore(core);
        //Definindo a nova janela como visível
        janelaCadastroUsuario.setVisible(true);
        //Descartando a janela atual
        this.dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(JanelaCadastroConfirmarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaCadastroConfirmarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaCadastroConfirmarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaCadastroConfirmarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaCadastroConfirmarSenha().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonOk;
    private javax.swing.JPasswordField fieldInputSenha;
    private javax.swing.JLabel labelDescrição;
    private javax.swing.JLabel labelSenha;
    // End of variables declaration//GEN-END:variables
}