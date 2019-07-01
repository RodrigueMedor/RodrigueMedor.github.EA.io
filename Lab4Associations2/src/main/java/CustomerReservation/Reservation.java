package CustomerReservation;

import javax.persistence.*;

@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer number;
    private String name;
    private boolean resType;
    private String dateF;
    private String dateT;
    private int numberNights;
    private int roomsNum;
    private String roomType;
    private int adults;
    private int children;
    private boolean breakfast;
    private double totalCost;
    private double deposit;

    public Reservation(String name, boolean resType, String dateF, String dateT, int numberNights, int roomsNum, String roomType, int adults, int children, boolean breakfast, double totalCost, double deposit) {
        this.name = name;
        this.resType = resType;

        this.dateF = dateF;
        this.dateT = dateT;

        this.numberNights = numberNights;
        this.roomsNum = roomsNum;
        this.roomType = roomType;
        this.adults = adults;
        this.children = children;
        this.breakfast = breakfast;
        this.totalCost = totalCost;
        this.deposit = deposit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isResType() {
        return resType;
    }

    public void setResType(boolean resType) {
        this.resType = resType;
    }



    public String getDateF() {
        return dateF;
    }

    public void setDateF(String dateF) {
        this.dateF = dateF;
    }

    public String getDateT() {
        return dateT;
    }

    public void setDateT(String dateT) {
        this.dateT = dateT;
    }

    public int getNumberNights() {
        return numberNights;
    }

    public void setNumberNights(int numberNights) {
        this.numberNights = numberNights;
    }

    public int getRoomsNum() {
        return roomsNum;
    }

    public void setRoomsNum(int roomsNum) {
        this.roomsNum = roomsNum;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getAdults() {
        return adults;
    }

    public void setAdults(int adults) {
        this.adults = adults;
    }

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public boolean isBreakfast() {
        return breakfast;
    }

    public void setBreakfast(boolean breakfast) {
        this.breakfast = breakfast;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }
}
