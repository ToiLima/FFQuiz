package Controller;
import DTO.CharacterDTO;
import DAO.CharacterDAO;
import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class QuizController {

    public static CharacterDTO startQuiz() {
        CharacterDTO chDTO = new CharacterDTO();
        chDTO = CharacterDAO.selectCharacter();

        return chDTO;
    }

    public static Icon characterImage(CharacterDTO chDTO, JLabel lblCharacterImage) {
       try {
            URL url = new URL(chDTO.getPicture());
            ImageIcon icon = new ImageIcon(url);
            
            Image image = icon.getImage();
            Image newimg = image.getScaledInstance(300, 200,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
            icon = new ImageIcon(newimg);  // transform it back
            
            return icon;
        } catch (MalformedURLException ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }

    public static int submitAnswer(String userAnswer, CharacterDTO chDTO, int currentScore) {
        if (userAnswer.equalsIgnoreCase(chDTO.getName())) {
            JOptionPane.showMessageDialog(null, "ACERTOU");
            
            return currentScore+1;
        } else {
            JOptionPane.showMessageDialog(null, "ERROU");
            
            return currentScore;
        }       
    }
}
