/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ttt;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Mohamed
 */
public class game extends javax.swing.JFrame {

    /**
     * Creates new form game
     */
    public game() {
        JOptionPane.showMessageDialog(null, "X player starting each game");
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        x_name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        o_name = new javax.swing.JTextField();
        btn_start = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        x_score = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        o_score = new javax.swing.JLabel();
        btn_reset = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        winner = new javax.swing.JLabel();
        turns = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Tic-Toc-Toe");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Player X :");

        x_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                x_nameKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Player O :");

        o_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                o_nameKeyPressed(evt);
            }
        });

        btn_start.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_start.setText("Start Game");
        btn_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_startActionPerformed(evt);
            }
        });

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("X Score :");

        x_score.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        x_score.setText("0");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("O Score :");

        o_score.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        o_score.setText("0");

        btn_reset.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        btn_exit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_exit.setText("Exit");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });

        winner.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        turns.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(73, 73, 73)
                                    .addComponent(jLabel1))
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(x_name))
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(o_name, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(btn_start))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(turns)))
                        .addGap(0, 48, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_reset)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_exit))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(x_score))
                                    .addComponent(winner)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(o_score)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(x_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(o_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_start)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(turns)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(x_score))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(o_score))
                .addGap(18, 18, 18)
                .addComponent(winner)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_reset)
                    .addComponent(btn_exit))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int counter = 1;

    private void start() {
        String x = x_name.getText();
        String o = o_name.getText();
        if (x.equals("") || o.equals("")) {
            tbl.setEnabled(false);
            JOptionPane.showMessageDialog(null, "Write names for 2 players before starting game");
        } else {
            tbl.setEnabled(true);
            jLabel4.setText(x + "'s Score : ");
            jLabel5.setText(o + "'s Score : ");
        }
        clear(tbl);
    }

    private String won(JTable tbl) {
        String[] arr = new String[3];
        int col = tbl.getSelectedColumn();
        int row = tbl.getSelectedRow();

        //clear(arr);
        //won with rows
        for (int i = 0; i < tbl.getModel().getRowCount(); i++) {
            if (tbl.getModel().getValueAt(i, col) != null) {
                arr[i] = tbl.getModel().getValueAt(i, col).toString();
            }
        }
        if (!(arr[0] == null || arr[1] == null || arr[2] == null)) {
            if (arr[0].equals(arr[1]) && arr[1].equals(arr[2])) {
                //winner.setText(arr[0] + " is winner");
                if (arr[0].equals("X")) {
                    //JOptionPane.showMessageDialog(null, x_name.getText() + " is winner");
                    winner.setText(x_name.getText() + " is winner");
                    counter = 10;
                    turns.setText("");
                } else if (arr[0].equals("O")) {
                    //JOptionPane.showMessageDialog(null, o_name.getText() + " is winner");
                    winner.setText(o_name.getText() + " is winner");
                    counter = 10;
                    turns.setText("");
                }
                return arr[2];
            }
            //clear(arr);
        }

        //won with column
        for (int i = 0; i < tbl.getModel().getColumnCount(); i++) {
            if (tbl.getModel().getValueAt(row, i) != null) {
                arr[i] = tbl.getModel().getValueAt(row, i).toString();
            }
        }
        if (!(arr[0] == null || arr[1] == null || arr[2] == null)) {
            if (arr[0].equals(arr[1]) && arr[1].equals(arr[2])) {
                if (arr[0].equals("X")) {
                    //JOptionPane.showMessageDialog(null, x_name.getText() + " is winner");
                    winner.setText(x_name.getText() + " is winner");

                    counter = 10;
                    turns.setText("");
                } else if (arr[0].equals("O")) {
                    //JOptionPane.showMessageDialog(null, o_name.getText() + " is winner");
                    winner.setText(o_name.getText() + " is winner");

                    counter = 10;
                    turns.setText("");
                }
                return arr[2];
            }
            //clear(arr);
        }

        //won with diagonal
        if (tbl.getModel().getValueAt(0, 0) == tbl.getModel().getValueAt(1, 1) && tbl.getModel().getValueAt(1, 1) == tbl.getModel().getValueAt(2, 2)
                && tbl.getModel().getValueAt(0, 0) != null && tbl.getModel().getValueAt(1, 1) != null && tbl.getModel().getValueAt(2, 2) != null) {
            arr[0] = tbl.getModel().getValueAt(0, 0).toString();
            arr[1] = tbl.getModel().getValueAt(1, 1).toString();
            arr[2] = tbl.getModel().getValueAt(2, 2).toString();
        }
        if (!(arr[0] == null || arr[1] == null || arr[2] == null)) {
            if (arr[0].equals(arr[1]) && arr[1].equals(arr[2])) {
                if (arr[0].equals("X")) {
                    //JOptionPane.showMessageDialog(null, x_name.getText() + " is winner");
                    winner.setText(x_name.getText() + " is winner");

                    counter = 10;
                    turns.setText("");
                } else if (arr[0].equals("O")) {
                    //JOptionPane.showMessageDialog(null, o_name.getText() + " is winner");
                    winner.setText(o_name.getText() + " is winner");

                    counter = 10;
                    turns.setText("");

                }
                return arr[2];
            }
            //clear(arr);
        }

        if (tbl.getModel().getValueAt(2, 0) == tbl.getModel().getValueAt(1, 1) && tbl.getModel().getValueAt(1, 1) == tbl.getModel().getValueAt(0, 2)
                && tbl.getModel().getValueAt(2, 0) != null && tbl.getModel().getValueAt(1, 1) != null && tbl.getModel().getValueAt(0, 2) != null) {
            arr[0] = tbl.getModel().getValueAt(2, 0).toString();
            arr[1] = tbl.getModel().getValueAt(1, 1).toString();
            arr[2] = tbl.getModel().getValueAt(0, 2).toString();
        }
        if (!(arr[0] == null || arr[1] == null || arr[2] == null)) {
            if (arr[0].equals(arr[1]) && arr[1].equals(arr[2])) {
                if (arr[0].equals("X")) {
                    //JOptionPane.showMessageDialog(null, x_name.getText() + " is winner");
                    winner.setText(x_name.getText() + " is winner");

                    counter = 10;
                    turns.setText("");
                } else if (arr[0].equals("O")) {
                    //JOptionPane.showMessageDialog(null, o_name.getText() + " is winner");
                    winner.setText(o_name.getText() + " is winner");

                    counter = 10;
                    turns.setText("");
                }
                return arr[2];
            }
            //clear(arr);
        }
        return "";
    }

    private void clear(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = null;
        }
    }

    private void clear(JTable tbl) {
        for (int i = 0; i < tbl.getModel().getRowCount(); i++) {
            for (int j = 0; j < tbl.getModel().getColumnCount(); j++) {
                tbl.setValueAt("", i, j);
                counter = 1;
            }
        }
    }

    private void x_nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_x_nameKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (o_name.getText().equals("")) {
                o_name.requestFocus();
            } else {
                start();
            }
        }
    }//GEN-LAST:event_x_nameKeyPressed

    private void o_nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_o_nameKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            start();
        }
    }//GEN-LAST:event_o_nameKeyPressed

    private void btn_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_startActionPerformed
        // TODO add your handling code here:
        start();
    }//GEN-LAST:event_btn_startActionPerformed

    private void tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMouseClicked
        // TODO add your handling code here:
        int row = tbl.getSelectedRow();
        int col = tbl.getSelectedColumn();
        int x = Integer.parseInt(x_score.getText());
        int o = Integer.parseInt(o_score.getText());
        //

        if (tbl.getModel().getValueAt(row, col).equals("X")) {
            JOptionPane.showMessageDialog(null, "Cell already taken");
                     
            tbl.setValueAt("X", row, col);
        } else if (tbl.getModel().getValueAt(row, col).equals("O")) {
            JOptionPane.showMessageDialog(null, "Cell already taken");
                     
            tbl.setValueAt("O", row, col);
        } else {
            if (counter % 2 != 0) {
                ++counter;
                tbl.setValueAt("X", row, col);
                won(tbl);
                if (counter == 10) {
                    turns.setText("it's " + x_name.getText() + " turn's");
                } else {
                    turns.setText("it's " + o_name.getText() + " turn's");
                }
            } else {
                ++counter;
                tbl.setValueAt("O", row, col);
                //++counter;
                won(tbl);
                turns.setText("it's " + x_name.getText() + " turn's");
            }
            System.out.println(counter);
        }

        if (!winner.getText().equals("") && counter == 10 && !won(tbl).equals("")) {
            String won = winner.getText();
            if (won.contains(x_name.getText())) {
                x++;
                x_score.setText(x + "");
                clear(tbl);
                counter = 1;
            } else if (won.contains(o_name.getText())) {
                o++;
                o_score.setText(o + "");
                clear(tbl);
                counter = 1;
            } else {
                winner.setText("");
            }
        } else if (counter == 10 && won(tbl).equals("")) {
            String msg = "Draw\n" + x_name.getText() + "'s score is " + x_score.getText()
                    + "\n" + o_name.getText() + "'s score is " + o_score.getText();
            JOptionPane.showMessageDialog(null, msg);
            clear(tbl);
        }
    }//GEN-LAST:event_tblMouseClicked

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        // TODO add your handling code here:
        o_score.setText(0 + "");
        x_score.setText(0 + "");
        o_name.setText("");
        x_name.setText("");
        clear(tbl);
        winner.setText("");
        jLabel4.setText("X Score : ");
        jLabel5.setText("O Score : ");
        counter = 1;
        tbl.setEnabled(false);
        x_name.requestFocus();
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        // TODO add your handling code here:
        int x = Integer.parseInt(x_score.getText());
        int o = Integer.parseInt(o_score.getText());
        int confirm = 5;
        if (x > o) {
            confirm = JOptionPane.showConfirmDialog(null, x_name.getText() + " has high score than " + o_name.getText()
                    + "\nare you sure you want to exit this game");
        } else if (o > x) {
            confirm = JOptionPane.showConfirmDialog(null, o_name.getText() + " has high score than " + x_name.getText()
                    + "\nare you sure you want to exit this game");
        } else {
            System.exit(0);
        }
        if (confirm == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btn_exitActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        tbl.setEnabled(false);
        tbl.getTableHeader().setReorderingAllowed(false);
        winner.setText("");
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_start;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField o_name;
    private javax.swing.JLabel o_score;
    private javax.swing.JTable tbl;
    private javax.swing.JLabel turns;
    private javax.swing.JLabel winner;
    private javax.swing.JTextField x_name;
    private javax.swing.JLabel x_score;
    // End of variables declaration//GEN-END:variables
}
