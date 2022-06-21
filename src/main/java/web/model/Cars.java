package web.model;

public class Cars {
    String model;
    int number;
    int serial;


    public Cars(String model, int number, int serial) {
        this.model = model;
        this.number = number;
        this.serial = serial;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSerial() {
        return this.serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

   

}
