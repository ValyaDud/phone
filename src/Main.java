public class Main  {
    public static void main(String[] args) {
    String name = "Valya";


    Phone apple = new Phone(70, "Iphone" , 172d);
    apple.showInfo();
    apple.receiveCall(name);

    Phone samsung = new Phone(123, "Samsung");
    samsung.showInfo();
    samsung.receiveCall(name);

    Phone poco = new Phone();
    poco.showInfo();
    poco.receiveCall(name);
    }
}