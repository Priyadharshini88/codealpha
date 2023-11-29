
import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author admin
 */
public class qu extends javax.swing.JFrame {
String[] q={"1+1= ?","25+5= ?","100+400 =?","98+2= ?"};
 String[][] qu={{"70","25","40","2"},{"100","2","30","50"},{"20","2","30","500"},{"10","2","30","100"}};
   int i=0,c=0;
   ButtonGroup bg=new ButtonGroup();
   
    
   
   public qu() {
        initComponents();
        bg.add(o1);
                bg.add(o2);
                        bg.add(o3);
                                bg.add(o4);
        bActionPerformed(null);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        a = new javax.swing.JPanel();
        aa = new javax.swing.JLabel();
        o1 = new javax.swing.JRadioButton();
        o2 = new javax.swing.JRadioButton();
        o3 = new javax.swing.JRadioButton();
        o4 = new javax.swing.JRadioButton();
        b = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        a.setBackground(new java.awt.Color(204, 255, 255));

        aa.setText("jLabel1");

        javax.swing.GroupLayout aLayout = new javax.swing.GroupLayout(a);
        a.setLayout(aLayout);
        aLayout.setHorizontalGroup(
            aLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aLayout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(aa)
                .addContainerGap(281, Short.MAX_VALUE))
        );
        aLayout.setVerticalGroup(
            aLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(aa)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        o1.setText("jRadioButton1");
        o1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o1ActionPerformed(evt);
            }
        });

        o2.setText("jRadioButton2");
        o2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o2ActionPerformed(evt);
            }
        });

        o3.setText("jRadioButton3");
        o3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o3ActionPerformed(evt);
            }
        });

        o4.setText("jRadioButton4");
        o4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o4ActionPerformed(evt);
            }
        });

        b.setText("Next");
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(o4)
                            .addComponent(o3)
                            .addComponent(o2)
                            .addComponent(o1)
                            .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(b)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(o1)
                .addGap(31, 31, 31)
                .addComponent(o2)
                .addGap(35, 35, 35)
                .addComponent(o3)
                .addGap(30, 30, 30)
                .addComponent(o4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void geto(JRadioButton r){
       
        System.out.println(r.getText());
        System.out.println(qu[i][3]);
        if(r.getText().equals(qu[i][3])){
            
            c++;
            
        }
        i++;
        en(false);
    }
    public void en(boolean yon){
        o1.setEnabled(yon);
        o2.setEnabled(yon);        o3.setEnabled(yon);
        o4.setEnabled(yon);
    }

    private void bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActionPerformed
    if(b.getText().equals("Restart the quiz")){
     b.setText("Next");
      a.setBackground(new java.awt.Color(204, 255, 255));
        i=0;
     c=0;
     
 }
        if(i==q.length){
        aa.setText("Your score ="+ c +"/"+q.length);
        if(c>=(float)q.length){
            a.setBackground(Color.green);
        }else{
            
            a.setBackground(Color.red);
        }
        b.setText("Restart the quiz");
        }else{
        en(true);
        aa.setText(q[i]);
o1.setText(qu[i][0]);
o2.setText(qu[i][1]);
o3.setText(qu[i][2]);
o4.setText(qu[i][3]);   

if(i==q.length-1){
        b.setText("Finish");}
  
}
        bg.clearSelection();
    
// TODO add your handling code here:
    }//GEN-LAST:event_bActionPerformed

    private void o1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o1ActionPerformed

geto(o1);
    }//GEN-LAST:event_o1ActionPerformed

    private void o2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o2ActionPerformed
 geto(o2);       // TODO add your handling code here:
    }//GEN-LAST:event_o2ActionPerformed

    private void o3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o3ActionPerformed
     geto(o3);  // TODO add your handling code here:
    }//GEN-LAST:event_o3ActionPerformed

    private void o4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o4ActionPerformed
     geto(o4);  // TODO add your handling code here:
    }//GEN-LAST:event_o4ActionPerformed

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
            java.util.logging.Logger.getLogger(qu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(qu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(qu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(qu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new qu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel a;
    private javax.swing.JLabel aa;
    private javax.swing.JButton b;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton o1;
    private javax.swing.JRadioButton o2;
    private javax.swing.JRadioButton o3;
    private javax.swing.JRadioButton o4;
    // End of variables declaration//GEN-END:variables
}
