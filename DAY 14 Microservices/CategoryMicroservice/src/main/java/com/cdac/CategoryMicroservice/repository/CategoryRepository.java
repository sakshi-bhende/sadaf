package com.cdac.CategoryMicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdac.CategoryMicroservice.entity.Category;
@Repository
public interface CategoryRepository extends JpaRepository<Category,Integer> {

}
