/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.models;

/**
 *
 * @author bkones
 */
public class Hosting {

    private int Id;
    private String websites;
    private long amount;

    public Hosting(int Id, String websites, long amount ) {
        this.Id = Id;
        this.websites = websites;
        this.amount = amount;
        
    }

    public int getId() {
        return Id;
    }

    public String getWebsites() {
        return websites;
    }

    public long getAmount() {
        return amount;
    }

}
