/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uas.fix;
import java.awt.*;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
/**
 *
 * @author NekoMorie
 */
public class Pasien extends javax.swing.JFrame {
    private String no_identitas;
    private String coba;
   

    /**
     * Creates new form dashboard
     */
    
    public Pasien() {
        initComponents();
        tampil_table();
       
        
        tbl_pasien.getTableHeader().setFont (new Font("Segoe UI", Font.BOLD, 12));
        tbl_pasien.getTableHeader().setOpaque(false);
        tbl_pasien.getTableHeader().setBackground (new Color(236, 171, 171));
        tbl_pasien.getTableHeader().setForeground (new Color(255,255,255));
        tbl_pasien.setRowHeight(25);
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
        tambah = new javax.swing.JButton();
        layar1 = new javax.swing.JDesktopPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_pasien = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        cari = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(204, 204, 204)));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/image/navbar.png"))); // NOI18N

        Dashboard.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/image/icon/dashboard_1.png"))); // NOI18N
        Dashboard.setText("Dashboard");
        Dashboard.setBorder(null);
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
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Profile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(User, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pasien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Penangan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
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
                .addGap(0, 437, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        tambah.setBackground(new java.awt.Color(132, 17, 17));
        tambah.setForeground(new java.awt.Color(255, 255, 255));
        tambah.setText("Tambah Pasien");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });

        layar1.setBackground(new java.awt.Color(255, 255, 255));
        layar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tbl_pasien.setAutoCreateRowSorter(true);
        tbl_pasien.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        tbl_pasien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "Nama", "No Identitas", "Identitas", "Jurusan", "Telepon", "Penyakit", "GolDarah", "Alergi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_pasien.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbl_pasien.setDragEnabled(true);
        tbl_pasien.setEnabled(false);
        tbl_pasien.setFocusTraversalPolicyProvider(true);
        tbl_pasien.setGridColor(new java.awt.Color(255, 255, 255));
        tbl_pasien.setName(""); // NOI18N
        tbl_pasien.setRowHeight(25);
        tbl_pasien.setSelectionBackground(new java.awt.Color(236, 171, 171));
        tbl_pasien.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tbl_pasien.setShowGrid(false);
        tbl_pasien.setShowVerticalLines(true);
        tbl_pasien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_pasienMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_pasien);
        if (tbl_pasien.getColumnModel().getColumnCount() > 0) {
            tbl_pasien.getColumnModel().getColumn(0).setMinWidth(0);
            tbl_pasien.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        layar1.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layar1Layout = new javax.swing.GroupLayout(layar1);
        layar1.setLayout(layar1Layout);
        layar1Layout.setHorizontalGroup(
            layar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1004, Short.MAX_VALUE)
            .addGroup(layar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layar1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 992, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layar1Layout.setVerticalGroup(
            layar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 483, Short.MAX_VALUE)
            .addGroup(layar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layar1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        cari.setBackground(new java.awt.Color(132, 17, 17));
        cari.setForeground(new java.awt.Color(255, 255, 255));
        cari.setText("Cari Pasien");
        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });

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
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(tambah)
                                .addGap(18, 18, 18)
                                .addComponent(cari)
                                .addGap(210, 210, 210))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(layar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(1004, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel2)
                        .addGap(136, 136, 136)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(108, 108, 108)
                        .addComponent(layar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tambah)
                            .addComponent(cari))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String coba(String no_identitas){
        return no_identitas;
    }
    private void tampil_table()
    {
        DefaultTableModel tb = new DefaultTableModel();
        tb.addColumn("No");
        tb.addColumn("Nama");
        tb.addColumn("No Identitas");
        tb.addColumn ("Identitas");
        tb.addColumn("Jurusan");
        tb.addColumn("No Telepon");
        tb.addColumn("Penyakit");
        
        
        try {
          int counter = 1;
          String query = "SELECT * FROM pasien" ;
          
            java.sql.Connection configDB = (java.sql.Connection)TesKoneksi.configDB();
            
            java.sql.Statement s = configDB.createStatement();
            
            java.sql.ResultSet r = s.executeQuery(query);
            
            while (r.next()) {
                tb.addRow(new Object[]{
                    counter++,
                    r.getString("nama"),
                    r.getString("NoIdentitas"),
                    r.getString("Identitas"),
                    r.getString("jurusan"),
                    r.getString("no_telp"),
                    r.getString("riwayat_penyakit")
                });
            }
            tbl_pasien.setModel(tb);
            String noIdentitas = r.getString("NoIdentitas");
                    jLabel4.setText("isi");

            coba(noIdentitas);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
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
        Pasien Pasien = new Pasien();
        Pasien.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_PasienActionPerformed

    private void PenanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PenanganActionPerformed
        Obat obat = new Obat();
        obat.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_PenanganActionPerformed

    private void ProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProfileActionPerformed

    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutActionPerformed
        Login Login = new Login();
        Login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogOutActionPerformed

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        // TODO add your handling code here:
        TambahPasien tambahPasien = new TambahPasien();
        tambahPasien.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tambahActionPerformed
    
    
    
    private void tbl_pasienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_pasienMouseClicked
//        String isi = coba();
        int baris = tbl_pasien.rowAtPoint(evt.getPoint());
        
        
        String no_idenitas = tbl_pasien.getValueAt(baris, 1).toString();
        LihatPasien LP = new LihatPasien();
        layar1.add(LP);
        LP.setVisible(true);
        
        TableModel tm = tbl_pasien.getModel();
        
        String nama = tm.getValueAt(baris, 1).toString();
        String NoIdentitas = tm.getValueAt(baris, 2).toString();    
        String identitas= tm.getValueAt(baris, 3).toString();
        String jurusan = tm.getValueAt(baris, 4).toString();
        String no_telp = tm.getValueAt(baris, 5).toString();
        String riwayat_penyakit = tm.getValueAt(baris, 6).toString();
        
        LP.txtnama.setText(nama);
        LP.txtidentitas.setText(NoIdentitas);
        LP.txtno_telp.setText(no_telp);
        LP.combo_jurusan.setSelectedItem(jurusan);
        LP.combo_identitas.setSelectedItem(identitas);
        LP.txt_riwayat.setText(riwayat_penyakit);
        
        LP.pack();
        LP.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_tbl_pasienMouseClicked

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cariActionPerformed
    
    
    /**
     * @param args the command line arguments
     */
   
//        public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
////        try {
////            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
////                if ("Nimbus".equals(info.getName())) {
////                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
////                    break;
////                }
////            }
////        } catch (ClassNotFoundException ex) {
////            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
////        } catch (InstantiationException ex) {
////            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
////        } catch (IllegalAccessException ex) {
////            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
////        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
////            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
////        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Pasien().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Dashboard;
    private javax.swing.JButton LogOut;
    private javax.swing.JButton Pasien;
    private javax.swing.JButton Penangan;
    private javax.swing.JButton Profile;
    private javax.swing.JButton User;
    private javax.swing.JButton cari;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JDesktopPane layar1;
    private javax.swing.JButton tambah;
    private javax.swing.JTable tbl_pasien;
    // End of variables declaration//GEN-END:variables

    private String coba() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
