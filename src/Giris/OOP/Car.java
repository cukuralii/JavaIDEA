package Giris.OOP;

public class Car {
    // Arabanın niteliklerini değiskenlerle tanımladık degiskenleri sınıfların en üstüne tanımlamak önemli!!;
    String type ;
    String model;
    String color;
    int speed;
    int limit = 180;

    // Kurucu metodlar değiskenlerden hemen sonra tanımlanması uygundur.
   Car(String type , String model , int Speed , String color)
     {
        this.type = type;
        this.model = model;
        this.color = color ;
        this.speed= Speed;
    }

    // Davranısları belirtirkende metodları kullanıyoruz yani nasıl kullanıcagımıza karar verdiigimiz kısım
    int increaseSpeed(int increment)
    {
        speed += increment;
        return speed;
    }

    int decreaseSpeed(int decrease)
    {
        if (speed>0)
        {
            speed -= decrease;
        }
        return speed;
    }

    void printInfo()
    {
        System.out.println("==========");
        System.out.println("Model : \t" + this.model);
        System.out.println("Model : \t" + this.speed);
        System.out.println("Model : \t" + this.color);
        System.out.println("Model : \t" + this.type);

    }
    public static void main(String[] args) {
        // metodumuzu cagırıyoruzz.
        Car car = new Car("Sedan","Cabrio", 100, "blue");


    }

}
