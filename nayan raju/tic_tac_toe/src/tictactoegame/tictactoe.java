
package tictactoegame;

import javax.swing.JFrame;


public class tictactoe extends javax.swing.JFrame {

    int i=1;
    int a[][]=new int[3][3];
    int comp;
   
    public tictactoe() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogbox = new javax.swing.JDialog();
        dTextField1 = new javax.swing.JTextField();
        dbtn1 = new javax.swing.JButton();
        dbtn2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        txtfield = new javax.swing.JTextField();
        txtfield1 = new javax.swing.JTextField();
        txtfield2 = new javax.swing.JTextField();
        Button1 = new javax.swing.JButton();

        dialogbox.setMinimumSize(new java.awt.Dimension(400, 246));
        dialogbox.setType(java.awt.Window.Type.POPUP);

        dTextField1.setEditable(false);
        dTextField1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        dTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dTextField1.setText("Start a New Game ?");

        dbtn1.setFont(new java.awt.Font("Trajan Pro", 1, 24)); // NOI18N
        dbtn1.setText("Yes");
        dbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dbtn1ActionPerformed(evt);
            }
        });

        dbtn2.setFont(new java.awt.Font("Trajan Pro", 1, 24)); // NOI18N
        dbtn2.setText("No");
        dbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dbtn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogboxLayout = new javax.swing.GroupLayout(dialogbox.getContentPane());
        dialogbox.getContentPane().setLayout(dialogboxLayout);
        dialogboxLayout.setHorizontalGroup(
            dialogboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogboxLayout.createSequentialGroup()
                .addGroup(dialogboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogboxLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(dTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dialogboxLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(dbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(dbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        dialogboxLayout.setVerticalGroup(
            dialogboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogboxLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(dTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(dialogboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(472, 387));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Adobe Garamond Pro Bold", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tic-Tac-Toe");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 102, 0), new java.awt.Color(255, 255, 0), null, new java.awt.Color(204, 0, 0)));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 312, -1));

        jPanel1.setBackground(new java.awt.Color(51, 51, 0));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        btn1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 46, -1, -1));

        txtfield.setFont(new java.awt.Font("Tekton Pro Cond", 2, 36)); // NOI18N
        txtfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtfield.setText("Player 1");
        getContentPane().add(txtfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 326, 312, 61));

        txtfield1.setEditable(false);
        txtfield1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtfield1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtfield1.setText("Player 1 - X");
        getContentPane().add(txtfield1, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 61, 144, 63));

        txtfield2.setEditable(false);
        txtfield2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtfield2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtfield2.setText("Player 2 - O");
        getContentPane().add(txtfield2, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 150, 144, 63));

        Button1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Button1.setText("Refresh");
        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });
        getContentPane().add(Button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 241, 144, 65));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        if(comp==1){
            dialogbox.setVisible(true);
        }
        else if(i%2==1){
           btn1.setText("X");
           a[0][0]=1;
           i++;
           checkwin();
           if(comp==0)
               txtfield.setText("Player 2");
       }else{
           btn1.setText("O");
           a[0][0]=2;
           i++;
           checkwin();
           if(comp==0)
               txtfield.setText("Player 1");
       }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
       
        if(comp==1){
            dialogbox.setVisible(true);
        }
         else if(i%2==1){
           btn2.setText("X");
           a[0][1]=1;
           i++;
           checkwin();
           if(comp==0)
               txtfield.setText("Player 2");
       }else{
           btn2.setText("O");
           a[0][1]=2;
           i++;
           checkwin();
           if(comp==0)
               txtfield.setText("Player 1");
       }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        if(comp==1){
            dialogbox.setVisible(true);
        }
        else if(i%2==1){
           btn3.setText("X");
           a[0][2]=1;
           i++;
           checkwin();
           if(comp==0)
               txtfield.setText("Player 2");
       }else{
           btn3.setText("O");
           a[0][2]=2;
           i++;
           checkwin();
           if(comp==0)
               txtfield.setText("Player 1");
       }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        if(comp==1){
            dialogbox.setVisible(true);
        }
        else if(i%2==1){
           btn4.setText("X");
           a[1][0]=1;
           i++;
           checkwin();
           if(comp==0)
               txtfield.setText("Player 2");
       }else{
           btn4.setText("O");
           a[1][0]=2;
           i++;
           checkwin();
           if(comp==0)
               txtfield.setText("Player 1");
       }
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        if(comp==1){
            dialogbox.setVisible(true);
        }
        else if(i%2==1){
           btn5.setText("X");
           a[1][1]=1;
           i++;
           checkwin();
           if(comp==0)
               txtfield.setText("Player 2");
       }else{
           btn5.setText("O");
           a[1][1]=2;
           i++;
           checkwin();
           if(comp==0)
               txtfield.setText("Player 1");
       }
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        if(comp==1){
            dialogbox.setVisible(true);
        }
        else if(i%2==1){
           btn6.setText("X");
           a[1][2]=1;
           i++;
           checkwin();if(comp==0)
               txtfield.setText("Player 2");
       }else{
           btn6.setText("O");
           a[1][2]=2;
           i++;
           checkwin();
           if(comp==0)
               txtfield.setText("Player 1");
       }
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        if(comp==1){
            dialogbox.setVisible(true);
        }
        else if(i%2==1){
           btn7.setText("X");
           a[2][0]=1;
           i++;
           checkwin();
           if(comp==0)
               txtfield.setText("Player 2");
       }else{
           btn7.setText("O");
           a[2][0]=2;
           i++;
           checkwin();
           if(comp==0)
               txtfield.setText("Player 1");
       }
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        if(comp==1){
            dialogbox.setVisible(true);
        }
        else if(i%2==1){
           btn8.setText("X");
           a[2][1]=1;
           i++;
           checkwin();
           if(comp==0)
               txtfield.setText("Player 2");
       }else{
           btn8.setText("O");
           a[2][1]=2;
           i++;
           checkwin();
           if(comp==0)
               txtfield.setText("Player 1");
       }
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        if(comp==1){
            dialogbox.setVisible(true);
        }
        else if(i%2==1){
           btn9.setText("X");
           a[2][2]=1;
           i++;
           checkwin();
           if(comp==0)
               txtfield.setText("Player 2");
       }else{
           btn9.setText("O");
           a[2][2]=2;
           i++;
           checkwin();
           if(comp==0)
               txtfield.setText("Player 1");
       }
    }//GEN-LAST:event_btn9ActionPerformed

    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1ActionPerformed
        if(comp==1)
            dialogbox.setVisible(true);
        else{
            i=0;
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++)
                    a[j][k]=0;
            }
            btn1.setText("");
            btn2.setText("");
            btn3.setText("");
            btn4.setText("");
            btn5.setText("");
            btn6.setText("");
            btn7.setText("");
            btn8.setText("");
            btn9.setText("");
        }
    }//GEN-LAST:event_Button1ActionPerformed

    private void dbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dbtn1ActionPerformed
        i=1;
        comp=0;
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++)
                    a[j][k]=0;
            }
            btn1.setText("");
            btn2.setText("");
            btn3.setText("");
            btn4.setText("");
            btn5.setText("");
            btn6.setText("");
            btn7.setText("");
            btn8.setText("");
            btn9.setText("");
            txtfield.setText("Player 1");
            dialogbox.setVisible(false);
    }//GEN-LAST:event_dbtn1ActionPerformed

    private void dbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dbtn2ActionPerformed
        dialogbox.setVisible(false);
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_dbtn2ActionPerformed

    public void checkwin(){
        if(i>5){
            if (i>=10){
                txtfield.setText("Game Drawn !!");
                        i=100;
                        comp=1;
                         dialogbox.setVisible(true);
                        return;
            }
            for(int j=0;j<3;j++){
                if(a[j][0]==a[j][1] && a[j][0]==a[j][2] && (a[j][0]==1 || a[j][0]==2)){
                    if(a[j][0]==1){
                        txtfield.setText("Player 1 Won !!");
                        i=100;
                        comp=1;
                         dialogbox.setVisible(true);
                        return;
                    }
                    else if(a[j][0]==2){
                        txtfield.setText("Player 2 Won !!");
                        i=100;
                        comp=1;
                         dialogbox.setVisible(true);
                        return;
                    }
                }
            }
             for(int j=0;j<3;j++){
                if(a[0][j]==a[1][j] && a[0][j]==a[2][j] && (a[0][j]==1 || a[0][j]==2)){
                    if(a[0][j]==1){
                        txtfield.setText("Player 1 Won !!");
                        i=100;
                        comp=1;
                         dialogbox.setVisible(true);
                        return;
                    }
                    else if(a[0][j]==2){
                        txtfield.setText("Player 2 Won !!");
                        i=100;
                        comp=1;
                         dialogbox.setVisible(true);
                        return;
                    }
                }
            }
             if(a[0][0]==a[1][1] && a[0][0]==a[2][2] && (a[0][0]==1 || a[0][0]==2)){
                 if(a[0][0]==1){
                        txtfield.setText("Player 1 Won !!");
                        i=100;
                        comp=1;
                         dialogbox.setVisible(true);
                        return;
                    }
                    else if(a[0][0]==2){
                        txtfield.setText("Player 2 Won !!");
                        i=100;
                        comp=1;
                         dialogbox.setVisible(true);
                        return;
                    }
             }
             else if(a[0][2]==a[1][1] && a[0][2]==a[2][0] && (a[0][2]==1 || a[0][2]==2)){
                 if(a[0][2]==1){
                        txtfield.setText("Player 1 Won !!");
                        i=100;
                        comp=1;
                         dialogbox.setVisible(true);
                        return;
                    }
                    else if(a[0][2]==2){
                        txtfield.setText("Player 2 Won !!");
                        i=100;
                        comp=1;
                         dialogbox.setVisible(true);
                        return;
                    }
             }
        }
          
    }
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
            java.util.logging.Logger.getLogger(tictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tictactoe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button1;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JTextField dTextField1;
    private javax.swing.JButton dbtn1;
    private javax.swing.JButton dbtn2;
    private javax.swing.JDialog dialogbox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtfield;
    private javax.swing.JTextField txtfield1;
    private javax.swing.JTextField txtfield2;
    // End of variables declaration//GEN-END:variables
}
