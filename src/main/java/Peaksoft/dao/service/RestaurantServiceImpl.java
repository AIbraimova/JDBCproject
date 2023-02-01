package Peaksoft.dao.service;

import Peaksoft.Restaurant;
import Peaksoft.dao.RestaurantDao;
import Peaksoft.dao.RestaurantDaoImpl;

import java.util.List;

public class RestaurantServiceImpl implements RestaurantService{
    RestaurantDao restaurantDao = new RestaurantDaoImpl();
    @Override
    public String createRestaurant() {
        restaurantDao.createRestaurant();
        return "saved";
    }

    @Override
    public String saveRestaurant(Long id,String name, String address, int openingYear) {
        restaurantDao.saveRestaurant(id, name, address, openingYear);
        return "Saved";
    }

    @Override
    public Restaurant findById(Long id) {
        return restaurantDao.findById(id);
    }

    @Override
    public List<Restaurant> getAll() {
        return restaurantDao.getAll();
    }

    @Override
    public String deleteRestaurant() {
        restaurantDao.deleteRestaurant();
        return "Successfully deleted ";
    }

    @Override
    public String updateRestaurant(Long id, Restaurant newRestaurant) {
        return "Successfully updated";
    }
}