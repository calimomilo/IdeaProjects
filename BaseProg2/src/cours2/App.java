package cours2;

public class App extends Product {
    private String version;
    private String donwloadLink;

    public App(String name, double price, double shipping, String version, String donwloadLink) {
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

    @Override
    public boolean equals(Object object) {
        if (object instanceof App app) {
            return this.getName().equals(app.getName()) && this.getPrice() == app.getPrice() &&
                    this.getShipping() == app.getShipping() && this.getVersion().equals(app.getVersion()) &&
                    this.getDonwloadLink().equals(app.getDonwloadLink());
        }
        return false;
    }
}
