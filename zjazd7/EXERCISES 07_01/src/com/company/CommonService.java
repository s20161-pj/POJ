/*
 * SUMMARY: Exercises 07_01
 * AUTHOR: "Joanna Walkiewicz"
 */
package com.company;

import java.util.ArrayList;
import java.util.Date;

public interface CommonService {
    ArrayList<CommonTicketInfo> getTicketInfo(String providerType, String from, String to, Date when);
}
