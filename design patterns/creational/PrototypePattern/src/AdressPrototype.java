public abstract class AdressPrototype implements Cloneable {
    private String street;
    private String no;
    private String district;
    private String city;

    public AdressPrototype(String street, String no, String district, String city) {
        this.street = street;
        this.no = no;
        this.district = district;
        this.city = city;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void printAdress() {
        System.out.println(street);
        System.out.println(no);
        System.out.println(district);
        System.out.println(city);
        System.out.println(hashCode());
    }

}
