import java.util.Date;

/*
* create date Nov 15, 2021
* create time: 7:57:53 PM
* author: hnivq
*/
public class ElectronicManager {
	// DanhSachQuanLy electronicList;

	public static Electronic inputElectronic()
	{
		Electronic electronic = null;
		
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
		System.out.println("Giá nhập trên 1cái sản phẩm: ");
		String importPriceString = InputTool.input.nextLine();
		long importPrice = Long.parseLong(importPriceString);
		System.out.println("Số lượng tồn kho: ");
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
		Serial serial = new Serial("EC", Electronic.getCountEC());
		electronic = new Electronic(serial,name, importPrice, inventory, importDate);	
		return electronic;
	}

	public ElectronicManager()
	{
		// electronicList = new DanhSachQuanLy();
	}

}
