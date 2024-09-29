package com.category.demo.CalegoryService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryDetails {

 @RequestMapping("/category")
	public List<CategoryVO> getCategoryDetails(){
	 List<CategoryVO> categoryVOs = new ArrayList<CategoryVO>();
	 CategoryVO categoryVO1 = new CategoryVO("C201","Food Grains");
	 CategoryVO categoryVO2 = new CategoryVO("C202","Beverages");
	 CategoryVO categoryVO3 = new CategoryVO("C203","Medicines");
	 categoryVOs.add(categoryVO1);
	 categoryVOs.add(categoryVO2);
	 categoryVOs.add(categoryVO3);
		return categoryVOs;
	}
}
