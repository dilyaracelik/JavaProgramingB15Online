package InterfaceRecap_Muhtar;

public class Jeep_Wragler implements Cars,GasVehicles, ElectricVehicles {

@Override
    public void start(){
    System.out.println("Pumping \"gas\" ");

}
@Override
    public  void pumpGas() {
    System.out.println("Call mechanic");
}
@Override
    public void Charge (){
        System.out.println("NEW CAR CHARGING");
    }
    @Override
    public void SelfDrive(){
        System.out.println("Self driving");

    }


    public static void main(String[] args) {

    Jeep_Wragler j1 = new Jeep_Wragler();
    j1.Charge();
    j1.pumpGas();
    j1.SelfDrive();
    j1.start();

    }}