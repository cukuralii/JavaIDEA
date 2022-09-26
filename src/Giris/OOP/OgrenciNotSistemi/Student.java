package Giris.OOP.OgrenciNotSistemi;


// Ogrencinin ozelliklerinin bulundugu kısım diyoruz . +
public class Student {
     String name;
     int stuNo;
     int classes ;
     Course mat ;
     Course fizik ;
     Course kimya ;
     double avarage ;
     boolean isPass;
     int verbalNote = 0 ;




     // program ayaga kalktıgında student sınıfında ilk calısacak metot constructor metotdur. Bu yüzden burda bütün
     // degiskenlerimiz aldık ve studen sınıfının icindeki degiskenlere atadık.
    Student(String name, int classes, int stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }

    // kullanıcıdan alınan not bilgisi student sınıfımızdaki değiskenlerime aldık ki üstünde yorumlama yapabilelim.
    public void addBulkExamNote(int mat , int fizik , int kimya)
    {
        if (mat>=0 && mat <=100)
        {
            this.mat.note = mat;
        }
        if (fizik>=0 && fizik <=100)
        {
            this.fizik.note = fizik;
        }
        if (kimya>=0 && kimya <=100)
        {
            this.kimya.note = kimya;
        }
    }

    // Sozlu notu metod olusturduk notlarımıza dagıttık
    public  void  addverbalNote(int matS , int fizikS , int kimyaS){
       if (matS>0 && matS<100)
       {
           this.mat.verbalNote = matS;
       }
       if (fizikS>0 && fizikS<100)
       {
           this.fizik.verbalNote = fizikS;
       }
       if (kimyaS>0 && kimyaS<100)
       {
           this.kimya.verbalNote =kimyaS;
       }
    }


    //Notlar tam olarak girilmişmi girilmemiş mi onu kontrol edip , daha sonra ortalama hesapladıgımız calcAvarage
    // metodundan ortalamanın 55 üstünde ise gecti değilse gecemedi kosuluna baktırdık.
    public void isPass(){
        if (this.mat.note==0 || this.fizik.note==0 || this.kimya.note==0)
        {
            System.out.println("Notlar tam olarak girilmemistir.");
        }
        else
        {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass)
            {
                System.out.println("Sınıfı gectiniz");
            }
            else
            {
                System.out.println("Sınıfta kaldınız");
            }

        }
    }

   public void calcAvarage()
   {
      double fizik_Avarage = (this.fizik.note*0.75) + (this.fizik.verbalNote*0.25);
      double mat_Avarage = (this.mat.note*0.80) + (this.mat.verbalNote*0.20);
      double kimya_Avarege = (this.kimya.note*0.60)+ (this.kimya.verbalNote*0.40);
      double _avarage = (fizik_Avarage+mat_Avarage+kimya_Avarege)/3;
      this.avarage = Math.round(_avarage);
   }

   public boolean isCheckPass()
   {
       calcAvarage();
       return this.avarage>55;
   }

   public void printNote(){
       System.out.println("=========================");
       System.out.println("Öğrenci : " + this.name);
       System.out.println("Matematik Notu : " + this.mat.note + "Sözlü Notu" +  "Matematik sözlü notu  " + this.mat.verbalNote + " " +"Oran ==> sınav %75  sözlü %25");
       System.out.println("Fizik Notu : " + this.fizik.note + " Sözlü Notu"  +  "Fizik sözlü notu  "  +   this.fizik.verbalNote +" " +"Oran ==> sınav %80  sözlü %20");
       System.out.println("Kimya Notu : " + this.kimya.note + " Sözlü Notu"  +  "Kimya sözlü notu  " +  this.kimya.verbalNote +" "   +"Oran ==> sınav %60  sözlü %40");
   }


}
