package eso.Chars;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Characters_Weapons {

	@Id
	@GeneratedValue
	private Integer	WeaponID;
	private String	MainWeapon;
	private String SecondWeapon;
	
	public Integer getWeaponID() {
		return WeaponID;
	}
	public void setWeaponID(Integer weaponID) {
		WeaponID = weaponID;
	}
	public String getMainWeapon() {
		return MainWeapon;
	}
	public void setMainWeapon(String mainWeapon) {
		MainWeapon = mainWeapon;
	}
	public String getSecondWeapon() {
		return SecondWeapon;
	}
	public void setSecondWeapon(String secondWeapon) {
		SecondWeapon = secondWeapon;
	}
}
