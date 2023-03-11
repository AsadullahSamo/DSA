package ABC;
public class Earthquake {
    String country, city;
    double magnitude;
    int year;

    public Earthquake(String country, String city, double magnitude, int year) {
        this.country = country;
        this.city = city;
        this.magnitude = magnitude;
        this.year = year;
    }
    public Earthquake(){}

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
