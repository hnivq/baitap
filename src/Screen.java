/*
* create date Nov 17, 2021
* create time: 10:55:12 PM
* author: hnivq
*/
public class Screen {
	static public void clear()
	{
		try {
			new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
		} catch (Exception E) {
			{
				System.out.println(E);
			}
		}
	}
	
	static public void stop()
	{
		String stop;
		System.out.println("Nhấn phím bất kì để tiếp tục !!!");
		stop = InputTool.input.nextLine();
	}
}
