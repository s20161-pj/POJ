/*
 * SUMMARY: Exercises 07_02
 * AUTHOR: "Joanna Walkiewicz"
 */
package com.company;

public class BaseAuction implements Auction {
    protected String name;
    protected String description;
    protected double startingPrice;
    protected int auctionTime;
    protected boolean isActive;
    protected User buyer;
    protected User seller; //sprzedawca
    protected double bidPrice;  //oferowana cena
    protected int minTrustPoints; //minimalne punty zaufania

    public BaseAuction(String name, String description, double startingPrice, int auctionTime, User seller, int minTrustPoints) {
        this.name = name;
        this.description = description;
        this.startingPrice = startingPrice;
        this.auctionTime = auctionTime;
        this.seller = seller;
        this.minTrustPoints = minTrustPoints;
        this.isActive = true;
        this.bidPrice = 0.0;
    }

    @Override
    public void bid(User user, double price) {

    }

    public String getSellerLogin(){
        return this.seller.getLogin();
    }

    public int getAuctionTime(){
        return this.auctionTime;
    }

    public void setInactive(){
        this.isActive = false;
    }

    public boolean isActive() {
        return this.isActive;
    }
}
