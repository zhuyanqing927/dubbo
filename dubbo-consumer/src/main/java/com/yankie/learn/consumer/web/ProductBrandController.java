package com.yankie.learn.consumer.web;

import com.yankie.learn.domain.ProductBrandDTO;
import com.yankie.learn.service.ProductBrandService;
import io.swagger.annotations.Api;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(description = "品牌接口")
@RestController("productBrandController")
@RequestMapping(value = "/productBrand")
public class ProductBrandController {
    @Reference(version = "1.0.0")
    private ProductBrandService productBrandService;

    @PostMapping("save")
    public int save(@RequestBody ProductBrandDTO productBrandDTO) {
        return productBrandService.save(productBrandDTO);
    }
}
