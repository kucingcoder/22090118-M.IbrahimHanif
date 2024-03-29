package com.m.ibrahimhanif.View;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.intellijthemes.FlatArcOrangeIJTheme;
import com.m.ibrahimhanif.Controller.data_adapter;
import java.util.Collections;
import javax.swing.JOptionPane;

public class main extends javax.swing.JFrame {

    public main() {
        initComponents();
        FlatLaf.setGlobalExtraDefaults( Collections.singletonMap( "@accentColor", "#F18805" ) );
        FlatArcOrangeIJTheme.setup();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Assets/icon.png")).getImage());
        try {
            data_adapter.MuatPengaturan();
            autentikasi login = new autentikasi();
            konten.add(login);
            login.setVisible(true);
        } catch (Exception e) {
            if ("pengaturan.json".equals(e.getMessage())) {
                setup setup = new setup();
                konten.add(setup);
                setup.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Sistem Gagal", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }
        }
    }
    
    public static void dashboard(){
        dashboard kerja = new dashboard();
        konten.add(kerja);
        kerja.setVisible(true);
    }
    
    public static void auth(){
        autentikasi kerja = new autentikasi();
        konten.add(kerja);
        kerja.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        konten = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Parkirin");
        setBackground(new java.awt.Color(255, 255, 255));
        setFocusTraversalPolicyProvider(true);
        setMinimumSize(new java.awt.Dimension(920, 640));
        setName("halaman_utama"); // NOI18N
        setPreferredSize(new java.awt.Dimension(920, 640));
        setSize(new java.awt.Dimension(920, 640));

        konten.setBackground(new java.awt.Color(253, 255, 252));
        konten.setAlignmentX(0.0F);
        konten.setAlignmentY(0.0F);
        konten.setMinimumSize(new java.awt.Dimension(900, 600));

        javax.swing.GroupLayout kontenLayout = new javax.swing.GroupLayout(konten);
        konten.setLayout(kontenLayout);
        kontenLayout.setHorizontalGroup(
            kontenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 920, Short.MAX_VALUE)
        );
        kontenLayout.setVerticalGroup(
            kontenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(konten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(konten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            main main = new main();
            main.setLocationRelativeTo(null);
            main.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JDesktopPane konten;
    // End of variables declaration//GEN-END:variables
}