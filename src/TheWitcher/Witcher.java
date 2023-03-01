package TheWitcher;


/**
 * Clase que representa un brujo con tres atributos, name, health, hasSoul.
 * Esta clase se usará para un video juego RPG.
 * 
 * @author Juan Cortés
 * @version 1.0
 * 
 */

public class Witcher {
	/**
	 * atributo name que es el nombre del brujo
	 */
	private  String name;
	public String getName() {
		return name;
	}
	/**
	 * Setter para introducir el nombre del brujo
	 * @param name Nombre del Brujo
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Getter para obtener la cantidad de Vida del brujo
	 * @return Devuelve el numero de vidas que le quedan al brujo
	 */
	public int getHealth() {
		return health;
	}
	/**
	 * Setter para establecer la vida del brujo
	 * @param health Cantidad de vida del brujo
	 */
	public void setHealth(int health) {
		this.health = health;
	}
	/**
	 * Funcion para saber si el brujo tiene alma.
	 * @return Devuelve si el brujo tiene alma o no.
	 */
	public boolean isHasSoul() {
		return hasSoul;
	}
	/**
	 * Setter oara establecer el alma del brujo
	 * @param hasSoul Valor boolean si tiene o no alma
	 */
	public void setHasSoul(boolean hasSoul) {
		this.hasSoul = hasSoul;
	}

	private int health;
	private boolean hasSoul;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * Nos dice si el brujo está o no muerto
	 * <ul>
	 * 	 <li>Si no tiene vida</li>
	 * 	 <li>Si tiene vida pero no tiene alma</li>
	 * </ul>
	 * @return Si está o no muerto
	 */
	public boolean isDeath() {
		// TODO Auto-generated method stub
		if(health==0) {
			return true;
		}else if (!hasSoul) {
			return true;
		}else {
			return false;
		}
		
	}

}
