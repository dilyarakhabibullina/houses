package ru.itpark;

import ru.itpark.domain.House;
import ru.itpark.service.HouseService;

public class Main {
    public static void main(String[] args) {
        HouseService houseService = new HouseService();
        houseService.add(new House(1, 3, "Новосавиновский", "прекрасная квартира", 4_000_000));
        houseService.add(new House(2, 100, "Новосавиновский", "ужасная квартира", 10_000_000));
        houseService.add(new House(3, 5, "Вахитовский", "лучшее место на земле", 12_000_000));
        houseService.add(new House(4, 1, "Голливуд", "неплохое местечко", 15_000_000));
        houseService.add(new House(5, 4, "Беверли-Хиллз", "великолепное место", 1_500_000_000));
        System.out.println(houseService.searchByDistrict());
        System.out.println(houseService.searchByPrice());
    }
}
