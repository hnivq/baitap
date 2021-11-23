/*
* create date Nov 19, 2021
* create time: 8:06:53 AM
* author: hnivq
*/
public class TableStatistic {
	public static void headTable()
	{
		System.out.println("╒══════════════════╤═════════════════════════╤════════════════╤═════════════════════╤═════════════╤═══════════╕");
		System.out.printf("│%18s│%25s│%16s│%21s│%13s│%11s│\n","Loại","Tên hàng","Mã hàng","Giá nhập","Tồn kho","Ngày nhập");
		System.out.println("╞══════════════════╪═════════════════════════╪════════════════╪═════════════════════╪═════════════╪═══════════╡");
	}

	public static void endTable()
	{
		System.out.println("╘══════════════════╧═════════════════════════╧════════════════╧═════════════════════╧═════════════╧═══════════╛");
	}
}
