public class Adress {

    private int id;
    private String street;
    private String cardinal;
    private String number;
    private String city;
    private String state;
    private String country;
    private String cp;

    public Adress() {
    }

    public Adress(String street, String cardinal, String number, String city, String state, String country, String cp) {
        this.street = street;
        this.cardinal = cardinal;
        this.number = number;
        this.city = city;
        this.state = state;
        this.country = country;
        this.cp = cp;
    }

    //getters

    public String getStreet() {
        return street;
    }

    public String getCardinal() {
        return cardinal;
    }

    public String getNumber() {
        return number;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public String getCp() {
        return cp;
    }

    //Setters:

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCardinal(String cardinal) {
        this.cardinal = cardinal;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    //tostring

    @Override
    public String toString() {

        return ">Adress: " + street + " " + number + "(" + cardinal + ")" + "-" + city + ", " + state + ", " + country + ". ZipCode: " + cp;

    }
}
