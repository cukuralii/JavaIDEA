package Giris.OOP.OgrenciNotSistemi;

// alınan kursun adı kodu ve ogretmeni mevcut.
public class Course {
    Teacher courseTeacher;
    String name ;
    String code ;
    String prefix;
    int note ;
    int verbalNote ;
    String teacher ;


    //Constroctur metodumuzu tanımladık.
    // Metotlarımın davranıslarımın bulundugu kısım olucak
    Course(String name , String code ,String prefix)
    {
       this.name = name;
       this.code = code;
       this.prefix = prefix;
       this.note =0 ;
       this.verbalNote = 0;
    }

    public void addTeacher(Teacher t)
    {
        if (this.prefix.equals(t.branch))
        {
            this.courseTeacher=t;
            System.out.println("İslem basarılı");
        }
        else
        {
            System.out.println(t.name + "Akademisyeni bu dersi veremez ");
        }
    }

    void printTeacher()
    {
       if (courseTeacher!=null)
       {
           System.out.println(this.name+ "dersinin akademisyeni " + courseTeacher.name);
       }
       else
       {
           System.out.println(this.name + "dersine akademisyen atanmamıstır.");
       }
    }


}
