package com.thisconstructors;

public class Product {
        int id;
        double price;
       public Product(int id,double price) {
    	   this.id=id;
    	   this.price=price;
       }
       public boolean isSame(Product p) {
    	   if(p.id==this.id) {
    		   return true;
    	   }else {
    		   return false;
    	   }
    		   
    	   }
       public void test() {
    	   System.out.println("Product id is:"+id);
    	   System.out.println("Product price is:"+price);
    	   
       }
       
	public static void main(String[] args) {
		Product p=new Product(1,100);
		Product p1=new Product(2,200);
		  p.test();
		  p1.test();
		  System.out.println(p.isSame(p1));
		  System.out.println(p1.isSame(p));

	}

}
