/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.util.Arrays;
import javax.swing.DefaultListModel;
import javax.swing.Timer;
import ps.controlUnit;

/**
 *
 * @author Gabriel
 */
public class UI extends javax.swing.JFrame {

    int valueDelay;
    public short input;
    static private DefaultListModel lista = new DefaultListModel();
    public controlUnit control;
    
    
    /**
     * Creates new form UI
     */
    public UI() {
        initComponents();
//        setMemoria();
        //valueDelay = sliderDelay.getValue();
    }
    
    public void setMemoria(){
        lista.clear();
        for(int i=0;i<64;i++){
            lista.add(i, String.valueOf(control.memoria.get(i)));
        }
        memoriaLista.setModel(lista);
    }
    
   /* public void setPcLabel(String newPc){
        pcLabel.setText(newPc);
    }
    public String getPcLabel(){
        return pcLabel.getText();
    }
    
    public void setRiLabel(String newRi){
        riLabel.setText(newRi);
    }
    public String getRiLabell(){
        return riLabel.getText();
    }*/
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputDialog = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        inputTexto = new javax.swing.JTextField();
        okInputBotao = new javax.swing.JButton();
        outputDialog = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        outputLabel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        okOutputBotao = new javax.swing.JButton();
        erroTokenDialog = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        okErroBotao = new javax.swing.JButton();
        tokenLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        codigoTexto = new javax.swing.JTextPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        memoriaLista = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        executarBotao = new javax.swing.JButton();
        limparBotao = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        resultadoLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        opd1Label = new javax.swing.JLabel();
        opd2Label = new javax.swing.JLabel();

        inputDialog.setMinimumSize(new java.awt.Dimension(440, 161));

        jPanel3.setMinimumSize(new java.awt.Dimension(420, 200));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("Digite o valor desejado:");

        inputTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTextoActionPerformed(evt);
            }
        });

        okInputBotao.setText("Ok");
        okInputBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okInputBotaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputTexto)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(okInputBotao)))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(26, 26, 26)
                .addComponent(inputTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(okInputBotao)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout inputDialogLayout = new javax.swing.GroupLayout(inputDialog.getContentPane());
        inputDialog.getContentPane().setLayout(inputDialogLayout);
        inputDialogLayout.setHorizontalGroup(
            inputDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
            .addGroup(inputDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        inputDialogLayout.setVerticalGroup(
            inputDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 131, Short.MAX_VALUE)
            .addGroup(inputDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(inputDialogLayout.createSequentialGroup()
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        outputDialog.setMinimumSize(new java.awt.Dimension(420, 170));

        outputLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        outputLabel.setText("0000000");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setText("Resultado:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(outputLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(outputLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        okOutputBotao.setText("Ok");
        okOutputBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okOutputBotaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout outputDialogLayout = new javax.swing.GroupLayout(outputDialog.getContentPane());
        outputDialog.getContentPane().setLayout(outputDialogLayout);
        outputDialogLayout.setHorizontalGroup(
            outputDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputDialogLayout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(okOutputBotao)
                .addContainerGap(180, Short.MAX_VALUE))
            .addGroup(outputDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        outputDialogLayout.setVerticalGroup(
            outputDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, outputDialogLayout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addComponent(okOutputBotao)
                .addContainerGap())
            .addGroup(outputDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(outputDialogLayout.createSequentialGroup()
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 41, Short.MAX_VALUE)))
        );

        erroTokenDialog.setMinimumSize(new java.awt.Dimension(420, 131));

        jPanel5.setMinimumSize(new java.awt.Dimension(420, 200));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel11.setText("Token não encontrado:");

        okErroBotao.setText("Ok");
        okErroBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okErroBotaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel11))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(okErroBotao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tokenLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tokenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(okErroBotao)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout erroTokenDialogLayout = new javax.swing.GroupLayout(erroTokenDialog.getContentPane());
        erroTokenDialog.getContentPane().setLayout(erroTokenDialogLayout);
        erroTokenDialogLayout.setHorizontalGroup(
            erroTokenDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
            .addGroup(erroTokenDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        erroTokenDialogLayout.setVerticalGroup(
            erroTokenDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 131, Short.MAX_VALUE)
            .addGroup(erroTokenDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(erroTokenDialogLayout.createSequentialGroup()
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 200));

        jScrollPane1.setViewportView(codigoTexto);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(200, 40, 0));
        jLabel1.setText("Calingaert Virtual Machine");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(236, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("Registradores:");

        jScrollPane2.setViewportView(memoriaLista);

        jLabel5.setText("Memória:");

        executarBotao.setText("Executar");
        executarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                executarBotaoActionPerformed(evt);
            }
        });

        limparBotao.setText("Limpar");
        limparBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparBotaoActionPerformed(evt);
            }
        });

        jLabel6.setText("Resultado:");

        resultadoLabel.setText("000000");

        jLabel8.setText("Operando 1:");

        jLabel9.setText("Operando 2:");

        opd1Label.setText("000000");

        opd2Label.setText("000000");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(27, 27, 27)
                                .addComponent(resultadoLabel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(opd2Label)
                                    .addComponent(opd1Label)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(executarBotao)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(limparBotao)))))
                .addGap(59, 59, 59)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(82, 82, 82)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(resultadoLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(opd1Label))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(opd2Label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(executarBotao)
                        .addGap(18, 18, 18)
                        .addComponent(limparBotao)
                        .addGap(27, 27, 27))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void executarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_executarBotaoActionPerformed
      int i=0;
   
      lista.clear();    
      memoriaLista.setModel(lista);
      control.clearMemory();
      setMemoria();
      
      String[] lineCod = codigoTexto.getText().split("\n");
      while(i<lineCod.length) {
        String[] tokenInstruction = lineCod[i].split("[ \\s]");//Quebra a String nos espaços e tabulações!
        
        tokenInstruction[0] = tokenInstruction[0].toUpperCase();
        if("STOP".equals(tokenInstruction[0])) {
            break;
        }
        switch(tokenInstruction[0]){
            case "ADD":
                control.setOpd1(Short.valueOf( tokenInstruction[1]));
                control.add();
                break;
            case "BR":
                control.setOpd1(Short.valueOf( tokenInstruction[1]));
                control.br();
                break;
            case "BRNEG":
                control.setOpd1(Short.valueOf( tokenInstruction[1]));
                control.brneg();                        
                if(control.getOpd1()<0)
                    i=control.getPC();
                break;
            case "BRPOS":
                control.setOpd1(Short.valueOf( tokenInstruction[1]));
                control.brpos();
                if(control.getOpd1()>0)
                    i=control.getPC();
                break;
            case "BRZERO":
                control.setOpd1(Short.valueOf( tokenInstruction[1]));
                control.brzero();
                if(control.getOpd1()==0)
                    i=control.getPC();
                break;
            case "CALL":
                control.call();
                break;
            case "COPY":
                control.copy();
                break;
            case "DIV":
                control.setOpd1(Short.valueOf( tokenInstruction[1]));
                control.div();
                break;
            case "LOAD":
                control.setOpd1(Short.valueOf( tokenInstruction[1]));
                control.load();
                break;
            case "MULT":
                control.setOpd1(Short.valueOf( tokenInstruction[1]));
                control.mult();
                break;
            case "READ":
                control.setOpd1(input());
                break;
            case "RET":
                control.ret();
                break;
            case "STOP":
                control.stop();
            case "STORE":
                control.setOpd1(Short.valueOf( tokenInstruction[1]));
                control.store();
                break;
            case "SUB":
                control.setOpd1(Short.parseShort(tokenInstruction[1]));
                control.sub();
                break;
            case "WRITE":
                output(String.valueOf(control.getOpd1()));
                break;
            default:
               erroTokenDialog.setVisible(true);
               tokenLabel.setText(tokenInstruction[0]);
                break;
        }
        
        //Setando labels a cada iteração:
        resultadoLabel.setText(String.valueOf( control.getACC()));
        
        opd1Label.setText(String.valueOf(control.getOpd1()));
        opd2Label.setText(String.valueOf(control.getOpd2()));
        
        setMemoria();
        
        /*
            Implementar aqui o Delay, usando a variável valueDelay
        
        
        */
        
        i++;
      }
      
    }//GEN-LAST:event_executarBotaoActionPerformed

    private void limparBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparBotaoActionPerformed
        // TODO add your handling code here:
        codigoTexto.setText("");
        lista.clear();    
        memoriaLista.setModel(lista);
        control.clearMemory();
        setMemoria();
        resultadoLabel.setText("000000");
        opd1Label.setText("000000");
        opd2Label.setText("000000");
        
        control.setACC((short)0);
        control.setOpd1((short)0);
        control.setOpd2((short)0);
        
    }//GEN-LAST:event_limparBotaoActionPerformed

    private void inputTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTextoActionPerformed

    private void okOutputBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okOutputBotaoActionPerformed
        // TODO add your handling code here:
       outputDialog.setVisible(false);
    }//GEN-LAST:event_okOutputBotaoActionPerformed

    private void okInputBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okInputBotaoActionPerformed
        // TODO add your handling code here:
        input = Short.parseShort(inputTexto.getText());
        inputDialog.setVisible(false);
    }//GEN-LAST:event_okInputBotaoActionPerformed

    private void okErroBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okErroBotaoActionPerformed
        // TODO add your handling code here:
        erroTokenDialog.setVisible(false);
    }//GEN-LAST:event_okErroBotaoActionPerformed

    public void output(String value){
        outputLabel.setText(value);
        outputDialog.setVisible(true);
       // System.out.println(value);
    }

    public short input(){
        inputDialog.setVisible(true);
        return Short.valueOf(inputTexto.getText());//String tá vindo vazia, arrumar
    }
    
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
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane codigoTexto;
    private javax.swing.JDialog erroTokenDialog;
    private javax.swing.JButton executarBotao;
    private javax.swing.JDialog inputDialog;
    private javax.swing.JTextField inputTexto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton limparBotao;
    private javax.swing.JList<String> memoriaLista;
    private javax.swing.JButton okErroBotao;
    private javax.swing.JButton okInputBotao;
    private javax.swing.JButton okOutputBotao;
    private javax.swing.JLabel opd1Label;
    private javax.swing.JLabel opd2Label;
    private javax.swing.JDialog outputDialog;
    private javax.swing.JLabel outputLabel;
    private javax.swing.JLabel resultadoLabel;
    private javax.swing.JLabel tokenLabel;
    // End of variables declaration//GEN-END:variables
}
