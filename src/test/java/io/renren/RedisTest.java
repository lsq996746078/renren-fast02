package io.renren;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.qiniu.util.Json;

import io.renren.common.elasticsearch.Chili;
import io.renren.common.utils.RedisUtils;
import io.renren.modules.sys.entity.SysUserEntity;

public class RedisTest extends SpringbootApplicationTests {
	@Autowired
	private RedisUtils redisUtils;

	@Test
	public void contextLoads() {
		SysUserEntity user = new SysUserEntity();
		user.setEmail("qqq@qq.com");
		redisUtils.set("user", user);

		System.out.println(ToStringBuilder.reflectionToString(redisUtils.get("user", SysUserEntity.class)));
		
		String randomKey = redisUtils.getRandomKeyforDatabase(6);
		String chiliJson = redisUtils.getKeyforDatabase(6,randomKey);
		Chili chili = Json.decode(chiliJson, Chili.class);
	}

}
