package com.yankie.learn.provider.service;

import com.yankie.learn.domain.ProductBrandDTO;
import com.yankie.learn.provider.dao.ProductBrandMapper;
import com.yankie.learn.provider.entity.ProductBrand;
import com.yankie.learn.service.ProductBrandService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

@Service(version = "1.0.0")
public class ProductBrandServiceImpl implements ProductBrandService {
    @Autowired
    private ProductBrandMapper productBrandMapper;

    @Override
    public int save(ProductBrandDTO productBrandDTO) {
        ProductBrand productBrand = new ProductBrand();
        BeanUtils.copyProperties(productBrandDTO, productBrand);
       return productBrandMapper.insert(productBrand);
    }
}
