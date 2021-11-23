import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Date;

/*
* create date Nov 23, 2021
* create time: 5:39:46 PM
* author: hnivq
*/
public class FileHandle {
	public static void readFile() throws Exception{
		
		System.out.println("Bắt đầu đọc");
		try {
			Food food;
			Ceramic ceramic;
			Electronic electronic;
			FileReader fr = new FileReader("stuff.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = "";
			while(true)
			{
				line = br.readLine();
				if(line == null)
					break;
				String txt[] = line.split(";");
				String type = txt[0];
				String name = txt[1];
				String serialString = txt[2];
				String[] serialTxt = serialString.split(" ");
				String serialChar = serialTxt[0];
				String serialNumString = serialTxt[1];
				int serialNum = Integer.parseInt(serialNumString);
				Serial serial = new Serial(serialChar, serialNum);
				String importPriceString = txt[3];
				int importPrice = Integer.parseInt(importPriceString);
				String inventoryString = txt[4];
				float inventory = Float.parseFloat(inventoryString);
				String importDateString = txt[5];
				Date importDate = FomatDate.nhapNgay(importDateString);
				if(serialChar.equals("FD"))
				{
					food = new Food(type, serial, name, importPrice, inventory, importDate);
					DanhSachQuanLy.list.add(food);
				}
				else if(serialChar.equals("CM"))
				{
					ceramic = new Ceramic(type, serial, name, importPrice, inventory, importDate);
					DanhSachQuanLy.list.add(ceramic);
				}
				else
				{
					electronic = new Electronic(type, serial, name, importPrice, inventory, importDate);
					DanhSachQuanLy.list.add(electronic);
				}
			}
			br.close();
		} catch (Exception e) {
		}
	}
	
	public static void saveFile() throws Exception{
		System.out.println("Bắt đầu lưu");
		try {
			FileWriter fw = new FileWriter("stuff.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			for (Stuff stuff : DanhSachQuanLy.list) {
				bw.write(stuff.toString());
				bw.newLine();	
			}
			
			bw.close();
			fw.close();
		} catch (Exception e) {
		}
	}
}
