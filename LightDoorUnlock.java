import mraa.*;

public class LightDoorUnlock {
  public static void main(String[] args)
  {
    Aio light = new Aio(3);
    float value = readFloat(light);
    System.out.println("The reading from the phototransistor is " + value);
  }
}
