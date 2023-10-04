package com.codeddecode.restaurantlisting.service;

import com.codeddecode.restaurantlisting.dto.RestaurantDTO;
import com.codeddecode.restaurantlisting.entity.Restaurant;
import com.codeddecode.restaurantlisting.mapper.RestaurantMapper;
import com.codeddecode.restaurantlisting.repo.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RestaurantService {
    @Autowired
    RestaurantRepo restaurantRepo;

    public List<RestaurantDTO> findAllRestaurants() {
        List<Restaurant> restaurants = restaurantRepo.findAll();
        //map it ti list of DTO
        List<RestaurantDTO> restaurantDTOS = restaurants.stream().map(restaurant -> RestaurantMapper.INSTANCE.mapRestaurantToRestaurantDTO(restaurant)).collect(Collectors.toList());
              return  restaurantDTOS;
    }
}
