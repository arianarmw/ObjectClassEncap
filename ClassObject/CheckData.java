/* Author : Ariana Rahmawati
 * Date   : September 10th 2022
 * Lesson : Object, Class, Encapsulation
 * Course : Object Oriented Programming (OOP)
 */

package ClassObject;

public class CheckData {
	//Atribut
		String Merk;
		String Variant;
		String NettWeight;
		String ExpDate;
		
		//Digunakan constructor
		CheckData () {
			System.out.println("\t------ JTK Mart Warehouse ------");
			System.out.println("\n");
			System.out.println("\tMerk : Pringles");
			System.out.println("\tVariant : Cheesy Cheese");
			System.out.println("\tNett Weight : 107gr");
			System.out.println("\tExpired Date : February 2023");
		}
}
