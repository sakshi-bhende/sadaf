package com.cdac.CategoryMicroservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.CategoryMicroservice.dto.CategoryDto;
import com.cdac.CategoryMicroservice.services.CategoryService;



@RestController
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	CategoryService categoryService;
	@GetMapping("/")
	public List<CategoryDto> getAllCategories() {
		return categoryService.allCategories();
	}
	
	@GetMapping("/{cid}")
	public CategoryDto getCategoryById(@PathVariable(name="cid") int catId) {
		return categoryService.getCategoryById(catId);
	}
	
	@PostMapping("/")
	public void saveCategory(@RequestBody CategoryDto categoryDto) {
		categoryService.addNewCategory(categoryDto);
	}
}
