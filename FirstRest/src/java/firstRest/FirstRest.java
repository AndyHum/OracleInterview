/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstRest;

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
@Path("firstRest")
public class FirstRest {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of FirstRest
     */
    public FirstRest() {
    }

    /**
     * Retrieves representation of an instance of firstRest.FirstRest
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String getHtml() {
        return "<html><body><h1>Hello,World!!</html></body></h1>";
        //throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of FirstRest
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.TEXT_HTML)
    public String putHtml(String content) {
        String result = "";
        if(content == null){
            return null;
        }
        for(int i = 0; i < content.length();i++){
            if(result == ""){
                result = result + content.charAt(0);
            }
            else{
                if(content.charAt(i) != result.charAt(result.length()-1)){
                    result = result + content.charAt(i);
                }
            }
        }
        return result;
        //return "<html><body><h1>Hello,World!!</html></body></h1>";
    }
}
