package LW03;

public class Temperature {

    private double celsius;

    public Temperature(){
        this.celsius =0.0;
    }

    public Temperature(double celsius){
        this.celsius = celsius;
    }

    public double getCelsius() {
        return celsius;
    }
    public double getFahrenheit() {
        return celsius * 9/5 + 32;
    }
    public void setCelsius(double celsius) {
        this.celsius =celsius;
    }
    public void setFahrenheit(double fahrenhite){
        this.celsius = (fahrenhite-32)*5/9;

    }
}
