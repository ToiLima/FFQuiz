package DTO;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

public class CharacterDTO {
    private String name; 
    private JSONArray picture;
  

    public CharacterDTO(String name, JSONArray picture) {
        this.name = name;
        this.picture = picture;
    }
    
    public CharacterDTO() {
        this.name = null;
        this.picture = null;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
  
    public String getPicture() {
        if (this.picture != null && this.picture.size() > 0) {
            JSONObject pictureObject = (JSONObject) this.picture.get(0);
            return (String) pictureObject.get("url");
        }
        return null;
    }

    public void setPicture(JSONArray picture) {
        this.picture = picture;
    }

}


