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
             

            
		List <ProductClass> store = new ArrayList<ProductClass>(); // an arraylist object to store items
		
			 Scanner scan = new Scanner(System.in); // Scanner object for keyboard input
			
				   ProductClass p = new ProductClass("", 0, 0); // product class object
				 
				   do {// a do ... while loop to ask if the user wants to continue to add products.
					   
					System.out.println("Enter product name:?"); // prompt user to enter an item/product
					String item = scan.nextLine();  // get an item/product
					p.setProductDesc(item); // store it in the  productClass object
					 
					System.out.println("Enter price: "); // prompt user to enter the price of the item.
					 price = scan.nextDouble(); // Get the price from the keyboard input
				     scan.nextLine(); // remove buffer 
					p.setProductPrice(price); // add the price to the productClass objectimport java.util.*;		         
			            

			        

					 store.add(p); // add the price and the item in the arrayList object
				   
					System.out.println( " Do you want to add more products?"); // ask the user to continue or not
					 response=scan.nextLine();  // get the users respone
					 
				   }	 
				   while(response=="yes");
				   
				   
				   System.out.println("Enter tax rate: "); // Ask the user for the tax rate 
					
					double taxRate = scan.nextDouble();
					   p.setTaxRate(taxRate);
					
					for (ProductClass t : store) {
					 
						System.out.println(" Enered items: " +t.getProductDesc() );
					}				
				 
					 
					 
					for (int i = 0; i < store.size(); i++) {
					 totalPrice = totalPrice + store.get(i).getProductPrice();
					}
					  tax = totalPrice *(p.getTaxRate()/100);
					  grandTotal =totalPrice +tax;
                     System.out.println( "Tax due:"+tax);
					System.out.println("Grand total: "+(grandTotal));
					 
				}

				 
		}


