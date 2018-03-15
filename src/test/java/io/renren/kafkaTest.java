package io.renren;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class kafkaTest extends SpringbootApplicationTests{
	
	
	private Gson gson = new GsonBuilder().create();
	
	@Autowired
	private KafkaTemplate<?, String> kafkaTemplate;
	
	@Test
	public void testkafka() throws Exception {
       List<String> list = new ArrayList<String>();
       list.add("testkafka");
       list.add("testcxf");
       list.add("kafkaTestaaaa");
       kafkaTemplate.send("alan.test", gson.toJson(list));
    }

}
