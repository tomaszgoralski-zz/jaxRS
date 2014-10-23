package ets;

import java.util.List;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

@Path("/ets")
public class AddList {

	@GET
	@Path("/add/{num}/{num}")
	public String addlist(@PathParam("num") List<Integer> numbers) {
		return "" + (numbers.get(0) + numbers.get(1));
	}

	@GET
	@Path("/add1")
	public String add1(@DefaultValue("9") @QueryParam("num1") int num,
			@DefaultValue("8") @QueryParam("num2") int num2) {
		return "" + (num + num2);
	}

	@GET
	@Path("/add")
	public String addlistMa(@MatrixParam("num1") int num1,
			@MatrixParam("num2") int num2) {
		return "" + (num1 + num2);
	}

	@POST
	@Path("/add2")
	public String add2(@FormParam("num1") int num1, @FormParam("num2") int num2) {
		return "" + (num1 + num2);
	}

	@GET
	@Path("/add3")
	public String add3(@MatrixParam("num1") int num1,
			@MatrixParam("num2") int num2) {
		return "" + (num1 + num2);
	}
}