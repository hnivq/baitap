import java.util.Date;

/*
* create date Nov 23, 2021
* create time: 6:52:04 PM
* author: hnivq
*/
public abstract class Check {
	public static boolean checkName(String name)
	{
		boolean check = true;
		for (Stuff stuff : DanhSachQuanLy.list) {
			if(stuff.getName().equalsIgnoreCase(name))
				return false;
		}
		return check;
	}

	public static boolean checkDate(String ngayNhapString)
	{
		Date importDate = FomatDate.nhapNgay(ngayNhapString);
		boolean check = true;
			if(importDate.getTime() > System.currentTimeMillis())
			{
				return false;
			}
		return check;
	}

	public static boolean checkSerial(String serial)
	{
		boolean check = true;
		
		for (Stuff stuff : DanhSachQuanLy.list) {
		    	if(stuff.serialString().equalsIgnoreCase(serial))
			{
				return check = true;
			}
		    	else
		   	{
				check = false;
		    	}
		}
		System.out.println("Mã hàng này không tồn tại !!!");
		return check;
	}
}
