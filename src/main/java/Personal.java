public class Personal {
    private int id;
    private String name;
    private String surname;
    private String dni;
    private String dob;
    private String charge;
    private String email;
    private String phone;
    private String doa;
    private Adress address;

    public Personal() {
    }

    public Personal(String name, String surname, String dni, String dob, String charge, String email, String phone, String doa) {
        this.name = name;
        this.surname = surname;
        this.dni = dni;
        this.dob = dob;
        this.charge = charge;
        this.email = email;
        this.phone = phone;
        this.doa = doa;
    }

    public Personal(int id, String name, String surname, String dni, String dob, String charge, String email, String phone, String doa) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.dni = dni;
        this.dob = dob;
        this.charge = charge;
        this.email = email;
        this.phone = phone;
        this.doa = doa;
    }

    public Personal(int id, String name, String surname, String dni, String dob, String charge, String email, String phone, String doa, Adress address) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.dni = dni;
        this.dob = dob;
        this.charge = charge;
        this.email = email;
        this.phone = phone;
        this.doa = doa;
        this.address = address;
    }

    //Getters:

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDni() {
        return dni;
    }

    public String getDob() {
        return dob;
    }

    public String getCharge() {
        return charge;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getDoa() {
        return doa;
    }

    public Adress getAddress() {
        return address;
    }
    //Setters:


    public void setId(int id) {
        this.id = id;
    }

    public void setDoa(String doa) {
        this.doa = doa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(Adress address) {
        this.address = address;
    }

    //To String method:

    @Override
    public String toString() {
        if (address != null) {
            return ">Id: " + id + "\n" +
                    ">Name: " + name + "\n" +
                    ">Surname: " + surname + "\n" +
                    ">DNI: " + dni + "\n" +
                    ">Date of Birth [dd/mm/yyyy]: " + dob + "\n" +
                    ">Charge: " + charge + "\n" +
                    ">E-mail:" + email + "\n" +
                    ">Phone:" + phone + "\n" +
                    ">Date of Admission [dd/mm/yyyy]: " + doa + "\n" +
                    "\n" +
                    address.toString() + "\n";
        } else {
            return "Id: " + id + "\n" +
                    "Name: " + name + "\n" +
                    "Surname: " + surname + "\n" +
                    "DNI: " + dni + "\n" +
                    "Date of Birth [dd/mm/yyyy]: " + dob + "\n" +
                    "Charge: " + charge + "\n" +
                    "E-mail:" + email + "\n" +
                    "Phone:" + phone + "\n" +
                    "Date of Admission [dd/mm/yyyy]: " + doa + "\n" +
                    "Address not Declared";
        }


    }
}
