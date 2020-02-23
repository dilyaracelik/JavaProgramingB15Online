package InterfaceRecap_Muhtar;

public class Tesla_Model3 implements Cars, ElectricVehicles {

    public void start() {
        System.out.println(("Voice Control \"Tesla Start \" "));
    }
        public void Charge (){
            System.out.println("Charging");

        }

         public void SelfDrive(){

             System.out.println("Self driving model");
         }

}
