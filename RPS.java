package rock_paper_scissors;

public enum RPS {
    ROCK("Rock"),
    PAPER("Paper"),
    SCISSORS("Scissors");
    private final String rps;

    RPS(String rps){
        this.rps = rps;
    }

    @Override
    public String toString(){
        return this.rps;
    }
}
