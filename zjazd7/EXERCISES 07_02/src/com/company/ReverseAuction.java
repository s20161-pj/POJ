/*
 * SUMMARY: Exercises 07_02
 * AUTHOR: "Joanna Walkiewicz"
 */
package com.company;

public class ReverseAuction extends BaseAuction implements Auction {
    public ReverseAuction(String name, String description, double startingPrice, int auctionTime, User seller, int minTrustPoints) {
        super(name, description, startingPrice, auctionTime, seller, minTrustPoints);
    }            //aukcja odwrotna
    @Override
    public void bid(User user, double price) {
       this.startingPrice = this.startingPrice - 1;
    }

    @Override
    public String toString(){
        return super.name+" "+super.description+" Typ: Reverse";
    }
}
