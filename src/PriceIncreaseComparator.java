import java.util.Comparator;

/*
* create date Nov 19, 2021
* create time: 10:00:31 PM
* author: hnivq
*/
public class PriceIncreaseComparator implements Comparator<Stuff>{
	@Override
	public int compare(Stuff stuff1,Stuff stuff2)
	{
		if(stuff1.getImportPrice() == stuff2.getImportPrice())
			return 0;
		else if(stuff1.getImportPrice() > stuff2.getImportPrice())
			return 1;
		else
			return -1;
	}
} 
