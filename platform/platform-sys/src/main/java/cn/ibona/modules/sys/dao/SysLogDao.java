package cn.ibona.modules.sys.dao;

import cn.ibona.modules.sys.entity.SysLogEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统日志
 */
@Mapper
public interface SysLogDao extends BaseMapper<SysLogEntity> {
	
}
