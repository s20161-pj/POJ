/*
 * SUMMARY: Exercises 07_01
 * AUTHOR: "Joanna Walkiewicz"
 */
package com.company;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class BATicketImpl implements BATicketService {
    @Override
    public ArrayList<BATicket> getTicketInfo(Airport from, Airport to, Date when) {
        ArrayList<BATicket> baTicketArrayList = new ArrayList<BATicket>();
        if(from.airportCode == "GDN" && to.airportCode =="LTN") {
            BATicket baTicket = new BATicket();
            baTicket.departureTime = LocalDateTime.now();
            baTicket.ticketPrice = 999;

            baTicketArrayList.add(baTicket);
        }

        return baTicketArrayList;
    }
}
