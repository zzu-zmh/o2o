package dao;

import entity.ProductCategory;

public interface ProductCategoryMapper {
    int deleteByPrimaryKey(Integer productCategoryId);

    int insert(ProductCategory record);

    int insertSelective(ProductCategory record);

    ProductCategory selectByPrimaryKey(Integer productCategoryId);

    int updateByPrimaryKeySelective(ProductCategory record);

    int updateByPrimaryKey(ProductCategory record);
}