import java.util.Date;

/*
* create date Nov 14, 2021
* create time: 8:27:42 PM
* author: hnivq
*/
public class Food extends Stuff {
	private static int countFD = 1;
	private static int foodStuff;
	public Food(Serial serial, String name, long importPrice, float inventory, Date importDate) {
		super("Food", serial ,name, importPrice, inventory, importDate);
		countFD += 2;
		foodStuff++;
		
	}


	/**
	 * @param type
	 * @param serial
	 * @param name
	 * @param importPrice
	 * @param inventory
	 * @param importDate
	 */
	public Food(String type, Serial serial, String name, long importPrice, float inventory, Date importDate) {
		super(type, serial, name, importPrice, inventory, importDate);
		countFD +=2;
		foodStuff++;
	}

	@Override
	public long getTotalPrice() {
		return super.getTotalPrice()*1000;
	}

	/**
	 * @return the foodStuff
	 */
	public static int getFoodStuff() {
		return foodStuff;
	}


	/**
	 * @param foodStuff the foodStuff to set
	 */
	public static void setFoodStuff(int foodStuff) {
		Food.foodStuff = foodStuff;
	}


	/**
	 * @return the countFD
	 */
	public static int getCountFD() {
		return countFD;
	}



	/**
	 * @param countFD the countFD to set
	 */
	public static void setCountFD(int countFD) {
		Food.countFD = countFD;
	}

	@Override
	protected String importPriceString() {
		return super.importPriceString() + "/kg";
	}

	@Override
	protected String inventoryString() {
		return super.inventoryString() + " tấn";
	}
}
