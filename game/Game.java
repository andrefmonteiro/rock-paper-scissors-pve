package rock_paper_scissors.game;
import rock_paper_scissors.AsciiArt;
import rock_paper_scissors.player.BotPlayer;
import rock_paper_scissors.player.UserPlayer;
public class Game {
    public Game(UserPlayer user, BotPlayer bot){
        System.out.println("\n--- " + user.getName() + " vs. " + bot.getName() + " ---");

        while (user.getUserWinCounter() < 3 && bot.getBotWinCounter() < 3){
            System.out.println("\n" + user.getName() + ": " + user.getUserWinCounter() + " points." );
            System.out.println(bot.getName() + ": " + bot.getBotWinCounter() + " points.\n");

            user.setUserMove();
            bot.setBotMove();

            determineWinner(user, bot);
        }

        System.out.println("\n--- Final Score ---");
        System.out.println(user.getName() + ": " + user.getUserWinCounter() + " points");
        System.out.println(bot.getName() + ": " + bot.getBotWinCounter() + " points");

        if(user.getUserWinCounter() > bot.getBotWinCounter()){
            System.out.println(user.getName() + " wins the game!");
        } else {
            System.out.println(bot.getName() + " wins the game!");
        }

    }

    private void determineWinner(UserPlayer user, BotPlayer bot) {
        if (user.getMove().equals(bot.getMove())){
            System.out.println("It's a tie.");
        } else if ((user.getMove().equals(RPS.ROCK) && bot.getMove().equals(RPS.SCISSORS)) ||
                    (user.getMove().equals(RPS.PAPER) && bot.getMove().equals(RPS.ROCK)) ||
                    (user.getMove().equals(RPS.SCISSORS) && bot.getMove().equals(RPS.PAPER))) {
            System.out.println(user.getName() + " wins the round!");
            user.incrementUserWinCounter();
        } else {
            System.out.println(bot.getName() + " wins the round!");
            bot.incrementBotWinCounter();
        }
    }

}
