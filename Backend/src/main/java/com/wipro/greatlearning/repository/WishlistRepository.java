package com.wipro.greatlearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.greatlearning.entity.Wishlist;
/**
 * @author Soumyadeep
 * Modified Date: 27/08/2022
 * Description: User Repository
 *
 */

public interface WishlistRepository extends JpaRepository<Wishlist, Long> {

}
