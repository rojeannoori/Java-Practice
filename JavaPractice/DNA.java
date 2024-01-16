// Practicing String Traversal
// this code identifies if a certain DNA has protein in the sequence
// each DNA is a String
// a DNA contains a protein if:
/*

-it starts with AGT in sequence.
-it ends with TGA
-DNA strings can be of any length

*/

public class DNA{

// checks if a DNA string has protein
  public String hasProtein(String dna){

    //getting the start potion ATG
    int startIndex = dna.indexOf("ATG");

    //getting the end position TGA
    int endIndex =  dna.indexOf("TGA");

    //if the Start and Index are above -1 they are found in the string. 
    if ((startIndex > -1 && endIndex > -1) && (endIndex+2-startIndex+1)%3==0){
      return "Contains a Protein";
    }
    else return "Does not contain a Protein";
 }

public static void main (String [] args){

String dna1 = "ATGCGATACGCTTGA"; //has protein
String dna2 = "ATGCGATACGTGA"; //doesnt have a protein
String dna3 = "ATTAATATGTACTGA"; //has a protein
String dna4 = "edaub";
DNA dna = new DNA();


System.out.println(dna.hasProtein(dna1));
System.out.println(dna.hasProtein(dna2));
System.out.println(dna.hasProtein(dna3));
}
}