package com.hmdp.mapper;

import com.hmdp.entity.Follow;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.Set;

/**
 * <p>
 *  Mapper 接口
 * </p>
 */
public interface FollowMapper extends BaseMapper<Follow> {

    Set<String> getIntersects (Long userId, Long targetId);
}
