package DAO;

//Importações
import DTO.CharacterDTO;
import org.json.simple.JSONArray;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class CharacterDAO {
    public static CharacterDTO selectCharacter () {
        CharacterDTO chDTO = new CharacterDTO();
        
        try {
            String responseBody;
            responseBody = APIConnection.connect();
            
            JSONParser parser = new JSONParser();
            JSONObject json = (JSONObject) parser.parse(responseBody);
            
            chDTO.setName((String) json.get("name"));
            chDTO.setPicture((JSONArray) json.get("pictures"));
            
            return chDTO;     
        } catch(ParseException ex){
            throw new RuntimeException(ex.getMessage());
        }
    }     
}
