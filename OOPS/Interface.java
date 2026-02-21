
interface Bicycle {
    int a = 45; // public, static, final by default
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface HornBicycle {
    int b = 45;
    void blowHornK3g();
    void blowHornmhn();
}

class AvonCycle implements Bicycle, HornBicycle {
    void blowHorn() {
        System.out.println("Pee Pee Poo Poo");
    }
@Override
    public void applyBrake(int decrement) {
        System.out.println("Applying Brake");
    }

    @Override
    public void speedUp(int increment) {
        System.out.println("Applying SpeedUP");
    }

    @Override
    public void blowHornK3g() {
        System.out.println("Kabhi khushi kabhi gum pee pee pee pee");
    }
@Override
    public void blowHornmhn() {
        System.out.println("Main hoon naa po po po po");
    }
}

public class Interface {
    public static void main(String[] args) {
        AvonCycle cycleHarry = new AvonCycle();
        cycleHarry.applyBrake(1);

        // Interface properties are accessed using Interface name (not object)
        System.out.println(Bicycle.a);
        System.out.println(HornBicycle.b);

        // You cannot modify interface properties (they are final)
        // Bicycle.a = 454; X Not allowed

        cycleHarry.blowHornK3g();
        cycleHarry.blowHornmhn();
    }
}