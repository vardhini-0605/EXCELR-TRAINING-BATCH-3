class Bowler {
    String name;
    int wickets, matches, ballsBowled, runsConceded;

    Bowler(String name, int wickets, int matches, int ballsBowled, int runsConceded) {
        this.name = name;
        this.wickets = wickets;
        this.matches = matches;
        this.ballsBowled = ballsBowled;
        this.runsConceded = runsConceded;
    }

    boolean isValid() {
        return wickets >= 0 && matches >= 0 && ballsBowled >= 0 && runsConceded >= 0 &&
               (matches > 0 || (ballsBowled == 0 && runsConceded == 0));
    }

    void computeBowlingAverage() {
        if (!isValid() || wickets == 0) {
            System.out.println("Error");
            return;
        }
        System.out.println("Name: " + name);
        System.out.println("bowling_avg=" + (double) runsConceded / wickets);
    }

    void computeStrikeRate() {
        if (!isValid() || ballsBowled == 0) {
            System.out.println("Error");
            return;
        }
        System.out.println("Name: " + name);
        System.out.println("Strike_rate=" + (double) runsConceded / ballsBowled);
    }

    void showStatistics() {
        if (!isValid()) {
            System.out.println("Error");
            return;
        }
        System.out.println("Name=" + name);
        System.out.println("wickets=" + wickets);
        System.out.println("matches=" + matches);
        System.out.println("balls_bowled=" + ballsBowled);
        System.out.println("runs_conceded=" + runsConceded);
    }
}

public class PS003 {
    public static void main(String[] args) {
        Bowler bowler = new Bowler("Sachin", 10, 5, 750, 463);
        bowler.computeBowlingAverage();
        bowler.showStatistics();
        bowler.computeStrikeRate();
    }
}