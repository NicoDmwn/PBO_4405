import java.lang.Math;
import java.util.ArrayList;

public class Cellphone implements Phone{
    ArrayList<Contact> contact;
    String merk;
    String type;
    int batteryLevel;
    int status;
    int volume = 0;
    int pulsa;

    public Cellphone(String merk,String type)
    {
        this.merk = merk;
        this.type = type;
        this.batteryLevel = (int)(Math.random()*(100-0+1)+0); 
        this.contact = new ArrayList<>(); 
    }

    public void powerOn(){
        this.status = 1;
        System.out.println("Ponsel menyala");
    }
    
    public void powerOff(){
        this.status = 0;
        System.out.println("Ponsel mati");
    }

    public boolean cekoff(){
        if(this.status == 1){
            return true;
        }else{
            System.out.println("Ponsel mati. Tidak dapat menjalankan operasi apapun");
            return false;
        }
    }
    public void volumeUp(){
        if(cekoff())
            this.volume++;
            if(this.volume>=100)
            {
                this.volume = 100;
            }
        }
    

    public void volumeDown(){
        if(cekoff())
        this.volume--;
    }

    public int getVolume(){
        if(cekoff())
        System.out.println("Volume "+this.volume);
        return this.volume;
    }

    public void pulsaUp(int pulsa){
        if(cekoff())
        this.pulsa += pulsa;
    }

    public void getPulsa(){
        if(cekoff())
        System.out.println("Pulsa "+this.pulsa);
    }

    public void addContact(String nama, String nomor){
		if(cekoff())
		contact.add(new Contact(nama,nomor));
		
	}

    public void showContact(){
		if(cekoff())
			if(contact.isEmpty()){
				System.out.println("Kontak masih kosong.");
			} else{
				System.out.println("== Kontak ==");
				for(int i=0; i<contact.size();i++){
					Contact kt = contact.get(i);
					System.out.println((i+1)+". "+kt.nama+" - "+kt.nomor);
				}
			}
		
	}

    public void findContact(String nama){
		if(cekoff())
			if(contact.isEmpty()){
				System.out.println("Kontak masih kosong.");
			} else{
				System.out.println("Mencari kontak "+nama+"");
				String nama2 = nama.toLowerCase();
				boolean found = false;
				int count = 1;
				for(int i=0; i<contact.size();i++){
					Contact kt = contact.get(i);
					if(kt.nama.toLowerCase().equals(nama2)){
						System.out.println(kt.nama+" - "+kt.nomor);
						found = true;
						count++;
					}
				}
				if(!found)
					System.out.println("Kontak dengan nama "+nama+" tidak ditemukan!");
		}
	}

}
