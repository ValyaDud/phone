public class Main {
    public static void main(String[] args) {
        Phone phone = new IphonePhone();
        phone.setModel("Iphone 12 ");
        phone.setNumber(89137896);
        phone.setWeight(172.8);
        phone.showInfo();
        phone.receiveCall("Ilya \n");

        Phone phone1 = new SamsungPhone();
        phone1.setModel("Samsung Note 8 ");
        phone1.setNumber(892319777);
        phone1.showInfo();
        phone1.receiveCall("Walya \n");

        Phone phone3 = new PocoPhone();
        phone3.showInfo();
        phone3.receiveCall("Julia \n");
    }
}