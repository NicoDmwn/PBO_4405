public class DataMhs{
    String nim,nama,getPredikat,predikat;
    float nilaitgs,nilaiuts,nilaiuas,nilaiakhir;
    char nilaiHuruf;
    public Object tampilData;

    public void Datanilai(String nim, String nama, float nilaitgs,float nilaiuts, float nilaiuas){
        this.nim=nim;
        this.nama=nama;
        this.nilaitgs=nilaitgs;
        this.nilaiuts=nilaiuts;
        this.nilaiuas=nilaiuas;
        this.nilaiakhir=nilaiakhir;
    }

    void tampilData(){
        float persenTgs= this.nilaitgs*30/100;
        float persenUts= this.nilaiuts*35/100;
        float persenUas= this.nilaiuas*35/100;
        nilaiakhir=persenTgs+persenUas+persenUts;
        System.out.println("NIM     : "+this.nim);
        System.out.println("Nama    : "+this.nama);
        System.out.println("N.Tugas : "+this.nilaitgs+" 30%   : "+persenTgs);
        System.out.println("N.UTS   : "+this.nilaiuts+" 35%   : "+persenUts);
        System.out.println("N.UAS   : "+this.nilaiuas+" 35%   : "+persenUas);
        System.out.println("N.Akhir : "+this.nilaiakhir);
        System.out.println("N.Huruf : "+getNilHuruf(nilaiakhir));
        System.out.println("Predikat : "+getPredikat(getNilHuruf(nilaiakhir))); 
    }

    char getNilHuruf(float nilaiakhir)
    {
        if(nilaiakhir>=85 && nilaiakhir<=100){
            return 'A';
        }else if(nilaiakhir>=70 && nilaiakhir<85){
            return 'B';
        }else if(nilaiakhir>=60 && nilaiakhir<70){
            return 'C';
        }else if(nilaiakhir>=40 && nilaiakhir<60){
            return 'D';
        }else{
            return 'E';
        }
    }

    String getPredikat(char getNilHuruf){
        switch(getNilHuruf)
        {
        case 'A':predikat="Apik";
        break;
        case 'B':predikat="Baik";
        break;
        case 'C':predikat="Cukup";
        break;
        case 'D':predikat="Dablek";
        break;
        default:predikat="Elek";
        }
        return predikat;
        } 
       
}