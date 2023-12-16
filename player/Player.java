package rock_paper_scissors.player;
import rock_paper_scissors.RPS;
import java.util.Scanner;

public abstract class Player {
    String name;
    RPS move;
    Scanner scanner = new Scanner(System.in);

    protected void chooseMove(){
    }

    public RPS getMove() {
        return move;
    }

    public String getName() {
        return name;
    }
}
