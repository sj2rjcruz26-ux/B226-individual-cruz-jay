/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day16.discussion;

// LoadRegistrationApp
public class Method {
    
    public static void main(String[] args) {
        
    }

    
    public static void printName(String name, int age, double salary){
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
        return; //; exit the method
        
    }
}


/* 
public static void main(String[] args) {
        // invoke the method
        int result = sum(50, 50);
        System.out.println("The sum of the two numbers is " + result);
    }
    
syntax
    // return type: data type
    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(greet("Winter"));
    }
    
    public static String greet(String name) {
        return "Hello " + name;
    }
*/