


package org.acme.rest;

import org.acme.model.Categoria;

import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import static io.quarkus.hibernate.orm.panache.PanacheEntity_.id;



//  ./mvnw compile quarkus:dev

@Path("/categoria")
@Produces(MediaType.APPLICATION_JSON)
public class CategoriaResource {

    @Transactional
    @POST
    public void insert(Categoria categoria) {
        Categoria.persist(categoria);
    }

    @Path("{id}")
    @GET
    public Categoria getById(@PathParam("id") long id) {
        return Categoria.findById(id);
    }
}