package com.gs.ilp.corejava.collectionsFramework2.maps;

import java.util.HashMap;
import java.util.Map;

public class CreateHashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<Object, Integer> numberMapping = new HashMap<>();

        // Adding key-value pairs to a HashMap
        numberMapping.put("One", 1);
        numberMapping.put("Two", 2);
        numberMapping.put("Four", 3);

        // Add a new key-value pair only if the key does not exist in the HashMap, or is mapped to `null`
        numberMapping.putIfAbsent("Three", 5);
        
        numberMapping.put("One", 343);
        
        numberMapping.put(null, 323);
        
        numberMapping.put(null, 3233);
        
        numberMapping.put(null, 3233);



        System.out.println(numberMapping);
    }
}