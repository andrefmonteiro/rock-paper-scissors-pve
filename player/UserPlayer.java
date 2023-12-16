package rock_paper_scissors.player;
import rock_paper_scissors.game.RPS;

public class UserPlayer extends Player{

    private int userWinCounter;

    public UserPlayer(){
        setUserName();
    }

    @Override
    protected void chooseMove() {
        while (true) {
            System.out.println("Choose a move (r, p, s)");
            String scannedChoice;
            scannedChoice = scanner.nextLine();

            if (scannedChoice.equals("r")){
                this.move = RPS.ROCK;
                System.out.println("\n" + this.name + " played " + this.move);
                break;
                }
            if (scannedChoice.equals("p")){
                this.move = RPS.PAPER;
                System.out.println(this.name + " played " + this.move);
                break;
            }
            if (scannedChoice.equals("s")){
                this.move = RPS.SCISSORS;
                System.out.println(this.name + " played " + this.move);
                break;
            }
            System.out.println("\nInvalid move!");
        }
    }

    public int getUserWinCounter() {
        return userWinCounter;
    }

    public void incrementUserWinCounter(){
        this.userWinCounter++;
    }

    public void setUserName(){
        System.out.println("Type your name:");
        this.name = scanner.nextLine();

    }
    public void setUserMove() {
        chooseMove();
    }
}
