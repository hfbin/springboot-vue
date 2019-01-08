package cn.ibona.modules.sys.dao;

import cn.ibona.modules.sys.entity.DeptEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 部门管理
 * 
 * @author qiao
 * @email qiaogqiang@163.com
 * @date 2019-01-08 16:09:30
 */
@Mapper
public interface DeptDao extends BaseMapper<DeptEntity> {
	
}
