package com.cdac.CategoryMicroservice.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cdac.CategoryMicroservice.dto.CategoryDto;

public interface CategoryService {
	public boolean addNewCategory(CategoryDto dto);
	public CategoryDto getCategoryById(int categoryId);
	public List<CategoryDto> allCategories();
	public List<CategoryDto> getCategoryNameLike(String nameLike);
}
