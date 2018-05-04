package com.revature.main;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

import com.revature.beans.Item;

public class Application {
	
	private static final Logger log = LoggerFactory.getLogger(Application.class);
	
	public static void main(String[] args) {
		
		RestTemplate restTemplate = new RestTemplate();
		
//		String postRequestUrl = "http://bryandjosh-env-2.us-east-2.elasticbeanstalk.com/items";
//		Item newItem = new Item("Item3", 150, "Descriptive text 3", "Me");
//		try {
//			Item item = restTemplate.postForObject(postRequestUrl, newItem, Item.class);
//			log.info(item.toString());
//		} catch (Exception e) {
//			log.error("Post unsuccessful");
//		}
		
//		String requestUrl = "http://bryandjosh-env-2.us-east-2.elasticbeanstalk.com/items/2";
//		try {
//			Item item = restTemplate.getForObject(requestUrl, Item.class);
//			log.info(item.toString());
//		} catch (Exception e) {
//			log.error("Resource consumption was unsuccessful");
//		}
//		
//		String getAllUrl = "http://bryandjosh-env-2.us-east-2.elasticbeanstalk.com/items";
//		try {
//			List<Item> items = restTemplate.getForObject(getAllUrl, List.class);
//			log.info(items.toString());
//		} catch (Exception e) {
//			log.error("Resource consumption was unsuccessful");
//		}
		
//		String deleteUrl = "http://bryandjosh-env-2.us-east-2.elasticbeanstalk.com/items/delete/1";
//		try {
//			restTemplate.delete(deleteUrl);
//		} catch (Exception e) {
//			log.error("Deletion unsuccessful");
//		}
		
//		String patchAllUrl = "http://bryandjosh-env-2.us-east-2.elasticbeanstalk.com/items";
//		String getUrl3 = "http://bryandjosh-env-2.us-east-2.elasticbeanstalk.com/items/3";
//		Item newItem = new Item(3L, "Item3", 500, "Descriptive text 3", "Me");
//		try {
//			restTemplate.put(patchAllUrl, newItem);
//			Item updatedItem = restTemplate.getForObject(getUrl3, Item.class);
//			log.info(updatedItem.toString());
//		} catch (Exception e) {
//			log.error("Unsucessful update");
//		}
		
		//String getAllUrl2 = "http://bryandjosh-env-2.us-east-2.elasticbeanstalk.com/items";
//		try {
//			List<Item> items = restTemplate.getForObject(getAllUrl, List.class);
//			log.info(items.toString());
//		} catch (Exception e) {
//			log.error("Resource consumption was unsuccessful");
//		}
	}

}
