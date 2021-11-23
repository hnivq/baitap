/*
* create date Nov 16, 2021
* create time: 1:24:02 PM
* author: hnivq
*/
public class Serial {
	private String serialChar;
	private long serialNum;	
	// Food FD ceramic CM electronic EC
	/**
	 * @param object
	 * @param string
	 * 
	 */

	public Serial(String serialChar, int serialNum) {
		this.serialChar = serialChar;
		this.serialNum = serialNum;
	}
	/**
	 * @return the serialChar
	 */
	public String getSerialChar() {
		return serialChar;
	}
	/**
	 * @param serialChar the serialChar to set
	 */
	public void setSerialChar(String serialChar) {
		this.serialChar = serialChar;
	}
	/**
	 * @return the serialNum
	 */
	
	public long getSerialNum() {
		return serialNum;
	}
	/**
	 * @param serialNum the serialNum to set
	 */
	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}

	public String convert(String serialChar, long serialNum)
	{
		String serial = null;
		if(serialNum >= 0 && serialNum <= 9)//FD 000001
		{
			serial = "00000" + serialNum;
			return serialChar + " " + serial;
		}
		else if(serialNum >= 10 && serialNum <=99)
		{
			serial = "0000" + serialNum;
			return serialChar + " " + serial;
		}
		else if(serialNum >= 100 && serialNum <= 999)
		{
			serial = "000" + serialNum;
			return serialChar + " " + serial;
		}
		else if(serialNum >=1000 && serialNum <= 9999)
		{
			serial = "00" + serialNum;
			return serialChar + " " + serial;
		}
		else if(serialNum >=10000 && serialNum <= 99999)
		{
			serial = "0" + serialNum;
			return serialChar + " " + serial;
		}
		else 
		{
			return serialChar + " " + serialNum;
		}
	}
	
	
}
