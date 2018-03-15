package io.renren.common.elasticsearch;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldIndex;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "magnet", type = "chili",shards = 1,replicas = 0, refreshInterval = "-1")
public class Chili {
	
	@Id
	private String id;
	
	@Field(type = FieldType.String, index = FieldIndex.not_analyzed, store = true, analyzer = "analysis-smartcn", searchAnalyzer = "analysis-smartcn")
    private String title;
	
	@Field(type = FieldType.String, index = FieldIndex.analyzed,  store = true,analyzer = "analysis-smartcn", searchAnalyzer = "analysis-smartcn")
	private String name;
	
	@Field(type = FieldType.String, index = FieldIndex.not_analyzed, store = true)
	private String size;
	
	@Field(type= FieldType.Nested)
	private List<Files> files;
	
	@Field(type = FieldType.String, index = FieldIndex.not_analyzed, store = true)
	private String address;
	
	@Field(type = FieldType.String, index = FieldIndex.not_analyzed, store = true)
	private int port;
	
	@Field(type = FieldType.String, index = FieldIndex.not_analyzed, store = true)
	private String infohash;
	
	@Field(type = FieldType.String, index = FieldIndex.analyzed, store = true)
	private String magnet;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public List<Files> getFiles() {
		return files;
	}

	public void setFiles(List<Files> files) {
		this.files = files;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getInfohash() {
		return infohash;
	}

	public void setInfohash(String infohash) {
		this.infohash = infohash;
	}

	public String getMagnet() {
		return magnet;
	}

	public void setMagnet(String magnet) {
		this.magnet = magnet;
	}
	
	
	
	

}
