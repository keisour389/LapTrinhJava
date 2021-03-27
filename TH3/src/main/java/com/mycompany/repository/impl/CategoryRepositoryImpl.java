/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.repository.impl;

import com.mycompany.pojo.Category;
import com.mycompany.repository.CategoryRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Admin
 */
@Repository
public class CategoryRepositoryImpl implements CategoryRepository{
    @Override
    public List<Category> getCategories() {
        List<Category> cates = new ArrayList<>();
        Category cate1 = new Category();
        cate1.setId(1);
        cate1.setName("Samsung");
        Category cate2 = new Category();
        cate2.setId(2);
        cate2.setName("IPhone");
        
        cates.add(cate1);
        cates.add(cate2);
        
        return cates;
    }
}
