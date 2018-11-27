/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thirdRest;

import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author gpcan
 */
@Path("ThirdRest")
public class ThirdRest {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ThirdRest
     */
    public ThirdRest() {
    }

    /**
     * Retrieves representation of an instance of thirdRest.ThirdRest
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public String getXml() {
        return "<html><body><h1>this is the second Rest</html></body></h1>";
        //throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of ThirdRest
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public String putXml(String content) {
        String result = "";
        Map<String, Integer> map = new HashMap<String, Integer>();
        int start = 65;
        while(start<=90){
            map.put(String.valueOf(start),0);
            start++;
        }
        start = 97;
        while(start <= 122){
            map.put(String.valueOf(start),0);
            start++;
        }
        for(int i = 0; i < content.length(); i++){
            map.put(String.valueOf(content.charAt(i)),map.get(String.valueOf(content.charAt(i)))+1);
        }
        for(int i = 65; i <= 90; i++){
            int counter = 0;
            if(counter % 2 == 0){
                if(map.get(String.valueOf(i)) != 0){
                    for(int j = 0; j < map.get(String.valueOf(i)); j++){
                        result += String.valueOf(i);
                    }
                }
            }
            else{
                if(map.get(String.valueOf(i+32)) != 0){
                    for(int j = 0; j < map.get(String.valueOf(i)); j++){
                        result += String.valueOf(i+32);
                    }
                }
            }
        }
        return result;
    }
}
