package cn.ibona.modules.sys.dao;

import cn.ibona.modules.sys.entity.SysCaptchaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 验证码
 */
@Mapper
public interface SysCaptchaDao extends BaseMapper<SysCaptchaEntity> {

}
