package Peaksoft;

import Peaksoft.dao.service.RestaurantService;
import Peaksoft.dao.service.RestaurantServiceImpl;

/**
 * Hello world!
 *
 */
public class Restaurant 
{
    public Restaurant(long l, String Macaronnaya, String Almatinskaya, int i) {
    }

    public Restaurant() {

    }

    public static void main(String[] args )
    {
        RestaurantService restaurantService = new RestaurantServiceImpl();
        restaurantService.createRestaurant();
        System.out.println(restaurantService.saveRestaurant(1L, "Sierra", "Bokonbaeva 123", 2020));
        System.out.println(restaurantService.saveRestaurant(2L, "Losteria", "Manasa 123", 2022));
        System.out.println(restaurantService.saveRestaurant(3L, "Skyberry", "Baitik Baatyr 123", 2021));
        System.out.println(restaurantService.saveRestaurant(4L,"Zerno",  "Turusbekov 123",2022));
        System.out.println(restaurantService.updateRestaurant(1L, new Restaurant(2L, "Macaronnaya", "Almatinskaya", 2021)));
        System.out.println(restaurantService.findById(2L));
        System.out.println(restaurantService.deleteRestaurant());
    }

    public void setName(String string) {
    }

    public void setAddress(String string) {
    }

    public void setOpeningYear(int anInt) {
    }

    public String getName() {
        return null;
    }

    public String getAddress() {
        return null;
    }

    public int getOpeningYear() {
        return 0;
    }
}
