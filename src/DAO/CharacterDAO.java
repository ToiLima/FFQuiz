package DAO;

//Importações
import DTO.CharacterDTO;
import DAO.APIConnection;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class CharacterDAO {
    public CharacterDTO selectCharacter () {
        CharacterDTO chDTO = new CharacterDTO();
        
        try {
            String responseBody;
            responseBody = APIConnection.connect();
            
            JSONParser parser = new JSONParser();
            JSONObject json = (JSONObject) parser.parse(responseBody);
            
            chDTO.setName((String) json.get("Name"));
            chDTO.setPictures(json.get("Picture"));
            
        } catch(){
        
        }
        
        return chDTO;
    }
        
}
