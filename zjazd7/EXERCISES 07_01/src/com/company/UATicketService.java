/*
 * SUMMARY: Exercises 07_01
 * AUTHOR: "Joanna Walkiewicz"
 */
package com.company;

import java.util.ArrayList;
import java.util.Date;

public interface UATicketService {
    ArrayList<UATicketInfo> getTicketInfo(String from, String to,
                                          Date when);
}