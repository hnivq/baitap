import java.util.Date;

/*
* create date Nov 14, 2021
* create time: 8:32:56 PM
* author: hnivq
*/
public class FoodManager {
	// DanhSachQuanLy foodList;
	public static Food inputFood()
	{
		Food food = null;
		System.out.println("Tên sản phẩm: ");
		String name = InputTool.input.nextLine(); 
		if(Check.checkName(name) == false)
		{
			do {
				Screen.clear();
				System.out.println("Tên của sản phẩm bị trùng lặp vui lòng nhập lại!!!");
				System.out.println("Tên sản phẩm: ");
				name = InputTool.input.nextLine();
			} while (Check.checkName(name) == false);
		}
		System.out.println("Giá nhập trên 1kg sản phẩm: ");
		String importPriceString = InputTool.input.nextLine();
		long importPrice = Long.parseLong(importPriceString);
		System.out.println("Số tấn tồn kho: ");
		String inventoryString = InputTool.input.nextLine();
		float inventory = Float.parseFloat(inventoryString);
		System.out.println("Ngày nhập hàng: ");
		String ngayNhapString = InputTool.input.nextLine();
		Date importDate = FomatDate.nhapNgay(ngayNhapString);
		if(Check.checkDate(ngayNhapString) == false)
		{
			do {
				System.out.println("Ngày nhập không hợp lệ vui lòng nhập lại!!!");
				System.out.println("Ngày nhập hàng: ");
				ngayNhapString = InputTool.input.nextLine();
				importDate = FomatDate.nhapNgay(ngayNhapString);
			} while (Check.checkDate(ngayNhapString) == false);
		}
		Serial serial = new Serial("FD", Food.getCountFD());
		food = new Food(serial, name, importPrice, inventory, importDate);		
		return food;
	}

	public FoodManager()
	{
		// foodList = new DanhSachQuanLy();
	}

}
