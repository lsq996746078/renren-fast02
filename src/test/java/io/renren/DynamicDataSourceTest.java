package io.renren;


import org.apache.commons.lang.builder.ToStringBuilder;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import io.renren.datasources.DataSourceTestService;
import io.renren.modules.app.entity.UserEntity;


public class DynamicDataSourceTest extends SpringbootApplicationTests{
    @Autowired
    private DataSourceTestService dataSourceTestService;

    @Test
    public void test(){
        //数据源1
        UserEntity user = dataSourceTestService.queryObject(1L);
        System.out.println(ToStringBuilder.reflectionToString(user));

        //数据源2
        UserEntity user2 = dataSourceTestService.queryObject2(1L);
        System.out.println(ToStringBuilder.reflectionToString(user2));

        //数据源1
        UserEntity user3 = dataSourceTestService.queryObject(1L);
        System.out.println(ToStringBuilder.reflectionToString(user3));
    }

}
