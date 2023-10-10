import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Phone phone = new IphonePhone();
        phone.setModel("Iphone 12 ");
        phone.setNumber(89137896);
        phone.setWeight(172.8);

        Phone phone1 = new SamsungPhone();
        phone1.setModel("Samsung Note 8 ");
        phone1.setNumber(892319777);

        Phone phone3 = new PocoPhone();

        try {
            Phone[] array = new Phone[60];
            for (int i = 0; i < array.length; i++) {
                if (i < 20) {
                    array[i] = phone1.clone();
                } else if (i > 20 && i < 40) {
                    array[i] = phone.clone();
                } else {
                    array[i] = phone3.clone();
                }

                array[i].setNumber(array[i].getNumber() + i);
            }
            System.out.println(Arrays.toString(array));
        } catch (CloneNotSupportedException exception) {
            System.out.println("Error");
        }
    }
}