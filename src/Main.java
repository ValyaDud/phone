public class Main  {
    public static void main(String[] args) {



    Phone phone = new Phone(70, "Iphone" , 172d);
    phone.showInfo();
    phone.receiveCall("Ilya");

    Phone phone1 = new Phone(123, "Samsung");
    phone1.showInfo();
    phone1.receiveCall("Walya");

    Phone phone3 = new Phone();
    phone3.showInfo();
    phone3.receiveCall("Julia");
    }
}