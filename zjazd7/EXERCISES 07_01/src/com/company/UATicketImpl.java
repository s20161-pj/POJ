package com.company;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class UATicketImpl implements UATicketService {
    @Override
    public ArrayList<UATicketInfo> getTicketInfo(String from, String to, Date when) {
        ArrayList<UATicketInfo> uaTicketInfoArrayList = new ArrayList<UATicketInfo>();
        if(from == "GDN" && to =="LTN") {
            UATicketInfo uaTicketInfo = new UATicketInfo();
            uaTicketInfo.dateTime = LocalDateTime.now();
            uaTicketInfo.price = 999;

            uaTicketInfoArrayList.add(uaTicketInfo);
        }

        return uaTicketInfoArrayList;
    }
}
