/*
 * SUMMARY: Exercises 07_02
 * AUTHOR: "Joanna Walkiewicz"
 */
package com.company;

public class SimpleAuction extends BaseAuction implements Auction {

    public SimpleAuction(String name, String description, double startingPrice, int auctionTime, User seller, int minTrustPoints) {
        super(name, description, startingPrice, auctionTime, seller, minTrustPoints);
    }

    @Override
    public void bid(User user, double price) {
        if(price > this.startingPrice && price > this.bidPrice) {
            this.buyer = user;
            this.bidPrice = price;
        }
    }

    @Override
    public String toString(){
        return super.name+" "+super.description+" Typ: Simple";
    }
}
