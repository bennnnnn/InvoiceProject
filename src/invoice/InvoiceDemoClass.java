package invoice;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InvoiceDemoClass {
	 

 
	 
	 
		public static void main(String[] args) {
			
			String response; // this holds the users response to continue or not
			double totalPrice = 0; // this holds the total price of the items
            double tax;     // The tax applied to the price of the items
            double grandTotal; // this holds the sum of the price and the tax
            double price; // holds price of an item
             

            
		ArrayList <String> s = new ArrayList<String>(); // an arraylist object to store items
		ArrayList <Double> D = new ArrayList<Double>();
		
			 Scanner scan = new Scanner(System.in); // Scanner object for keyboard input
			
				   ProductClass p = new ProductClass("", 0, 0); // product class object
				 
				   do {// a do ... while loop to ask if the user wants to continue to add products.
					   
					System.out.println("Enter product name:?"); // prompt user to enter an item/product
					String item = scan.nextLine();  // get an item/product
				    p.setProductDesc(item); // add the item to the p object
					s.add(item); // add item to the array
					System.out.println("Enter price: "); // prompt user to enter the price of the item.
					 price = scan.nextDouble(); // Get the price from the keyboard input
					 p.setProductPrice(price);
				     
					 	         
			            
				     D.add( price); // add the price to the array

			        
                       scan.nextLine();// remove buffer
				   
				   
					System.out.println( " Do you want to add more products?"); // ask the user to continue or not
					 response=scan.nextLine();  // get the users respone
					 
		}	 
				    while(response.equalsIgnoreCase( "yes")); // if user entered yes, continue to add items.
				   
 			    
				   
				   System.out.println("Enter tax rate: "); // Ask the user for the tax rate 
					
					double taxRate = scan.nextDouble();
					 p.setTaxRate(taxRate);
					 
					 System.out.println( "Thank you for buying from us.");
					 System.out.println( "The list of items you purchased is below:\r\r " );
					
					for (int i=0;i<s.size();i++) {
					 
						System.out.println("Item " +(i+1) +": \t\t"+s.get( i)+ " \t\t"+D.get( i)+"$"  ); // get items and their prices
					}				
				 
					 
					 
					for (int i = 0; i < D.size(); i++) {   // add all the prices entered
					 totalPrice = totalPrice + D.get( i);
					}
					  tax = totalPrice *(p.getTaxRate()/100);
					  grandTotal =totalPrice +tax;
					  
					  System.out.println("\r\rTax Rate\t\t"+ p.getTaxRate()+"%");
                     System.out.println( "Tax charged:\t\t"+tax +"$");
					 System.out.println("Grand total: \t\t"+(grandTotal)+"$");
					 
				}

				 
		}


