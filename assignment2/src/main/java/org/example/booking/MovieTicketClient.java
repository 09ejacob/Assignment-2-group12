package org.example.booking;

public class MovieTicketClient extends Thread {
    private String customerName;
    private int numberOfTickets;
    private MovieTicketServer server;

    public MovieTicketClient(MovieTicketServer server, String customerName, int numberOfTickets) {
        this.server = server;
        this.customerName = customerName;
        this.numberOfTickets = numberOfTickets;
    }

    @Override
    public void run() {
        server.bookTicket(customerName, numberOfTickets);
    }
}
