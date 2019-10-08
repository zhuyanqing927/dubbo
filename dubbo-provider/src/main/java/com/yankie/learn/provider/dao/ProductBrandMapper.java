package com.yankie.learn.provider.dao;

import com.yankie.learn.provider.entity.ProductBrand;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductBrandMapper {
    int deleteByPrimaryKey(Long brandId);

    int insert(ProductBrand record);

    int insertSelective(ProductBrand record);

    ProductBrand selectByPrimaryKey(Long brandId);

    int updateByPrimaryKeySelective(ProductBrand record);

    int updateByPrimaryKeyWithBLOBs(ProductBrand record);

    int updateByPrimaryKey(ProductBrand record);
}