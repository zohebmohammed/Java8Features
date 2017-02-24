package com.java8.features;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
public class HelloWorldTest {
   
	private static List<Employee> employeeList = new ArrayList();
    private static HelloWorld helloWorld = new HelloWorld();
   
   @BeforeClass
   public static void prepareEmployeeList(){
		
		Employee employee1 = new Employee(30, "John", "CA");
		Employee employee2 = new Employee(10, "Mike", "OH");
		Employee employee3 = new Employee(20, "David", "TX");
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		
	}
   
   @Test
   public void testGetSortedEmployees(){
	   List<Employee> sortedEmployeeList = helloWorld.getSortedEmployees(employeeList);
	   Employee emp1 = sortedEmployeeList.get(0);
	   Assert.assertEquals(emp1.getId(),10);
   }
   
   @Test
   public void testFilterAndCollectEmployee(){
	   List<Employee> filetredEmployeeList = helloWorld.filterAndCollectEmployee(employeeList);
	   Assert.assertEquals(filetredEmployeeList.size(),1);
   }
   
   
}
