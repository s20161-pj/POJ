/*
 * SUMMARY: Exercises 07_02
 * AUTHOR: "Joanna Walkiewicz"
 */
package com.company;

public interface Auction {
    String name = null;
    void bid(User user, double price); //bid-podbicie ceny; interfejs

    String getSellerLogin();
    int getAuctionTime();
    void setInactive();
    boolean isActive();
}
