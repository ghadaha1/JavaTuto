public class Car {
    private String color ;
    private String Model ;
    private double weight;
    private int speed;

    void acceleration (int speed){
        System.out.println("increase the speed by "+speed);
    }
    void reverse(){

    }
    void increasesSpeed(){

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
