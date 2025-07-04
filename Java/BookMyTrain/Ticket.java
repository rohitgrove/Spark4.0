public class Ticket {
    private int ticketId;
    private User user;
    private Train train;
    private int seatBooked;
    private static int counter = 1001;

    public Ticket(User user, Train train, int seatBooked) {
        this.ticketId = counter++;
        this.user = user;
        this.train = train;
        this.seatBooked = seatBooked;
    }

    public int getTicketId() {
        return this.ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Train getTrain() {
        return this.train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public int getSeatBooked() {
        return this.seatBooked;
    }

    public void setSeatBooked(int seatBooked) {
        this.seatBooked = seatBooked;
    }

    @Override
    public String toString() {
        return "Ticket ID: " + ticketId + " | Train: " + train.getName() + " | Route: " + train.getSource() + " -> "
                + train.getDestination() + " | Seats: " + seatBooked + " | Booked By: " + user.getFullname();
    }
}