package org.example.booking;

public class MovieTicketServer {
    public String movieTitle;
    public int availableSeats;

    public MovieTicketServer(String movieTitle, int availableSeats) {
        this.movieTitle = movieTitle;
        this.availableSeats = availableSeats;
    }

    public void bookTicket(String customerName, int numberOfSeats) {
        System.out.println("Hi, " + customerName + ". There are: " +
                            this.availableSeats + " seats available for " +
                            this.movieTitle);

        if ((this.availableSeats - numberOfSeats) < 0) {
            System.out.println("Hi, " + customerName + ". There are not enough available seats for " +
                                this.movieTitle);
            return;
        }

        this.availableSeats -= numberOfSeats;

        System.out.println("Hi, " + customerName + ". There was: " + numberOfSeats +
                            "successfully booked for " + this.movieTitle);
    }
}
