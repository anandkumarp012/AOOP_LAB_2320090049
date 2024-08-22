package Com.Gaming;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	       gameworking gamestate = gameworking.getInstance();

	        System.out.println("Welcome to the Game!");
	        System.out.print("Select Difficulty (Easy, Medium, Hard): ");
	        String difficulty = sc.nextLine();
	        gamestate.setDifficulty(difficulty);

	        enemtfactory enemyFactory;
	        GameFactory gameFactory;

	               switch (difficulty.toLowerCase()) {
	            case "easy":
	                enemyFactory = new EasyEnemyFactory();
	                gameFactory = new EasyGameFactory();
	                break;
	            case "medium":
	                enemyFactory = new MediumEnemyFactory();
	                gameFactory = new MediumGameFactory();
	                break;
	            case "hard":
	                enemyFactory = new HardEnemyFactory();
	                gameFactory = new HardGameFactory();
	                break;
	            default:
	                System.out.println("Invalid difficulty. Defaulting to Easy.");
	                enemyFactory = new EasyEnemyFactory();
	                gameFactory = new EasyGameFactory();
	        }

	        enemy enemy = enemyFactory.createEnemy();
	        weopen weapon = gameFactory.createWeapon();
	        PowerUp powerUp = gameFactory.createPowerUp();

	        gamestate.displayState();
	        enemy.attack();
	        weapon.fire();
	        powerUp.activate();

	        sc.close();
	    }
	}