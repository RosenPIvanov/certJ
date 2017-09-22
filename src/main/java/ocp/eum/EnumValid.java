package ocp.eum;



    /* no way public*/ enum EnumA{ A, AA, AAA};  //1
public class EnumValid { //2
     public enum EnumB{ B, BB, BBB }; //3

     public static enum EnumC{ C, CC, CCC }; //4
       public EnumValid()    {
           //error in method enum EnumD{ D, DD, DDD } //5
           }     public void methodX()    {
        //error in method public enum EnumE{ E, EE, EEE } //6
       }
       public static void main(String[] args) //7
       {
           //error in method enum EnumF{ F, FF, FFF};
    // 8
     } }

