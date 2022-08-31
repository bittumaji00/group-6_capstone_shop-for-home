package com.wipro.greatlearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.greatlearning.entity.User;

/**
 * @author Shubh Sharma
 * Modified Date: 24/08/2022
 * Description: User Repository
 *
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
