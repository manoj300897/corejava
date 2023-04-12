abstract class Animal {
 abstract void animalSound();
  public void crow(){
    System.out.println("krkrkr");
  }
}
class myna extends Animal{
  public void animalSound() {
    System.out.println("koookoo");
  }
}

class Abstracs{
  public static void main(String[] args) {
    myna my= new myna();
    my.animalSound();
    my.crow();
  }
}