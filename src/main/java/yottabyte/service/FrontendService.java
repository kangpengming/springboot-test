package yottabyte.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import yottabyte.DAO.FrontendDAO;
import yottabyte.mysqlmodel.FrontMysql;
import yottabyte.requestmodel.FrontendRequest;


/**
 * @author kangpeng
 * @date 2019/3/27 下午2:12
 */

@Service
public class FrontendService {

    @Autowired
    private FrontendDAO frontendDAO;

    @Value("${frontend.group}")
    private String group;

    public void insertMysql(FrontendRequest frontendRequest){
        FrontMysql frontMysql = new FrontMysql();
        frontMysql.setGroup(group);
        frontMysql.setName(frontendRequest.getName());
        frontendDAO.inserData(frontMysql);
    }

}
