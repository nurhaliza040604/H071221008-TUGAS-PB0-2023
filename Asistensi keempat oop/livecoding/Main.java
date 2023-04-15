public class Main {
    
    public static void main(String[] args) {    // mengisi objek Country yang kosong
        Country country1 = new Country();
        country1.setName("Indonesia");
        country1.setCapital("Jakarta");
        country1.setheadOfState("Presiden");
        country1.setpopulation(2_000_000);
        country1.setlanguange("indonesia");
        country1.displayInfo();

        
        System.out.println("-------------");
        
        
        Country country2 = new Country("Malaysia","Kuala Lumpur", "Perdana Menteri", 1_000_000, "melayu");
        country2.getName();
        country2.getCapital();
        country2.getheadOfState();
        country2.getpopulation();
        country2.getlanguage();   
        country2.displayInfo();

        System.out.println("-------------");

        SelfUtils.displaySelfData("Nurhaliza Alawiah Syah", "H071221008");


    }
    
}
