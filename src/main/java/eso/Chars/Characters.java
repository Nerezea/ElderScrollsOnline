package eso.Chars;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Characters")
public class Characters {

	@Id
	@GeneratedValue
	private Integer ID;
	@Column(name = "Name")
	private String name;
	@Column(name = "Role")
	private String role;
	@Column(name = "Damage")
	private Integer damage;
	@Column(name = "Race")
	private String race;
	@Column(name = "Job")
	private String job;
	@Column(name = "Title")
	private String title;
	@Column(name = "Class")
	private String type;
	@Column(name = "Curse")
	private String curse;
	@Column(name = "Alliance")
	private String alliance;

	@Embedded
	private Embedded_Sets sets;

	@OneToOne
	private Characters_Weapons weapon;
	@OneToMany
	@JoinTable(joinColumns = @JoinColumn(name = "Char_ID"), inverseJoinColumns = @JoinColumn(name = "PotionID"))
	private Collection<Characters_Potions> potion = new ArrayList<Characters_Potions>();

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getDamage() {
		return damage;
	}

	public void setDamage(Integer damage) {
		this.damage = damage;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public Embedded_Sets getSets() {
		return sets;
	}

	public void setSets(Embedded_Sets sets) {
		this.sets = sets;
	}

	public Characters_Weapons getWeapon() {
		return weapon;
	}

	public void setWeapon(Characters_Weapons weapon) {
		this.weapon = weapon;
	}

	public Collection<Characters_Potions> getPotion() {
		return potion;
	}

	public void setPotion(Collection<Characters_Potions> potion) {
		this.potion = potion;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCurse() {
		return curse;
	}

	public void setCurse(String curse) {
		this.curse = curse;
	}

	public String getAlliance() {
		return alliance;
	}

	public void setAlliance(String alliance) {
		this.alliance = alliance;
	}
	
	
	

}

//TODO ANSCHAUEN UND VERSTEHEN, OHNE BEARBEITUNG AUF SACHEN ZUGREIFEN
//@OneToMany(mappedBy = "alliancename")
//private Collection<Player>	player	= new ArrayList<Player>();

//@ManyToOne
//@JoinColumn(name = "allianceid")
//private Alliance	alliancename;
