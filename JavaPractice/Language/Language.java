//this is a main class where we execute the methods

public class Language{

  protected String name;
  protected int numSpeakers;
  protected String regionsSpoken;
  protected String wordOrder;

  //Constructor
  public Language (String name, int numSpeakers, String regionsSpoken, String wordOrder){
    this.name = name;
    this.numSpeakers = numSpeakers;
    this.regionsSpoken = regionsSpoken;
    this.wordOrder = wordOrder;
  }

  public void getInfo(){
    System.out.println(name + " is spoken by " + numSpeakers + " people mainly in " + regionsSpoken + ".\nThe language follows the word order: " + wordOrder);
  }

  public static void main (String [] args){

      Language lang1 = new Language("Farsi", 80000000, "Iran" , "Subject, Object, Verb");
      Language lang2 = new Mayan("Mayan" , 2000);
      Language lang3 = new SinoTibetan("Mandarin Chinese", 30050);
      Language lang4 = new SinoTibetan("Burmese", 4306800);

      lang1.getInfo();
      lang2.getInfo();
      lang3.getInfo();
      lang4.getInfo();



  }
}