public class Ticket {
    private int tickerId;
    private User user;
    private Train train;
    private int seatBooked;
    private static int counter = 1001;

    public Ticket(Train train, int seatBooked, User user) {
        this.train = train;
        this.seatBooked = seatBooked;
        this.tickerId = counter++;
        this.user = user;
    }

    public int getTickerId() {
        return tickerId;
    }

    public void setTickerId(int tickerId) {
        this.tickerId = tickerId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public int getSeatBooked() {
        return seatBooked;
    }

    public void setSeatBooked(int seatBooked) {
        this.seatBooked = seatBooked;
    }

    @Override
    public String toString() {
        return "Ticket ID: " + tickerId + " | Train ID: " +
                tickerId + " | Train: " + train.getName() + " |Route: " + train.getSource() + " -> " + train.getDestination() +
                " | Seats: " + seatBooked + " | Booked By: " + user.getFullName();
    }
}
