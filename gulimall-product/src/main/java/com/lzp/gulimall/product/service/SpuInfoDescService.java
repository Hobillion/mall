package com.lzp.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lzp.common.utils.PageUtils;
import com.lzp.gulimall.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author lzp
 * @email 1608757513@qq.com
 * @date 2022-11-29 17:06:36
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

