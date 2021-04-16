package ittapiros;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

public class GUI extends javax.swing.JFrame {

    public GUI() {
        golyoUjHelyreKerul();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPohar1 = new javax.swing.JButton();
        btnPohar3 = new javax.swing.JButton();
        btnPohar2 = new javax.swing.JButton();
        lblVisszjelzes = new javax.swing.JLabel();
        cbxUjHely = new javax.swing.JCheckBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuFajl = new javax.swing.JMenu();
        mnuMentes = new javax.swing.JMenuItem();
        mnuBetolt = new javax.swing.JMenuItem();
        mnuJatek = new javax.swing.JMenu();
        mnuUjJatek = new javax.swing.JMenuItem();
        mnu3Pohar = new javax.swing.JMenuItem();
        mnu4Pohar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Itt a piros...");

        btnPohar1.setText("Pohár 1");
        btnPohar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPohar1ActionPerformed(evt);
            }
        });

        btnPohar3.setText("Pohár 3");
        btnPohar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPohar3ActionPerformed(evt);
            }
        });

        btnPohar2.setText("Pohár 2");
        btnPohar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPohar2ActionPerformed(evt);
            }
        });

        lblVisszjelzes.setText("Válassz egy poharat!");

        cbxUjHely.setText("Új helyre rakja a golyót");

        mnuFajl.setText("Fájl");

        mnuMentes.setText("Mentés");
        mnuMentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMentesActionPerformed(evt);
            }
        });
        mnuFajl.add(mnuMentes);

        mnuBetolt.setText("Betöltés");
        mnuBetolt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuBetoltActionPerformed(evt);
            }
        });
        mnuFajl.add(mnuBetolt);

        jMenuBar1.add(mnuFajl);

        mnuJatek.setText("Játék");

        mnuUjJatek.setText("Új Játék");
        mnuUjJatek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuUjJatekActionPerformed(evt);
            }
        });
        mnuJatek.add(mnuUjJatek);

        mnu3Pohar.setText("3 pohár");
        mnuJatek.add(mnu3Pohar);

        mnu4Pohar.setText("4 pohár");
        mnu4Pohar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu4PoharActionPerformed(evt);
            }
        });
        mnuJatek.add(mnu4Pohar);

        jMenuBar1.add(mnuJatek);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblVisszjelzes)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPohar1)
                                .addGap(30, 30, 30)
                                .addComponent(btnPohar2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addComponent(btnPohar3)))
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbxUjHely)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblVisszjelzes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxUjHely)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPohar1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPohar3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPohar2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private int joPohar = 0;
    private boolean megtalalta = false;
    private void mnu4PoharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu4PoharActionPerformed
        JOptionPane.showMessageDialog(mnu4Pohar,"Ez a mód még nem elérhető!");
    }//GEN-LAST:event_mnu4PoharActionPerformed

    private void mnuUjJatekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuUjJatekActionPerformed
        golyoUjHelyreKerul();
    }//GEN-LAST:event_mnuUjJatekActionPerformed

    private void btnPohar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPohar1ActionPerformed
        talaltE(1);
    }//GEN-LAST:event_btnPohar1ActionPerformed

    private void btnPohar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPohar2ActionPerformed
        talaltE(2);
    }//GEN-LAST:event_btnPohar2ActionPerformed

    private void btnPohar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPohar3ActionPerformed
        talaltE(3);
    }//GEN-LAST:event_btnPohar3ActionPerformed

    private void mnuMentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMentesActionPerformed
        StringBuilder sb = new StringBuilder();
        sb.append(joPohar + ";");
        sb.append(megtalalta + ";");
        sb.append(cbxUjHely.isSelected());
        try {
            Files.write(Paths.get("config.bin"), sb.toString().getBytes());
            System.out.println("Sikeres mentés a config.bin fájlba... ");
        } 
        catch (IOException ex) {
            System.out.println("Sikertelen mentés...");
        }
    }//GEN-LAST:event_mnuMentesActionPerformed

    private void mnuBetoltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuBetoltActionPerformed
        try {
            List<String> sorok = Files.readAllLines(Paths.get("config.bin"));
            int N = sorok.size();
            for (String sor : sorok) {
                String[] s = sor.split(";");
                joPohar = Integer.parseInt(s[0]);
                megtalalta = Boolean.parseBoolean(s[1]);
                cbxUjHely.setSelected(Boolean.parseBoolean(s[2]));
            }
            System.out.println(joPohar + " " + megtalalta);
            System.out.println("Sikeres betöltés...");
        } catch (IOException ex) {
            System.out.println("Sikertelen betöltés...");
        }
    }//GEN-LAST:event_mnuBetoltActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPohar1;
    private javax.swing.JButton btnPohar2;
    private javax.swing.JButton btnPohar3;
    private javax.swing.JCheckBox cbxUjHely;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblVisszjelzes;
    private javax.swing.JMenuItem mnu3Pohar;
    private javax.swing.JMenuItem mnu4Pohar;
    private javax.swing.JMenuItem mnuBetolt;
    private javax.swing.JMenu mnuFajl;
    private javax.swing.JMenu mnuJatek;
    private javax.swing.JMenuItem mnuMentes;
    private javax.swing.JMenuItem mnuUjJatek;
    // End of variables declaration//GEN-END:variables

    private void golyoUjHelyreKerul() {
        megtalalta = false;
        Random rnd = new Random();
        joPohar = rnd.nextInt(3)+1;
        System.out.println(joPohar);
    }

    private void talaltE(int pohar) {
        if (pohar == joPohar) {
            lblVisszjelzes.setText("Itt volt a piros!");
            golyoUjHelyreKerul();
            megtalalta = true;
        }
        else {
            lblVisszjelzes.setText("Nem talált próbáld újra!");
        }
        if (cbxUjHely.isSelected()) {
            golyoUjHelyreKerul();
        }
    }
}
