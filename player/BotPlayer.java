package rock_paper_scissors.player;
import rock_paper_scissors.game.RPS;
import java.util.Random;

public class BotPlayer extends Player{

    private int botWinCounter;

    public BotPlayer(){
       setBotName();
    }

    @Override
    protected void chooseMove(){
        // choose a random value from RPS enum
        Random random = new Random();
        int randomValue = random.nextInt(RPS.values().length);

        this.move =  RPS.values()[randomValue];
        System.out.println(this.name + " played " + this.move);
    }

    public int getBotWinCounter(){
        return botWinCounter;
    }

    public void incrementBotWinCounter(){
        this.botWinCounter++;
    }

    private void setBotName(){
        System.out.println("Type the bot name:");
        this.name = scanner.nextLine();
    }

    public void setBotMove() {
        chooseMove();
    }
}