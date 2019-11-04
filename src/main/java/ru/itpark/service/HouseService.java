package ru.itpark.service;

import ru.itpark.domain.House;

import java.util.*;

public class HouseService {
    private Collection<House> houses = new LinkedList<>();

    public void add(House house) {
        houses.add(house);
    }

    public List<House> searchByDistrict() {
        List<House> resultDistrict = new ArrayList<>();
        for (House house : houses) {
            if (house.getDistrict().toLowerCase().equals("голливуд")) {
                resultDistrict.add(house);
            }
        }
        return resultDistrict;
    }

    public List<House> searchByPrice() {
        List<House> resultByPrice = new ArrayList<>();
        for (House house : houses) {
            if (5_000_000 < house.getPrice() && 20_000_000 > house.getPrice()) {
                resultByPrice.add(house);
            }
        }
        return resultByPrice;
    }
}
