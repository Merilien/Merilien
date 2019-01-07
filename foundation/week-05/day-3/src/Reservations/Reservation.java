package Reservations;

public class Reservation implements Reservationy {


    public void printReservation() {
        System.out.println(String.format("Booking# %s for %s", getCodeBooking(), getDowBooking()));
    }

    @Override
    public String getDowBooking() {
        String[] days = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        return days[(int) (Math.random()*7)];
    }

    @Override
    public String getCodeBooking() {
        StringBuilder builder = new StringBuilder();
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        for (int i = 0; i < 8; i++) {
            builder.append(chars.charAt((int) (Math.random() * (chars.length()))));
        }
        return builder.toString();
    }
}
