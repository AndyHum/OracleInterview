/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge2;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
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
@Path("Challenge2")
public class Challenge2 {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of Challenge2
     */
    public Challenge2() {
    }

    /**
     * Retrieves representation of an instance of challenge2.Challenge2
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String getHtml() {
        return "<html><body><h1>Hello,World!!</html></body></h1>";
        //throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of Challenge2
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.TEXT_HTML)
    public void putHtml(String content) throws MalformedURLException, IOException {
        String[] helper = content.split(",");
        if(helper[0] == "FirstRest"){
            String url = "http://localhost:8080/FirstRest/webresources/firstRest";
            url+=("put"+"/xxx");
            URL restServiceURL = new URL(url);
            HttpURLConnection httpConnection = (HttpURLConnection) restServiceURL.openConnection();
            httpConnection.setRequestMethod(helper[1].toUpperCase());  
        }
        if(helper[0] == "SecondRest"){
            String url = "http://localhost:8080/FirstRest/webresources/SecondRest";
            url+=("put"+"/xxx");
            URL restServiceURL = new URL(url);
            HttpURLConnection httpConnection = (HttpURLConnection) restServiceURL.openConnection();
            httpConnection.setRequestMethod(helper[1].toUpperCase());  
        }
        if(helper[0] == "ThirdRest"){
            String url = "http://localhost:8080/FirstRest/webresources/ThirdRest";
            url+=("put"+"/xxx");
            URL restServiceURL = new URL(url);
            HttpURLConnection httpConnection = (HttpURLConnection) restServiceURL.openConnection();
            httpConnection.setRequestMethod(helper[1].toUpperCase()); 
        }
    }
}
