package cn.joinhealth.springbootsqlite.mapper;

import cn.joinhealth.springbootsqlite.model.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author linjian
 * @date 14:41
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
