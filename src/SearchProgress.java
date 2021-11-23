import java.util.Date;

/*
* create date Nov 23, 2021
* create time: 6:08:48 PM
* author: hnivq
*/
public abstract class SearchProgress {
	public static int searchProgress(int luaChon)
	{
		switch (luaChon) {
			case 0:
				Screen.clear();
				System.out.println("Bạn chọn thoát !!!");
				break;
			
			case 1:
				Screen.clear();
				System.out.print("Loại muốn tìm kiếm (Food, Ceramic, Electronic): ");
				String type = InputTool.input.nextLine();
				searchType(type);
				Screen.stop();
				break;

			case 2:
				Screen.clear();
				System.out.print("Giá thấp nhất muốn tìm kiếm: ");
				String minString = InputTool.input.nextLine();
				int min = Integer.parseInt(minString);
				System.out.print("Giá cao nhất muốn tìm kiếm: ");
				String maxString = InputTool.input.nextLine();
				int max = Integer.parseInt(maxString);
				searchPrice(min, max);
				Screen.stop();
				break;

			case 3:
				Screen.clear();
				System.out.println("Ngày cũ nhất muốn tìm kiếm: ");
				String oldest = InputTool.input.nextLine();
				System.out.println("Ngày gần nhất muốn tìm kiếm: ");			
				String lastest = InputTool.input.nextLine();
				searchDate(oldest, lastest);
				Screen.stop();

				break;

			default:
				Screen.clear();
				System.out.println("Chưa có tính năng này. Vui lòng chọn lại !!!");
				Screen.stop();
				break;
		}
		return luaChon;
	}
	
	private static void searchType(String type)
	{
		Screen.clear();
		int count = 0;
		TableStatistic.headTable();
		for (Stuff stuff : DanhSachQuanLy.list) {
			if(stuff.getType().equalsIgnoreCase(type))
			{
				stuff.statistics();
				count ++;
			}
		}
		if(count == 0)
			System.out.println("Không có sản phẩm phù hợp!!!");
		TableStatistic.endTable();
	}

	private static void searchPrice(int min, int max)
	{
		Screen.clear();
		int count = 0;
		TableStatistic.headTable();
		for (Stuff stuff : DanhSachQuanLy.list) {
			if (stuff.getImportPrice() >= min && stuff.getImportPrice() <= max)
			{
				stuff.statistics();
				count ++;
			}
		}
		if(count == 0)
			System.out.println("Không có sản phẩm phù hợp!!!");
		TableStatistic.endTable();
	}

	private static void searchDate(String oldest, String lastest)
	{
		Screen.clear();
		int count = 0;
		Date oldDate = FomatDate.nhapNgay(oldest);
		Date lastDate = FomatDate.nhapNgay(lastest);
		TableStatistic.headTable();
		for (Stuff stuff : DanhSachQuanLy.list) {
			if(stuff.getImportDate().compareTo(oldDate) >= 0 && stuff.getImportDate().compareTo(lastDate) <= 0 ){
				stuff.statistics();
				count ++;
			}
		}
		if(count == 0)
			System.out.println("Không có sản phẩm phù hợp!!!");
		TableStatistic.endTable();
	}
}
