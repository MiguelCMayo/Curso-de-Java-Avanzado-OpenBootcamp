package com.openbootcamp.demoSpringRest.controllers;

import com.openbootcamp.demoSpringRest.models.Bootcamper;
import com.openbootcamp.demoSpringRest.service.BootcamperService;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.util.List;

@Component
@Path("/")
public class BootcampersController {

    private BootcamperService bootcamperService;

    public BootcampersController(BootcamperService bootcamperService) {
        this.bootcamperService = bootcamperService;

        this.bootcamperService.add(new Bootcamper("miguel"));
        this.bootcamperService.add(new Bootcamper("antonio"));
        this.bootcamperService.add(new Bootcamper("maria"));
        this.bootcamperService.add(new Bootcamper("ana"));
    }

    @GET
    @Path("/bootcampers")
    @Produces("application/json")
    public List<Bootcamper> listarTodos(){
        return bootcamperService.getAll();
    }

    @GET
    @Path("/bootcampers/{nombre}")
    @Produces("application/json")
    public Bootcamper listarUno(@PathParam("nombre") String nombre){
        return bootcamperService.get(nombre);
    }

    @POST
    @Path("/bootcampers")
    @Produces("application/json")
    @Consumes("application/json")
    public Response crearBootcamper(Bootcamper bootcamper){

        bootcamperService.add(bootcamper);

        return Response.created(
                URI.create("?bootcamper/" + bootcamper.getNombre())
        ).build();
    }
}
