package Controller;
import DTO.CharacterDTO;
import DAO.CharacterDAO;
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

    public static Integer submitAnswer(String answer, CharacterDTO chDTO, Integer points) {  
        if (answer.isBlank() && answer.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor preencher todos os campos");
            return points;
        } else {
            return answerVerification(answer, chDTO, points);
        } 
    }
    
    private static Integer answerVerification(String answer, CharacterDTO chDTO, Integer points) {
        if (answer.equalsIgnoreCase(chDTO.getName())) {
            JOptionPane.showMessageDialog(null, "Acertou");
            points = +1;
            return points;
        } else {
            JOptionPane.showMessageDialog(null, "Errou");
            points = - 1;
            return points;
        }
    }

    public static Icon characterImage(CharacterDTO chDTO, JLabel lblCharacterImage) {
       try {
            URL url = new URL(chDTO.getPicture());
            ImageIcon icon = new ImageIcon(url);
            
            return icon;
        } catch (MalformedURLException ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }
}
