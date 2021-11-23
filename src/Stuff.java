import java.util.Date;

/*
* create date Nov 14, 2021
* create time: 5:00:00 PM
* author: hnivq
*/
public abstract class Stuff {
	private String type;
	private Serial serial;
	private String name;
	private long importPrice;
	private float inventory;
	private Date importDate;
	private static long totalStuff;
	
	public Stuff(){
	}	

	/**
	 * @param type
	 * @param serial
	 * @param name
	 * @param importPrice
	 * @param inventory
	 * @param imporDate
	 */
	public Stuff(String type, Serial serial, String name, long importPrice, float inventory, Date importDate) {
		this.type = type;
		this.name = name;
		this.serial = serial;
		this.importPrice = importPrice;
		this.inventory = inventory;
		this.importDate = importDate;
		totalStuff ++;
	}
	
	/**
	 * @param totalStuff the totalStuff to set
	 */
	public static void setTotalStuff(long totalStuff) {
		Stuff.totalStuff = totalStuff;
	}

	public static long getTotalStuff()
	{
		return totalStuff;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the serial
	 */
	public Serial getSerial() {
		return serial;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;	
	}
	/**
	 * @param list
	 */

	/**
	 * @return the importPrice
	 */
	public long getImportPrice() {
		return importPrice;
	}
	/**
	 * @param importPrice2 the importPrice to set
	 */
	public void setImportPrice(long importPrice) {
		this.importPrice = importPrice;
	}
	/**
	 * @return the inventory
	 */
	public float getInventory() {
		return inventory;
	}
	/**
	 * @param f the inventory to set
	 */
	public void setInventory(float inventory) {
		this.inventory = inventory;
	}
	/**
	 * @return the imporDate
	 */
	public Date getImportDate() {
		return importDate;
	}
	/**
	 * @param imporDate the imporDate to set
	 */
	public void setImportDate(Date importDate) {
		this.importDate = importDate;
	}

	public void statistics()
	{
		// System.out.println("-----------------------");
		// System.out.println("Loại: " + this.type);
		// System.out.println("Tên: " + this.name);
		// System.out.println("Mã hàng: " + serialString());
		// System.out.println("Tồn kho: " + inventoryString());
		// System.out.println("Ngày nhập kho: " + importDateString());
		// System.out.println("Giá nhập kho: " +  importPriceString());
		// System.out.println("-----------------------");

		System.out.printf("│%18s│%25s│%16s│%21s│%13s│%11s│\n",this.getType(),this.getName(),serialString(),importPriceString(),inventoryString(),importDateString());
	}

	public long getTotalPrice()
	{
		return (long)getInventory() * getImportPrice();
	}
	
	protected String serialString()
	{
		return serial.convert(serial.getSerialChar(),serial.getSerialNum());
	}

	protected String importDateString()
	{
		return FomatDate.formatDate.format(this.importDate);
	}

	protected String importPriceString()
	{
		return FomatNumber.formatNumString(this.importPrice);
	}

	protected String inventoryString()
	{
		return Float.toString(this.inventory);
	}

	@Override
	public String toString() {
		return this.type + ";" + this.name + ";" + serialString() + ";" + getImportPrice() + ";" + getInventory() + ";" + importDateString();
	}

}
