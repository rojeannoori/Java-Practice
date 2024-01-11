public class SinoTibetan extends Language{

  public SinoTibetan(String name, int numSpeakers){

    super(name, numSpeakers, "Asia" , "Subject-object-verb");
    if (this.name.contains("Chinese")){
        this.wordOrder = "subject-verb-object";
    }
  }
  
}