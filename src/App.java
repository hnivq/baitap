

public class App {
    public static void main(String[] args) throws Exception{
        Screen.clear();
        DanhSachQuanLy list = new DanhSachQuanLy();
        FileHandle.readFile();
        int luaChon;
        do {
            list.show();
            Menu.mainMenu();
            String luaChonString = InputTool.input.nextLine();
            luaChon = Integer.parseInt(luaChonString);

            switch (luaChon) {
                case 0:
                    Screen.clear();
                    FileHandle.saveFile();
                    System.out.println("Bạn chọn thoát !!!");
                    break;

                case 1:
                    list.them();
                    break;

                case 2:
                    System.out.print("Mã sản phẩm muốn xóa: ");
                    String serial = InputTool.input.nextLine();
                    if(Check.checkSerial(serial) == false)
                         break;
                    list.delete(serial);
                    break;

                case 3:
                    System.out.print("Mã sản phẩm cần chỉnh sửa: ");
                    serial = InputTool.input.nextLine();
                    if(Check.checkSerial(serial) == false) 
                        break;
                    list.edit(serial);
                    break;

                case 4:
                    list.search();
                    break;
                
                case 5:
                    list.sort();
                    break;

                case 6:
                    Screen.clear();
                    list.statisticsList();
                    Screen.stop();
                    break;
            
                default:
                    Screen.clear();
                    System.out.println("Chưa có tính năng này. Vui lòng chọn lại !!!");
                    Screen.stop();
                    break;
            }
        } while (luaChon != 0);
    }
}
