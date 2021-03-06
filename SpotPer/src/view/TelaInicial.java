/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Faixa;
import controller.DbConnection;
import controller.FaixaController;

import java.awt.Color;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
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

        panel1 = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();
        labelNovaPlaylist = new javax.swing.JLabel();
        menuAlbum1 = new javax.swing.JLabel();
        menuPlaylist1 = new javax.swing.JLabel();
        titulo1 = new javax.swing.JLabel();
        menuAlbum = new javax.swing.JLabel();
        menuPlaylist = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setBackground(new java.awt.Color(120, 0, 0));

        panel2.setBackground(new java.awt.Color(120, 0, 0));

        titulo1.setFont(new java.awt.Font("MV Boli", 0, 36)); // NOI18N
        titulo1.setForeground(new java.awt.Color(255, 255, 255));
        titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo1.setText("FBD - spotper");

        menuAlbum1.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        menuAlbum1.setForeground(new java.awt.Color(155, 155, 155));
        menuAlbum1.setText("Álbuns");
        menuAlbum1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAlbum1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuAlbum1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuAlbum1MouseExited(evt);
            }
        });

        menuPlaylist1.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        menuPlaylist1.setForeground(new java.awt.Color(155, 155, 155));
        menuPlaylist1.setText("Playlists");
        menuPlaylist1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuPlaylist1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuPlaylist1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuPlaylist1MouseExited(evt);
            }
        });

        labelNovaPlaylist.setFont(new java.awt.Font("MV Boli", 0, 16)); // NOI18N
        labelNovaPlaylist.setForeground(new java.awt.Color(155, 155, 155));
        labelNovaPlaylist.setText("+ Nova Playlist");
        labelNovaPlaylist.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        labelNovaPlaylist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelNovaPlaylistMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelNovaPlaylistMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelNovaPlaylistMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titulo1, javax.swing.GroupLayout.DEFAULT_SIZE, 829, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(173, 173, 173)
                                .addComponent(menuPlaylist1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(186, 186, 186)
                                .addComponent(menuAlbum1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addComponent(labelNovaPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(titulo1)
                .addGap(94, 94, 94)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuPlaylist1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuAlbum1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNovaPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(190, Short.MAX_VALUE))
        );

        menuAlbum.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        menuAlbum.setForeground(new java.awt.Color(155, 155, 155));
        menuAlbum.setText("Álbuns");
        menuAlbum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAlbumMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuAlbumMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuAlbumMouseExited(evt);
            }
        });

        menuPlaylist.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        menuPlaylist.setForeground(new java.awt.Color(155, 155, 155));
        menuPlaylist.setText("Playlists");
        menuPlaylist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuPlaylistMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuPlaylistMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuPlaylistMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(menuAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menuPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelNovaPlaylistMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelNovaPlaylistMouseExited
        Color gray = new Color(155, 155, 155);
        labelNovaPlaylist.setForeground(gray);
    }//GEN-LAST:event_labelNovaPlaylistMouseExited

    private void labelNovaPlaylistMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelNovaPlaylistMouseEntered
        labelNovaPlaylist.setForeground(Color.WHITE);
    }//GEN-LAST:event_labelNovaPlaylistMouseEntered

    private void labelNovaPlaylistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelNovaPlaylistMouseClicked
        new CriarPlaylist(this).setVisible(true);
        dispose();
    }//GEN-LAST:event_labelNovaPlaylistMouseClicked

    private void menuPlaylistMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPlaylistMouseExited
        Color gray = new Color(155, 155, 155);
        menuPlaylist.setForeground(gray);
    }//GEN-LAST:event_menuPlaylistMouseExited

    private void menuPlaylistMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPlaylistMouseEntered
        menuPlaylist.setForeground(Color.WHITE);
    }//GEN-LAST:event_menuPlaylistMouseEntered

    private void menuPlaylistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPlaylistMouseClicked
        new MostrarPlaylist().setVisible(true);
        dispose();
    }//GEN-LAST:event_menuPlaylistMouseClicked

    private void menuAlbumMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAlbumMouseExited
        Color gray = new Color(155, 155, 155);
        menuAlbum.setForeground(gray);
    }//GEN-LAST:event_menuAlbumMouseExited

    private void menuAlbumMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAlbumMouseEntered
        menuAlbum.setForeground(Color.WHITE);
    }//GEN-LAST:event_menuAlbumMouseEntered

    private void menuAlbumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAlbumMouseClicked
        new MostrarAlbum().setVisible(true);
        dispose();
    }//GEN-LAST:event_menuAlbumMouseClicked

    private void menuPlaylist1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPlaylist1MouseExited
        Color gray = new Color(155, 155, 155);
        menuPlaylist1.setForeground(gray);
    }//GEN-LAST:event_menuPlaylist1MouseExited

    private void menuPlaylist1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPlaylist1MouseEntered
        menuPlaylist1.setForeground(Color.WHITE);
    }//GEN-LAST:event_menuPlaylist1MouseEntered

    private void menuPlaylist1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPlaylist1MouseClicked
        new MostrarPlaylist().setVisible(true);
        dispose();
    }//GEN-LAST:event_menuPlaylist1MouseClicked

    private void menuAlbum1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAlbum1MouseExited
        Color gray = new Color(155, 155, 155);
        menuAlbum1.setForeground(gray);
    }//GEN-LAST:event_menuAlbum1MouseExited

    private void menuAlbum1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAlbum1MouseEntered
        menuAlbum1.setForeground(Color.WHITE);
    }//GEN-LAST:event_menuAlbum1MouseEntered

    private void menuAlbum1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAlbum1MouseClicked

        new MostrarAlbum().setVisible(true);
        dispose();
    }//GEN-LAST:event_menuAlbum1MouseClicked

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JLabel labelNovaPlaylist;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel menuAlbum;
    private javax.swing.JLabel menuAlbum1;
    private javax.swing.JLabel menuPlaylist;
    private javax.swing.JLabel menuPlaylist1;
    // End of variables declaration//GEN-END:variables
}
