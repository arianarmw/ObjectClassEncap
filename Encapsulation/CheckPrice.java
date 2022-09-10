/* Author : Ariana Rahmawati
 * Date   : September 10th 2022
 * Lesson : Object, Class, Encapsulation
 * Course : Object Oriented Programming (OOP)
 */

package Encapsulation;

public class CheckPrice {
	public static void main(String[] args) {
		//Data merupakan objek
		Price Data = new Price();
		Data.Merk = "Pringles";
		Data.Variant = "Sour & Onion";
		Data.NettWeight = "107gr";
		Data.ExpDate = "February 2023";
		Data.setPrice(18000);
		System.out.println("\t------ JTK Mart Warehouse ------");
		System.out.println("\n");
		System.out.println("\tMerk          : "+ Data.Merk);
		System.out.println("\tVariant       : "+ Data.Variant);
		System.out.println("\tNett Weight   : "+ Data.NettWeight);
		System.out.println("\tExpired Date  : "+ Data.ExpDate);
		System.out.println("\tPrice         : Rp "+ Data.getPrice());
	}
}