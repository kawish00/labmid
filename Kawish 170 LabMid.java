
package kawishlabmid;

import java.util.*;
class VisaBuilder{
    String VisaName;
    String Nationality ;
    int yourage;
    String yourgender;
    String Visapurpose;
    Scanner sc = new Scanner(System.in);
    public void CollectData(){
    System.out.println("Visa Form");
    System.out.println("Enter your Name: ");
    VisaName = sc.nextLine();
    System.out.println("Enter your Nationality: ");
    Nationality = sc.nextLine();
     System.out.println("Enter your age: ");
    yourage = sc.nextInt();
    System.out.println("Enter your gender: ");
    yourgender = sc.nextLine(); 
    System.out.println("Enter purpose of visa: ");
    Visapurpose = sc.nextLine();
    Myvisaconcretebuilder obj = new Myvisaconcretebuilder(
    VisaName,Nationality,yourage,yourgender,Visapurpose);
    obj.creatVisa();
    }
    
    
}
class Myvisaconcretebuilder{
    String yourname;
    String Yournamtinality ; 
    int age;
    String gender;
    String purposeOfVisa;
    BusniseVisa Bobj;
    StudyVisa Sobj;
    VisitVisa Vobj;
    Myvisaconcretebuilder(String name,String nat, int age, String gender, String purpose ){
        this.yourname = name;
        this.Yournamtinality = nat;
        this.age = age;
        this.gender = gender;
        this.purposeOfVisa = purpose;
    }
    public void creatVisa(){
        if(this.purposeOfVisa.contentEquals("Busnise")){
               Bobj.creatVisa();
            
        }
        else if(this.purposeOfVisa.contentEquals("Study")){
               Sobj.creatVisa();
            
        }
        else if(this.purposeOfVisa.contentEquals("Visit")){
               Vobj.creatVisa();
            
        }
        else{
            System.out.println("You Chose Nothing ");
        }
    }
    
}
class BusniseVisa extends Myvisaconcretebuilder {

    public BusniseVisa(String name,String nat, int age, String gender, String purpose) {
        super(name,nat, age, gender, purpose);
    }
    @Override
    public void creatVisa(){
        System.out.println("-------- This is Busnise Visa --------- ");
        System.out.println("Your Name is : "+super.yourname);
        System.out.println("Your Nationality is : "+super.Yournamtinality);
        System.out.println("Your Age is : "+super.age);
        System.out.println("Your Gender is : "+super.gender);  
        System.out.println("Your Purpose of Visa  is : "+super.purposeOfVisa);
        
    }
    
}
 
class VisitVisa extends Myvisaconcretebuilder{
      public VisitVisa(String name,String nat, int age, String gender, String purpose) {
        super(name,nat, age, gender, purpose);
    }
    @Override
    public void creatVisa(){
        System.out.println("-------- This is Visit Visa --------- ");
        System.out.println("Your Name is : "+super.yourname);
        System.out.println("Your Nationality is : "+super.Yournamtinality);
        System.out.println("Your Age is : "+super.age);
        System.out.println("Your Gender is : "+super.gender);  
        System.out.println("Your Purpose of Visa  is : "+super.purposeOfVisa);
        
    }
    
}
class VisaDirector{ 
    VisaBuilder myobj = new VisaBuilder();
    public void requestVisa(){
    myobj.CollectData();
    }
    
}
public class KawishLabMid {

    public static void main(String[] args) {
        System.out.println("Create Me A Visa ");
        VisaDirector obj = new VisaDirector();
        obj.requestVisa();
        
    }
    
}

