import java.util.ArrayList;

public class Shopping {

			    private double money;

			    // I myself always instantiate any list to avoid NullPointerExceptions
			    private ArrayList<String> items = new ArrayList<String>();

			    /**
			     * Use this constructor to add multiple items to the 'items' list.
			     */
			    public Shopping(double price, ArrayList<String> itemsToAdd) {
			        this.money = price;

			        // If you want to add multiple items, you can just reassign
			        // the 'items' property
			        items = itemsToAdd;

			        // Or you can just add all elements of 'itemsToAdd' to the
			        // 'items' property using the 'addAll()' method.
			        this.items.addAll(itemsToAdd);
			    }

			    /**
			     * Use this constructor if you want a single element to be added
			     * to the 'items' list.
			     */
			    public Shopping(double price, String itemToAdd) {
			        this.money = price;

			        // The ArrayList class inherits the method 'add()', which
			        // allows you to add an element to the list.
			        this.items.add(itemToAdd);
			    }
			}
