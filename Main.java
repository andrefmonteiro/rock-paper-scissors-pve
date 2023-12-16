package rock_paper_scissors;
import rock_paper_scissors.player.BotPlayer;
import rock_paper_scissors.player.UserPlayer;


public class Main{

    public static void main(String[] args) {

        UserPlayer user = new UserPlayer();
        BotPlayer bot = new BotPlayer();

        Game game1 = new Game(user, bot);

    }

}
