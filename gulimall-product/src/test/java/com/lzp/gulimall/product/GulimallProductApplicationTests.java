package com.lzp.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lzp.gulimall.product.entity.BrandEntity;
import com.lzp.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class GulimallProductApplicationTests {
    @Resource
    BrandService brandService;

    @Test
    void contextLoads() {
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setDescript("huawei");
//        System.out.println(brandService.save(brandEntity));
        System.out.println(brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1)));
    }

}
