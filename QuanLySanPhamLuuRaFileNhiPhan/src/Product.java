public class Product {
    private String idProduct;
    private String nameProduct;
    private String production;
    private double priceOfProduct;

    public Product() {
    }

    public Product(String idProduct, String nameProduct, String production, double priceOfProduct) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.production = production;
        this.priceOfProduct = priceOfProduct;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public double getPriceOfProduct() {
        return priceOfProduct;
    }

    public void setPriceOfProduct(double priceOfProduct) {
        this.priceOfProduct = priceOfProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct='" + idProduct + '\'' +
                ", nameProduct='" + nameProduct + '\'' +
                ", production='" + production + '\'' +
                ", priceOfProduct='" + priceOfProduct + '\'' +
                '}';
    }
}
