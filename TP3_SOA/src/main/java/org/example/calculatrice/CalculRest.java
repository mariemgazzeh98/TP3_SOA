package org.example.calculatrice;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/calcul")
public class CalculRest {

    private Calculatrice calculatrice = new Calculatrice();

    // 1. ADDITION (GET)
    @GET
    @Path("/addition")
    @Produces(MediaType.APPLICATION_JSON)
    public Response addition(@QueryParam("a") double a, @QueryParam("b") double b) {
        Operation operation = new Operation("addition", a, b);
        operation.setResultat(calculatrice.addition(a, b));
        return Response.ok(operation).build();
    }

    // 2. SOUSTRACTION (GET)
    @GET
    @Path("/soustraction")
    @Produces(MediaType.APPLICATION_JSON)
    public Response soustraction(@QueryParam("a") double a, @QueryParam("b") double b) {
        Operation operation = new Operation("soustraction", a, b);
        operation.setResultat(calculatrice.soustraction(a, b));
        return Response.ok(operation).build();
    }

    // 3. MULTIPLICATION (GET)
    @GET
    @Path("/multiplication")
    @Produces(MediaType.APPLICATION_JSON)
    public Response multiplication(@QueryParam("a") double a, @QueryParam("b") double b) {
        Operation operation = new Operation("multiplication", a, b);
        operation.setResultat(calculatrice.multiplication(a, b));
        return Response.ok(operation).build();
    }

    // 4. DIVISION (GET)
    @GET
    @Path("/division")
    @Produces(MediaType.APPLICATION_JSON)
    public Response division(@QueryParam("a") double a, @QueryParam("b") double b) {
        try {
            Operation operation = new Operation("division", a, b);
            operation.setResultat(calculatrice.division(a, b));
            return Response.ok(operation).build();
        } catch (ArithmeticException e) {
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity("{\"error\": \"" + e.getMessage() + "\"}")
                    .build();
        }
    }
}