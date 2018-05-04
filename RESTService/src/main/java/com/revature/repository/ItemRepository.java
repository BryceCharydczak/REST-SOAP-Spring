package com.revature.repository;

import java.util.List;

import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;

import com.revature.beans.Item;

public interface ItemRepository extends JpaRepository<Item, Long>{

	
	public List<Item> findItemsBySellerName(String sellerName);
	
	
	/*@Modifying
	@Query("UPDATE item i SET i = :updatedItem WHERE i.itemId = :itemId")
	public Item updateItemById(@Param("itemId") Long itemId, @Param("updatedItem") Item updatedItem);*/
}
