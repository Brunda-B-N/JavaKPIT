public class Association{
    public static void main(String args[]){
        Terrorist terrorObj = new Terrorist();
       
        Guns gunObj = new Guns("riffle", "full automacity", 7);
        BluePrint bPrintObj = new BluePrint("Pune", true);
        Bomb bombObj = new Bomb("high");

        Guns gunObj2 = new Guns("pistol", "semi automacity", 3);
        BluePrint bPrintObj2 = new BluePrint("Bangalore", false);
        Bomb bombObj2 = new Bomb("low");
        terrorObj.Attack(gunObj2, bPrintObj2, bombObj2);
        terrorObj.Attack(gunObj, bPrintObj, bombObj);
        

        
    }

}
class Human{

}
class Terrorist extends Human{     //isA

    Mentor mentorObj = new Mentor("Jhone");          //hasA
    Mentor mentorObj2 = new Mentor("Jake");        //hasA

    Plan planObj = new Plan();                             //hasA
    
    private Weapon weaponObj = new Weapon();               //hasA
    
    public void Attack(Guns gunsref, BluePrint bluePrintref, Bomb bombref ){             //function usesA
        System.out.println("--------------------------------------------------------------");
        System.out.println("The attack is in "+bluePrintref.place);
        
        if (bluePrintref.isLarge.equals(true)){
            gunsref.numbers = gunsref.numbers + 2;
            System.out.println("Mentor for the attack is "+mentorObj.name);
            System.out.println("As plan is large using "+gunsref.numbers+" "+gunsref.guntype+ " with the "+bombref.capacity+ " bomb capacity");
        }
        else{
            System.out.println("Mentor for the attack is "+mentorObj2.name);
            System.out.println("Plan is simple and using " +gunsref.numbers+ " "+gunsref.guntype+ " guns with the "+bombref.capacity+ " bomb capacity");
        }
        System.out.println("Disaster is successfull in "+bluePrintref.place+" in "+bombref.capacity+" range");
        System.out.println("--------------------------------------------------------------");
    }
    
}
class Mentor{
    String name;

    public Mentor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
class Plan{
    
}
class Weapon{
}
class Guns{
    String guntype;
    String atomacity;
    int numbers;
    public int getNumbers() {
        return numbers;
    }
    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }
    public String getGuntype() {
        return guntype;
    }
    public void setGuntype(String guntype) {
        this.guntype = guntype;
    }
    public String getAtomacity() {
        return atomacity;
    }
    public void setAtomacity(String atomacity) {
        this.atomacity = atomacity;
    }
    public Guns(String guntype, String atomacity, int numbers) {
        this.guntype = guntype;
        this.atomacity = atomacity;
        this.numbers = numbers;
    }
    

}

class BluePrint{
    String place;
    Boolean isLarge;

    public Boolean getIsLarge() {
        return isLarge;
    }

    public void setIsLarge(Boolean isLarge) {
        this.isLarge = isLarge;
    }
    public BluePrint(String place, Boolean isLarge) {
        this.place = place;
        this.isLarge = isLarge;
    }
    public String getPlace() {
        return place;
    }
    public void setPlace(String place) {
        this.place = place;
    }
    
    
}

class Bomb{
    String capacity;

    public Bomb(String capacity) {
        this.capacity = capacity;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

}

