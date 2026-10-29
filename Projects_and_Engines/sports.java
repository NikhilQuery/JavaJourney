package Projects_and_Engines;
import java.util.Scanner;

interface states{
    void calculatetotalscore();
}
class player{
     String playername;
    int playerage;
    
    public player(String name , int age){
        playername = name;
        playerage = age;
    }

    public player(){
        playername = "nikhil";
        playerage = 18;
    }

    public String getPlayername() {
        return playername;
    }

    public void setPlayername(String playername) {
        this.playername = playername;
    }

    public int getPlayerage() {
        return playerage;
    }

    public void setPlayerage(int playerage) {
        this.playerage = playerage;
    }
}

class cricketplayer extends player implements states{
    @Override 
    public void calculatetotalscore(){
        int totalruns = 0;
        for (int run : matchescores) {
    totalruns += run;
}
    System.out.println("player name : " + playername);
    System.out.println("player age : " + playerage);
    System.out.println("total runs : " + totalruns);
    if (totalruns >=150){
        System.out.println("star player");
    } else {
        System.out.println("regular palyer");
    }
}
    int[] matchescores;
    public cricketplayer(String name , int age , int[] scores){
        super(name, age);
        this.matchescores = scores;
    }
}
    public class sports {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter player name");
    String name = sc.nextLine();
    System.out.println("enter player age");
    int age = sc.nextInt();
    int [] score = new int[3];
    for(int i = 0; i<3; i++){
        System.out.println("enter runs for match" +(i+1) + ":");
        score[i] = sc.nextInt();
    }        
    cricketplayer cp = new cricketplayer(name, age, score);
    cp.calculatetotalscore();
    sc.close();    
}
}