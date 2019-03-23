package com.gs.ilp.corejava.collectionsFramework2.maps;

import java.util.HashMap;
import java.util.Map;

class Employee{
    private Integer id;
    private String name;
    private String city;

    public Employee(Integer id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

	
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + "]";
	}


}

public class HashMapUserDefinedObjectExample {
    public static void main(String[] args) {
        Map<Integer, Employee> employeesMap = new HashMap<>();

        Employee emp1 = new Employee(12, "Steve", "London");
        Employee emp2 = new Employee(13, "Mark", "Delhi");
        Employee emp3 = new Employee(14, "Rajiv", "GGN");

        employeesMap.put(1, emp1);
        employeesMap.put(2, emp2);
        employeesMap.put(3, emp3);


        
        System.out.println(employeesMap);
    }
}