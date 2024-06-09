/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uas.fix;

import java.awt.*;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import uas.fix.Login;
import uas.fix.TesKoneksi;
/**
 *
 * @author NekoMorie
 */
public class TambahPasien extends javax.swing.JFrame {

    /**
     * Creates new form dashboard
     */
    public TambahPasien() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Dashboard = new javax.swing.JButton();
        User = new javax.swing.JButton();
        Pasien = new javax.swing.JButton();
        Penangan = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        Profile = new javax.swing.JButton();
        LogOut = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        nama = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        jurusan = new javax.swing.JLabel();
        no_wali = new javax.swing.JLabel();
        txtno_wali = new javax.swing.JTextField();
        jk = new javax.swing.JLabel();
        riwayat_penyakit = new javax.swing.JLabel();
        txtriwayat_penyakit = new javax.swing.JTextField();
        identitas = new javax.swing.JLabel();
        txtidentitas = new javax.swing.JTextField();
        no_telp = new javax.swing.JLabel();
        alamat = new javax.swing.JLabel();
        txtalamat = new javax.swing.JTextField();
        gol_darah = new javax.swing.JLabel();
        alergi_obat = new javax.swing.JLabel();
        txtalergi_obat = new javax.swing.JTextField();
        daftar = new javax.swing.JButton();
        jkcombo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        identitascombo = new javax.swing.JComboBox<>();
        combo_goldar = new javax.swing.JComboBox<>();
        combo_jurusan = new javax.swing.JComboBox<>();
        txtno_telp = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(204, 204, 204)));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/image/navbar.png"))); // NOI18N

        Dashboard.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/image/icon/dashboard_1.png"))); // NOI18N
        Dashboard.setText("Dashboard");
        Dashboard.setToolTipText("");
        Dashboard.setBorderPainted(false);
        Dashboard.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Dashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DashboardActionPerformed(evt);
            }
        });

        User.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        User.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/image/icon/user.png"))); // NOI18N
        User.setText("User");
        User.setBorderPainted(false);
        User.setContentAreaFilled(false);
        User.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserActionPerformed(evt);
            }
        });

        Pasien.setBackground(new java.awt.Color(184, 17, 17));
        Pasien.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Pasien.setForeground(new java.awt.Color(255, 255, 255));
        Pasien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/image/icon/pasien-active.png"))); // NOI18N
        Pasien.setText("Pasien");
        Pasien.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Pasien.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Pasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasienActionPerformed(evt);
            }
        });

        Penangan.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Penangan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/image/icon/penagan.png"))); // NOI18N
        Penangan.setText("Penangan");
        Penangan.setBorderPainted(false);
        Penangan.setContentAreaFilled(false);
        Penangan.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Penangan.setFocusPainted(false);
        Penangan.setFocusable(false);
        Penangan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Penangan.setRequestFocusEnabled(false);
        Penangan.setRolloverEnabled(false);
        Penangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PenanganActionPerformed(evt);
            }
        });

        Profile.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/image/icon/profile.png"))); // NOI18N
        Profile.setText("Profile");
        Profile.setBorderPainted(false);
        Profile.setContentAreaFilled(false);
        Profile.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfileActionPerformed(evt);
            }
        });

        LogOut.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        LogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/image/icon/logout.png"))); // NOI18N
        LogOut.setText("LogOut");
        LogOut.setBorderPainted(false);
        LogOut.setContentAreaFilled(false);
        LogOut.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Profile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Dashboard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(User, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pasien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Penangan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(69, 69, 69)
                .addComponent(Dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(User, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Pasien, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Penangan, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Profile, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 129, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(184, 17, 17));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jLabel2.setText("Pasien");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel3.setText("Copyright 2024 © Teknik Komputer Kampus UPI Cibiru All rights reserved.");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(377, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(274, 274, 274))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel3)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        nama.setText("Nama");

        txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaActionPerformed(evt);
            }
        });

        jurusan.setText("No Telepon");

        no_wali.setText("No Telepon Wali");

        jk.setText("Jenis Kelamin");

        riwayat_penyakit.setText("Riwayat Penyakit ");

        identitas.setText("No Identitas");

        txtidentitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidentitasActionPerformed(evt);
            }
        });

        no_telp.setText("Jurusan/Jabatan");

        alamat.setText("Alamat");

        gol_darah.setText("Golongan Darah");

        alergi_obat.setText("Alergi Obat");

        daftar.setBackground(new java.awt.Color(132, 17, 17));
        daftar.setForeground(new java.awt.Color(255, 255, 255));
        daftar.setText("Daftar");
        daftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarActionPerformed(evt);
            }
        });

        jkcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Perempuan", "Laki-Laki", "Tidak Disebutkan", " " }));

        jLabel4.setText("Identitas");

        identitascombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mahasiswa", "Civitas", " " }));

        combo_goldar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Golongan Darah", "A", "B", "O", "AB" }));

        combo_jurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "PGSD", "PGPAUD", "PMM", "RPL", "TEKKOM", "Dosen", "Tendik", " " }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(txtno_telp, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(137, 137, 137)
                                        .addComponent(combo_jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(13, 13, 13)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtnama)
                                                        .addComponent(txtno_wali)
                                                        .addComponent(txtriwayat_penyakit, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                                                        .addComponent(jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(no_wali, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(riwayat_penyakit, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(139, 139, 139))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(12, 12, 12)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jkcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jk, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(identitascombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(225, 225, 225)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(13, 13, 13)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel2)
                                                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(430, 430, 430)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(identitas, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtidentitas)
                                                .addComponent(txtalamat)
                                                .addComponent(txtalergi_obat, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                                                .addComponent(no_telp, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(gol_darah, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(alergi_obat, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(combo_goldar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(416, 416, 416)
                        .addComponent(daftar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nama)
                    .addComponent(identitas))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtidentitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jurusan)
                    .addComponent(no_telp))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtno_telp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(no_wali)
                    .addComponent(alamat))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtno_wali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtalamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jk)
                    .addComponent(gol_darah)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jkcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(identitascombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_goldar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(riwayat_penyakit)
                    .addComponent(alergi_obat))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtriwayat_penyakit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtalergi_obat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(daftar)
                .addGap(39, 39, 39)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    private void DashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DashboardActionPerformed
        dashboard back = new dashboard();
        back.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DashboardActionPerformed

    private void UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserActionPerformed
        users users = new users();
        users.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_UserActionPerformed

    private void PasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasienActionPerformed
        // TODO add your handling code here:
        TambahPasien Pasien = new TambahPasien();
        Pasien.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_PasienActionPerformed

    private void PenanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PenanganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PenanganActionPerformed

    private void ProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProfileActionPerformed

    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutActionPerformed
        Login Login = new Login();
        Login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogOutActionPerformed

    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamaActionPerformed

    private void txtidentitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidentitasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidentitasActionPerformed

    private void daftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarActionPerformed
        // TODO add your handling code here:
        String nama = txtnama.getText();
        String jurusan = (String) combo_jurusan.getSelectedItem();
        String no_wali = txtno_wali.getText();
        String jk = (String)jkcombo.getSelectedItem();
        String identitas = (String)identitascombo.getSelectedItem();  
        String riwayat_penyakit = txtriwayat_penyakit.getText();
        String NoIdentitas = txtidentitas.getText();
        String no_telp = txtno_telp.getText();
        String alamat = txtalamat.getText();
        String gol_darah = (String) combo_goldar.getSelectedItem();
        String alergi_obat = txtalergi_obat.getText();
        
        if (nama.isEmpty() || jurusan.isEmpty() || no_wali.isEmpty() || jk.isEmpty() || riwayat_penyakit.isEmpty() || NoIdentitas.isEmpty() || no_telp.isEmpty() || alamat.isEmpty() || gol_darah.isEmpty() || alergi_obat.isEmpty()){
            JOptionPane.showMessageDialog(this, "Semua harus diisi", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try (Connection conn = TesKoneksi.configDB()){
                String sql = "INSERT INTO pasien (nama, jurusan, no_wali, riwayat_penyakit, jk, identitas, NoIdentitas, no_telp, alamat, gol_darah, alergi_obat) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement statement = conn.prepareStatement(sql);
                statement.setString(1, nama);
                statement.setString(2, jurusan);
                statement.setString(3, no_wali);
                statement.setString(4, jk);
                statement.setString(5, identitas);
                statement.setString(6, riwayat_penyakit);
                statement.setString(7, NoIdentitas);
                statement.setString(8, no_telp);
                statement.setString(9, alamat);
                statement.setString(10, gol_darah);
                statement.setString(11, alergi_obat);
                
                int rowsInserted = statement.executeUpdate();
                if (rowsInserted > 0) {
                    JOptionPane.showMessageDialog(this, "Pasien berhasil ditambahkan!");
                    
                }
                Pasien Back = new Pasien();
                Back.setVisible(true);
                this.dispose();
            }catch (Exception e) {
                 e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat menambah data pasien", "Error", JOptionPane.ERROR_MESSAGE);
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
    }//GEN-LAST:event_daftarActionPerformed

    /**
     * @param args the command line arguments
     */
    
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TambahPasien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Dashboard;
    private javax.swing.JButton LogOut;
    private javax.swing.JButton Pasien;
    private javax.swing.JButton Penangan;
    private javax.swing.JButton Profile;
    private javax.swing.JButton User;
    private javax.swing.JLabel alamat;
    private javax.swing.JLabel alergi_obat;
    private javax.swing.JComboBox<String> combo_goldar;
    private javax.swing.JComboBox<String> combo_jurusan;
    private javax.swing.JButton daftar;
    private javax.swing.JLabel gol_darah;
    private javax.swing.JLabel identitas;
    private javax.swing.JComboBox<String> identitascombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jk;
    private javax.swing.JComboBox<String> jkcombo;
    private javax.swing.JLabel jurusan;
    private javax.swing.JLabel nama;
    private javax.swing.JLabel no_telp;
    private javax.swing.JLabel no_wali;
    private javax.swing.JLabel riwayat_penyakit;
    private javax.swing.JTextField txtalamat;
    private javax.swing.JTextField txtalergi_obat;
    private javax.swing.JTextField txtidentitas;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtno_telp;
    private javax.swing.JTextField txtno_wali;
    private javax.swing.JTextField txtriwayat_penyakit;
    // End of variables declaration//GEN-END:variables
}