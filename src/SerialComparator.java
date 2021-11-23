import java.util.Comparator;

/*
* create date Nov 21, 2021
* create time: 11:21:21 AM
* author: hnivq
*/
public class SerialComparator implements Comparator<Stuff>{
	@Override
	public int compare(Stuff stuff1, Stuff stuff2) {
		if(stuff1.getSerial().getSerialNum() == stuff2.getSerial().getSerialNum())
			return 0;
		else if(stuff1.getSerial().getSerialNum() > stuff2.getSerial().getSerialNum())
			return 1;
		else
			return -1;
	}
}
