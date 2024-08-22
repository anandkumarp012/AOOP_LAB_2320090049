package Com.Gaming;

public abstract class enemtfactory {
	public abstract enemy createEnemy();
}

 class EasyEnemyFactory extends enemtfactory {
    @Override
    public enemy createEnemy() {
        return new conditionofenemy();
    }
}

 class MediumEnemyFactory extends enemtfactory {
    @Override
    public enemy createEnemy() {
        return new MediumEnemy();
    }
}

class HardEnemyFactory extends enemtfactory {
    @Override
    public enemy createEnemy() {
        return new hard();
    }
}
