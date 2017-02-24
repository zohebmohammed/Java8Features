package com.java8.features;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class HelloWorld {
	
	
	// forEach() method on Iterable interface.
	public List<Employee> populateEmployeeDetails(List<Employee> employees){
		ConsumerImpl impl = new ConsumerImpl();
		employees.forEach(impl);
		return employees;
	}
	
	
	// This is the feature which allows to use sort method directly on List and
	//using Lambda expressions
	public List<Employee> getSortedEmployees(List<Employee> employees){
		 employees.sort((Employee e1, Employee e2)->e1.getId()-e2.getId());
		 return employees;
	}
	
	// Usage of stream filters and Collectors.
	public List<Employee> filterAndCollectEmployee(List<Employee> employees){
		List<Employee> result = employees.stream() 			
				.filter(emp -> "John". equals(emp.getName()))	
				.collect(Collectors.toList());
		return result;
	}
	
	// Implementation of Consumer class to use in forEach.
	class ConsumerImpl implements Consumer<Employee>{

		public void accept(Employee t) {
	        t.setDetails("Details are id: "+t.getId()+", name: "+t.getName()+", address: "+t.getAddress());
		}


	}
}
