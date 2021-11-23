
import java.util.Collections;
import java.util.LinkedList;


/*
* create date Nov 14, 2021
* create time: 8:40:20 PM
* author: hnivq
*/
public class DanhSachQuanLy {
 	static LinkedList<Stuff> list;

	public DanhSachQuanLy()
	{
		list = new LinkedList<>();
	}

	public void add(Stuff stuff)
	{
		if(stuff == null)
			System.out.println("Cập nhật thông tin thành công !!!");
		else
			list.add(stuff);
	}

	public void delete(String serial)
	{
		for (Stuff stuff : list) {
			if(stuff.serialString().equalsIgnoreCase(serial))
			{
				list.remove(list.indexOf(stuff)) ;
				break;
			}
		}
		Stuff.setTotalStuff(Stuff.getTotalStuff() - 1);

		String txt[] = serial.split(" ");
		if(txt[0].equalsIgnoreCase("FD"))
		{
			Food.setFoodStuff(Food.getFoodStuff() - 1);			
		}
		else if(txt[0].equalsIgnoreCase("CM"))
		{
			Ceramic.setCeramicStuff(Ceramic.getCeramicStuff() - 1);
		}
		else
		{
			Electronic.setElectronicStuff(Electronic.getElectronicStuff() - 1);
		}
		show();
		Screen.stop();
		
	}

	public void show()
	{	
		Screen.clear();
		Collections.sort(list, new SerialComparator());
		TableStatistic.headTable();
		for (Stuff stuff : list) {
			if(stuff instanceof Food)
			{
				stuff.statistics();
			}
		}
		for (Stuff stuff : list) {
			if(stuff instanceof Ceramic)
			{
				stuff.statistics();
			}
		}
		for (Stuff stuff : list) {
			if(stuff instanceof Electronic)
			{
				stuff.statistics();
			}
		}
		TableStatistic.endTable();
	}

	public void them()
	{
		int luaChon;
		do {
			Screen.clear();
			SortProgress.sortType();
			show();
			Menu.menuAdd();
			String luaChonString = InputTool.input.nextLine();
            		luaChon = Integer.parseInt(luaChonString);
			AddProgress.addProgress(luaChon);
		}while(luaChon != 0);
	}

	public void sort()
	{
		Screen.clear();
		int luaChon;
		do {
			Screen.clear();
			Menu.menuSort();
			String luaChonString = InputTool.input.nextLine();
            		luaChon = Integer.parseInt(luaChonString);
			SortProgress.sortProgress(luaChon);
		} while (luaChon != 0);
	}
	
	public void edit(String serial)
	{
		show();
		int luaChon;
		do {
			Screen.clear();
			TableStatistic.headTable();
			for (Stuff stuff : list) {
				if(stuff.serialString().equalsIgnoreCase(serial))
					stuff.statistics();
			}
			TableStatistic.endTable();
			Menu.menuEdit();
			String luaChonString = InputTool.input.nextLine();
            		luaChon = Integer.parseInt(luaChonString);
			EditProgress.editProgress(luaChon,serial);
			
		} while (luaChon != 0);
	}

	public void search()
	{
		int luaChon;
		do {
			Screen.clear();
			Menu.menuSearch();
			String luaChonString = InputTool.input.nextLine();
			luaChon = Integer.parseInt(luaChonString);
			SearchProgress.searchProgress(luaChon);
		} while (luaChon != 0);
	}

	public void statisticsList()
	{
		System.out.print("Tổng số lượng hàng của kho: ");
		System.out.println(Stuff.getTotalStuff());
		System.out.println("Bao gồm: \n");
		System.out.printf("%s %6d món\n","Food:",Food.getFoodStuff());
		TableStatistic.headTable();
		for (Stuff stuff : list) {
			if(stuff instanceof Food)
				stuff.statistics();	
		}
		TableStatistic.endTable();
		System.out.printf("%s %4d món\n","Ceramic:",Ceramic.getCeramicStuff());
		TableStatistic.headTable();
		for (Stuff stuff : list) {
			if(stuff instanceof Ceramic)
				stuff.statistics();
		}
		TableStatistic.endTable();
		System.out.printf("%s %d món\n","Electronic:",Electronic.getElectronicStuff());
		TableStatistic.headTable();
		for (Stuff stuff : list) {
			if(stuff instanceof Electronic)
				stuff.statistics();
		}
		TableStatistic.endTable();
		System.out.println("Tổng giá trị hàng hóa của kho: " + FomatNumber.formatNumString(totalPrice()));

	}

	private long totalPrice()
	{
		long totalPrice = 0;
		for (Stuff stuff : list) {
			totalPrice += stuff.getTotalPrice();
		}
		return totalPrice;
	}
}
