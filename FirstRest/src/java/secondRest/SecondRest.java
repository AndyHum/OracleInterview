/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondRest;

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
@Path("SecondRest")
public class SecondRest {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of SecondRest
     */
    public SecondRest() {
    }

    /**
     * Retrieves representation of an instance of secondRest.SecondRest
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public String getXml() {
        return "<html><body><h1>this is the second Rest</html></body></h1>";
        //throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of SecondRest
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public int putXml(String content) {
        int result = 0;
        char charnow = content.charAt(0);
        int counter = 0;
        if(content == null){
            return 0;
        }
        for(int i = 0; i < content.length();i++){            
            if(content.charAt(i) == charnow){
                counter++;
            }
            else{
                result = Math.max(counter, result);
                counter = 1;
                charnow = content.charAt(i);
            }
        }
        return result;
    }
}
