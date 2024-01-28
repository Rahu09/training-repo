package com.hexaware.exceptionHandling;

//class representing custom exception
class Myexcep extends Exception {
 public Myexcep(int age) {
     // calling the constructor of parent Exception
     System.err.println("error is :" + age);
 }
}