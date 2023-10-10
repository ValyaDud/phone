public abstract class Phone  implements Callable, Informable, Cloneable {

     private int number;
     private  String model;
    private double weight;

    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return model;
    }

    public int getNumber(){
        return number;
    }
    public void setNumber(int number){
        this.number = number;
    }

    public double getWeight(){
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Phone() {

        this.model = "UNKONWN";
        this.number = 0;
        this.weight = 0;

    }
    public void receiveCall(String name){

        System.out.printf("Calling %s \n", name);
    }
    public abstract void showInfo();

    public Phone clone () throws CloneNotSupportedException {
        return (Phone) super.clone();
    }
    public String toString() {
        return " Phone number = " + getNumber();
    }
}
