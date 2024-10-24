package main;

public class Valasztasok extends javax.swing.JFrame {

    public Valasztasok() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnlSzakValasztas = new javax.swing.JPanel();
        pnlSzakok = new javax.swing.JPanel();
        rdbSZF = new javax.swing.JRadioButton();
        rdbIRU = new javax.swing.JRadioButton();
        rdbGRAF = new javax.swing.JRadioButton();
        btnSzakvalasztas = new javax.swing.JButton();
        lblValasztottSzak = new javax.swing.JLabel();
        lblValasztottSzak2 = new javax.swing.JLabel();
        pnlKonyvValasztas = new javax.swing.JPanel();
        btnKonyvValasztas = new javax.swing.JButton();
        pnlKonyvek = new javax.swing.JPanel();
        ckbMagyarTortenelem = new javax.swing.JCheckBox();
        ckbMagyarNemetSzoltar = new javax.swing.JCheckBox();
        ckbHarryPotter = new javax.swing.JCheckBox();
        lblValasztottKonyv = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaValasztottKonyv = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vátozások");
        setMinimumSize(new java.awt.Dimension(200, 200));

        pnlSzakValasztas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Szak választás"));

        pnlSzakok.setBorder(javax.swing.BorderFactory.createTitledBorder("Szakok"));

        buttonGroup1.add(rdbSZF);
        rdbSZF.setText("SzF");
        rdbSZF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbSZFActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdbIRU);
        rdbIRU.setText("IRÜ");

        buttonGroup1.add(rdbGRAF);
        rdbGRAF.setText("GRAF");

        javax.swing.GroupLayout pnlSzakokLayout = new javax.swing.GroupLayout(pnlSzakok);
        pnlSzakok.setLayout(pnlSzakokLayout);
        pnlSzakokLayout.setHorizontalGroup(
            pnlSzakokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSzakokLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSzakokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rdbSZF)
                    .addComponent(rdbIRU)
                    .addComponent(rdbGRAF))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlSzakokLayout.setVerticalGroup(
            pnlSzakokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSzakokLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdbSZF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdbIRU)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdbGRAF)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSzakvalasztas.setText("Szak választás");
        btnSzakvalasztas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSzakvalasztasActionPerformed(evt);
            }
        });

        lblValasztottSzak.setText("Választott szak:");

        javax.swing.GroupLayout pnlSzakValasztasLayout = new javax.swing.GroupLayout(pnlSzakValasztas);
        pnlSzakValasztas.setLayout(pnlSzakValasztasLayout);
        pnlSzakValasztasLayout.setHorizontalGroup(
            pnlSzakValasztasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSzakValasztasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSzakValasztasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblValasztottSzak2, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                    .addGroup(pnlSzakValasztasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnSzakvalasztas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                        .addComponent(pnlSzakok, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblValasztottSzak, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlSzakValasztasLayout.setVerticalGroup(
            pnlSzakValasztasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSzakValasztasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlSzakok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSzakvalasztas)
                .addGap(7, 7, 7)
                .addComponent(lblValasztottSzak, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblValasztottSzak2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlKonyvValasztas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Könyv választás"));

        btnKonyvValasztas.setText("Könyv kiválasztása");
        btnKonyvValasztas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKonyvValasztasActionPerformed(evt);
            }
        });

        pnlKonyvek.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Könyvek"));

        ckbMagyarTortenelem.setText("Magyar Történelem 1876");

        ckbMagyarNemetSzoltar.setText("Magyar-Német szótár");

        ckbHarryPotter.setText("Harry Potter");

        javax.swing.GroupLayout pnlKonyvekLayout = new javax.swing.GroupLayout(pnlKonyvek);
        pnlKonyvek.setLayout(pnlKonyvekLayout);
        pnlKonyvekLayout.setHorizontalGroup(
            pnlKonyvekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKonyvekLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlKonyvekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ckbMagyarTortenelem)
                    .addComponent(ckbHarryPotter)
                    .addComponent(ckbMagyarNemetSzoltar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlKonyvekLayout.setVerticalGroup(
            pnlKonyvekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKonyvekLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ckbMagyarTortenelem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ckbMagyarNemetSzoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ckbHarryPotter)
                .addContainerGap())
        );

        lblValasztottKonyv.setText("Választott könyv:");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        txtaValasztottKonyv.setColumns(20);
        txtaValasztottKonyv.setRows(3);
        txtaValasztottKonyv.setEnabled(false);
        jScrollPane1.setViewportView(txtaValasztottKonyv);

        javax.swing.GroupLayout pnlKonyvValasztasLayout = new javax.swing.GroupLayout(pnlKonyvValasztas);
        pnlKonyvValasztas.setLayout(pnlKonyvValasztasLayout);
        pnlKonyvValasztasLayout.setHorizontalGroup(
            pnlKonyvValasztasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKonyvValasztasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlKonyvValasztasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlKonyvek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlKonyvValasztasLayout.createSequentialGroup()
                        .addGroup(pnlKonyvValasztasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnKonyvValasztas, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblValasztottKonyv, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pnlKonyvValasztasLayout.setVerticalGroup(
            pnlKonyvValasztasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKonyvValasztasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlKonyvek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnKonyvValasztas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblValasztottKonyv, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlSzakValasztas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(pnlKonyvValasztas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlSzakValasztas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlKonyvValasztas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rdbSZFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbSZFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbSZFActionPerformed

    private void btnKonyvValasztasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKonyvValasztasActionPerformed
//selekted true boolean get
        boolean MTAktiv = ckbMagyarTortenelem.isSelected();//fals ha nem aktiv, ha aktiv true
        boolean MNAktiv = ckbMagyarNemetSzoltar.isSelected();
        boolean HPAktiv = ckbHarryPotter.isSelected();
        boolean vanKivalasztva = false;
        final String SORTORES =System.lineSeparator();
        String konyv = ""; //= "valami ami soha nem lesz kiirva";
        if (MTAktiv) {
            konyv += "Magyar Történelem "+ SORTORES;
            vanKivalasztva = true;
        }

        if (MNAktiv) {
            konyv += "Magyar-Német szótár"+ SORTORES;
            vanKivalasztva = true;
        }

        if (HPAktiv) {
            konyv += "Harry Potter"+ SORTORES;
            vanKivalasztva = true;
        }
        
        if (!vanKivalasztva) {
            konyv = "Nem szeretsz olvasni?";
        }

        txtaValasztottKonyv.setText(konyv);

    }//GEN-LAST:event_btnKonyvValasztasActionPerformed

    private void btnSzakvalasztasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSzakvalasztasActionPerformed
        //selekted true boolean get
        boolean szfAktiv = rdbSZF.isSelected();//fals ha nem aktiv, ha aktiv true
        boolean iruAktiv = rdbIRU.isSelected();
        boolean grafAktiv = rdbGRAF.isSelected();
        String szak = "<html>"; //= "valami ami soha nem lesz kiirva";
        if (szfAktiv) {
            szak = "SZF";

        } else if (iruAktiv) {
            szak = "IRU";

        } else if (grafAktiv) {
            szak = "GRAF";

        } else {
            
            szak += "<span style='color:red;'>"+"Nincs kiválasztva"+"</span>";
            szak += "</html>";
        }
        lblValasztottSzak2.setText(szak);
    }//GEN-LAST:event_btnSzakvalasztasActionPerformed

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
            java.util.logging.Logger.getLogger(Valasztasok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Valasztasok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Valasztasok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Valasztasok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Valasztasok().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKonyvValasztas;
    private javax.swing.JButton btnSzakvalasztas;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox ckbHarryPotter;
    private javax.swing.JCheckBox ckbMagyarNemetSzoltar;
    private javax.swing.JCheckBox ckbMagyarTortenelem;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblValasztottKonyv;
    private javax.swing.JLabel lblValasztottSzak;
    private javax.swing.JLabel lblValasztottSzak2;
    private javax.swing.JPanel pnlKonyvValasztas;
    private javax.swing.JPanel pnlKonyvek;
    private javax.swing.JPanel pnlSzakValasztas;
    private javax.swing.JPanel pnlSzakok;
    private javax.swing.JRadioButton rdbGRAF;
    private javax.swing.JRadioButton rdbIRU;
    private javax.swing.JRadioButton rdbSZF;
    private javax.swing.JTextArea txtaValasztottKonyv;
    // End of variables declaration//GEN-END:variables
}
