package View;

public class frmMain extends javax.swing.JFrame {

    public frmMain() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblImageTitle = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        btnStart = new javax.swing.JButton();
        btnAbout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Final Fantasy Quiz - Menu");
        setBackground(new java.awt.Color(0, 0, 0));
        setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        setForeground(new java.awt.Color(0, 0, 0));
        setName("frmMain"); // NOI18N
        setPreferredSize(new java.awt.Dimension(400, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 400));

        lblTitle.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        lblTitle.setText("          QUIZ");

        btnStart.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        btnStart.setText("JOGAR");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        btnAbout.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        btnAbout.setText("SOBRE");
        btnAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/file.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblImageTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImageTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );

        getAccessibleContext().setAccessibleName("Main");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        this.setVisible(false);
        new frmQuiz().setVisible(true);
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutActionPerformed
        this.setVisible(false);
        new frmAbout().setVisible(true);
    }//GEN-LAST:event_btnAboutActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbout;
    private javax.swing.JButton btnStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblImageTitle;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
