package View;

import Controller.QuizController;
import DTO.CharacterDTO;
import java.awt.Component;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

public class frmQuiz extends javax.swing.JFrame {
    public CharacterDTO chDTO = new CharacterDTO();
    
    
    public frmQuiz() {
        initComponents();
        this.lblAcumulatedScore.setText("0");
        
        this.newMatch();
    }
    
    private void newMatch() {
        //this.lblCharacterImage.setIcon(QuizController.characterImage(chDTO, lblCharacterImage));
        chDTO = QuizController.startQuiz();
        ImageIcon imageIcon = (ImageIcon) QuizController.characterImage(chDTO, lblCharacterImage);
        Image image = imageIcon.getImage(); // transform it 
        Image newimg = image.getScaledInstance(300, 200,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        imageIcon = new ImageIcon(newimg);  // transform it back

        this.lblCharacterImage.setIcon(imageIcon);
    }
    
    private void wipeOutField(){
        for(int i = 0; i< getContentPane().getComponentCount(); i++){
            Component c = getContentPane().getComponent(i);
            
            if (c instanceof JTextField){
                JTextField field = (JTextField) c;
                field.setText(null);
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        lblCharacterImage = new javax.swing.JLabel();
        lblQuestion = new javax.swing.JLabel();
        txtQuestion = new javax.swing.JTextField();
        btnResponse = new javax.swing.JButton();
        lblScore = new javax.swing.JLabel();
        lblAcumulatedScore = new javax.swing.JLabel();
        btnGoBack = new javax.swing.JButton();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Final Fantasy Quiz ");
        setLocationByPlatform(true);
        setName("frmQuiz"); // NOI18N
        setPreferredSize(new java.awt.Dimension(400, 400));
        setResizable(false);

        lblCharacterImage.setBorder(new javax.swing.border.MatteBorder(null));

        lblQuestion.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        lblQuestion.setText("Qual é o nome do personagem");

        txtQuestion.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N

        btnResponse.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        btnResponse.setText("CHUTAR");
        btnResponse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResponseActionPerformed(evt);
            }
        });

        lblScore.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        lblScore.setText("PONTOS:");

        lblAcumulatedScore.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        lblAcumulatedScore.setBorder(new javax.swing.border.MatteBorder(null));

        btnGoBack.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        btnGoBack.setText("VOLTAR");
        btnGoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtQuestion))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblScore)
                        .addGap(18, 18, 18)
                        .addComponent(lblAcumulatedScore, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnResponse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGoBack, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lblCharacterImage, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(lblCharacterImage, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblQuestion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblScore)
                            .addComponent(lblAcumulatedScore, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnResponse, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGoBack, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnResponseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResponseActionPerformed
        String name = this.txtQuestion.getText();
        Integer points = Integer.valueOf(this.lblAcumulatedScore.getText());
     
        points += QuizController.submitAnswer(name, chDTO, points);
           
        this.lblAcumulatedScore.setText(points.toString());
    }//GEN-LAST:event_btnResponseActionPerformed

    private void btnGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoBackActionPerformed
        this.setVisible(false);
        new frmMain().setVisible(true);
    }//GEN-LAST:event_btnGoBackActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmQuiz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGoBack;
    private javax.swing.JButton btnResponse;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblAcumulatedScore;
    private javax.swing.JLabel lblCharacterImage;
    private javax.swing.JLabel lblQuestion;
    private javax.swing.JLabel lblScore;
    private javax.swing.JTextField txtQuestion;
    // End of variables declaration//GEN-END:variables
}
