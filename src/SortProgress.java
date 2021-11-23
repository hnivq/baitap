import java.util.Collections;

/*
* create date Nov 23, 2021
* create time: 6:32:42 PM
* author: hnivq
*/
public abstract class SortProgress {
	public static int sortProgress(int luaChon)
	{
		switch (luaChon) {
			case 0:
				Screen.clear();
				System.out.println("Bạn chọn thoát !!!");
				break;
			
			case 1:
				Screen.clear();
				sortPriceIncrease();
				Screen.stop();
				break;

			case 2:
				Screen.clear();
				sortPriceDecrease();
				Screen.stop();
				break;

			case 3:
				Screen.clear();
				sortTypeNPrice();
				Screen.stop();
				break;

			case 4:
				Screen.clear();
				sortOlestDate();
				Screen.stop();
				break;

			case 5:
				Screen.clear();
				sortLastestDate();
				Screen.stop();
				break;

			case 6:
				Screen.clear();
				sortTypeNDate();
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

	private static void sortPriceIncrease()
	{
		Collections.sort(DanhSachQuanLy.list, new PriceIncreaseComparator());
		TableStatistic.headTable();
		for (Stuff stuff : DanhSachQuanLy.list) {
			stuff.statistics();
		}
		TableStatistic.endTable();
	}

	private static void sortPriceDecrease()
	{
		Collections.sort(DanhSachQuanLy.list, new PriceDecreaseComparator());
		TableStatistic.headTable();
		for (Stuff stuff : DanhSachQuanLy.list) {
			stuff.statistics();
		}
		TableStatistic.endTable();
	}

	private static void sortTypeNPrice()
	{
		Collections.sort(DanhSachQuanLy.list, new PriceIncreaseComparator());
		TableStatistic.headTable();
		for (Stuff stuff : DanhSachQuanLy.list) {
			if(stuff instanceof Food)
			{
				stuff.statistics();
			}
		}
		for (Stuff stuff : DanhSachQuanLy.list) {
			if(stuff instanceof Ceramic)
			{
				stuff.statistics();
			}
		}
		for (Stuff stuff : DanhSachQuanLy.list) {
			if(stuff instanceof Electronic)
			{
				stuff.statistics();
			}
		}
		TableStatistic.endTable();
	}

	private static void sortOlestDate()
	{
		Collections.sort(DanhSachQuanLy.list,new DateOldestDate());
		TableStatistic.headTable();
		for (Stuff stuff : DanhSachQuanLy.list) {
			stuff.statistics();
		}
		TableStatistic.endTable();
	}

	private static void sortLastestDate()
	{
		Collections.sort(DanhSachQuanLy.list, new DateLastestComparator());
		TableStatistic.headTable();
		for (Stuff stuff : DanhSachQuanLy.list) {
			stuff.statistics();
		}
		TableStatistic.endTable();
	}

	private static void sortTypeNDate()
	{
		Collections.sort(DanhSachQuanLy.list, new DateOldestDate());
		TableStatistic.headTable();
		for (Stuff stuff : DanhSachQuanLy.list) {
			if(stuff instanceof Food)
			{
				stuff.statistics();
			}
		}
		for (Stuff stuff : DanhSachQuanLy.list) {
			if(stuff instanceof Ceramic)
			{
				stuff.statistics();
			}
		}
		for (Stuff stuff : DanhSachQuanLy.list) {
			if(stuff instanceof Electronic)
			{
				stuff.statistics();
			}
		}
		TableStatistic.endTable();
	}

	public static void sortType()
	{	
		Collections.sort(DanhSachQuanLy.list, new SerialComparator());
		TableStatistic.headTable();
		for (Stuff stuff : DanhSachQuanLy.list) {
			if(stuff instanceof Food)
			{
				stuff.statistics();
			}
		}
		for (Stuff stuff : DanhSachQuanLy.list) {
			if(stuff instanceof Ceramic)
			{
				stuff.statistics();
			}
		}
		for (Stuff stuff : DanhSachQuanLy.list) {
			if(stuff instanceof Electronic)
			{
				stuff.statistics();
			}
		}
		TableStatistic.endTable();
	}
}
