import java.util.Scanner;
class Currency{
 public static void main(String []args){
 double 
Rupees,Dollar,Dirham,Euro,Dinar,Sdollar,Yen,r,r1,r2,r3,r4,r5,d,d1,d2,d3,d4,d5,h,h1,h2,h3,h4,h5,e,e1,e2,e3,e
4,e5,i,i1,i2,i3,i4,i5,s,s1,s2,s3,s4,s5,y,y1,y2,y3,y4,y5;
 int choice = 0;
 Scanner sc = new Scanner(System.in);
System.out.println("CONVERSION OF RUPEES TO OTHER CURRENCIES ARE FROM CASE 1 - 6");
System.out.println("\n1. Rupees --> Dollar\n2. Rupees --> Dirham \n3. Rupees --> Euro\n4. Rupees --> Dinar\
n5. Rupees --> Singaporedollar\n6. Dollar --> Yen\n7. Exit ");
System.out.println("Enter Your choice : ");
choice = sc.nextInt();
 switch(choice){
// amount -> rupees
 case 1 : {System.out.println("Rupees to Dollar : ");
 Rupees = sc.nextDouble();
 r = Rupees * 0.013;
 System.out.println("Converted Currency : " + r);}
 break;
 case 2 : {System.out.println("Enter Rupees you want to convert : ");
 Rupees = sc.nextDouble();
 r1 = Rupees * 0.049;
 System.out.println("Converted Currency : " + r1);}
 break;
 case 3 : {System.out.println("Enter Rupees you want to convert : ");
 Rupees = sc.nextDouble();
 r2 = Rupees * 0.011;
 System.out.println("Converted Currency : " + r2);}
 break;
 case 4 : {System.out.println("Enter Rupees you want to convert : ");
 Rupees = sc.nextDouble();
 r3 = Rupees * 0.040;
 System.out.println("Converted Currency : " + r3);}
 break;
 case 5 : {System.out.println("Enter Rupees you want to convert : ");
 Rupees = sc.nextDouble();
 r4 = Rupees * 0.018;
 System.out.println("Converted Currency : " + r4);}
 break;
 case 6 : {System.out.println("Enter Rupees you want to convert : ");
 Rupees = sc.nextDouble();
 r5 = Rupees * 1.44;
 System.out.println("Converted Currency : " + r5);}
 break;
 default : System.out.println("Wrong Input");
}
System.out.println("-------------------------------------------------------------------------------------------------------------------------
---------------------------------------------");
System.out.println("-------------------------------------------------------------------------------------------------------------------------
---------------------------------------------");
System.out.println("CONVERSION OF DOLLARS TO OTHER CURRENCIES ARE FROM CASE 7 - 12");
System.out.println("\n7. Dollar --> Rupees\n8. Dollar --> Dirham \n9. Dollar --> Euro\n10. Dollar --> Dinar\
n11. Dollar --> Singaporedollar\n12. Dollar --> Yen\n13. Exit ");
System.out.println("Enter Your choice : ");
choice = sc.nextInt();
 switch(choice){
// amount -> dollar
 case 7 : {System.out.println("Enter Dollars you want to convert : ");
 Dollar = sc.nextDouble();
 d = Dollar * 74.88;
 System.out.println("Converted Currency : " + d);}
 break;
 case 8 : {System.out.println("Enter Dollars you want to convert : ");
 Dollar = sc.nextDouble();
 d1 = Dollar * 3.67;
 System.out.println("Converted Currency : " + d1);}
 break;
 case 9 : {System.out.println("Enter Dollars you want to convert : ");
 Dollar = sc.nextDouble();
 d2 = Dollar * 0.83;
 System.out.println("Converted Currency : " + d2);}
 break;
 case 10 : {System.out.println("Enter Dollars you want to convert : ");
 Dollar = sc.nextDouble();
 d3 = Dollar * 0.30;
 System.out.println("Converted Currency : " + d3);}
 break;
 case 11 : {System.out.println("Enter Dollars you want to convert : ");
 Dollar = sc.nextDouble();
 d4 = Dollar * 1.33;
 System.out.println("Converted Currency : " + d4);}
 break;
 case 12 : {System.out.println("Enter Dollars you want to convert : ");
 Dollar = sc.nextDouble();
 d5 = Dollar * 108.6;
 System.out.println("Converted Currency : " + d5);}
 break;
 default : System.out.println("Wrong Input");
 }
 
System.out.println("-------------------------------------------------------------------------------------------------------------------------
---------------------------------------------");
 
System.out.println("-------------------------------------------------------------------------------------------------------------------------
---------------------------------------------");
 System.out.println("CONVERSION OF DIRHAMS TO OTHER CURRENCIES ARE FROM CASE 13 - 19");
 System.out.println("\n13. Dirham --> Rupees\n14. Dirham --> Dollar \n15. Dirham --> Euro\n16. Dirham --> 
Dinar\n17. Dirham --> Singaporedollar\n18. Dirham --> Yen\n19. Exit ");
 System.out.println("Enter Your choice : ");
 choice = sc.nextInt();
 switch(choice){
 // amount -> dirham
 case 13 : {System.out.println("Enter Dirhams you want to convert : ");
 Dirham = sc.nextDouble();
 h = Dirham * 20.38;
 System.out.println("Converted Currency : " + h);}
 break;
 case 14 : {System.out.println("Enter Dirhams you want to convert : ");
 Dirham = sc.nextDouble();
 h1 = Dirham * 0.27;
 System.out.println("Converted Currency : " + h1);}
 break;
 case 15 : {System.out.println("Enter Dirhams you want to convert : ");
 Dirham = sc.nextDouble();
 h2 = Dirham * 0.23;
 System.out.println("Converted Currency : " + h2);}
 break;
 case 16 : {System.out.println("Enter Dirhams you want to convert : ");
 Dirham = sc.nextDouble();
 h3 = Dirham * 0.082;
 System.out.println("Converted Currency : " + h3);}
 break;
 case 17 : {System.out.println("Enter Dirhams you want to convert : ");
 Dirham = sc.nextDouble();
 h4 = Dirham * 0.36;
 System.out.println("Converted Currency : " + h4);}
 break;
 case 18 : {System.out.println("Enter Dirhams you want to convert : ");
 Dirham = sc.nextDouble();
 h5 = Dirham * 29.45;
 System.out.println("Converted Currency : " + h5);}
 break;
 default : System.out.println("Wrong Input");
 }
 
System.out.println("-------------------------------------------------------------------------------------------------------------------------
---------------------------------------------");
 
System.out.println("-------------------------------------------------------------------------------------------------------------------------
---------------------------------------------");
 System.out.println("CONVERSION OF EUROS TO OTHER CURRENCIES ARE FROM CASE 20 - 26");
 System.out.println("\n20. Euro --> Rupees\n21. Euro --> Dollar \n22. Euro --> Dirham\n23. Euro --> Dinar\
n24. Euro --> Singaporedollar\n25. Euro --> Yen\n26. Exit ");
 System.out.println("Enter Your choice : ");
 choice = sc.nextInt();
 switch(choice){
 // amount -> euro
 case 20 : {System.out.println("Enter Euros you want to convert : ");
 Euro = sc.nextDouble();
 e = Euro * 90.15;
 System.out.println("Converted Currency : " + e);}
 break;
 case 21 : {System.out.println("Enter Euros you want to convert : ");
 Euro = sc.nextDouble();
 e1 = Euro * 1.20;
 System.out.println("Converted Currency : " + e1);}
 break;
 case 22 : {System.out.println("Enter Euros you want to convert : ");
 Euro = sc.nextDouble();
 e2 = Euro * 4.42;
 System.out.println("Converted Currency : " + e2);}
 break;
 case 23 : {System.out.println("Enter Euros you want to convert : ");
 Euro = sc.nextDouble();
 e3 = Euro * 0.36;
 System.out.println("Converted Currency : " + e3);}
 break;
 case 24 : {System.out.println("Enter Euros you want to convert : ");
 Euro = sc.nextDouble();
 e4 = Euro * 1.60;
 System.out.println("Converted Currency : " + e4);}
 break;
 case 25 : {System.out.println("Enter Euros you want to convert : ");
 Euro = sc.nextDouble();
 e5 = Euro * 130.22;
 System.out.println("Converted Currency : " + e5);}
 break;
 default : System.out.println("Wrong Input");
 }
 
System.out.println("-------------------------------------------------------------------------------------------------------------------------
---------------------------------------------");
 
System.out.println("-------------------------------------------------------------------------------------------------------------------------
---------------------------------------------");
 System.out.println("CONVERSION OF DINARS TO OTHER CURRENCIES ARE FROM CASE 27 - 33");
 System.out.println("\n27. Dinars --> Rupees\n28. Dinars --> Dollar \n29. Dinars --> Dirham\n30. Dinars 
--> Euro\n31. Dinars --> Singaporedollar\n32. Dinars --> Yen\n33. Exit ");
 System.out.println("Enter Your choice : ");
 choice = sc.nextInt();
 switch(choice){
 // amount -> dinar
 case 27 : {System.out.println("Enter Dinars you want to convert : ");
 Dinar = sc.nextDouble();
 i = Dinar * 248.56;
 System.out.println("Converted Currency : " + i);}
 break;
 case 28 : {System.out.println("Enter Dinars you want to convert : ");
 Dinar = sc.nextDouble();
 i1 = Dinar * 3.32;
 System.out.println("Converted Currency : " + i1);}
 break;
 case 29 : {System.out.println("Enter Dinars you want to convert : ");
 Dinar = sc.nextDouble();
 i2 = Dinar * 12.19;
 System.out.println("Converted Currency : " + i2);}
 break;
 case 30 : {System.out.println("Enter Dinars you want to convert : ");
 Dinar = sc.nextDouble();
 i3 = Dinar * 2.76;
 System.out.println("Converted Currency : " + i3);}
 break;
 case 31 : {System.out.println("Enter Dinars you want to convert : ");
 Dinar = sc.nextDouble();
 i4 = Dinar * 4.42;
 System.out.println("Converted Currency : " + i4);}
 break;
 case 32 : {System.out.println("Enter Dinars you want to convert : ");
 Dinar = sc.nextDouble();
 i5 = Dinar * 359.03;
 System.out.println("Converted Currency : " + i5);}
 break;
 default : System.out.println("Wrong Input");
 }
 
System.out.println("-------------------------------------------------------------------------------------------------------------------------
---------------------------------------------");
 
System.out.println("-------------------------------------------------------------------------------------------------------------------------
---------------------------------------------");
 System.out.println("CONVERSION OF DINARS TO OTHER CURRENCIES ARE FROM CASE 34 - 40");
 System.out.println("\n34. Singaporedollar --> Rupees\n35. Singaporedollar --> Dollar \n36. 
Singaporedollar --> Dirham\n37. Singaporedollar --> Euro\n38. Singaporedollar --> Dinars\n39. 
Singaporedollar --> Yen\n40. Exit ");
 System.out.println("Enter Your choice : ");
 choice = sc.nextInt();
 switch(choice){
 // amount -> singapore dollar
 case 34 : {System.out.println("Enter Singaporedollars you want to convert : ");
 Sdollar = sc.nextDouble();
 s = Sdollar * 56.26;
 System.out.println("Converted Currency : " + s);}
 break;
 case 35 : {System.out.println("Enter Singaporedollars you want to convert : ");
 Sdollar = sc.nextDouble();
 s1 = Sdollar * 0.75;
 System.out.println("Converted Currency : " + s1);}
 break;
 case 36 : {System.out.println("Enter Singaporedollars you want to convert : ");
 Sdollar = sc.nextDouble();
 s2 = Sdollar * 2.76;
 System.out.println("Converted Currency : " + s2);}
 break;
 case 37 : {System.out.println("Enter Singaporedollars you want to convert : ");
 Sdollar = sc.nextDouble();
 s3 = Sdollar * 0.62;
 System.out.println("Converted Currency : " + s3);}
 break;
 case 38 : {System.out.println("Enter Singaporedollars you want to convert : ");
 Sdollar = sc.nextDouble();
 s4 = Sdollar * 0.23;
 System.out.println("Converted Currency : " + s4);}
 break;
 case 39 : {System.out.println("Enter Singaporedollars you want to convert : ");
 Sdollar = sc.nextDouble();
 s5 = Sdollar * 81.28;
 System.out.println("Converted Currency : " + s5);}
 break;
 default : System.out.println("Wrong Input");
 }
 
System.out.println("-------------------------------------------------------------------------------------------------------------------------
---------------------------------------------");
 
System.out.println("-------------------------------------------------------------------------------------------------------------------------
---------------------------------------------");
 System.out.println("CONVERSION OF YENS TO OTHER CURRENCIES ARE FROM CASE 34 - 40");
 System.out.println("\n41. Yens --> Rupees\n42. Yens --> Dollar \n43. yens --> Dirham\n44. Yens --> 
Euro\n45. Yens --> Dinars\n46. Yens --> Singaporedollar\n47. Exit ");
 System.out.println("Enter Your choice : ");
 choice = sc.nextInt();
 switch(choice){
 // amount -> yen
 case 41 : {System.out.println("Enter Yens you want to convert : ");
 Yen = sc.nextDouble();
 y = Yen * 0.69;
 System.out.println("Converted Currency : " + y);}
 break;
 case 42 : {System.out.println("Enter Yens you want to convert : ");
 Yen = sc.nextDouble();
 y1 = Yen * 0.0092;
 System.out.println("Converted Currency : " + y1);}
 break;
 case 43 : {System.out.println("Enter Yens you want to convert : ");
 Yen = sc.nextDouble();
 y2 = Yen * 0.034;
 System.out.println("Converted Currency : " + y2);}
 break;
 case 44 : {System.out.println("Enter Yens you want to convert : ");
 Yen = sc.nextDouble();
 y3 = Yen * 0.0077;
 System.out.println("Converted Currency : " + y3);}
 break;
 case 45 : {System.out.println("Enter Yens you want to convert : ");
 Yen = sc.nextDouble();
 y4 = Yen * 0.0028;
 System.out.println("Converted Currency : " + y4);}
 break;
 case 46 : {System.out.println("Enter Yens you want to convert : ");
 Yen = sc.nextDouble();
 y5 = Yen * 0.012;
 System.out.println("Converted Currency : " + y5);}
 break;
 default : System.out.println("Wrong Input");
 }
}
}
