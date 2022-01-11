package edu.upc.dsa.services;
import edu.upc.dsa.models.*;
import edu.upc.dsa.Manager;
import edu.upc.dsa.ManagerImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.ws.rs.*;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.LinkedList;
import java.util.List;

@Api(value ="/endpoint", description = "Endpoint to Pokemon Service")
@Path("/endpoint")
public class Server {
    private Manager manager;

    public Server(){this.manager =ManagerImpl.getInstance();}

    @GET
    @ApiOperation(value = "lista repositorios usuario", notes = "asdasd")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful", response = Repositorios.class, responseContainer = "Lista"),
            @ApiResponse(code = 500, message = "Error")
    })
    @Path("/repositorios/{userId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getInsignias(@PathParam("userId") String user){
        List<Repositorios> repos = this.manager.getRepositorios(user);
        if(repos.size()!=0) {
            GenericEntity<List<Repositorios>> entity = new GenericEntity<List<Repositorios>>(repos) {
            };
            return Response.status(200).entity(entity).build();
        }
        else{
            return Response.status(500).build();
        }
    }

    @GET
    @ApiOperation(value = "get user", notes = "asdasd")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful", response = User.class),
            @ApiResponse(code = 404, message = "Not found")
    })
    @Path("/user/{userId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUser(@PathParam("userId") String userName){
        if(userName!=null){
            User user = this.manager.getUser(userName);
            if (user!=null){
                return Response.status(201).entity(user).build();}
            else{
                return Response.status(500).build();}}
        else{
            return Response.status(500).build();}
    }
}
