package eso.Chars;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Characters_Potions {

	@Id
	@GeneratedValue
	private Integer	PotionID;
	private String	Potion;
	
	public Integer getPotionID() {
		return PotionID;
	}
	public void setPotionID(Integer potionID) {
		PotionID = potionID;
	}
	public String getMainPotion() {
		return Potion;
	}
	public void setMainPotion(String mainPotion) {
		Potion = mainPotion;
	}
}
