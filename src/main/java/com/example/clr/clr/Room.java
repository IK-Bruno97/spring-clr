package com.example.clr.clr;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ROOM")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ROOM_ID")
    private int id;
    @Column(name = "ROOM_NUMBER")
    private String roomNumber;
    @Column(name = "ROOM_TYPE")
    private String roomType;
    @Column(name = "CAPACITY")
    private int capacity;
    @Column(name = "PRICE")
    private float price;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getRoomNumber(){
        return roomNumber;
    }
    public void setRoomNumber(String roomNumber){
        this.roomNumber = roomNumber;
    }

    public String getRoomType(){
        return roomType;
    }
    public void setRoomType(String roomType){
        this.roomType = roomType;
    }

    public int getCapacity(){
        return capacity;
    }
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public float getPrice(){
        return price;
    }
    public void setPrice(float price){
        this.price = price;
    }

    @Override
    public String toString(){
        return "Room{ " +
            "room_id=" + id +
            ", room_number="+ roomNumber +
            ", room_type="+ roomType +
            ", capacity="+ capacity+
            ", price=" + price +
        "}" ;
    }

}
