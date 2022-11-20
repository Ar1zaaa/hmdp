package com.hmdp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hmdp.entity.Sign;
import com.hmdp.mapper.SignMapper;
import com.hmdp.service.ISignService;
import org.springframework.stereotype.Service;

/**
* @author 51198
* @description 针对表【tb_sign】的数据库操作Service实现
* @createDate 2022-11-19 09:44:09
*/
@Service
public class SignServiceImpl extends ServiceImpl<SignMapper, Sign>
implements ISignService {

}
