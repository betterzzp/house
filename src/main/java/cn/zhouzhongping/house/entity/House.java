package cn.zhouzhongping.house.entity;

public class House extends Community {
	private static final long serialVersionUID = 1L;
	/**
	 * 平米
	 */
	private Integer square;
	/**
	 * 几厅
	 */
	private Integer hallNumber;
	/**
	 * 价格
	 */
	private float price;
	/**
	 * 建造年代
	 */
	private Integer buildYear;
	/**
	 * 几室
	 */
	private Integer bedRoomNumber;
	

	public Integer getBedRoomNumber() {
		return bedRoomNumber;
	}

	public void setBedRoomNumber(Integer bedRoomNumber) {
		this.bedRoomNumber = bedRoomNumber;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public Integer getSquare() {
		return square;
	}

	public void setSquare(Integer square) {
		this.square = square;
	}

	public Integer getHallNumber() {
		return hallNumber;
	}

	public void setHallNumber(Integer hallNumber) {
		this.hallNumber = hallNumber;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Integer getBuildYear() {
		return buildYear;
	}

	public void setBuildYear(Integer buildYear) {
		this.buildYear = buildYear;
	}
}
