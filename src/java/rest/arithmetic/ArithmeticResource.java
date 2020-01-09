/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest.arithmetic;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import model.Employee;

/**
 *
 * @author Eskindir
 */
@Path("arithmetic")
@Produces({MediaType.TEXT_PLAIN})
public class ArithmeticResource {

    @GET
    @Path("/greet/{name}")
    public String greet(@PathParam("name") String name) {
        return "Hi there " + name;
    }

    @GET
    @Path("/addition/{num1}/{num2}")
    public int addition(@PathParam("num1") Integer a, @PathParam("num2") Integer b) {
        return a + b;
    }

    @GET
    @Path("/subtraction")
    public int subtraction(@QueryParam("num1") Integer num1, @QueryParam("num2") Integer num2) {
        return num1 - num2;
    }

    @GET
    @Path("/division")
    public int division(@PathParam("num1") Integer num1, @PathParam("num2") Integer num2) {
        return num1 / num2;
    }

    @GET
    @Path("/multiplication")
    public int multiplication(@PathParam("num1") Integer num1, @PathParam("num2") Integer num2) {
        return num1 * num2;
    }

    @GET
    @Path("/employee")
    public Response getEmployee() {
        Employee emp = Employee.getEmployee();
        return Response.status(200).entity(emp).build();
    }
}
