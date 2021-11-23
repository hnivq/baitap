import java.util.Comparator;

/*
* create date Nov 21, 2021
* create time: 9:49:59 AM
* author: hnivq
*/
public class DateLastestComparator implements Comparator<Stuff>{
	@Override
	public int compare(Stuff stuff1, Stuff stuff2) {
		if(stuff1.getImportDate() == stuff2.getImportDate())
			return 0;
		else if(stuff1.getImportDate().before(stuff2.getImportDate()))
		 	return 1;
		else
			return -1;
	}
}
