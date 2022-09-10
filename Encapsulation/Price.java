/* Author : Ariana Rahmawati
 * Date   : September 10th 2022
 * Lesson : Object, Class, Encapsulation
 * Course : Object Oriented Programming (OOP)
 */

package Encapsulation;

public class Price {
private int itemPrice;
	
	public String Merk;
	public String Variant;
	public String NettWeight;
	public String ExpDate;
	public String Price;
	
	public void setPrice (int price) {
		itemPrice = price;
	}
	
	public int getPrice() {
		return itemPrice;
	}
}