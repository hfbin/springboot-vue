package cn.ibona.modules.job.dao;

import cn.ibona.modules.job.entity.ScheduleJobLogEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 定时任务日志
 */
@Mapper
public interface ScheduleJobLogDao extends BaseMapper<ScheduleJobLogEntity> {
	
}
