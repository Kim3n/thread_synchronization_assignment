package org.example.booking;

public class MovieTicketClient extends Thread {
    private String customerName;
    private MovieTicketServer movieTicketServer;
    private int numberOfSeats;


    public MovieTicketClient(MovieTicketServer movieTicketServer, String customerName, int numberOfSeats) {
        this.customerName = customerName;
        this.numberOfSeats = numberOfSeats;
        this.movieTicketServer = movieTicketServer;
    }

    public void run() {
        movieTicketServer.bookTicket(customerName, numberOfSeats);
    }
}