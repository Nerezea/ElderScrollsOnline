package eso.Chars;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Embedded_Sets {

	@Column(name = "FirstSet")
	private String	firstset;
	@Column(name = "SecondSet")
	private String	secondset;
	@Column(name = "ThirdSet")
	private String	thirdset;
	
	public String getFirstset() {
		return firstset;
	}
	public void setFirstset(String firstset) {
		this.firstset = firstset;
	}
	public String getSecondset() {
		return secondset;
	}
	public void setSecondset(String secondset) {
		this.secondset = secondset;
	}
	public String getThirdset() {
		return thirdset;
	}
	public void setThirdset(String thirdset) {
		this.thirdset = thirdset;
	}

	

}
