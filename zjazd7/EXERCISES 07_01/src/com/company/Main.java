package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        CommonService commonService = new CommonAdapter();
        commonService.getTicketInfo("BA", "GDN", "LTN", new Date());
        commonService.getTicketInfo("UA", "GDN", "LTN", new Date());
    }
}
