package io.renren.common.elasticsearch;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import io.renren.modules.app.entity.UserEntity;

public interface ChiliRepository extends ElasticsearchRepository<Chili,String>{

	List<UserEntity> findByTitle(String title);
}
