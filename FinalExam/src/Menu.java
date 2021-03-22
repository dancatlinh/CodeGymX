import java.util.Scanner;

public class Menu {
    public static void showMenu() {
        System.out.println("----CHƯƠNG TRÌNH QUẢN LÝ DANH BẠ----");
        System.out.println("Chọn chức năng theo số (để tiếp tục): ");
        System.out.println("1. Xem danh sách");
        System.out.println("2. Thêm mới");
        System.out.println("3. Cập nhật");
        System.out.println("4. Xóa");
        System.out.println("5. Tìm kiếm");
        System.out.println("6. Đọc từ file");
        System.out.println("7. Ghi vào file");
        System.out.println("8. Thoát");
        System.out.println("chọn chức năng");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int selection;
PhoneBookManager phoneBookManager = new PhoneBookManager();
do {
showMenu();
selection = sc.nextInt();
switch (selection) {
    case 1:
        phoneBookManager.displayPhoneBook();
        break;
    case 2:
phoneBookManager.addPhoneBook();
        break;
    case 3:
phoneBookManager.updatePhoneBook();
        break;
    case 4:
phoneBookManager.deleteProduct();
        break;
    case 5:
phoneBookManager.findByPhoneNumber();
        break;
    case 6:
phoneBookManager.ReadCSV();
        break;
    case 7:
phoneBookManager.WriteCSV();
        break;
    case 8:
        break;
    default:
        System.out.println("Nhập lại");
}
}while (selection!=8);
    }
}
