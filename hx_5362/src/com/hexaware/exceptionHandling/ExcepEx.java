package com.hexaware.exceptionHandling;


// class that uses custom exception InvalidAgeException
public class ExcepEx {

    // method to check the age
    static void show(int age) throws Myexcep {
        if (age > 60) {

            // throw an object of user defined exception
            throw new Myexcep(60);
        } else {
            System.out.println("congrats your age is " + age);
        }
    }

    // main method
    public static void main(String args[]) {
    	int p = 61;
    	ExcepEx a = new ExcepEx();
        try {
        	a.show(p);
        	int m = 9;
        	int n = 0;
        	int ans = m/n;
        	System.out.println(ans);
        	
        } catch (Myexcep ex) {
            System.out.println("Caught the exception");
            ex.printStackTrace();

            System.out.println("Exception occurred: " + ex);
        } catch(ArithmeticException e) {
            e.printStackTrace();
        	System.out.println("catch 2");
        	
        } catch(NumberFormatException n) {
            n.printStackTrace();
        	System.out.println("catch 3");
        	
        } catch(NullPointerException n){
			n.printStackTrace();
			System.out.println("catch4");
			
		} catch(Exception e) {
        	e.printStackTrace();
        	System.out.println("catch5");
        	
        } finally {
        	System.out.println("rest of code");
        }
        
    }
}
