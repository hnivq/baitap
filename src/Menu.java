/*
* create date Nov 23, 2021
* create time: 5:43:47 PM
* author: hnivq
*/
public abstract class Menu {
	public Menu(){}

	public static void mainMenu()
	{
			System.out.println("        Menu        ");
			System.out.println("    01. Thêm        ");
			System.out.println("    02. Xóa         ");
			System.out.println("    03. Sửa         ");
			System.out.println("    04. Tìm kiếm    ");
			System.out.println("    05. Sắp xếp     ");
			System.out.println("    06. Thống kê    ");
			System.out.println("    00. Exit & Save ");
			System.out.println("____________________");
			System.out.print("Lựa chọn: ");
	}
	
	public static void menuAdd()
	{
			System.out.println("    	Menu chỉnh sửa		");
			System.out.println("    01. Thêm sản phẩm thực phẩm	");
			System.out.println("    02. Thêm sản phẩm sành sứ	");
			System.out.println("    03. Thêm sản phẩm đồ điện tử	");
			System.out.println("    00. Exit			");
			System.out.println("____________________________________");
			System.out.print("Lựa chọn: ");
	}
	
	public static void menuEdit()
	{
			System.out.println("    	Menu chỉnh sửa		");
			System.out.println("    01. Sửa ngày nhập hàng		");
			System.out.println("    02. Sửa giá nhập hàng		");
			System.out.println("    03. Sửa số lượng tồn kho	");
			System.out.println("    04. Sửa tên sản phẩm		");
			System.out.println("    00. Exit        		");
			System.out.println("____________________________________");
			System.out.print("Lựa chọn: ");
	}

	public static void menuSearch()
	{
			System.out.println("    	Menu chỉnh sửa		");
			System.out.println("    01. Tìm kiếm theo loại		");
			System.out.println("    02. Tìm kiếm theo giá		");
			System.out.println("    03. Tìm kiếm theo ngày		");
			System.out.println("    00. Exit			");
			System.out.println("____________________________________");
			System.out.print("Lựa chọn: ");
	}

	public static void menuSort()
	{
			System.out.println("    	Menu sắp xếp		");
			System.out.println("    01. Theo giá thấp đến cao   	");
			System.out.println("    02. Theo giá cao đến thấp	");
			System.out.println("    03. Theo loại và giá	        ");
			System.out.println("    04. Theo ngày cũ nhất	 	");
			System.out.println("    05. Theo ngày mới nhất	 	");
			System.out.println("    06. Theo loại và ngày	 	");
			System.out.println("    00. Exit        		");
			System.out.println("____________________________________");
			System.out.print("Lựa chọn: ");
	}
}
