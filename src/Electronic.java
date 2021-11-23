import java.util.Date;

/*
* create date Nov 14, 2021
* create time: 8:31:23 PM
* author: hnivq
*/
public class Electronic extends Stuff{
	private static int countEC = 1;
	private static int electronicStuff;
	public Electronic(Serial serial ,String name, long importPrice, float inventory, Date imporDate) {
		super("Electronic",serial, name, importPrice, inventory, imporDate);
		countEC +=2;
		electronicStuff++;
	}

	
	
	
	
	/**
	 * @param type
	 * @param serial
	 * @param name
	 * @param importPrice
	 * @param inventory
	 * @param importDate
	 */
	public Electronic(String type, Serial serial, String name, long importPrice, float inventory, Date importDate) {
		super(type, serial, name, importPrice, inventory, importDate);
		countEC +=2;
		electronicStuff++;
	}





	/**
	 * @return the electronicStuff
	 */
	public static int getElectronicStuff() {
		return electronicStuff;
	}





	/**
	 * @param electronicStuff the electronicStuff to set
	 */
	public static void setElectronicStuff(int electronicStuff) {
		Electronic.electronicStuff = electronicStuff;
	}





	/**
	 * @return the countEC
	 */
	public static int getCountEC() {
		return countEC;
	}



	/**
	 * @param countEC the countEC to set
	 */
	public static void setCountEC(int countEC) {
		Electronic.countEC = countEC;
	}



	@Override
	protected String importPriceString() {
		return super.importPriceString() + "/chiếc";
	}

	@Override
	protected String inventoryString() {
		return super.inventoryString() + " cái";
	}
}
