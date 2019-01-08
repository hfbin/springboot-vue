/**
 *
 */

package cn.ibona.modules.job.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import cn.ibona.common.utils.PageUtils;
import cn.ibona.common.utils.Query;
import cn.ibona.modules.job.dao.ScheduleJobLogDao;
import cn.ibona.modules.job.entity.ScheduleJobLogEntity;
import cn.ibona.modules.job.service.ScheduleJobLogService;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("scheduleJobLogService")
public class ScheduleJobLogServiceImpl extends ServiceImpl<ScheduleJobLogDao, ScheduleJobLogEntity> implements ScheduleJobLogService {

	@Override
	public PageUtils queryPage(Map<String, Object> params) {
		String jobId = (String)params.get("jobId");

		Page<ScheduleJobLogEntity> page = this.selectPage(
				new Query<ScheduleJobLogEntity>(params).getPage(),
				new EntityWrapper<ScheduleJobLogEntity>().like(StringUtils.isNotBlank(jobId),"job_id", jobId)
		);

		return new PageUtils(page);
	}

}
