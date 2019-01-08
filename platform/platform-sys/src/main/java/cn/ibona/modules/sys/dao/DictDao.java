package cn.ibona.modules.sys.dao;

import cn.ibona.modules.sys.entity.DictEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 数据字典表
 * 
 * @author qiao
 * @email qiaogqiang@163.com
 * @date 2019-01-08 16:13:22
 */
@Mapper
public interface DictDao extends BaseMapper<DictEntity> {
	
}
