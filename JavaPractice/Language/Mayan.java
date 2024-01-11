public class Mayan extends Language {

  public Mayan(String name, int numSpeakers){

    super(name, numSpeakers,"Central America", "verb-object-subject" );
  }

  public void getInfo(){
    System.out.println("Ki \'che\' is spoken by 2330000 people mainly in Central America. \nThe language follows the word order: verb-object-subject.\nFun fact: Ki\'che\' is an ergative language.");
  }

}