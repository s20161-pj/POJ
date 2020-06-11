package com.company;

/*
 * SUMMARY: Exercises 07_01
 * AUTHOR: "Joanna Walkiewicz"
 */
import java.util.ArrayList;
import java.util.Date;

public class CommonAdapter implements CommonService {
    private UATicketService uaTicketService;
    private BATicketService baTicketService;

    @Override
    public ArrayList<CommonTicketInfo> getTicketInfo(String providerType, String from, String to, Date when) {
        if (providerType == "UA") {
            this.uaTicketService = new UATicketImpl();
            return this.fromUATicketToCommon(this.uaTicketService.getTicketInfo(from, to, when));
        }
        if (providerType == "BA") {
            Airport fromAirport = new Airport();
            fromAirport.airportCode = from;

            Airport toAirport = new Airport();
            toAirport.airportCode = to;

            this.baTicketService = new BATicketImpl();
            return this.fromBATicketToCommon(this.baTicketService.getTicketInfo(fromAirport, toAirport, when));
        }

        return null;
    }

    private ArrayList<CommonTicketInfo> fromUATicketToCommon(ArrayList<UATicketInfo> uaTicketInfoArrayList) {
        ArrayList<CommonTicketInfo> commonTicketInfoArrayList = new ArrayList<CommonTicketInfo>();

        for (UATicketInfo ticket : uaTicketInfoArrayList) {
            CommonTicketInfo commonTicketInfo = new CommonTicketInfo();
            commonTicketInfo.dateTime = ticket.dateTime;
            commonTicketInfo.price = ticket.price;
            commonTicketInfoArrayList.add(commonTicketInfo);
        }
        return commonTicketInfoArrayList;
    }

    private ArrayList<CommonTicketInfo> fromBATicketToCommon(ArrayList<BATicket> baTickets) {
        ArrayList<CommonTicketInfo> commonTicketInfoArrayList = new ArrayList<CommonTicketInfo>();

        for (BATicket ticket : baTickets) {
            CommonTicketInfo commonTicketInfo = new CommonTicketInfo();
            commonTicketInfo.dateTime = ticket.departureTime;
            commonTicketInfo.price = ticket.ticketPrice;
            commonTicketInfoArrayList.add(commonTicketInfo);
        }
        return commonTicketInfoArrayList;
    }
}
