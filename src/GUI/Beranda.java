/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Class.beranda;

/**
 *
 * @author USER DK
 */
public class Beranda extends javax.swing.JFrame {
    private static beranda homee = new beranda();
    /**
     * Creates new form Beranda
     */
    public Beranda() {
        initComponents();
        setLocationRelativeTo(null);
        Harga.setText("Rp. 0,00");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Asal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TGLPesan = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Clearbtn = new javax.swing.JButton();
        Pesantbn = new javax.swing.JButton();
        Tujuan = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        Harga = new javax.swing.JTextField();
        Cek = new javax.swing.JButton();
        JMLHKursi = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        pesanan = new javax.swing.JLabel();
        akun = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jToolBar1.setRollover(true);

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(51, 51, 51));

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tiket Bus & Shuttle");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(156, 156, 28));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel2.setText("Lokasi Penjemputan");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        jPanel1.add(Asal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 190, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel3.setText("Tujuan");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 59, 41, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel4.setText("Tanggal Pesanan");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 114, -1, -1));

        TGLPesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TGLPesanActionPerformed(evt);
            }
        });
        jPanel1.add(TGLPesan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 134, 190, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel5.setText("Jumlah Kursi");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 159, 100, -1));

        Clearbtn.setText("Clear");
        Clearbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearbtnMouseClicked(evt);
            }
        });
        Clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearbtnActionPerformed(evt);
            }
        });
        jPanel1.add(Clearbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 224, -1, -1));

        Pesantbn.setText("Pesan");
        Pesantbn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PesantbnMouseClicked(evt);
            }
        });
        Pesantbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesantbnActionPerformed(evt);
            }
        });
        jPanel1.add(Pesantbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 224, -1, -1));

        Tujuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Tujuan", "Singkil", "Meulaboh", "Tapaktuan", "Aceh Timur", "Aceh Tengah", "Medan" }));
        Tujuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TujuanActionPerformed(evt);
            }
        });
        jPanel1.add(Tujuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 87, 190, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel7.setText("Harga");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 202, 100, -1));

        Harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HargaActionPerformed(evt);
            }
        });
        jPanel1.add(Harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 225, 187, -1));

        Cek.setText("Cek Harga");
        Cek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CekActionPerformed(evt);
            }
        });
        jPanel1.add(Cek, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 224, -1, -1));

        JMLHKursi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "/Orang", "1", "2", "3", "4", "5", " " }));
        jPanel1.add(JMLHKursi, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 181, 187, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/My project5.jpg"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 280));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 25, -1, -1));

        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/home.png"))); // NOI18N
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });
        jPanel2.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 315, 31, -1));

        pesanan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/shopping-bag.png"))); // NOI18N
        pesanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pesananMouseClicked(evt);
            }
        });
        jPanel2.add(pesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 315, -1, -1));

        akun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/user.png"))); // NOI18N
        akun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                akunMouseClicked(evt);
            }
        });
        jPanel2.add(akun, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 315, 31, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/My project6.jpg"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 370));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClearbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearbtnMouseClicked
        Asal.setText("");
        Tujuan.setSelectedIndex(0);
        TGLPesan.setText("");
        JMLHKursi.setSelectedIndex(0);
        Harga.setText("Rp. 0,00");
    }//GEN-LAST:event_ClearbtnMouseClicked

    private void TujuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TujuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TujuanActionPerformed

    private void TGLPesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TGLPesanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TGLPesanActionPerformed

    private void CekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CekActionPerformed
         int indexcombo = Tujuan.getSelectedIndex();
        Object pilihan = Tujuan.getSelectedItem();
        String pilih = String.valueOf(pilihan);
         int indexcombo1 = JMLHKursi.getSelectedIndex();
        Object pilihan1 = JMLHKursi.getSelectedItem();
        String pilih1 = String.valueOf(pilihan1);
        //int JMLHKursi = 1;
        if (indexcombo == 1){
            String harga = "200000";
            if(indexcombo1 != 0){
                int hargaa = Integer.parseInt(harga) * Integer.parseInt(pilih1);
                String hasil = String.valueOf(hargaa);
                Harga.setText("Rp."+hasil+",00");
                homee.setHarga("Rp."+hasil+",00");
                homee.setTujuan(pilih);
                homee.setJumlah_kursi(pilih1);
                
            }
            
            if(indexcombo1 == 0){
                Harga.setText("Rp.0,00");
            }
            
        }else if (indexcombo == 2){
            String harga = "120000";
            if(indexcombo1 != 0){
                int hargaa = Integer.parseInt(harga) * Integer.parseInt(pilih1);
                String hasil = String.valueOf(hargaa);
                Harga.setText("Rp."+hasil+",00");
                homee.setHarga("Rp."+hasil+",00");
                homee.setTujuan(pilih);
                homee.setJumlah_kursi(pilih1);
            }
            if(indexcombo1 == 0){
                Harga.setText("Rp.0,00");
            }
            
        }else if (indexcombo == 3){
            String harga = "160000";
            if(indexcombo1 != 0){
                int hargaa = Integer.parseInt(harga) * Integer.parseInt(pilih1);
                String hasil = String.valueOf(hargaa);
                Harga.setText("Rp."+hasil+",00");
                homee.setHarga("Rp."+hasil+",00");
                homee.setTujuan(pilih);
                homee.setJumlah_kursi(pilih1);
            }
            if(indexcombo1 == 0){
                Harga.setText("Rp.0,00");
            }
        }else if (indexcombo == 4){
           String harga = "170000";
            if(indexcombo1 != 0){
                int hargaa = Integer.parseInt(harga) * Integer.parseInt(pilih1);
                String hasil = String.valueOf(hargaa);
                Harga.setText("Rp."+hasil+",00");
                homee.setHarga("Rp."+hasil+",00");
                homee.setTujuan(pilih);
                homee.setJumlah_kursi(pilih1);
            }
            if(indexcombo1 == 0){
                Harga.setText("Rp.0,00");
            }
        }else if (indexcombo == 5){
            String harga = "180000";
            if(indexcombo1 != 0){
                int hargaa = Integer.parseInt(harga) * Integer.parseInt(pilih1);
                String hasil = String.valueOf(hargaa);
                Harga.setText("Rp."+hasil+",00");
                homee.setHarga("Rp."+hasil+",00");
                homee.setTujuan(pilih);
                homee.setJumlah_kursi(pilih1);
            }
            if(indexcombo1 == 0){
                Harga.setText("Rp.0,00");
            }
        }else if(indexcombo == 6){
            String harga = "250000";
            if(indexcombo1 != 0){
                int hargaa = Integer.parseInt(harga) * Integer.parseInt(pilih1);
                String hasil = String.valueOf(hargaa);
                Harga.setText("Rp."+hasil+",00");
                homee.setHarga("Rp."+hasil+",00");
                homee.setTujuan(pilih);
                homee.setJumlah_kursi(pilih1);
            }
            if(indexcombo1 == 0){
                Harga.setText("Rp.0,00");
            }
        }else{
                Harga.setText("Rp.0,00");   
        }
    }//GEN-LAST:event_CekActionPerformed

    private void ClearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClearbtnActionPerformed

    private void PesantbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesantbnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PesantbnActionPerformed

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        Beranda home = new Beranda();
        home.setVisible(true);
        dispose();
    }//GEN-LAST:event_homeMouseClicked

    private void HargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HargaActionPerformed

    private void PesantbnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PesantbnMouseClicked
        Pesanan pesan = new Pesanan(homee.getTujuan(),homee.getJumlah_kursi(),homee.getharga());
        pesan.setVisible(true);
        dispose();
    }//GEN-LAST:event_PesantbnMouseClicked

    private void akunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_akunMouseClicked
        AboutUs about = new AboutUs();
        about.setVisible(true);
        dispose();
    }//GEN-LAST:event_akunMouseClicked

    private void pesananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pesananMouseClicked
         Pesanan pesan = new Pesanan(homee.getTujuan(),homee.getJumlah_kursi(),homee.getharga());
        pesan.setVisible(true);
        dispose();
    }//GEN-LAST:event_pesananMouseClicked

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
            java.util.logging.Logger.getLogger(Beranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Beranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Beranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Beranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Beranda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Asal;
    private javax.swing.JButton Cek;
    private javax.swing.JButton Clearbtn;
    private javax.swing.JTextField Harga;
    private javax.swing.JComboBox<String> JMLHKursi;
    private javax.swing.JButton Pesantbn;
    private javax.swing.JTextField TGLPesan;
    private javax.swing.JComboBox<String> Tujuan;
    private javax.swing.JLabel akun;
    private javax.swing.JLabel home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel pesanan;
    // End of variables declaration//GEN-END:variables
}
