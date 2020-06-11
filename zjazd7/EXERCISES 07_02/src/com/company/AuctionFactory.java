package com.company;

public class AuctionFactory {
    public Auction createAuction(String auctionType, String name, String description, double startingPrice, int auctionTime, User seller, int minTrustPoints){
        if (auctionType==null){
            return null;
        }
        if(auctionType.equalsIgnoreCase("Simple")){
            return new SimpleAuction(name, description, startingPrice, auctionTime, seller, minTrustPoints);
        }
        else if (auctionType.equalsIgnoreCase("Extended")){
            return new ExtendedAuction(name, description, startingPrice, auctionTime, seller, minTrustPoints);
        }
        else if (auctionType.equalsIgnoreCase("Reverse")){
            return new ReverseAuction(name, description, startingPrice, auctionTime, seller, minTrustPoints);
        }
        return null;
    }
}
