package com.xworkz.laptop;

public class Laptop 
{
 public Laptop() {
	System.out.println(this.getClass().getSimpleName().concat("invoked default const"));
}
 public void start()
 {
	System.out.println("invoked start method"); 
 }
}
