package com.lzp.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lzp.common.utils.PageUtils;
import com.lzp.gulimall.product.entity.CategoryEntity;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author lzp
 * @email 1608757513@qq.com
 * @date 2022-11-29 17:06:36
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}
