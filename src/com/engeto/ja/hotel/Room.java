package com.engeto.ja.hotel;

import java.math.BigDecimal;

public class Room {
    private int roomNum;
    private int bed;
    private boolean withBalcone;
    private boolean seaView;
    private BigDecimal price;

    public Room(){
        this.roomNum = roomNum;
        this.bed = bed;
        this.withBalcone = withBalcone;
        this.seaView = seaView;
        this.price = price;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    public int getBed() {
        return bed;
    }

    public void setBed(int bed) {
        this.bed = bed;
    }

    public boolean isWithBalcone() {
        return withBalcone;
    }

    public void setWithBalcone(boolean withBalcone) {
        this.withBalcone = withBalcone;
    }

    public boolean isSeaView() {
        return seaView;
    }

    public void setSeaView(boolean seaView) {
        this.seaView = seaView;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }


}

