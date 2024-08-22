package Com.Gaming;

public interface weopen {
	void fire();
}


 interface PowerUp {
    void activate();
}


 interface GameFactory {
    weopen createWeapon();
    PowerUp createPowerUp();
}
