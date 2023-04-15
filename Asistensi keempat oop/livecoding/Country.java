public class Country {
    
    String name ;
    String capital;
    String headOfState;
    int population;
    String language;

    public Country(){} // constructor kosong , lihat soal no 4 

    public Country(String name, String capital, String headOfState, int population, String language) { // constructor yang memiliki atribut , lihat soal no 8
        this.name = name;
        this.capital = capital ;
        this.headOfState = headOfState;
        this.population = population;
        this.language = language;
    }
    public void setName(String name) {
        this.name = name;
    }  
    public void setCapital(String capital) {
        this.capital = capital;
    }    
    public void setheadOfState(String headOfState) {
        this.headOfState = headOfState;
    }  
    public void setpopulation(int population) {
        this.population = population;
    }
    public void setlanguange(String language) {
        this.language = language;
    }    
    public String getName() {
        return name;  
    }
    public String getCapital(){
        return capital;
    }
    public String getheadOfState() {
        return headOfState;  
    }
    public int getpopulation() {
        return population;  
    }
    public String getlanguage() {
        return language;  
    }

    public void displayInfo(){ // behaviour untuk display info , baca soal no 7 
        System.out.println("Display Info country");
        System.out.println("Name : " + this.getName());
        System.out.println("Capital: " + this.getCapital());
        System.out.println("headOfState : " + this.getheadOfState());
        System.out.println("population : " + this.getpopulation());
        System.out.println("language : " + this.getlanguage());
    }    
}    