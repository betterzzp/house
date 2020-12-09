package cn.zhouzhongping.house.entity;

import java.io.Serializable;

public class Community implements Serializable{
	private static final long serialVersionUID = 1L;
	/**
	 * 记录Id
	 */
	private Integer id;
	/**
	 * 城市
	 */
	private String city;
	/**
	 * 区域
	 */
	private String area;
	/**
	 * 小区名称
	 */
	private String name;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
