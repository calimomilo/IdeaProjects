package cours2;

public class SoftwareLicense extends Product {
    private String version;
    private String donwloadLink;

    public SoftwareLicense(String name, double price, double shipping, String version, String donwloadLink) {
        super(name, price, shipping);
        this.version = version;
        this.donwloadLink = donwloadLink;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDonwloadLink() {
        return donwloadLink;
    }
}
