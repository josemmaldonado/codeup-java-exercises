// This program determines whether there is a protein 
// in a strand of DNA.

public class DNA {

    public static String containProtein (String dnaStrand) {
        
        int start = dnaStrand.indexOf("ATG"); 
        int stop = dnaStrand.indexOf("TGA");
    
        if (start != -1 && stop != -1 && (stop - start) % 3 == 0) {

            String protein = dnaStrand.substring(start, stop+3);

            return protein + " does contain protein";
        }
            return dnaStrand + " does not contain any protein";
    }


    public static void main(String[] args) {
        
    //  -. .-.   .-. .-.   .
    //    \   \ /   \   \ / 
    //   / \   \   / \   \  
    //  ~   `-~ `-`   `-~ `-


    // DNA strands that I will use to test my program
    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";

        System.out.println(containProtein(dna1));
        System.out.println(containProtein(dna2));
        System.out.println(containProtein(dna3));

    }

}