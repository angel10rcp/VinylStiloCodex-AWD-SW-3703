/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.vinylstilos.model;

/**
 *
 * @author Angel Cardenas
 */
public class Product {
  private String idProduct;
  private String nameProduct;
  private String descriptionProduct;
  private String imageProduct;
  private float priceProduct;
  private int amountProduct;
  private String categoryProduct;

    public Product(){     
   } 

    @Override
    public String toString() {
        return "Product{" + "idProduct=" + idProduct + ", nameProduct=" + nameProduct + ", descriptionProduct=" + descriptionProduct + ", imageProduct=" + imageProduct + ", priceProduct=" + priceProduct + ", amountProduct=" + amountProduct + ", categoryProduct=" + categoryProduct + '}';
    }
    
    

    public Product(String idProduct, String nameProduct, String descriptionProduct, String imageProduct, float priceProduct, int amountProduct, String categoryProduct) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.descriptionProduct = descriptionProduct;
        this.imageProduct = imageProduct;
        this.priceProduct = priceProduct;
        this.amountProduct = amountProduct;
        this.categoryProduct = categoryProduct;
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

    public String getDescriptionProduct() {
        return descriptionProduct;
    }

    public void setDescriptionProduct(String descriptionProduct) {
        this.descriptionProduct = descriptionProduct;
    }

    public String getImageProduct() {
        return imageProduct;
    }

    public void setImageProduct(String imageProduct) {
        this.imageProduct = imageProduct;
    }

    public float getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(float priceProduct) {
        this.priceProduct = priceProduct;
    }

    public int getAmountProduct() {
        return amountProduct;
    }

    public void setAmountProduct(int amountProduct) {
        this.amountProduct = amountProduct;
    }

    public String getCategoryProduct() {
        return categoryProduct;
    }

    public void setCategoryProduct(String categoryProduct) {
        this.categoryProduct = categoryProduct;
    }

    
  
  
}
