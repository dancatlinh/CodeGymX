public class PhoneBook {
    private String phoneNumber;
    private String groupPhoneBook;
    private String nameContact;
    private String gender;
    private String address;
    private String birthday;
    private String email;

    public PhoneBook(String phoneNumber, String groupPhoneBook, String nameContact, String gender, String address, String birthday, String email) {
        this.phoneNumber = phoneNumber;
        this.groupPhoneBook = groupPhoneBook;
        this.nameContact = nameContact;
        this.gender = gender;
        this.address = address;
        this.birthday = birthday;
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGroupPhoneBook() {
        return groupPhoneBook;
    }

    public void setGroupPhoneBook(String groupPhoneBook) {
        this.groupPhoneBook = groupPhoneBook;
    }

    public String getNameContact() {
        return nameContact;
    }

    public void setNameContact(String nameContact) {
        this.nameContact = nameContact;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return
                 phoneNumber + "," +
                 groupPhoneBook + "," +
                nameContact + "," +
                gender + "," +
                 address + "," +
                 birthday + "," +
                email;
    }
}
