package View;

import Controller.QuizController;
import DTO.CharacterDTO;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class frmQuiz extends javax.swing.JFrame {
    private CharacterDTO chDTO = new CharacterDTO();
    
    public frmQuiz() {
        initComponents();
        this.lblAcumulatedScore.setText("0");
        
        this.newMatch();
    }
    
    private void newMatch() {
        this.chDTO = QuizController.startQuiz();
        ImageIcon imageIcon = (ImageIcon) QuizController.characterImage(this.chDTO, lblCharacterImage);
        this.lblCharacterImage.setIcon(imageIcon);
    }
    
    private void wipeOutField(){
        for(int i = 0; i< getContentPane().getComponentCount(); i++){
            Component c = getContentPane().getComponent(i);
            
            if (c instanceof JTextField field){
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
        txtAnswer = new javax.swing.JTextField();
        btnAnswer = new javax.swing.JButton();
        lblScore = new javax.swing.JLabel();
        lblAcumulatedScore = new javax.swing.JLabel();
        btnGoBack = new javax.swing.JButton();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Final Fantasy Quiz ");
        setLocationByPlatform(true);
        setName("frmQuiz"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(400, 400));

        lblCharacterImage.setBorder(new javax.swing.border.MatteBorder(null));

        lblQuestion.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        lblQuestion.setText("Qual é o nome do personagem");

        txtAnswer.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N

        btnAnswer.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        btnAnswer.setText("CHUTAR");
        btnAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnswerActionPerformed(evt);
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
                        .addComponent(txtAnswer))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblScore)
                        .addGap(18, 18, 18)
                        .addComponent(lblAcumulatedScore, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAnswer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(txtAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblScore)
                            .addComponent(lblAcumulatedScore, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGoBack, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnswerActionPerformed
        String userAnswer = this.txtAnswer.getText().trim();
        int currentScore = Integer.parseInt(this.lblAcumulatedScore.getText());

        if (userAnswer.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, insira uma resposta");
            return;
        }

        int newScore = QuizController.submitAnswer(userAnswer, this.chDTO, currentScore);

        this.lblAcumulatedScore.setText(String.valueOf(newScore));
  
        this.wipeOutField();
        this.newMatch();   
    }//GEN-LAST:event_btnAnswerActionPerformed

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
    private javax.swing.JButton btnAnswer;
    private javax.swing.JButton btnGoBack;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblAcumulatedScore;
    private javax.swing.JLabel lblCharacterImage;
    private javax.swing.JLabel lblQuestion;
    private javax.swing.JLabel lblScore;
    private javax.swing.JTextField txtAnswer;
    // End of variables declaration//GEN-END:variables
}
