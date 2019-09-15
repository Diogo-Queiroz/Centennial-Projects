package exercise1;

public class Patient {
    private int patientId;
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String province;
    private String postalCode;

    Patient (
            int pId, String fName,
            String lName, String add,
            String cty, String pro,
            String postCod
    ) {
        patientId = pId;
        firstName = fName;
        lastName = lName;
        address = add;
        city = cty;
        province = pro;
        postalCode = postCod;
    }

    Patient () {
        patientId = 0;
        firstName = "";
        lastName = "lName";
        address = "add";
        city = "cty";
        province = "pro";
        postalCode = "postCod";
    }

    // Getter and Setters

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getProvince() {
        return province;
    }
}
