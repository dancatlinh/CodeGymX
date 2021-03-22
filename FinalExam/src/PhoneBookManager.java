import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneBookManager {
    Scanner sc = new Scanner(System.in);
    static List<PhoneBook> listPhoneBook = new ArrayList();

    public void addPhoneBook() {
        listPhoneBook.add(IOPhoneBook.addPhoneBook());
        System.out.println("Đã thêm thành chông");
    }

    public void displayPhoneBook() {
        System.out.println("Số điện thoại, Nhóm, Tên , Giới tính, Địa chỉ, Ngày sinh, Email");
        for (int i = 0; i < listPhoneBook.size(); i++) {
            System.out.println(listPhoneBook.get(i).toString());
            if (i%5 == 4 && i != listPhoneBook.size() - 1) {
                System.out.println("Ấn enter để xem tiếp");
sc.nextLine();
            }
        }
    }

    public void updatePhoneBook() {

        boolean check = true;
        while (check) {
            System.out.println("Nhập số điện thoại muốn sửa");
            String phoneNumber = sc.nextLine();
            check = false;
            for (int i = 0; i < listPhoneBook.size(); i++) {
                if (listPhoneBook.get(i).getPhoneNumber().equals(phoneNumber)) {
                    listPhoneBook.set(i, IOPhoneBook.addPhoneBook());
                    System.out.println("Cập nhật thành công");
                    return;
                }
            } System.out.println("Nhập sai số điện thoại");
            check = true;
            }
        }


    public void deleteProduct() {
        System.out.println("Nhập số điện thoại muốn xóa");
        String phoneNumber = sc.nextLine();

        for (int i = 0; i < listPhoneBook.size(); i++) {
            if (listPhoneBook.get(i).getPhoneNumber().equals(phoneNumber)) {
                listPhoneBook.remove(listPhoneBook.get(i));
                return;
            } else System.out.println("Nhập sai số điện thoại");
        }
    }

    public static PhoneBook findByPhoneNumber(String phone) {
        PhoneBook phoneNumber = null;
        for (PhoneBook p : PhoneBookManager.listPhoneBook) {
            if (p.getPhoneNumber().equals(phone)) {
                phoneNumber = p;
            }
        }
        return phoneNumber;
    }

    public void WriteCSV() {
        try {
            File file = new File("data/contacts.csv");
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < listPhoneBook.size(); i++) {
                bufferedWriter.write(listPhoneBook.get(i).toString() + "\n");
            }
            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void ReadCSV() {
        try {
            File file = new File("data/contacts.csv");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String read;
            while ((read = bufferedReader.readLine()) != null) {
                if (read.equals("")) {
                    continue;
                }
                String[] arr = read.split(",");
                String phoneNumber = arr[0];
                String groupPhoneBook = arr[1];
                String nameContact = arr[2];
                String gender = arr[3];
                String address = arr[4];
                String birthday = arr[5];
                String email = arr[6];
                listPhoneBook.add(new PhoneBook(phoneNumber,groupPhoneBook,nameContact,gender,address,birthday,email));
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}
