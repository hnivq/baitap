/*
* create date Nov 23, 2021
* create time: 6:23:19 PM
* author: hnivq
*/
public abstract class AddProgress {
	public static int addProgress(int luaChon)
	{
		switch (luaChon) {
			case 0:
				Screen.clear();
				System.out.println("Bạn chọn thoát !!!");
				System.out.println("____________________");
				break;
			
			case 1:
				Screen.clear();
				System.out.println("Thêm thực phẩm");
				addFood();
				break;

			case 2:
				Screen.clear();
				System.out.println("Thêm đồ sành sứ");
				addCeramic();
				break;

			case 3: 
				Screen.clear();
				System.out.println("Thêm đồ điện tử");
				addElectronic();
				break;
		
			default:
				Screen.clear();
				System.out.println("Chưa có tính năng này. Vui lòng chọn lại !!!");
				System.out.println("____________________");
				break;
		}
		return luaChon;
	}

	private static void addFood()
	{
		Food food = FoodManager.inputFood();
		DanhSachQuanLy.list.add(food);
	}

	private static void addCeramic()
	{
		Ceramic ceramic = CeramicManage.inputCeramic();
		DanhSachQuanLy.list.add(ceramic);
	}

	private static void addElectronic()
	{
		Electronic electronic = ElectronicManager.inputElectronic();
		DanhSachQuanLy.list.add(electronic);
	}
}
