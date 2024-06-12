package View;

public class frmAbout extends javax.swing.JFrame {

    public frmAbout() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGoBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAbout = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Final Fantasy Quiz - Sobre");
        setLocationByPlatform(true);
        setResizable(false);
        setSize(new java.awt.Dimension(400, 400));

        btnGoBack.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        btnGoBack.setText("VOLTAR");
        btnGoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoBackActionPerformed(evt);
            }
        });

        txtAbout.setEditable(false);
        txtAbout.setColumns(20);
        txtAbout.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        txtAbout.setRows(5);
        txtAbout.setText("Este programa foi feito como projeto de \nentrega do segundo bimestre da máteria de \nLinguagem de Programação VI em Java, \nutilizando Java Swing e bibliotecas para\nconsumo de APIs, acesso a URI e de \nmanipulação de imagens\n\nBaseado na série de RPG da Square-Enix, \nFinal Fantasy, lançado desde de 1987.\n\nTodos os conteúdos são propriedades de \nseus respectivos donos.\n\nAPI: https://www.moogleapi.com\nGitHub: https://github.com/ToiLima/FFQuiz");
        txtAbout.setName(""); // NOI18N
        jScrollPane1.setViewportView(txtAbout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGoBack, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnGoBack, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoBackActionPerformed
        this.setVisible(false);
        new frmMain().setVisible(true);
    }//GEN-LAST:event_btnGoBackActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAbout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGoBack;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAbout;
    // End of variables declaration//GEN-END:variables
}
