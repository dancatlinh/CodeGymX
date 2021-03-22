import java.util.Scanner;

public class IOPhoneBook {

    static Scanner sc = new Scanner(System.in);

    public static PhoneBook findByPhoneNumber(String phone) {
        PhoneBook phoneNumber = null;
        for (PhoneBook p : PhoneBookManager.listPhoneBook) {
            if (p.getPhoneNumber().equals(phone)) {
                phoneNumber = p;
            }
        }
        return phoneNumber;
    }

    public static String phoneNumber() {
        while (true) {
            try {
                System.out.println("Nhập số điện thoại người dùng");
                String phoneNumber = sc.nextLine();
                boolean check = true;
                for (int i = 0; i < PhoneBookManager.listPhoneBook.size(); i++) {
                    if(PhoneBookManager.listPhoneBook.get(i).getPhoneNumber().equals(phoneNumber)) {
                        System.out.println("Nhập trùng số điện thoại");
                        check = false;
                        break;
                    } else if(check) {
                        return phoneNumber;
                    }
                }
                return phoneNumber;
            } catch (Exception e) {
                System.out.println("Nhập sai số điện thoại");
            }
        }
    }

public static String groupPhoneBook() {
        while (true) {
            try {
                System.out.println("Nhập nhóm danh bạ");
                String groupPhoneBook = sc.nextLine();
        if(!groupPhoneBook.trim().equals("")) {
return groupPhoneBook;
        } else {
throw new Exception();
        }
            } catch (Exception e) {
                System.out.println("Nhập sai nhóm danh bạ ");
            }
        }
}

public static String nameContact() {
    while (true) {
        try {
            System.out.println("Nhập tên người liên lạc");
            String nameContact = sc.nextLine();
            if(!nameContact.trim().equals("")) {
                return nameContact;
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Nhập sai tên người dùng ");
        }
    }
}

public static String gender() {
    while (true) {
        try {
            System.out.println("Nhập giới tính");
            String gender = sc.nextLine();
            if(!gender.trim().equals("")) {
                return gender;
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Nhập sai giới tính ");
        }
    }
}

    public static String adress() {
        while (true) {
            try {
                System.out.println("Nhập địa chỉ");
                String adress = sc.nextLine();
                if(!adress.trim().equals("")) {
                    return adress;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Nhập sai địa chỉ ");
            }
        }
    }

    public static String birthday() {
        while (true) {
            try {
                System.out.println("Nhập ngày sinh");
                String birthday = sc.nextLine();
                if(!birthday.trim().equals("")) {
                    return birthday;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Nhập sai ngày sinh ");
            }
        }
    }

    public static String email() {
        while (true) {
            try {
                System.out.println("Nhập địa chỉ email");
                String email = sc.nextLine();
                if(!email.trim().equals("")) {
                    return email;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Nhập sai địa chỉ ");
            }
        }
    }

public static PhoneBook addPhoneBook() {
return new PhoneBook(phoneNumber(),groupPhoneBook(),nameContact(),gender(),adress(),birthday(),email());
}



}
