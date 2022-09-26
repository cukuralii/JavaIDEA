package Giris.OOP.OgrenciNotSistemi;

public class Teacher {
    String name;
    int mpno;
    String branch ;

    //Constroctur metodumuzu tanımladık.
    // Metotlarımın davranıslarımın bulundugu kısım olucak
    Teacher(String name , int mpno , String branch)
    {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

}
