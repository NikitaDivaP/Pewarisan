class ATM{
    void tarikUang(){
        
    }
}
public class Identitas{
    //atribut
    String nama;
    String ttl;
    String Alamat;
    String nik;
    String noWA;
    //kue
    void print(){
        System.out.println(" Nama : "+ nama + " ttl : "+ ttl + " Alamat : "+ Alamat + " nik : "+ nik + " No WA : "+ noWA);
    }

    //method
    void save(){

    }

    public static void main(String[] args){
        //cetakan
        Identitas Nikita = new Identitas();
        Nikita.nama     = " Nikita Diva Putri P\n";
        Nikita.ttl      = "Surabaya 11 Agustus 2004\n";
        Nikita.Alamat   = "Jl Jambangan Kebon Agung No 35\n";
        Nikita.nik      = "3578235108040001\n";
        Nikita.noWA     = "082247803904\n";
        Nikita.print();
        //System.out.println("Selamat Shubuh);
    }
}

