package Extends.models;

public class ForeignStudent extends Student {
    private String country;
    private String nativeLang;

    public ForeignStudent(String name, String lastname) {
        super(name, lastname);
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getNativeLang() {
        return nativeLang;
    }

    public void setNativeLang(String nativeLang) {
        this.nativeLang = nativeLang;
    }

    @Override
    public String toString() {
        String s = "ForeignStudent -> {\n" +
                "\tcountry='" + country + "',\n" +
                "\tnativeLang='" + nativeLang + "'\n" +
                '}' + "\n";
        return s + super.toString();
    }
}
