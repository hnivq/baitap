import java.util.Date;

/*
* create date Nov 14, 2021
* create time: 8:30:14 PM
* author: hnivq
*/
public class Ceramic extends Stuff{
	private static int countCM = 1;
	private static int ceramicStuff;
	public Ceramic(Serial serial, String name, long importPrice, float inventory, Date imporDate) {
		super("Ceramic", serial ,name, importPrice, inventory, imporDate);
		countCM +=2;
		ceramicStuff++;
	}

		

	/**
	 * @param type
	 * @param serial
	 * @param name
	 * @param importPrice
	 * @param inventory
	 * @param importDate
	 */
	public Ceramic(String type, Serial serial, String name, long importPrice, float inventory, Date importDate) {
		super(type, serial, name, importPrice, inventory, importDate);
		countCM +=2;
		ceramicStuff++;
	}



	/**
	 * @return the ceramicStuff
	 */
	public static int getCeramicStuff() {
		return ceramicStuff;
	}



	/**
	 * @param ceramicStuff the ceramicStuff to set
	 */
	public static void setCeramicStuff(int ceramicStuff) {
		Ceramic.ceramicStuff = ceramicStuff;
	}



	/**
	 * @return the countCM
	 */
	public static int getCountCM() {
		return countCM;
	}



	/**
	 * @param countCM the countCM to set
	 */
	public static void setCountCM(int countCM) {
		Ceramic.countCM = countCM;
	}



	@Override
	protected String importPriceString() {
		return super.importPriceString() + "/món";
	}

	@Override
	protected String inventoryString() {
		return super.inventoryString() + " món";
	}
}
