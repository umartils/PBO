/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package uas.fix;

import java.sql.Connection;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author ASUS
 */
public class LihatPasien extends javax.swing.JInternalFrame {
//    JLabel Label3;
    /**
     * Creates new form LihatPasien
     */
    public LihatPasien() {
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
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtidentitas = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtno_telp = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_riwayat = new javax.swing.JTextField();
        editdata = new javax.swing.JButton();
        hapusdata = new javax.swing.JButton();
        combo_identitas = new javax.swing.JComboBox<>();
        combo_jurusan = new javax.swing.JComboBox<>();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jButton1.setText("jButton1");

        jLabel6.setText("jLabel6");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setBackground(new java.awt.Color(132, 17, 17));
        setClosable(true);

        jPanel2.setBackground(new java.awt.Color(132, 17, 17));

        jLabel1.setFont(new java.awt.Font("Sitka Text", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PROFILE PASIEN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("Nama");

        jLabel3.setText("No Identitas");

        txtidentitas.setEditable(false);
        txtidentitas.setEnabled(false);
        txtidentitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidentitasActionPerformed(evt);
            }
        });

        jLabel4.setText("No Telepon");

        jLabel5.setText("Jurusan");

        jLabel7.setText("Identitas");

        jLabel8.setText("Riwayat Penyakit");

        txt_riwayat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_riwayatActionPerformed(evt);
            }
        });

        editdata.setBackground(new java.awt.Color(132, 17, 17));
        editdata.setForeground(new java.awt.Color(255, 255, 255));
        editdata.setText("Edit");
        editdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editdataActionPerformed(evt);
            }
        });

        hapusdata.setBackground(new java.awt.Color(132, 17, 17));
        hapusdata.setForeground(new java.awt.Color(255, 255, 255));
        hapusdata.setText("Hapus");
        hapusdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusdataActionPerformed(evt);
            }
        });

        combo_identitas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Identitas", "Mahasiswa", "Civitas", " " }));

        combo_jurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Jurusan/Jabatan", "PGSD", "PGPAUD", "PMM", "RPL", "TEKKOM", "Dosen", "Tendik", " " }));
        combo_jurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_jurusanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(editdata)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addComponent(txtnama)
                        .addComponent(txtidentitas)
                        .addComponent(txtno_telp, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(txt_riwayat, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                    .addComponent(hapusdata)
                    .addComponent(combo_identitas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(combo_jurusan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtidentitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_identitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtno_telp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_riwayat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editdata)
                    .addComponent(hapusdata))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtidentitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidentitasActionPerformed
        
    }//GEN-LAST:event_txtidentitasActionPerformed

    private void txt_riwayatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_riwayatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_riwayatActionPerformed

    private void editdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editdataActionPerformed
        String nama = txtnama.getText();
        String jurusan = (String) combo_jurusan.getSelectedItem();
        String noIdentitas = txtidentitas.getText();
        String identitas = (String) combo_identitas.getSelectedItem();
        String no_telp = txtno_telp.getText();
        String riwayat = txt_riwayat.getText();
        
        try{
            String queryTambah = "UPDATE pasien set nama = '"+nama+"', identitas = '"+identitas+"', jurusan = '"+jurusan+"', no_telp = '"+no_telp+"', riwayat_penyakit = '"+riwayat+"' where NoIdentitas =  '"+noIdentitas+"' ";
            java.sql.Connection konekTambah = (Connection)TesKoneksi.configDB();
            java.sql.PreparedStatement state = konekTambah.prepareStatement(queryTambah);
            state.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
            Pasien Back = new Pasien();
            Back.setVisible(true);
            this.dispose();
            
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Ubah Data Gagal");
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
    }//GEN-LAST:event_editdataActionPerformed

    private void hapusdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusdataActionPerformed
        String noIdentitas = txtidentitas.getText();
        
        try{
            String queryTambah = "DELETE FROM pasien where NoIdentitas =  '"+noIdentitas+"' ";
            java.sql.Connection konekHapus = (Connection)TesKoneksi.configDB();
            java.sql.PreparedStatement state = konekHapus.prepareStatement(queryTambah);
            state.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
            Pasien Back = new Pasien();
            Back.setVisible(true);
            this.dispose();
            
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Hapus Data Gagal");
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        
    }//GEN-LAST:event_hapusdataActionPerformed

    private void combo_jurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_jurusanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_jurusanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JComboBox<String> combo_identitas;
    javax.swing.JComboBox<String> combo_jurusan;
    private javax.swing.JButton editdata;
    private javax.swing.JButton hapusdata;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JTextField txt_riwayat;
    public javax.swing.JTextField txtidentitas;
    public javax.swing.JTextField txtnama;
    public javax.swing.JTextField txtno_telp;
    // End of variables declaration//GEN-END:variables
}
