package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.OrderUser;

public interface OrderUserRepo extends JpaRepository<OrderUser,Integer>  {
	
	@Query("SELECT o FROM OrderUser o WHERE o.order_delivered = :order_delivered")
    public List<OrderUser> findNotAccepted(@Param("order_delivered") boolean order_delivered);

}
