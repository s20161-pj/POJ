/*
 * SUMMARY: Exercises 07_01
 * AUTHOR: "Joanna Walkiewicz"
 */
package com.company;

import java.util.ArrayList;
import java.util.Date;

public interface BATicketService {
    ArrayList<BATicket> getTicketInfo(Airport from, Airport to, Date
            when);
}