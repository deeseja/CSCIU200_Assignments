package completed;

public class Phone {
	private String areaCode;
	private String number;
	private Style style;

	public Phone(String areaCode, String number) {
		this.areaCode = areaCode;
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public Style getStyle() {
		return style;
	}

	public void setStyle(Style style) {
		this.style = style;
	}
}
