package io.renren;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.qiniu.util.Json;

import io.renren.common.elasticsearch.Chili;
import io.renren.common.elasticsearch.ChiliRepository;
import io.renren.common.utils.RedisUtils;

public class ElasticsearchTest extends SpringbootApplicationTests {
	
	@Autowired
	private ChiliRepository chiliRepository;
	@Autowired
	private RedisUtils redisUtils;
	
	@Test
	public void esTest() {
		
		String randomKey = redisUtils.getRandomKeyforDatabase(6);
		String chiliJson = redisUtils.getKeyforDatabase(6,randomKey);
		Chili chili = Json.decode(chiliJson, Chili.class);
		System.out.println(Json.encode(chili));
		//chiliRepository.save(chili);
		
		
		
	}

}
