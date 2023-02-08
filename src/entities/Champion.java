package entities;

public class Champion {
	private String name;
	private int life, attack, armor;
	
	public Champion() {}
	
	public Champion(String name, int life, int attack, int armor) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLife() {
		return life;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}
	
	public void takeDamage(Champion champion) {
		if (champion.attack - armor < life) {
			if (armor > champion.attack) {
				life -= 1;
			} else {
				life -= champion.attack - armor;
			}
		} else {
			life = 0;
		}
	}
	
	public String status() {
		if (life > 0) {
			return name + ": " +life + " de vida";
		} else {
			return name + ": " +life + " de vida (morreu)";
		}
	}
}
