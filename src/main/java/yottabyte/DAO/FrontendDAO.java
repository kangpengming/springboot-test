package yottabyte.DAO;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import yottabyte.mysqlmodel.FrontMysql;

/**
 * @author kangpeng
 * @date 2019/3/27 下午2:21
 */

@Mapper
public interface FrontendDAO {
    @Insert("insert into FRONTENDTEST(name, `group`) value(#{frontend.name}, #{frontend.group})")
    void inserData(@Param("frontend")FrontMysql frontMysql);
}
