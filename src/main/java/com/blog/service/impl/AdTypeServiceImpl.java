package com.blog.service.impl;

import com.blog.entity.AdType;
import com.blog.mapper.AdTypeMapper;
import com.blog.service.IAdTypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 广告类型ID 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2024-01-16
 */
@Service
public class AdTypeServiceImpl extends ServiceImpl<AdTypeMapper, AdType> implements IAdTypeService {

}
