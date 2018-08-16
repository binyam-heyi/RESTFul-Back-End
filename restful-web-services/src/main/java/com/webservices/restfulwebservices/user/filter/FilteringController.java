/*package com.webservices.restfulwebservices.user.filter;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class FilteringController {
	//filtering field1
	@GetMapping("/filtering")
	public MappingJacksonValue retriveSomeBean()
	{
		Somebean somebean= new Somebean("value1","value2","value3");
		MappingJacksonValue mappingJacksonValue=new MappingJacksonValue(somebean);
		
	    SimpleBeanPropertyFilter filter= SimpleBeanPropertyFilter.filterOutAllExcept("field2","field3");
		FilterProvider filterProvider= new SimpleFilterProvider()
				                       .addFilter("SomeBeanFilter", filter);
		
		
		mappingJacksonValue.setFilters(filterProvider);
		
		return mappingJacksonValue;
	}
	// filtering field 3

}
*/