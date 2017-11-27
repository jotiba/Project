package com.jas.Demo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/GetEmp")
public class JercyDemo {
	
	
	@GET
	@Path("/get")
	@Produces("application/json")
	public Person getProductInJSON() {

		Person product = new Person();
		product.setName("iPad 3");
		product.setEmailid("jas"); 

		return product;

	}
	
}
