package gezginsaticiproblemi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GezginSatıcı {
 
 public static void main(String[] args) {
  // TODO Auto-generated method stub
  File dosya=new File("C:\\SwingDemos\\gezginSatıcı\\src\\gezginsaticiproblemi\\sehirmesafe.txt");//---->1
  
  String [][]mesafeolcum;//----------------------------------------------------->1
  int [][] gerceldegerler;//---------------------------------------------------->1
  BufferedReader buffereader=null;//-------------------------------------------->1
  int k=0;//-------------------------------------------------------------------->1
  int j=0;//-------------------------------------------------------------------->1
  try {//----------------------------------------------------------------------->1
   buffereader=new BufferedReader(new FileReader(dosya));//--------------------->1
   String oku=buffereader.readLine();//----------------------------------------->1
   int sayac = 0;
   while(oku!=null){//---------------------------------------------------------->10
    oku=buffereader.readLine();//----------------------------------------------->10
    k++;//---------------------------------------------------------------------->10
       
   }
   String[]sehirlerarasimesafe=new String[k];//--------------------------------->1
   buffereader=new BufferedReader(new FileReader(dosya));//--------------------->10
    oku=buffereader.readLine();//----------------------------------------------->10
   while(oku!=null){//---------------------------------------------------------->10
    sehirlerarasimesafe[j]=oku;//----------------------------------------------->10
    oku=buffereader.readLine();//----------------------------------------------->10
    j++;//---------------------------------------------------------------------->10
   }
   
   for(int i=0;i<sehirlerarasimesafe.length;i++){//----------------------------->10
    System.out.println(sehirlerarasimesafe[i]);//------------------------------->10
       
   }
   
   mesafeolcum=new String[sehirlerarasimesafe.length][];//---------------------->1
   for(int a=0;a<sehirlerarasimesafe.length;a++){//----------------------------->10
    mesafeolcum[a]=sehirlerarasimesafe[a].split(",");//------------------------->10
   }int sayc2=0;
   int sayc=0;
   int sayac3=0;
   gerceldegerler=new int[sehirlerarasimesafe.length][mesafeolcum[0].length];//->1
   for(int e=0;e<sehirlerarasimesafe.length;e++){//----------------------------->10
    for(int l=0;l<mesafeolcum[0].length;l++){//--------------------------------->100
        System.out.print(mesafeolcum[e][l]+"\t");//----------------------------->100
     gerceldegerler[e][l]=Integer.parseInt(mesafeolcum[e][l]);//---------------->100
    }
    System.out.println();
   }
    for (int i = 0; i <sehirlerarasimesafe.length; i++)//----------------------->10
             {
                 for (int t= 0; t < mesafeolcum[0].length; t++)//--------------->100 x 10 =1000
{//Buradaki içiçe for döngüsündenve SehirlerArasiMesafe clasında olan içiiçe while döngülerinden karmaşıklığı O(n^2) olacak
                    if (gerceldegerler[i][t] == 1 && gerceldegerler[t][i] == 0)//-->1000 x 0 =0
                     { 
                         gerceldegerler[t][i] = 1;//---------------------------->0
                     }
                 }
                 
             }
    System.out.println("Sırasıyla gezilen şehirler:");//------------------------>1
             SehirlerArasiMesafe gezmeislemi = new SehirlerArasiMesafe();//----->1
             gezmeislemi.Gezme(gerceldegerler);//------------------------------->1
    
   
  } catch (FileNotFoundException e) {//----------------------------------------->1
   // TODO Auto-generated catch block
   e.printStackTrace();//------------------------------------------------------->1
   System.out.println("Dosya açma hatası");//----------------------------------->1
  } catch (IOException e) {//--------------------------------------------------->1
   // TODO Auto-generated catch block
   e.printStackTrace();//------------------------------------------------------->1
   System.out.println("Dosya okuma hatası");//---------------------------------->1
   
  }//--------------------------------------------------------->GezginSatıcı çalışma zamanı = 1471
     System.out.println("ALGORİTMANIN 5 ŞEHİR GEZERKEN ÇALIŞMA ZAMANI = "+System.nanoTime());
 }//---------------------------------------------------------->Toplam çalışma zamanı(T(n)) = 9515 + 1471 =10986 
}//----------------------------------------------------------->Karmaşıklık = O(n^2)
