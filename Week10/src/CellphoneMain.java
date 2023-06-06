public class CellphoneMain {
    public static void main(String[] args){
        Cellphone cp = new Cellphone("Nokia", "3310");
        cp.powerOn();
        cp.getVolume();
        cp.pulsaUp(5000);
        cp.getPulsa();
        cp.volumeUp();
        cp.getVolume();
        cp.addContact("hudi","123456789");
		cp.addContact("joni","872867427");
		cp.addContact("papi","024676678");
        cp.showContact();
		cp.findContact("papi");
        
    }
}