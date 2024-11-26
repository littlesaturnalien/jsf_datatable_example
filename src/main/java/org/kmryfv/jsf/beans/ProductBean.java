package org.kmryfv.jsf.beans;

import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;
import java.util.ArrayList;

@Named
@RequestScoped
public class ProductBean {
    private static ArrayList<Product> products = new ArrayList<Product>();
    private Product myProduct;

    public ProductBean() {
        setMyProduct(new Product());
    }

    public void addProduct() {
        if (myProduct.getId() == null || myProduct.getName().isEmpty() || myProduct.getPrice() == 0) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "All fields are required"));
            return;
        }
        products.add(myProduct);
        myProduct = new Product();
    }

    public void deleteProduct(Product product) {
        products.remove(product);
    }

    public void editProduct(Product product) {
        product.setEdit(true);
    }

    public void saveProduct() {
        Product product = null;
        for (int i = 0; i < products.size(); i++) {
            product = products.get(i);
            product.setEdit(false);
        }
    }
    public Product getMyProduct() {
        return myProduct;
    }

    public void setMyProduct(Product myProduct) {
        this.myProduct = myProduct;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
}
