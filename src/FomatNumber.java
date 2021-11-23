import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/*
* create date Nov 16, 2021
* create time: 7:07:33 PM
* author: hnivq
*/
public abstract class FomatNumber {
	static Locale locale = new Locale("vi", "VN");
	static DecimalFormat formatCurrency =(DecimalFormat)DecimalFormat.getCurrencyInstance(locale);
	static DecimalFormatSymbols formatSymbols = new DecimalFormatSymbols();
	
	public static String formatNumString(Long importPrice)
	{
		formatSymbols.setGroupingSeparator(',');
		formatSymbols.setCurrencySymbol("vnđ");
		formatCurrency.setDecimalFormatSymbols(formatSymbols);
		return formatCurrency.format(importPrice);
	}
}
