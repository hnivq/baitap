import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
* create date Nov 14, 2021
* create time: 8:49:06 PM
* author: hnivq
*/
public abstract class FomatDate {
	static SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");

	public static Date nhapNgay(String nhapNgay)
	{
		Date importDate = null;
		if(nhapNgay.equals(""))
			importDate = null;
		else
		{
			try{
				importDate = formatDate.parse(nhapNgay);
			}catch (ParseException ex){
				Logger.getLogger(Stuff.class.getName()).log(Level.SEVERE,null,ex);
			}
		}
		return importDate;
	}
	
}
