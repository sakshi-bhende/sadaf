package com.cdac.CategoryMicroservice.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.CategoryMicroservice.dto.CategoryDto;
import com.cdac.CategoryMicroservice.entity.Category;
import com.cdac.CategoryMicroservice.repository.CategoryRepository;
@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	CategoryRepository categoryRepository;
	@Override
	public boolean addNewCategory(CategoryDto dto) {
		// TODO Auto-generated method stub
		Category eCategory = new Category();
		BeanUtils.copyProperties(dto, eCategory);
		categoryRepository.save(eCategory);
		return true;
	}

	@Override
	public CategoryDto getCategoryById(int categoryId) {
		// TODO Auto-generated method stub
		Optional<Category> eCategory = categoryRepository.findById(categoryId);
		if(eCategory.isPresent()) {
			Category entityCategory =eCategory.get();
			CategoryDto dto = new CategoryDto();
			BeanUtils.copyProperties(entityCategory, dto);
			return dto;
		}
		return null;
	}

	@Override
	public List<CategoryDto> allCategories() {
		// TODO Auto-generated method stub
		List<Category> categoryList = categoryRepository.findAll();
		List<CategoryDto> finalList = new ArrayList<>();
		for(Category category : categoryList) {
			CategoryDto dto  = new CategoryDto();
			BeanUtils.copyProperties(category, dto);
			finalList.add(dto);
		}
		return finalList;
	}

	@Override
	public List<CategoryDto> getCategoryNameLike(String nameLike) {
		// TODO Auto-generated method stub
		return null;
	}

}
