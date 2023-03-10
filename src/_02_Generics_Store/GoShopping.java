package _02_Generics_Store;

import _01_Generics_Vs_Object.GenericsList;

public class GoShopping {
	// 1. Look through other classes to see how they all interact.
	//
	//    There is a generic Cart class that can hold different 
	//    types of objects.
	//
	//    Candy and Cereal are Food objects
	//    Clothing and Toy are NonFood objects.
	
	public static void main(String[] args) {
		// 2. Create a Cart object of type Candy
		Cart<Candy> cart = new Cart<Candy>();
		
		// 3. Create another Cart object of type Cereal
		Cart<Cereal> cart1 = new Cart<Cereal>();
		
		// 4. Add a few items to EACH cart
		
		//cart.add(candy1.jpeg);
		//cart.add(candy2.jpeg);
		//cart1.add(cereal1.jpeg);
		//cart1.add(cereal2.jpeg);
		// 5. Call the showCart() method on EACH cart
		cart.showCart();
		cart1.showCart();
		// 6. Run the code
		
		// 7. Comment out the code you have so far
		
		// 8. Repeat steps 2-5 for a Clothing Cart and a Toy Cart
		Cart<> cart2 = new Cart[];
		Cart<Candy> cart3 = new Cart<Candy>();
		
		
		
		// Why are there errors?
		
		// 9. Modify the Cart class so that this code compiles
		// HINT: There are 3 lines of code to edit
				
		// 10. Run the code. Does it work?
		
	}
}
