// Task 1: Create a file Main.java in package com.driver
package com.driver;

public class Main {
    
     // Task 3: create main function in Main.java
    public static void main (String[] args) throws Exception {

        // Task 3: create an obj of class RWOnly
        RWOnly rownly = new RWOnly();

        // Task 4: Setting a value to name, by directly accessing it using obj and also try printing it Error: you might seen some error, please not it down in commnets
        // rownly.name = "Amit";
        // System.out.println(rownly.name);

        // Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
        // The field RWOnly.name is not visible
        // The field RWOnly.name is not visible
        // at com.driver.Main.main(Main.java:10)

        // Task 6: Now, trying to set a value to name in Main function using setter function
        rownly.setName("Amit");

        // Task 6: Now, trying to access it's value using getter function
        String name = rownly.getName();
        System.out.println(name);
    }
}