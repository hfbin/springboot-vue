package cn.ibona.modules.oss.service.impl;

import cn.ibona.modules.oss.service.SysOssService;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import cn.ibona.common.utils.PageUtils;
import cn.ibona.common.utils.Query;
import cn.ibona.modules.oss.dao.SysOssDao;
import cn.ibona.modules.oss.entity.SysOssEntity;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("sysOssService")
public class SysOssServiceImpl extends ServiceImpl<SysOssDao, SysOssEntity> implements SysOssService {

	@Override
	public PageUtils queryPage(Map<String, Object> params) {
		Page<SysOssEntity> page = this.selectPage(
				new Query<SysOssEntity>(params).getPage()
		);

		return new PageUtils(page);
	}
	
}
