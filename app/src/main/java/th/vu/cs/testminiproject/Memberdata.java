package th.vu.cs.testminiproject;

/**
 * Created by Rasta on 14/2/2560.
 */

public class Memberdata {

    private int id;
    private String name;
    private  String surname;
   // private  int age;

    public Memberdata(int id,String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
       // this.age = age;
    }




    public int getId(){
        return this.id;
    }

    public String getName(){

        return this.name;
    }


    public String getSurname(){

        return this.surname;
    }

  //  public int getAge(){

    //    return this.age;
   // }



}
