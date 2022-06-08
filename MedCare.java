/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Akhil Padmanaban
 */
import java.util.Scanner;
public class MedCare implements Welcome{
    
    String title;
    int code;
    MedCare(){           //used a Default Constructor
        this.title="Online Medicare";           //use of this keyword
        this.code=2;
    }
    /*Getter and Setter */
    public void setTitle(String ti){        //parameters included
        title=ti;
    }
    public void setCode(int C){
        code=C;
    }
    public String getTitle(){
        return title;
    }
    public int getCode(){
        return code;
    }
    public void welcome(){
        System.out.println("WELCOME TO THE LOGIN PAGE");
    }
    public void Login(){
        String name,blood;
        final int age;                      //Final keyword
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Name:");
        name=sc.nextLine();
        System.out.println("Enter your Bloodgroup:");
        blood=sc.nextLine();
        AgeTest a=new AgeTest();            
               a.start();
               
              
    }
    public static void main(String args[])throws Exception{         //used Throws (Exception handling)
        
        System.out.println(" \t\t\tONLINE MEDICARE SERVICE \n \t\t\t-------------------------- ");
        for(int i=5;i>0;i--){
            System.out.println("Page opens in "+i+"seconds");
            try{Thread.sleep(1000);} catch(Exception e){}
        }
        /*Showing Welcome part using INTERFACE */
        MedCare wel=new MedCare();                      //try and Catch block (Exception Handling concepts)
        MedCare m=new MedCare();
        m.setCode(2);
        System.out.println("Code=\n"+m.getCode());
        m.setTitle("ONLINE FREE MEDICARE\n\n");
        System.out.println("title=\n"+m.getTitle());
        wel.welcome();
        
        wel.Login();     
        
        System.out.println("\n----------------------");                 //use of arrays
        String[] safe = { "Wash", "You", "Hands","Stay", "Safe",};
        for (int i = 0; i < safe.length; i++) {
         System.out.println(safe[i]);
}
        System.out.println("\n----------------------");

       
    }
}
/*
Different classes with extend towards the main thread, Interfaces and abstractions are
used here.
*/
interface Welcome{              //Interface part
 public void welcome();  
public void Login(); 
}

class AgeTest extends Thread{       //usage of Thread 1
    public void run(){
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Age:");
        age=sc.nextInt();
        AdultChategory t=new AdultChategory();
        ChildChategory m=new ChildChategory();
        if(age<18){
            m.run();
        }else
        {
            t.run();
        }
        if(age>=18)
               {
                    System.out.println("\n----------\nADULT CARE\n----------");
                    Adulttreatment ad=new Adulttreatment();
                    ad.AdultOptions();
                    ad.Cure2();
               }
               else
               {
                   System.out.println("\n---------\nCHILD CARE\n----------");
                   Childtreatment c=new Childtreatment();
                   c.ChildOptions();
                   c.Cure1();
        
               }
    }
}

class  AdultChategory extends Thread {        //usage of Thread 2
    public void run(){
        System.out.println("The Person Falls under Adult Chategory...Now lets move onto the type of medical treatment \nthat the person is needed.");   
        
    }
}
class ChildChategory extends Thread{     //usage of Thread 3
    public void run(){
        System.out.println("The Person falls under the Child Chategory...Now lets move onto the type of treatment\n that the person is needed.");
    }
}

class  Childtreatment extends Solving {             //using abstract method
    public void ChildOptions(){
        System.out.println("\n-------------------");
        System.out.println(" 1)FEVER & COLD \n 2)TENSION+DEPRESSION\n3)Others");
        System.out.println("\n-------------------");
    
}
}

class Adulttreatment extends SolvingAdu{
    public void AdultOptions(){
        System.out.println("\n\n-------------------------------\n");
        System.out.println("1)DEPRESSION, TENSION & ANXIETY\n2)JOINT PAINS\n3)FEVER & COLD\n4)OTHER ISSUES\n");
        System.out.println("------------------------------");
    }
}

abstract class SolvingAdu{
    public void Cure2()
    {
        int b;
        Scanner abcd= new Scanner(System.in);
        System.out.println("\n\nEnter the choice :");
        b=abcd.nextInt();
        /* Using Switch cases */
        switch(b){
            case 1:System.out.println("REMEDY FOR DEPRESSION, TENSION & STRESS \n");
                    System.out.println("\n1.One of the best herbs for anxiety and ailments is Garlic that can be easily found in your kitchen.\n" +
"\n" +
"Whether you have chronic or passive anger due to sinus congestion or health issues, the regular use of garlic can help in lowering your blood pressure. Just eat 1 to 2 fresh garlic cloves daily in the morning and enjoy its antimicrobial benefits.\n" +
"\n" +
"9. Ginger\n" +
"Ginger is another readily available hers for severe anxiety and managing stomach related issues, such as nausea and vomiting.\n" +
"\n" +
"Fresh teas of ginger can also help in relieving flu and cold systems. It is recommended to use ginger teas or dried ginger in moderation to manage stress and other health issues.");
                    System.out.println("\n2.One of the best remedies for depression, anxiety, and chronic venous insufficiency is horse chestnut.\n" +
"\n" +
"These seed extracts are highly effective for treatment of varicose veins.\n" +
"\n" +
"Its topical gels can reduce swelling and tenderness due to injury and lower leg pains issues.");
                    System.out.println("3)Do exercise, Drink water  & do breathing exercises.");
                    break;
                    
            case 2:System.out.println("JOINT PAIN\n\n1)Apple cider vinegar contains potassium, magnesium, Calcium and Phosphorus which are all helpful in keeping your bones healthy. These minerals can also be helpful in relieving joint pain caused by arthritis and removing toxic build up in the joints and connective tissues.\n" +
"\n" +
"You can mix the apple cider vinegar with warm water and honey and take the solution in the morning daily.");
            System.out.println("\n2)Cinnamon has anti-inflammatory and anti-oxidant properties. Cinnamon can be mixed with honey and water then taken in the morning. A paste of cinnamon and honey can be used to massage the affected area. This can help in relieving the pain.");
            System.out.println("\n3)Fish oil contains omega fatty acids which have anti-inflammatory effect which can reduce body pain. You can take two spoonful of fish oil daily for effectiveness. It is advisable to take fish oil in the morning on an empty stomach.");
            
                    break;
            
            case 3:System.out.println("FEVER & COLD\n\n1)CHICKEN SOUP- Chicken soup may not be a cure-all, but it’s a great choice when you’re sick. Research suggests that enjoying a bowl of chicken soup with vegetables, prepared from scratch or warmed from a can, can slow the movement of neutrophils in your body. \nNeutrophils are a common type of white blood cell. They help protect your body from infection. \nWhen they’re moving slowly, they stay more concentrated in the areas of your body that require the most healing.");
                    System.out.println("2) The health benefits of ginger root have been touted for centuries, but now we have scientific proof of its curative properties. A few slices of raw ginger root in boiling water may help soothe a cough or sore throat. Research suggests that it can \nalso ward off the feelings of nausea that so often accompany influenza. For example, one studyTrusted Source found that just 1 gram of ginger \ncan alleviate clinical nausea of diverse causes.");
                    System.out.println("3) Gargling with salt water may help prevent Trusted Source upper respiratory infections. It may also decrease the severity of cold symptoms. For example, it may ease sore throat pain and nasal congestion.\n\nGargling with salt water reduces and loosens mucus, which contains bacteria and allergens. To try this remedy at home, dissolve 1 teaspoon of salt in a full glass of water. Swish it around your mouth and throat. Then spit it out.");
                    break;
                    
            case 4: System.out.println("\nCONTACT oUR DEPARTMENT FOR FURTHER ISSUES TREATMENT  :)");
                    break;
        default:System.out.println("Wrong Entry :(\ncheck the entering...");
                break;
            
            
        }
    }
}

abstract class Solving {
    public void Cure1(){
        Scanner abc=new Scanner(System.in);
        System.out.println("\n\nEnter the choice :");
    int a= abc.nextInt();
    switch(a)
    {
        case 1: System.out.println("REMEDY FOR FEVER & COLD\n");
                System.out.println("If the Child is suffering from fever adequately follow these quick measurements\n");
                System.out.println("1)\t\tIf you are an Indian, you must have heard your mother and grandmother preach about \nthe medicinal benefits of onion. Onion not only helps in reduction of body temperature but also relieves the body of pains during fever.\n Simply cut one whole onion into thin slices and rub 2 to 3 pieces on your child’s feet for a few minutes.\n This process may be repeated twice a day to reduce fever.");
                System.out.println("\n\n2)GINGER BATH-\nAdd about 2 tablespoons of ginger powder to a bathtub filled with warm water.\n The powder needs to be stirred well. You can give your ailing child a warm ginger bath. \nSweating post bath will reduce his body heat and flush out the toxins");
                System.out.println("\n-----------------------");
                break;
        case 2: System.out.println("REMEDY FOR TENSION + DEPRESSION\n");
                System.out.println("1)LAVENDER OIL-\nEssential oils, in general, and lavender oil, in particular, can be useful in treating stress and providing patients with peaceful\n feelings[6]. In fact, lavender oil has been commonly used as a medicine for mood \nand sleep disorders thanks to its calming and sedative effects.\n");
                System.out.println("2)Believe it or not, your diet plan also plays a significant role in your process of treating depression[12].\n The foods you choose may impact your mood. It is key to consume foods that help with your neurotransmitters and avoid\n foods that trigger your negative feelings.\nYou should avoid eating carb-rich snacks, as they make you slow and lethargic, and depressed.\n The foundation for a stable mind is a healthy body.");
                break;
        case 3: System.out.println("REMEDIES FOR ANY OTHER ISSUES\n");
                System.out.println("Always wash your hands well\n Bath & Brush your teeth twice a day\n eat foot well\n Contact our department if any other issues that the child is facing");
                break;
        default:System.out.println("Wrong Entry :(\ncheck the entering...");
                break;
        
    }
    }
}

