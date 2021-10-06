import java.util.*;
public class restaurant//class begins
{
    String mainMenu[]= {"SOUPS","SALAD", "STARTER","MAIN COURSE", "DESSERTS","BEVERAGES"};
    String SoupsMenu[]={"Indian","Chinese","Continental"};
    String SoupsIndian[]={"Tamatar Dhaniya Ka Shorba", "Lasooni Palak Ka Shorba", "Jahangiri Murgh Shorba(NV)", "Murgh Tamatar Pudina Shorba(NV)"};
    String SoupsChinese[]={"Manchow Soup(V)" ,"Manchow Soup(NV)","Hot and Sour Soup(V)","Hot and Sour Soup(NV)"};
    String SoupsContinental[]={"Cream of Tomato" ,"Cream of Veg","Cheese and Brocoli Soup","Cream of Chicken(NV)"};
    String SaladsMenu[]={"Green Salad","Bell Peppers and Pasta Salad","Chicken Tikka Chat","Grilled Chicken Salad"};
    String StarterMenu[]={"Indian","Chinese","Continental"};
    String StarterIndian[]={"Sabzi Ke Seekh Kabab","Paneer BBQ Tikka","Murgh Tikka(NV)","Chicken Pepper Kebab(NV)"};
    String StarterChinese[]={"Exotic Manchurian Dry","Spring Roll","Chicken Lollipop(NV)","Chicken Pepper Chili Dry(NV)"};
    String StarterContinental[]={"Garlic Bread","French Fries","Fish and Chips(NV)","Cajun Chicken Tenders(NV)"};
    String MainCourseMenu[]={"Rice","Indian Breads","Lentils","Indian Specials","Malvani Specials","Chinese Delicacies","Italian Delicacies"};
    String RiceMenu[]={"Steamed Rice","Subz Dum Biryani","Murgh Dum Pukht Biryani(NV)","Murgh Shahi Pulao"};
    String IndianBreadsMenu[]={"Plain Roti","Butter Roti","Butter Naan","Garlic Naan"};
    String LentilsMenu[]={"Dal Fry","Dal Palak","Dal Tadkewali","Dal Makhani"};
    String IndianSpecialsMenu[]={"Dum Aloo Punjabi","Kadai Paneer","Murgh Makhani(NV)","Mutton Roganjosh(NV)"};
    String MalvaniSpecialsMenu[]={"Kori Gassi(NV)", "Chicken Sukka(NV)","Kombdi Bhaat(NV)","Kolambi Bhaat(NV)"};
    String ChineseDelicaciesMenu[]={"Vegetable Balls in Manchurian","Three Treasure Exotic Vegetables","Chicken in Manchurian(NV)","Chicken in Sqezwan(NV)"};
    String ItalianDelicaciesMenu[]={"Deluxe Margherita Pizza", "Cheese and Barbequed Pizza(NV)","Pasta Creamy Cheese Sauce","Pasta Pesto Italiano with Sea Food(NV)"};
    String DessertsMenu[]={"Angoori Gulab Jamun","Crème Caramel","Choco Lava","Chocolate Mousse","Sizzling Walnut Brownie"};
    String BeveragesMenu[]={"Aerated Drinks","Mocktails","Cocktails"};
    String AeratedDrinksMenu[]={"Thumbs Up", "Mirinda", "Sprite","Limca"};
    String MocktailsMenu[]={"Spicy Lane","Jaljeera Chiller","Icy Lemon","Sunshine"};
    String CocktailsMenu[]={"Bull Frog","Margarita","Mojito","Blue Lagoon"};
    String itemdescription[]= new String[50];                       //**************Price List of All Items *********************/////////////////
    int quantity[]= new int[50],totalqty=0;
    int amount[]= new int[50],totalamt=0,cnt;
    int SoupsIndianPrice[]={160,160,175,175};
    int SoupsChinesePrice[]={160,160,175,175};
    int SoupsContinentalPrice[]={160,160,160,175};
    int SaladsPrice[]={165,175,195,195};
    int StarterIndianPrice[]={235,255,310,325};
    int StarterChinesePrice[]={235,235,310,310};
    int StarterContinentalPrice[]={110,165,285,285};
    int RicePrice[]={160,265,325,325};
    int IndianBreadsPrice[]={45,50,55,85};
    int LentilsPrice[]={190,190,200,220};
    int IndianSpecialsPrice[]={255,285,325,370};
    int MalvaniSpecialsPrice[]={325,325,355,375};
    int ChineseDelicaciesPrice[]={245,245,325,325};
    int ItalianDelicaciesPrice[]={325,365,340,410};
    int DessertsPrice[]={155,155,195,195,270};
    int AeratedDrinksPrice[]={100,100,100,100};
    int MocktailsPrice[]={195,145,195,195};
    int CocktailsPrice[]={425,335,310,310};
    char ans='y';
    int d= 0; // variable useed for the delay loop
    public restaurant()
    {
        cnt=0;
    }

    public void mainMenu()
    {  
        System.out.println("\f");
        int ans=0; boolean t=true;
        
        if(d==0)
        {
            delay();
            d=1;
        }
       
        do
        {
            try
            {
                Scanner in = new Scanner(System.in);
                System.out.println("Enter your choice according to the following : ");//let the user enter
                System.out.println();
                for(int i=0;i<mainMenu.length;i++)
                {
                    System.out.println((i+1)+". "+mainMenu[i]);
                }

                System.out.println("7. Exit");
                ans =in.nextInt();
                t=false;
            }
            catch(Exception e)
            {
                
                System.out.println("\f");
                System.out.println("Invalid Choice...\nEnter Integer Value");
                System.out.println();
                t=true;
                continue;
            }
            if(ans==7)
            {
               System.out.println("\f");
               displaytotalbill(); //generate the bill
               System.out.println("Thank You for using our Software....");
               delay_exit();
               System.exit(0);
            }
            else if(ans<1 || ans >7)
            {
                System.out.println("\f");
                System.out.println("Invalid Choice...\nEnter any number from (1-7)");
                System.out.println();
                t=true;
                continue;
            }
            else
                t=false;
        }while(t);
        switch(ans)
        {
            case 1:
            displaySoupsMenu();
            break;

            case 2:
            displaySaladsMenu();
            break;
            
            case 3:
            displayStarterMenu();
            break;
            
            case 4:
            displayMainCourseMenu();
            break;
            
            case 5:
            displayDessertsMenu();
            break;
            
            case 6:
            displayBeveragesMenu();
            break;

        }
    }//end of main menu

    void delay_exit()
    {
        for(double i=1.0;i<=500000000;i+=0.5);//delay loop used during closing the program
    }
    
    void displaySoupsMenu()
    {
        System.out.println("\f");
        int ans=0; boolean t=true;
        do
        {
            try
            {
                Scanner in = new Scanner(System.in);
                System.out.println("Enter your choice according to the following : ");//let the user enter
                System.out.println();
                for(int i=0;i<SoupsMenu.length;i++)
                {
                    System.out.println((i+1)+". "+SoupsMenu[i]);
                }

                System.out.println("4. Back");
                ans =in.nextInt();
                t=false;
            }
            catch(Exception e)
            {
                
                System.out.println("\f");
                System.out.println("Invalid Choice...\nEnter Integer Value");
                System.out.println();
                t=true;
                continue;
            }

            if(ans==4)
            {
                mainMenu();
                return;
            }
            else if(ans<1 || ans>4)
            {
                System.out.println("\f");                
                System.out.println("Invalid Choice...\nEnter any number from (1-4)");
                System.out.println();
                t=true;
                continue;
            }
            else
                t=false;
        }while(t);
        switch(ans)
        {
            case 1:
            displaySoupsIndian();
            break;

            case 2:
            displaySoupsChinese();
            break;

            case 3:
            displaySoupsContinental();
            break;
        }
    }

    void displaySoupsIndian()
    {
        System.out.println("\f");
        int amt=0, ch=0,qty=0, type=0;boolean t=true;
        do{
            Scanner in = new Scanner(System.in);
            try
            {
                System.out.println("Indian Soups option selected");
                System.out.println("Enter your choice according to the following : ");//let the user enter
                System.out.println();
                for(int i=0;i<SoupsIndian.length;i++)
                {
                    System.out.println((i+1)+". "+SoupsIndian[i]+"........."+SoupsIndianPrice[i]);
                }
                System.out.println("5. Back");
                ch=in.nextInt();
                t=false;
            }
            catch(Exception e)
            {
                System.out.println("\f");
                System.out.println("Invalid Choice...\nPlease Enter Integer Value");
                System.out.println();
                continue;
            }
            if(ch<1 || ch>5)
            {
                System.out.println("\f");
                System.out.println("Invalid Choice Entered...\nPlease enter from (1-5)");
                System.out.println();
                t=true;
                continue;
            }
            if(ch==5)
                displaySoupsMenu();
            do{
                Scanner in1 = new Scanner(System.in);
                try
                {
                    System.out.println("Enter quantity");
                    qty=in1.nextInt();
                    if(qty<1 || qty>100)
                    {
                        System.out.println("\f");
                        System.out.println("Invalid Input...\nPlease Enter Quantity between 1 -100...");
                        System.out.println();
                        t=true;
                        continue;
                    }
                    t=false;
                }
                catch(Exception e)
                {
                    System.out.println();
                    System.out.println("Invalid Input...\nPlease enter only Integer value");
                    System.out.println();
                    t=true;
                    continue;
                }
            }while(t);// for invalid  entries
            int pos=searchvalue(SoupsIndian[ch-1]);
            amt= SoupsIndianPrice[(ch-1)]*qty;
            if(pos==-1)
            {           
                itemdescription[cnt]=(SoupsIndian[ch-1]);
                amount[cnt]= amt;
                quantity[cnt]=qty;
                cnt++;
            }
            else
            {
                itemdescription[pos]=(SoupsIndian[ch-1]);
                amount[pos]+= amt;
                quantity[pos]+=qty;
            }
            System.out.println();
            displaytotalbill();
            System.out.println("Enter \'Y\' to continue");
            ans=in.next().charAt(0); 
            System.out.println("\f");
        }while(ans=='y'|| ans=='Y');
        mainMenu();
    }

    void displaySoupsChinese()
    {
        System.out.println("\f");
        int amt=0, ch=0,qty=0, type=0;boolean t=true;
        do{
            Scanner in = new Scanner(System.in);

            try
            {
                System.out.println("Chinese Soups option selected");
                System.out.println("Enter your choice according to the following : ");//let the user enter
                System.out.println();
                for(int i=0;i<SoupsChinese.length;i++)
                {
                    System.out.println((i+1)+". "+SoupsChinese[i]+"........."+SoupsChinesePrice[i]);
                }
                System.out.println("5. Back");
                ch=in.nextInt();
                t=false;
            }
            catch(Exception e)
            {
                System.out.println("\f");
                System.out.println("Invalid Choice...\nPlease Enter only Integer Value");
                System.out.println();
                t=true;
                continue;
            }
            if(ch<1 || ch>5)
            {
                System.out.println("\f");
                System.out.println("Invalid Choice ...\nPlease enter between 1-5");
                System.out.println();
                t=true;
                continue;
            }
            else if(ch==5)
                displaySoupsMenu();
            else
                t=false;
            do{
                Scanner in1 = new Scanner(System.in);
                try
                {
                    System.out.println("Enter quantity");
                    qty=in1.nextInt();
                    if(qty<1 || qty>100)
                    {
                        System.out.println();
                        System.out.println("Invalid Input...\nPlease Enter Quantity between 1 -100...");
                        System.out.println();
                        t=true;
                        continue;
                    }
                    t=false;
                }
                catch(Exception e)
                {
                    System.out.println("Invalid Input...\nPlease enter only Integer value");
                    System.out.println();
                    t=true;
                    continue;
                }
            }while(t);// for invalid  entries
            int pos=searchvalue(SoupsChinese[ch-1]);
            amt= SoupsChinesePrice[(ch-1)]*qty;
            if(pos==-1)
            {           
                itemdescription[cnt]=(SoupsChinese[ch-1]);
                amount[cnt]= amt;
                quantity[cnt]=qty;
                cnt++;
            }
            else
            {
                itemdescription[pos]=(SoupsChinese[ch-1]);
                amount[pos]+= amt;
                quantity[pos]+=qty;
            }
            System.out.println();
            displaytotalbill();
            System.out.println("Enter 'Y' to continue");
            ans=in.next().charAt(0); 
            System.out.println("\f");
        }while(ans=='y'|| ans=='Y');
        mainMenu();
    }

    void displaySoupsContinental()
    {
        System.out.println("\f");
        int amt=0, ch=0,qty=0;boolean t=true;
        do{
            Scanner in = new Scanner(System.in);

            try
            {
                System.out.println("Continental Soups option selected");
                System.out.println("Enter your choice according to the following : ");//let the user enter
                System.out.println();
                for(int i=0;i<SoupsContinental.length;i++)
                {
                    System.out.println((i+1)+". "+SoupsContinental[i]+"........."+SoupsContinentalPrice[i]);
                }
                System.out.println("5. Back");
                ch=in.nextInt();
                t=false;
            }
            catch(Exception e)
            {
                System.out.println("\f");
                System.out.println("Invalid Choice...\nPlease Enter only Integer Value");
                System.out.println();
                continue;
            }
            if(ch<1 || ch>5)
            {
                System.out.println("\f");
                System.out.println("Invalid Choice Entered...\nPlease enter between 1-5");
                System.out.println();
                t=true;
                continue;
            }
            if(ch==5)
                displaySoupsMenu();
            do{
                Scanner in1 = new Scanner(System.in);
                try
                {
                    System.out.println("Enter quantity");
                    qty=in1.nextInt();
                    if(qty<1 || qty>100)
                    {
                        System.out.println("Invalid Input...\nPlease Enter Quantity between 1 -100...");
                        System.out.println();
                        t=true;
                        continue;
                    }
                    t=false;
                }
                catch(Exception e)
                {
                    System.out.println("Invalid Input...\nPlease Enter only Integer value");
                    System.out.println();
                    t=true;
                    continue;
                }
            }while(t);// for invalid  entries
            int pos=searchvalue(SoupsContinental[ch-1]);
            amt= SoupsContinentalPrice[(ch-1)]*qty;
            if(pos==-1)
            {           
                itemdescription[cnt]=(SoupsContinental[ch-1]);
                amount[cnt]= amt;
                quantity[cnt]=qty;
                cnt++;
            }
            else
            {
                itemdescription[pos]=(SoupsContinental[ch-1]);
                amount[pos]+= amt;
                quantity[pos]+=qty;
            }
            System.out.println();
            displaytotalbill();
            System.out.println("Enter 'Y' to continue");
            ans=in.next().charAt(0); 
            System.out.println("\f");
        }while(ans=='y'|| ans=='Y');
        mainMenu();
    }

    void displaySaladsMenu()
    {
        System.out.println("\f");
        int amt=0, ch=0,qty=0;boolean t=true;
        do{
            Scanner in = new Scanner(System.in);

            try
            {
                System.out.println("Salads option selected");
                System.out.println("Enter your choice according to the following : ");//let the user enter
                System.out.println();
                for(int i=0;i<SaladsMenu.length;i++)
                {
                    System.out.println((i+1)+". "+SaladsMenu[i]+"........."+SaladsPrice[i]);
                }
                System.out.println("5. Back");
                ch=in.nextInt();
                t=false;
            }
            catch(Exception e)
            {
                System.out.println("\f");
                System.out.println("Invalid Choice...\nPlease Enter only Integer Value");
                System.out.println();
                t=true;
                continue;
            }
            if(ch<1 || ch>5)
            {
                System.out.println("\f");
                System.out.println("Invalid Choice...\nPlease enter between 1-5");
                System.out.println();
                t=true;
                continue;
            }
            if(ch==5)
            {
                mainMenu();
                return;
            }
            do{
                Scanner in1 = new Scanner(System.in);
                try
                {
                    System.out.println("Enter quantity");
                    qty=in1.nextInt();
                    if(qty<1 || qty>100)
                    {
                        System.out.println("Invalid Input...\nPlease Enter Quantity between 1 -100...");
                        System.out.println();
                        t=true;
                        continue;
                    }
                    t=false;
                }
                catch(Exception e)
                {
                    System.out.println("Invalid Input...\nPlease enter only Integer value");
                    System.out.println();
                    t=true;
                    continue;
                }
            }while(t);// for invalid  entries
            int pos=searchvalue(SaladsMenu[ch-1]);
            amt= SaladsPrice[(ch-1)]*qty;
            if(pos==-1)
            {           
                itemdescription[cnt]=(SaladsMenu[ch-1]);
                amount[cnt]= amt;
                quantity[cnt]=qty;
                cnt++;
            }
            else
            {
                itemdescription[pos]=(SaladsMenu[ch-1]);
                amount[pos]+= amt;
                quantity[pos]+=qty;
            }
            System.out.println();
            displaytotalbill();
            System.out.println("Enter \'Y\' to continue"); 
            ans=in.next().charAt(0); 
            System.out.println("\f");
        }while(ans=='y'|| ans=='Y');
        mainMenu();
    }
    
    void displayStarterMenu()
    {
        System.out.println("\f");
        int ans=0; boolean t=true;
        do
        {
            try
            {
                Scanner in = new Scanner(System.in);
                System.out.println("Enter your choice according to the following : ");//let the user enter
                System.out.println();
                for(int i=0;i<StarterMenu.length;i++)
                {
                    System.out.println((i+1)+". "+StarterMenu[i]);
                }

                System.out.println("4. Back");
                ans =in.nextInt();
                t=false;
            }
            catch(Exception e)
            {
                
                System.out.println("\f");
                System.out.println("Invalid Input...\nPlease Enter Integer Value");
                System.out.println();
                t=true;
                continue;
            }

            if(ans==4)
            {
                mainMenu();
                return;
            }
            else if(ans<1 || ans>4)
            {
                System.out.println("\f");
                System.out.println("Invalid Choice...\nPlease Enter any Number from (1-4)");
                System.out.println();
                t=true;
                continue;
            }
            else
                t=false;
        }while(t);
        switch(ans)
        {
            case 1:
            displayStarterIndian();
            break;
            
            case 2:
            displayStarterChinese();
            
            case 3:
            displayStarterContinental();

        }
    }
    
    void displayStarterIndian()
    {
        System.out.println("\f");
        int amt=0, ch=0,qty=0;boolean t=true;
        do{
            Scanner in = new Scanner(System.in);

            try
            {
                System.out.println("Indian Starters option selected");
                System.out.println("Enter your choice according to the following : ");//let the user enter
                System.out.println();
                for(int i=0;i<StarterIndian.length;i++)
                {
                    System.out.println((i+1)+". "+StarterIndian[i]+"........."+StarterIndian[i]);
                }
                System.out.println("5. Back");
                ch=in.nextInt();
                t=false;
            }
            catch(Exception e)
            {
                System.out.println("\f");
                System.out.println("Invalid Choice...\nPlease Enter Integer Value");
                System.out.println();
                t=true;
                continue;
            }
            if(ch<1 || ch>5)
            {
                System.out.println("\f");
                System.out.println("Invalid Choice Entered...\nPlease enter between 1-5");
                System.out.println();
                t=true;
                continue;
            }
            if(ch==5)
                displayStarterMenu();
            do{
                Scanner in1 = new Scanner(System.in);
                try
                {
                    System.out.println("Enter quantity");
                    qty=in1.nextInt();
                    if(qty<1 || qty>100)
                    {
                        System.out.println("Invalid Input...\nPlease Enter Quantity between 1 -100...");
                        System.out.println();
                        t=true;
                        continue;
                    }
                    t=false;
                }
                catch(Exception e)
                {
                    System.out.println("Invalid Input...\nPlease enter Integer value");
                    System.out.println();
                    t=true;
                    continue;
                }
            }while(t);// for invalid  entries
            int pos=searchvalue(StarterIndian[ch-1]);
            amt= StarterIndianPrice[(ch-1)]*qty;
            
            if(pos==-1)
            {           
                itemdescription[cnt]=(StarterIndian[ch-1]);
                amount[cnt]= amt;
                quantity[cnt]=qty;
                cnt++;
            }
            else
            {
                itemdescription[pos]=(StarterIndian[ch-1]);
                amount[pos]+= amt;
                quantity[pos]+=qty;
            }
            displaytotalbill();
            System.out.println("Enter \'Y\' to continue");
            ans=in.next().charAt(0); 
            System.out.println("\f");
        }while(ans=='y'|| ans=='Y');
        mainMenu();
    }
    
    void displayStarterChinese()
    {
        System.out.println("\f");
        int amt=0, ch=0,qty=0;boolean t=true;
        do{
            Scanner in = new Scanner(System.in);
            try
            {
                System.out.println("Chinese Starters option selected");
                System.out.println("Enter your choice according to the following : ");//let the user enter
                System.out.println();
                for(int i=0;i<StarterChinese.length;i++)
                {
                    System.out.println((i+1)+". "+StarterChinese[i]+"........."+StarterChinesePrice[i]);
                }
                System.out.println("5. Back");
                ch=in.nextInt();
                t=false;
            }
            catch(Exception e)
            {
                System.out.println("\f");
                System.out.println("Invalid Choice...\nPlease Enter Integer Value");
                System.out.println();
                continue;
            }
            if(ch<1 || ch>5)
            {
                System.out.println("\f");
                System.out.println("Invalid Choice Entered...\nPlease enter between 1-5");
                System.out.println();
                t=true;
                continue;
            }
            if(ch==5)
                displayStarterMenu();
            do{
                Scanner in1 = new Scanner(System.in);
                try
                {
                    System.out.println("Enter quantity");
                    qty=in1.nextInt();
                    if(qty<1 || qty>100)
                    {
                        System.out.println("Invalid Input...\nPlease Enter Quantity between 1 -100...");
                        System.out.println();
                        t=true;
                        continue;
                    }
                    t=false;
                }
                catch(Exception e)
                {
                    System.out.println("Invalid Input...\nPlease enter Integer value");
                    System.out.println();
                    t=true;
                    continue;
                }
            }while(t);// for invalid  entries
            int pos=searchvalue(StarterChinese[ch-1]);
            amt= StarterChinesePrice[(ch-1)]*qty;
            if(pos==-1)
            {           
                itemdescription[cnt]=(StarterChinese[ch-1]);
                amount[cnt]= amt;
                quantity[cnt]=qty;
                cnt++;
            }
            else
            {
                itemdescription[pos]=(StarterChinese[ch-1]);
                amount[pos]+= amt;
                quantity[pos]+=qty;
            }
            displaytotalbill();
            System.out.println("Enter \'Y\' to continue");
            ans=in.next().charAt(0); 
            System.out.println("\f");
        }while(ans=='y'|| ans=='Y');
        mainMenu();
    }
    
    void displayStarterContinental()
    {
        System.out.println("\f");
        int amt=0, ch=0,qty=0;boolean t=true;
        do{
            Scanner in = new Scanner(System.in);
            try
            {
                System.out.println("Continental Starters option selected");
                System.out.println("Enter your choice according to the following : ");//let the user enter
                System.out.println();
                for(int i=0;i<StarterContinental.length;i++)
                {
                    System.out.println((i+1)+". "+StarterContinental[i]+"........."+StarterContinentalPrice[i]);
                }
                System.out.println("5. Back");
                ch=in.nextInt();
                t=false;
            }
            catch(Exception e)
            {
                System.out.println("\f");
                System.out.println("Invalid Choice...\nPlease Enter Integer Value");
                System.out.println();
                continue;
            }
            if(ch<1 || ch>5)
            {
                System.out.println("\f");
                System.out.println("Invalid Choice...\nPlease enter between 1-5");
                System.out.println();
                t=true;
                continue;
            }
            if(ch==5)
                displayStarterMenu();
            do{
                Scanner in1 = new Scanner(System.in);
                try
                {
                    System.out.println("Enter quantity");
                    qty=in1.nextInt();
                    if(qty<1 || qty>100)
                    {
                        System.out.println("Invalid Input...\nPlease Enter Quantity between 1 -100...");
                        System.out.println();
                        t=true;
                        continue;
                    }
                    t=false;
                }
                catch(Exception e)
                {
                    System.out.println("Invalid Choice...\nPlease Enter Integer Value");
                    System.out.println();
                    t=true;
                    continue;
                }
            }while(t);// for invalid  entries
            int pos=searchvalue(StarterContinental[ch-1]);
            amt= StarterContinentalPrice[(ch-1)]*qty;
            
            if(pos==-1)
            {           
                itemdescription[cnt]=(StarterContinental[ch-1]);
                amount[cnt]= amt;
                quantity[cnt]=qty;
                cnt++;
            }
            else
            {
                itemdescription[pos]=(StarterContinental[ch-1]);
                amount[pos]+= amt;
                quantity[pos]+=qty;
            }
            displaytotalbill();
            System.out.println("Enter \'Y\' to continue");
            ans=in.next().charAt(0); 
            System.out.println("\f");
        }while(ans=='y'|| ans=='Y');
        mainMenu();
    }
    
    void displayMainCourseMenu()
    {
        System.out.println("\f");
        int ans=0; boolean t=true;
        do
        {
            try
            {
                Scanner in = new Scanner(System.in);
                System.out.println("Enter your choice according to the following : ");//let the user enter
                System.out.println();
                for(int i=0;i<MainCourseMenu.length;i++)
                {
                    System.out.println((i+1)+". "+MainCourseMenu[i]);
                }

                System.out.println("8. Back");
                ans =in.nextInt();
                t=false;
            }
            catch(Exception e)
            {
                
                System.out.println("\f");
                System.out.println("Invalid Choice...\nPlease Enter Integer Value");
                System.out.println();
                t=true;
                continue;
            }

            if(ans==8)
            {
                mainMenu();
                return;
            }
            else if(ans<1 || ans>7)
            {
                System.out.println("\f");
                System.out.println("Invalid Choice...\nPlease Enter from (1-8)");
                System.out.println();
                t=true;
                continue;
            }
            else
                t=false;
        }while(t);
        switch(ans)
        {
          case 1:
          displayRiceMenu();
          break;
          
          case 2:
          displayIndianBreadsMenu();
          break;
          
          case 3:
          displayLentilsMenu();
          break;
          
          case 4:
          displayIndianSpecialsMenu();
          break;
          
          case 5:
          displayMalvaniSpecialsMenu();
          break;
          
          case 6:
          displayChineseDelicaciesMenu();
          break;
          
          case 7:
          displayItalianDelicaciesMenu();

        }
    }
    
    void displayRiceMenu()
    {
        System.out.println("\f");
        int amt=0, ch=0,qty=0;boolean t=true;
        do{
            Scanner in = new Scanner(System.in);
            try
            {
                System.out.println("Rice option selected");
                System.out.println("Enter your choice according to the following : ");//let the user enter
                System.out.println();
                for(int i=0;i<RiceMenu.length;i++)
                {
                    System.out.println((i+1)+". "+RiceMenu[i]+"........."+RicePrice[i]);
                }
                System.out.println("5. Back");
                ch=in.nextInt();
                t=false;
            }
            catch(Exception e)
            {
                System.out.println("\f");
                System.out.println("Invalid Choice...\nPlease Enter Integer Value");
                System.out.println();
                continue;
            }
            if(ch<1 || ch>5)
            {
                System.out.println("\f");
                System.out.println("Invalid Choice Entered...\nPlease enter between 1-5");
                System.out.println();
                t=true;
                continue;
            }
            if(ch==5)
                displayMainCourseMenu();
            do{
                Scanner in1 = new Scanner(System.in);
                try
                {
                    System.out.println("Enter quantity");
                    qty=in1.nextInt();
                    if(qty<1 || qty>100)
                    {
                        System.out.println("Invalid Input...\nPlease Enter Quantity between 1 -100...");
                        System.out.println();
                        t=true;
                        continue;
                    }
                    t=false;
                }
                catch(Exception e)
                {
                    System.out.println("Invalid Choice...\nPlease Enter Integer Value");
                    System.out.println();
                    t=true;
                    continue;
                }
            }while(t);// for invalid  entries
            int pos=searchvalue(RiceMenu[ch-1]);
            amt= RicePrice[(ch-1)]*qty;
            
            if(pos==-1)
            {           
                itemdescription[cnt]=(RiceMenu[ch-1]);
                amount[cnt]= amt;
                quantity[cnt]=qty;
                cnt++;
            }
            else
            {
                itemdescription[pos]=(RiceMenu[ch-1]);
                amount[pos]+= amt;
                quantity[pos]+=qty;
            }
            displaytotalbill();
            System.out.println("Enter \'Y\' to continue");
            ans=in.next().charAt(0); 
            System.out.println("\f");
        }while(ans=='y'|| ans=='Y');
        mainMenu();
    }
    
    void displayIndianBreadsMenu()
    {
        System.out.println("\f");
        int amt=0, ch=0,qty=0;boolean t=true;
        do{
            Scanner in = new Scanner(System.in);
            try
            {
                System.out.println("Indian Breads option selected");
                System.out.println("Enter your choice according to the following : ");//let the user enter
                System.out.println();
                for(int i=0;i<IndianBreadsMenu.length;i++)
                {
                    System.out.println((i+1)+". "+IndianBreadsMenu[i]+"........."+IndianBreadsPrice[i]);
                }
                System.out.println("5. Back");
                ch=in.nextInt();
                t=false;
            }
            catch(Exception e)
            {
                System.out.println("\f");
                System.out.println("Invalid Choice...\nPlease Enter Integer Value");
                System.out.println();
                continue;
            }
            if(ch<1 || ch>5)
            {
                System.out.println("\f");
                System.out.println("Invalid Choice...\nPlease enter between 1-5");
                System.out.println();
                t=true;
                continue;
            }
            if(ch==5)
                displayMainCourseMenu();
            do{
                Scanner in1 = new Scanner(System.in);
                try
                {
                    System.out.println("Enter quantity");
                    qty=in1.nextInt();
                    if(qty<1 || qty>100)
                    {
                        System.out.println("Invalid Input...\nPlease Enter Quantity between 1 -100...");
                        System.out.println();
                        t=true;
                        continue;
                    }
                    t=false;
                }
                catch(Exception e)
                {
                    System.out.println("Invalid Choice...\nPlease Enter Integer Value");
                    System.out.println();
                    t=true;
                    continue;
                }
            }while(t);// for invalid  entries
            int pos=searchvalue(IndianBreadsMenu[ch-1]);
            amt= IndianBreadsPrice[(ch-1)]*qty;
            
            if(pos==-1)
            {           
                itemdescription[cnt]=(IndianBreadsMenu[ch-1]);
                amount[cnt]= amt;
                quantity[cnt]=qty;
                cnt++;
            }
            else
            {
                itemdescription[pos]=(IndianBreadsMenu[ch-1]);
                amount[pos]+= amt;
                quantity[pos]+=qty;
            }
            displaytotalbill();
            System.out.println("Enter \'Y\' to continue");
            ans=in.next().charAt(0); 
            System.out.println("\f");
        }while(ans=='y'|| ans=='Y');
        mainMenu();
    }
    
    void displayLentilsMenu()
    {
        System.out.println("\f");
        int amt=0, ch=0,qty=0;boolean t=true;
        do{
            Scanner in = new Scanner(System.in);
            try
            {
                System.out.println("Lentils option selected");
                System.out.println("Enter your choice according to the following : ");//let the user enter
                System.out.println();
                for(int i=0;i<LentilsMenu.length;i++)
                {
                    System.out.println((i+1)+". "+LentilsMenu[i]+"........."+LentilsPrice[i]);
                }
                System.out.println("5. Back");
                ch=in.nextInt();
                t=false;
            }
            catch(Exception e)
            {
                System.out.println("\f");
                System.out.println("Invalid Choice...\nPlease Enter Integer Value");
                System.out.println();
                continue;
            }
            if(ch<1 || ch>5)
            {
                System.out.println("\f");
                System.out.println("Invalid Choice Entered...\nPlease Enter values from (1-5)..");
                System.out.println();
                t=true;
                continue;
            }
            if(ch==5)
                displayMainCourseMenu();
            do{
                Scanner in1 = new Scanner(System.in);
                try
                {
                    System.out.println("Enter quantity");
                    qty=in1.nextInt();
                    if(qty<1 || qty>100)
                    {
                        System.out.println("Invalid Input...\nPlease Enter Quantity between 1 -100...");
                        System.out.println();
                        t=true;
                        continue;
                    }
                    t=false;
                }
                catch(Exception e)
                {
                    System.out.println("Invalid Input...\nPlease Enter Integer Value");
                    System.out.println();
                    t=true;
                    continue;
                }
            }while(t);// for invalid  entries
            int pos=searchvalue(LentilsMenu[ch-1]);
            amt= LentilsPrice[(ch-1)]*qty;
            
            if(pos==-1)
            {           
                itemdescription[cnt]=(LentilsMenu[ch-1]);
                amount[cnt]= amt;
                quantity[cnt]=qty;
                cnt++;
            }
            else
            {
                itemdescription[pos]=(LentilsMenu[ch-1]);
                amount[pos]+= amt;
                quantity[pos]+=qty;
            }
            displaytotalbill();
            System.out.println("Enter \'Y\' to continue");
            ans=in.next().charAt(0); 
            System.out.println("\f");
        }while(ans=='y'|| ans=='Y');
        mainMenu();
    }
    
    void displayIndianSpecialsMenu()
    {
        System.out.println("\f");
        int amt=0, ch=0,qty=0;boolean t=true;
        do{
            Scanner in = new Scanner(System.in);
            try
            {
                System.out.println("Indian Specials option selected");
                System.out.println("Enter your choice according to the following : ");//let the user enter
                System.out.println();
                for(int i=0;i<IndianSpecialsMenu.length;i++)
                {
                    System.out.println((i+1)+". "+IndianSpecialsMenu[i]+"........."+IndianSpecialsPrice[i]);
                }
                System.out.println("5. Back");
                ch=in.nextInt();
                t=false;
            }
            catch(Exception e)
            {
                System.out.println("\f");
                System.out.println("Invalid Choice...\nPlease Enter Integer Value");
                System.out.println();
                continue;
            }
            if(ch<1 || ch>5)
            {
                System.out.println("\f");
                System.out.println("Invalid Choice...\nPlease enter from (1-5)");
                System.out.println();
                t=true;
                continue;
            }
            if(ch==5)
                displayMainCourseMenu();
            do{
                Scanner in1 = new Scanner(System.in);
                try
                {
                    System.out.println("Enter quantity");
                    qty=in1.nextInt();
                    if(qty<1 || qty>100)
                    {
                        System.out.println("Invalid Input...\nPlease Enter Quantity between 1 -100");
                        System.out.println();
                        t=true;
                        continue;
                    }
                    t=false;
                }
                catch(Exception e)
                {
                    System.out.println("Invalid Choice...\nPlease Enter Integer Value");
                    System.out.println();
                    t=true;
                    continue;
                }
            }while(t);// for invalid  entries
            int pos=searchvalue(IndianSpecialsMenu[ch-1]);
            amt= IndianSpecialsPrice[(ch-1)]*qty;
            
            if(pos==-1)
            {           
                itemdescription[cnt]=(IndianSpecialsMenu[ch-1]);
                amount[cnt]= amt;
                quantity[cnt]=qty;
                cnt++;
            }
            else
            {
                itemdescription[pos]=(IndianSpecialsMenu[ch-1]);
                amount[pos]+= amt;
                quantity[pos]+=qty;
            }
            displaytotalbill();
            System.out.println("Enter \'Y\' to continue");
            ans=in.next().charAt(0); 
            System.out.println("\f");
        }while(ans=='y'|| ans=='Y');
        mainMenu();
    }

    void displayMalvaniSpecialsMenu()
    {
        System.out.println("\f");
        int amt=0, ch=0,qty=0;boolean t=true;
        do{
            Scanner in = new Scanner(System.in);
            try
            {
                System.out.println("Malvani Specials option selected");
                System.out.println("Enter your choice according to the following : ");//let the user enter
                System.out.println();
                for(int i=0;i<MalvaniSpecialsMenu.length;i++)
                {
                    System.out.println((i+1)+". "+MalvaniSpecialsMenu[i]+"........."+MalvaniSpecialsPrice[i]);
                }
                System.out.println("5. Back");
                ch=in.nextInt();
                t=false;
            }
            catch(Exception e)
            {
                System.out.println("\f");
                System.out.println("Invalid Choice...\nPlease Enter Integer Value");
                System.out.println();
                continue;
            }
            if(ch<1 || ch>5)
            {
                System.out.println("\f");
                System.out.println("Invalid Choice...\nPlease enter from (1-5)");
                System.out.println();
                t=true;
                continue;
            }
            if(ch==5)
                displayMainCourseMenu();
            do{
                Scanner in1 = new Scanner(System.in);
                try
                {
                    System.out.println("Enter quantity");
                    qty=in1.nextInt();
                    if(qty<1 || qty>100)
                    {
                        System.out.println("Invalid Input...\nPlease Enter Quantity between 1 -100");
                        System.out.println();
                        t=true;
                        continue;
                    }
                    t=false;
                }
                catch(Exception e)
                {
                    System.out.println("Invalid Choice...\nPlease Enter Integer Value");
                    System.out.println();
                    t=true;
                    continue;
                }
            }while(t);// for invalid  entries
            int pos=searchvalue(MalvaniSpecialsMenu[ch-1]);
            amt= MalvaniSpecialsPrice[(ch-1)]*qty;
            
            if(pos==-1)
            {           
                itemdescription[cnt]=(MalvaniSpecialsMenu[ch-1]);
                amount[cnt]= amt;
                quantity[cnt]=qty;
                cnt++;
            }
            else
            {
                itemdescription[pos]=(MalvaniSpecialsMenu[ch-1]);
                amount[pos]+= amt;
                quantity[pos]+=qty;
            }
            displaytotalbill();
            System.out.println("Enter \'Y\' to continue");
            ans=in.next().charAt(0);
            System.out.println("\f");
        }while(ans=='y'|| ans=='Y');
        mainMenu();
    }
    
    void displayChineseDelicaciesMenu()
    {
        System.out.println("\f");
        int amt=0, ch=0,qty=0;boolean t=true;
        do{
            Scanner in = new Scanner(System.in);

            try
            {
                System.out.println("Chinese Delicacies option selected");
                System.out.println("Enter your choice according to the following : ");//let the user enter
                System.out.println();
                for(int i=0;i<ChineseDelicaciesMenu.length;i++)
                {
                   System.out.println((i+1)+". "+ChineseDelicaciesMenu[i]+"........."+ChineseDelicaciesPrice[i]);
                }
                System.out.println("5. Back");
                ch=in.nextInt();
                t=false;
            }
            catch(Exception e)
            {
                System.out.println("\f");
                System.out.println("Invalid Choice...\nPlease Enter Integer Value");
                System.out.println();
                continue;
            }
            if(ch<1 || ch>5)
            {
                System.out.println("\f");
                System.out.println("Invalid Choice...\nPlease enter from (1-5)");
                System.out.println();
                t=true;
                continue;
            }
            if(ch==5)
                displayMainCourseMenu();
            do{
                Scanner in1 = new Scanner(System.in);
                try
                {
                    System.out.println("Enter quantity");
                    qty=in1.nextInt();
                    if(qty<1 || qty>100)
                    {
                        System.out.println("Invalid Input...\nPlease Enter Quantity between 1 -100");
                        System.out.println();
                        t=true;
                        continue;
                    }
                    t=false;
                }
                catch(Exception e)
                {
                    System.out.println("Invalid Input...\nPlease Enter Integer Value");
                    System.out.println();
                    t=true;
                    continue;
                }
            }while(t);// for invalid  entries
            int pos=searchvalue(ChineseDelicaciesMenu[ch-1]);
            amt= ChineseDelicaciesPrice[(ch-1)]*qty;
            
            if(pos==-1)
            {           
                itemdescription[cnt]=(ChineseDelicaciesMenu[ch-1]);
                amount[cnt]= amt;
                quantity[cnt]=qty;
                cnt++;
            }
            else
            {
                itemdescription[pos]=(ChineseDelicaciesMenu[ch-1]);
                amount[pos]+= amt;
                quantity[pos]+=qty;
            }
            displaytotalbill();
            System.out.println("Enter \'Y\' to continue");
            ans=in.next().charAt(0); 
            System.out.println("\f");
        }while(ans=='y'|| ans=='Y');
        mainMenu();
    }
    
    void displayItalianDelicaciesMenu()
    {
        System.out.println("\f");
        int amt=0, ch=0,qty=0;boolean t=true;
        do{
            Scanner in = new Scanner(System.in);

            try
            {
                System.out.println("Italian Delicacies option selected");
                System.out.println("Enter your choice according to the following : ");//let the user enter
                System.out.println();
                for(int i=0;i<ItalianDelicaciesMenu.length;i++)
                {
                   System.out.println((i+1)+". "+ItalianDelicaciesMenu[i]+"........."+ItalianDelicaciesPrice[i]);
                }
                System.out.println("5. Back");
                ch=in.nextInt();
                t=false;
            }
            catch(Exception e)
            {
                System.out.println("\f");
                System.out.println("Invalid Choice...\nPlease Enter Integer Value");
                System.out.println();
                continue;
            }
            if(ch<1 || ch>5)
            {
                System.out.println("\f");
                System.out.println("Invalid Choice...\nPlease enter from (1-5)");
                System.out.println();
                t=true;
                continue;
            }
            if(ch==5)
                displayMainCourseMenu();
            do{
                Scanner in1 = new Scanner(System.in);
                try
                {
                    System.out.println("Enter quantity");
                    qty=in1.nextInt();
                    if(qty<1 || qty>100)
                    {
                        System.out.println("Invalid Input...\nPlease Enter Quantity between 1 -100");
                        System.out.println();
                        t=true;
                        continue;
                    }
                    t=false;
                }
                catch(Exception e)
                {
                    System.out.println("Invalid Input...\nPlease Enter Integer Value");
                    System.out.println();
                    t=true;
                    continue;
                }
            }while(t);// for invalid  entries
            int pos=searchvalue(ItalianDelicaciesMenu[ch-1]);
            amt= ItalianDelicaciesPrice[(ch-1)]*qty;
            
            if(pos==-1)
            {           
                itemdescription[cnt]=(ItalianDelicaciesMenu[ch-1]);
                amount[cnt]= amt;
                quantity[cnt]=qty;
                cnt++;
            }
            else
            {
                itemdescription[pos]=(ItalianDelicaciesMenu[ch-1]);
                amount[pos]+= amt;
                quantity[pos]+=qty;
            }
            displaytotalbill();
            System.out.println("Enter \'Y\' to continue");
            ans=in.next().charAt(0); 
            System.out.println("\f");
        }while(ans=='y'|| ans=='Y');
        mainMenu();
    }
    
    void displayDessertsMenu()
    {
        System.out.println("\f");
        int amt=0, ch=0,qty=0;boolean t=true;
        do{
            Scanner in = new Scanner(System.in);
            try
            {
                System.out.println("Desserts option selected");
                System.out.println("Enter your choice according to the following : ");//let the user enter
                System.out.println();
                for(int i=0;i<DessertsMenu.length;i++)
                {
                   System.out.println((i+1)+". "+DessertsMenu[i]+"........."+DessertsPrice[i]);
                }
                System.out.println("6:Back");
                ch=in.nextInt();
                t=false;
            }
            catch(Exception e)
            {
                System.out.println("\f");
                System.out.println("Invalid Choice...\nPlease Enter Integer Value");
                System.out.println();
                continue;
            }
            if(ch<1 || ch>6)
            {
                System.out.println("\f");
                System.out.println("Invalid Choice...\nPlease Enter between 1-6");
                System.out.println();
                t=true;
                continue;
            }
            if(ch==6)
            {
                mainMenu();
                return;
             }
            do{
                Scanner in1 = new Scanner(System.in);
                try
                {
                    System.out.println("Enter quantity");
                    qty=in1.nextInt();
                    if(qty<1 || qty>100)
                    {
                        System.out.println("Invalid Input...\nPlease Enter Quantity between 1 -100...");
                        System.out.println();
                        t=true;
                        continue;
                    }
                    t=false;
                }
                catch(Exception e)
                {
                    System.out.println("Invalid Input...\nPlease Enter Integer Value");
                    System.out.println();
                    t=true;
                    continue;
                }
            }while(t);// for invalid  entries
            int pos=searchvalue(DessertsMenu[ch-1]);
            amt= DessertsPrice[(ch-1)]*qty;
            
            if(pos==-1)
            {           
                itemdescription[cnt]=(DessertsMenu[ch-1]);
                amount[cnt]= amt;
                quantity[cnt]=qty;
                cnt++;
            }
            else
            {
                itemdescription[pos]=(ItalianDelicaciesMenu[ch-1]);
                amount[pos]+= amt;
                quantity[pos]+=qty;
            }
            displaytotalbill();
            System.out.println("Enter \'Y\' to continue");
            ans=in.next().charAt(0); 
            System.out.println("\f");
        }while(ans=='y'|| ans=='Y');
        mainMenu();
    }
    
    void displayBeveragesMenu()
    {
        System.out.println("\f");
        int ans=0; boolean t=true;
        do
        {
            try
            {
                Scanner in = new Scanner(System.in);
                System.out.println("Enter your choice according to the following : ");//let the user enter
                System.out.println();
                for(int i=0;i<BeveragesMenu.length;i++)
                {
                    System.out.println((i+1)+". "+BeveragesMenu[i]);
                }
                System.out.println("4. Back");
                ans =in.nextInt();
                t=false;
            }
            catch(Exception e)
            {
                System.out.println("\f");
                System.out.println("Invalid Choice...\nPlease Enter Integer Value");
                System.out.println();
                t=true;
                continue;
            }

            if(ans==4)
            {
                mainMenu();
                return;
            }
            else if(ans<1 || ans>4)
            {
                System.out.println("\f");
                System.out.println("Invalid Choice...\nPlease Enter number from (1-4)");
                System.out.println();
                t=true;
                continue;
            }
            else
                t=false;
        }while(t);
        switch(ans)
        {
            case 1:
            displayAeratedDrinksMenu();
            break;
            
            case 2:
            displayMocktailsMenu();
            break;
            
            case 3:
            displayCocktailsMenu();
            break;
        }
    }
    
    void displayAeratedDrinksMenu()
    {
        System.out.println("\f");
        int amt=0, ch=0,qty=0;boolean t=true;
        do{
            Scanner in = new Scanner(System.in);
            try
            {
                System.out.println("Aerated Drinks option selected");
                System.out.println("Enter your choice according to the following : ");//let the user enter
                System.out.println();
                for(int i=0;i<AeratedDrinksMenu.length;i++)
                {
                   System.out.println((i+1)+". "+AeratedDrinksMenu[i]+"........."+AeratedDrinksPrice[i]);
                }
                System.out.println("5. Back");
                ch=in.nextInt();
                t=false;
            }
            catch(Exception e)
            {
                System.out.println("\f");
                System.out.println("Invalid Choice...\nPlease Enter Integer Value");
                System.out.println();
                continue;
            }
            if(ch<1 || ch>5)
            {
                System.out.println("\f");
                System.out.println("Invalid Choice...\nPlease enter from (1-5)");
                System.out.println();
                t=true;
                continue;
            }
            if(ch==5)
            {
                displayBeveragesMenu();
            }
            do{
                Scanner in1 = new Scanner(System.in);
                try
                {
                    System.out.println("Enter quantity");
                    qty=in1.nextInt();
                    if(qty<1 || qty>100)
                    {
                        System.out.println("Invalid Input...\nPlease Enter Quantity between 1 -100");
                        System.out.println();
                        t=true;
                        continue;
                    }
                    t=false;
                }
                catch(Exception e)
                {
                    System.out.println("Invalid Input...\nPlease Enter Integer Value");
                    System.out.println();
                    t=true;
                    continue;
                }
            }while(t);// for invalid  entries
            int pos=searchvalue(AeratedDrinksMenu[ch-1]);
            amt= AeratedDrinksPrice[(ch-1)]*qty;
            
            if(pos==-1)
            {           
                itemdescription[cnt]=(AeratedDrinksMenu[ch-1]);
                amount[cnt]= amt;
                quantity[cnt]=qty;
                cnt++;
            }
            else
            {
                itemdescription[pos]=(AeratedDrinksMenu[ch-1]);
                amount[pos]+= amt;
                quantity[pos]+=qty;
            }
            displaytotalbill();
            System.out.println("Enter \'Y\' to continue");
            ans=in.next().charAt(0); 
            System.out.println("\f");
        }while(ans=='y'|| ans=='Y');
        mainMenu();
    }
    
    void displayMocktailsMenu()
    {
        System.out.println("\f");
        int amt=0, ch=0,qty=0;boolean t=true;
        do{
            Scanner in = new Scanner(System.in);
            try
            {
                System.out.println("Mocktails option selected");
                System.out.println("Enter your choice according to the following : ");//let the user enter
                System.out.println();
                for(int i=0;i<MocktailsMenu.length;i++)
                {
                   System.out.println((i+1)+". "+MocktailsMenu[i]+"........."+MocktailsPrice[i]);
                }
                System.out.println("5. Back");
                ch=in.nextInt();
                t=false;
            }
            catch(Exception e)
            {
                System.out.println("\f");
                System.out.println("Invalid Choice...\nPlease Enter Integer Value");
                System.out.println();
                continue;
            }
            if(ch<1 || ch>5)
            {
                System.out.println("\f");
                System.out.println("Invalid Choice...\nPlease enter from (1-5)");
                System.out.println();
                t=true;
                continue;
            }
            if(ch==5)
                displayBeveragesMenu();
            do{
                Scanner in1 = new Scanner(System.in);
                try
                {
                    System.out.println("Enter quantity");
                    qty=in1.nextInt();
                    if(qty<1 || qty>100)
                    {
                        System.out.println("Invalid Input...\nPlease Enter Quantity between 1 -100");
                        System.out.println();
                        t=true;
                        continue;
                    }
                    t=false;
                }
                catch(Exception e)
                {
                    System.out.println("Invalid Input...\nPlease Enter Integer Value");
                    System.out.println();
                    t=true;
                    continue;
                }
            }while(t);// for invalid  entries
            int pos=searchvalue(MocktailsMenu[ch-1]);
            amt= MocktailsPrice[(ch-1)]*qty;
            
            if(pos==-1)
            {           
                itemdescription[cnt]=(MocktailsMenu[ch-1]);
                amount[cnt]= amt;
                quantity[cnt]=qty;
                cnt++;
            }
            else
            {
                itemdescription[pos]=(MocktailsMenu[ch-1]);
                amount[pos]+= amt;
                quantity[pos]+=qty;
            }
            displaytotalbill();
            System.out.println("Enter \'Y\' to continue");
            ans=in.next().charAt(0); 
            System.out.println("\f");
        }while(ans=='y'|| ans=='Y');
        mainMenu();
    }
    
    void displayCocktailsMenu()
    {
        System.out.println("\f");
        int amt=0, ch=0,qty=0;boolean t=true;
        do{
            Scanner in = new Scanner(System.in);
            try
            {
                System.out.println("Cocktails option selected");
                System.out.println("Enter your choice according to the following : ");//let the user enter
                System.out.println();
                for(int i=0;i<CocktailsMenu.length;i++)
                {
                   System.out.println((i+1)+". "+CocktailsMenu[i]+"........."+CocktailsPrice[i]);
                }
                System.out.println("5. Back");
                ch=in.nextInt();
                t=false;
            }
            catch(Exception e)
            {
                System.out.println("\f");
                System.out.println("Invalid Choice...\nPlease Enter Integer Value");
                System.out.println();
                continue;
            }
            if(ch<1 || ch>5)
            {
                System.out.println("\f");
                System.out.println("Invalid Choice...\nPlease Enter from (1-5)");
                System.out.println();
                t=true;
                continue;
            }
            if(ch==5)
                displayBeveragesMenu();
            do{
                Scanner in1 = new Scanner(System.in);
                try
                {
                    System.out.println("Enter quantity");
                    qty=in1.nextInt();
                    if(qty<1 || qty>100)
                    {
                        System.out.println("Invalid Input...\nPlease Enter Quantity between 1 -100");
                        System.out.println();
                        t=true;
                        continue;
                    }
                    t=false;
                }
                catch(Exception e)
                {
                    System.out.println("Invalid Input...\nPlease Enter Integer Value");
                    System.out.println();
                    t=true;
                    continue;
                }
            }while(t);// for invalid  entries
            int pos=searchvalue(CocktailsMenu[ch-1]);
            amt= CocktailsPrice[(ch-1)]*qty;
            
            if(pos==-1)
            {           
                itemdescription[cnt]=(CocktailsMenu[ch-1]);
                amount[cnt]= amt;
                quantity[cnt]=qty;
                cnt++;
            }
            else
            {
                itemdescription[pos]=(CocktailsMenu[ch-1]);
                amount[pos]+= amt;
                quantity[pos]+=qty;
            }
            displaytotalbill();
            System.out.println("Enter \'Y\' to continue");
            ans=in.next().charAt(0);
            System.out.println("\f");
        }while(ans=='y'|| ans=='Y');
        mainMenu();
    }

    void displaytotalbill()
    {
        totalqty=totalamt=0;
        if(cnt>0)
        {
            System.out.println("Sr No \tItem Description\t    Quantity \t      Amount ");
            for(int i=0; i<cnt ;i++)
            {
                System.out.print((i+1) + "\t" +itemdescription[i]);
                for(int k=itemdescription[i].length();k<=26; k++)//adjusting spaces in the bill
                    System.out.print(" ");
                System.out.print("\t" +quantity[i]+ "\t\t" +amount[i]);
                totalqty+=quantity[i];
                totalamt+=amount[i];
                System.out.println();
            }
            System.out.println("\tTotal \t\t\t\t"+ totalqty+"\t\t"+totalamt );
        }
 
    }

    int searchvalue(String s)
    {
        for(int i=0; i<cnt;i++)
        {
            String str=itemdescription[i];
            if(s.equalsIgnoreCase(str))
            {
                return i; //item exists in the bill
            }
        }return -1; //item does not exist in the Bill
    }
    
    void delay()
    
    {
        String str="Welcome to Spice Lane Resto Bar";
        for(int i=0;i<str.length();i++)
        {
            for(double j=1;j<4900000;j++)
            {}
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        restaurant obj = new restaurant();
        obj.mainMenu();
    }
}//class ends



