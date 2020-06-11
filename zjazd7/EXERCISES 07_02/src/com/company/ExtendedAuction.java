/*
 * SUMMARY: Exercises 07_02
 * AUTHOR: "Joanna Walkiewicz"
 */
package com.company;

public class ExtendedAuction extends BaseAuction implements Auction {
    public ExtendedAuction(String name, String description, double startingPrice, int auctionTime, User seller, int minTrustPoints) {
        super(name, description, startingPrice, auctionTime, seller, minTrustPoints);
    }

    @Override
    public void bid(User user, double price) {
        if(price > this.startingPrice && price > this.bidPrice) {
            this.buyer = user;
            this.bidPrice = price;
            this.auctionTime++;
        }
    }

    @Override
    public String toString(){
        return super.name+" "+super.description+" Typ: Extended";
    }
}
