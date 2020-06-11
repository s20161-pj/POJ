/*
 * SUMMARY: Exercises 07_02
 * AUTHOR: "Joanna Walkiewicz"
 */
package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class AuctionSystem {
    private int numberOfIteration;
    private ArrayList<Auction> AuctionList;
    private ArrayList<User> Users;

    public void nextIteration() {
        this.numberOfIteration++;
        this.setAuctionsState();
    }

    public ArrayList<Auction> findUnfinishedAuctions() {
        ArrayList<Auction> activeAuctions = new ArrayList<Auction>();
        for (Auction auction :
                AuctionList) {
            if (auction.isActive()) {
                activeAuctions.add(auction);
            }
        }

        return activeAuctions;
    }

    public ArrayList<Auction> findFinishedAuctions() {
        ArrayList<Auction> unactiveAuctions = new ArrayList<Auction>();
        for (Auction auction :
                AuctionList) {
            if (!auction.isActive()) {
                unactiveAuctions.add(auction);
            }
        }

        return unactiveAuctions;
    }

    public User findUserbyLogin(String login) {
        for (User user :                                                       //znajduje aukcje po loginie
                this.Users) {
            if (user.getLogin().equals(login)) {
                return user;
            }
        }

        return null;
    }

    public ArrayList<Auction> findAuctionsbyLogin(String login) {
        ArrayList<Auction> userAuctions = new ArrayList<Auction>();
        for (Auction auction :                                                       //znajduje aukcje po loginie
                AuctionList) {
            String sellerLogin = auction.getSellerLogin();
            if (sellerLogin.equals(login)) {
                userAuctions.add(auction);
            }
        }

        return userAuctions;
    }

    public void addTrustPointsToUser(User user) {
        user.addTrustPoints();
    }

    public void removeTrustPointsFromUser(User user) {
        user.removeTrustPoints();
    }

    public void run() {
        this.prepareData();
        this.showMenu();

    }        //metoda, która jest uruchamiana na początku

    public void setAuctionsState() {
        for (Auction auction :
                this.AuctionList) {
            if (this.numberOfIteration > auction.getAuctionTime()) {
                auction.setInactive();
            }
        }
    }

    private void showMenu() {
        Scanner choose = new Scanner(System.in);
        String choice = null;
        int j = 0;
        while (!"E".equals(choice)) {
            System.out.println("System aukcyjny \n" +
                    "Tura: "+ this.numberOfIteration +
                    "\nWybierz\n" +
                    " 1 - wyszukać niezakończone aukcje,\n" +
                    " 2 - wyszukać zakończone aukcje, \n" +
                    " 3 - wyszukać aukcje wystawione przez użytkownika o loginie \n" +
                    " 4 - przyznać bądź odjąć punkt zaufania kupującemu lub sprzedającemu\n" +
                    " 5 - przejście do kolejnej tury\n" +
                    " E - aby zakończyć program");
            choice = choose.nextLine();
            if ("1".equals(choice)) {
                System.out.println(this.showAuctions(this.findUnfinishedAuctions()));
                choice = null;
            }
            if ("2".equals(choice)) {
                System.out.println(this.showAuctions(this.findFinishedAuctions()));
                choice = null;
            }
            if ("3".equals(choice)) {
                System.out.println("Podaj login użytkownika");
                String login = choose.nextLine();
                System.out.println(this.showAuctions(this.findAuctionsbyLogin(login)));
                choice = null;
            }
            if ("4".equals(choice)) {
                System.out.println("Podaj login użytkownika");
                String login = choose.nextLine();
                User user = this.findUserbyLogin(login);

                if(user == null){
                    System.out.println("Nie znaleziono takiego użytkownika, nie można dodać mu punktów zaufania");
                } else {
                    System.out.println("Wpisz '+' jeżeli chcesz dodać mu punkt zaufania lub '-' jeżeli odjąć");
                    String selection = choose.nextLine();

                    if(selection.equals("+")){
                        this.addTrustPointsToUser(user);
                        System.out.println("Dodano punkt zaufania użytkownikowi o podanym loginie");
                    } else if (selection.equals("-")){
                        this.removeTrustPointsFromUser(user);
                        System.out.println("Usunięto punkt zaufania użytkownikowi o podanym loginie");
                    } else {
                        System.out.println("Dostępne opcje to jedynie '+' lub '-'");
                    }
                }

                choice = null;
            }
            if ("5".equals(choice)) {
                this.nextIteration();
                choice = null;
            }
        }
        choose.close();
    }

    private String showAuctions(ArrayList<Auction> auctions) {

        if (auctions.isEmpty()) {
            return "Brak aukcji";
        }

        String auctionInfo = "";
        for (Auction auction :                                                       //znajduje aukcje po userName
                auctions) {
            auctionInfo += auction.toString()+"\n";
        }

        return auctionInfo;
    }

    private void prepareData() {
        AuctionFactory auctionFactory = new AuctionFactory();
        this.Users = new ArrayList<User>();
        User buyer1 = new User("Mateusz", "Kowalski", "MK", "mk@gmail.com", 11);
        this.Users.add(buyer1);
        User buyer2 = new User("Adam", "Siemaszko", "AS", "as@gmail.com", 25);
        this.Users.add(buyer2);
        User seller1 = new User("Romek", "Adamski", "RA", "ra@gmail.com", 13);
        this.Users.add(seller1);
        User seller2 = new User("Bartosz", "Małysz", "BM", "bm@gmail.com", 17);
        this.Users.add(seller2);

        this.numberOfIteration = 1;
        this.AuctionList = new ArrayList<Auction>();
        this.AuctionList.add(auctionFactory.createAuction("Simple", "Sprzedam opla", "Sprzedam opla Astra", 3000.0, 3, seller1, 10));
        this.AuctionList.add(auctionFactory.createAuction("Extended", "Tanie ziemniaki", "Sprzedam ziemniaki", 3.5, 2, seller1, 1));
        this.AuctionList.add(auctionFactory.createAuction("Reverse", "Kolczyki", "Sprzedam samorobne kolczyki", 100.0, 1, seller2, 15));

    }
}