/**
 *
 */

package cn.ibona.modules.job.service;

import cn.ibona.modules.job.entity.ScheduleJobLogEntity;
import com.baomidou.mybatisplus.service.IService;
import cn.ibona.common.utils.PageUtils;

import java.util.Map;

/**
 * 定时任务日志
 *
 */
public interface ScheduleJobLogService extends IService<ScheduleJobLogEntity> {

	PageUtils queryPage(Map<String, Object> params);
	
}
