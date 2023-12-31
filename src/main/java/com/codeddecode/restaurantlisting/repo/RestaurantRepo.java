package com.codeddecode.restaurantlisting.repo;

import com.codeddecode.restaurantlisting.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//JpaRepos provides convenient methods for performing CRUD
@Repository
public interface RestaurantRepo extends JpaRepository<Restaurant,Integer> {
}
