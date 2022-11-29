package com.lzp.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lzp.common.utils.PageUtils;
import com.lzp.gulimall.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author lzp
 * @email 1608757513@qq.com
 * @date 2022-11-29 17:06:36
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

