// NOMOR 2
// nama kelas
public class Person {
    // atribut
    String name;
    int age;
    // bernilai benar atau salah
    boolean isMale;
// method
    public void setName (String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge (){
        return age;
    }
    public void setGender (boolean isMale){
        this.isMale = isMale;
    }
    public String getGender(){ 
        // pengkondisian jika is male sama dengan true dia adalah laki",dan jika bukan dia perempuan
        
        if ( isMale == true){
            return "laki-laki" ;
        
        }else {
            return "perempuan";
        }
    }
    public static void main(String[] args) {
        // objek
        Person person1 = new Person();
        person1.setName("Icha");
        person1.setAge(18);
        person1.setGender(false);

        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        System.out.println(person1.getGender());
    }
}
