package ru.itpark;

import ru.itpark.domain.House;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<House> houses = new ArrayList<House>();
        houses.add(new House(1, 3, "Новосавиновский", "прекрасная квартира", 4_000_000));
        houses.add(new House(2, 100, "Новосавиновский", "ужасная квартира", 10_000_000));
        houses.add(new House(3, 5, "Вахитовский", "лучшее место на земле", 12_000_000));

        List<House> foundByDistrictResults = new ArrayList<>();
        String text = "савин";
        for (House house : houses) {
            if (house.getDistrict().contains(text)) {
                foundByDistrictResults.add(house);
            }
        }
        System.out.println(foundByDistrictResults);

        ArrayList<House> foundByPriceResults = new ArrayList<>();
        int priceWantedMin = 5_000_000;
        int priceWantedMax = 12_000_000;
        for (House house : houses) {
            if (priceWantedMin < house.getPrice() && house.getPrice() <= priceWantedMax) {
                foundByPriceResults.add(house);
            }
        }
        System.out.println(foundByPriceResults);
    }
}
