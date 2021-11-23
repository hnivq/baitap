import java.util.Date;

/*
* create date Nov 23, 2021
* create time: 6:45:43 PM
* author: hnivq
*/
public abstract class EditProgress {
	public static int editProgress(int luaChon, String serial)
	{
		switch (luaChon) {
			case 0:
				Screen.clear();
				System.out.println("Bạn chọn thoát !!!");
				break;
			
			case 1:
				editImportDate(serial);
				break;

			case 2:
				editPrice(serial);
				break;

			case 3:
				editInventory(serial);
				break;

			case 4:
				editName(serial);
				break;

			default:
				Screen.clear();
				System.out.println("Chưa có tính năng này. Vui lòng chọn lại !!!");
				Screen.stop();
				break;
		}
		return luaChon;
	}

	private static void editImportDate(String serial)
	{
		for (Stuff stuff : DanhSachQuanLy.list) {
			if(stuff.serialString().equalsIgnoreCase(serial))
				{
					System.out.print("Ngày nhập kho sản phẩm sửa lại thành: ");
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
					stuff.setImportDate(importDate);
				}
		}
	}

	private static void editPrice(String serial)
	{
		for (Stuff stuff : DanhSachQuanLy.list) {
			if(stuff.serialString().equalsIgnoreCase(serial))
				{
					System.out.print("Giá sản phẩm sửa lại thành: ");
					String amountString = InputTool.input.nextLine();
					int amount = Integer.parseInt(amountString);
					stuff.setImportPrice(amount);
				}
		}
	}

	
	private static void editInventory(String serial)
	{
		for (Stuff stuff : DanhSachQuanLy.list) {
			if(stuff.serialString().equalsIgnoreCase(serial))
				{
					System.out.print("Số lượng tồn kho sửa lại thành: ");
					String amountString = InputTool.input.nextLine();
					int amount = Integer.parseInt(amountString);
					stuff.setInventory(amount);
				}
		}
	}

	private static void editName(String serial)
	{
		for (Stuff stuff : DanhSachQuanLy.list) {
			if(stuff.serialString().equalsIgnoreCase(serial))
			{
				System.out.print("Tên sản phẩm sửa lại thành: ");
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
				stuff.setName(name);
			}
		}
	}
}
