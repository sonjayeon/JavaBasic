package Practice0328_01;

public class Pitcher extends BaseballPlayer {
   private double era;

   public Pitcher(String name, int uniformNumber, double battingAverage, double era){
       this.name = name;
       this.uniformNumber = uniformNumber;
       this.battingAverage = battingAverage;
       this.era = era;
   }
   public void introduce(){
       System.out.println("선수명:" + name);
       System.out.println("등번호:" + uniformNumber);
       System.out.println("타율:" + battingAverage);
       System.out.println("방어율:" + era);
    }

}
