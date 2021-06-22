/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.vinylstilos.model;

/**
 *
 * @author Lenovo
 */
public class Sale {
     /**
     * @return the idSale
     */
    public String getIdSale() {
        return idSale;
    }

    /**
     * @param idSale the idSale to set
     */
    public void setIdSale(String idSale) {
        this.idSale = idSale;
    }

    /**
     * @return the idUser
     */
    public String getIdUser() {
        return idUser;
    }

    /**
     * @param idUser the idUser to set
     */
    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    /**
     * @return the totalScore
     */
    public float getTotalScore() {
        return totalScore;
    }

    /**
     * @param totalScore the totalScore to set
     */
    public void setTotalScore(float totalScore) {
        this.totalScore = totalScore;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    public Sale(String idSale, String idUser, float totalScore, String date) {
        this.idSale = idSale;
        this.idUser = idUser;
        this.totalScore = totalScore;
        this.date = date;
    }

    public Sale() {
    }
    
    private String idSale;
    private String idUser;
    private float totalScore;
    private String date;
         
}
