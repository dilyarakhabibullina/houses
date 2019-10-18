package ru.itpark.domain;

public class House {
    private int id;
    private int rooms;
    private String district;
    private String description;
    private int price;

    public House(int id, int rooms, String district, String description, int price) {
        this.id = id;
        this.rooms = rooms;
        this.district = district;
        this.description = description;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", rooms=" + rooms +
                ", district='" + district + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
