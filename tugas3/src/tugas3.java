import java.util.LinkedList;

public class tugas3 {
    public static void main(String[] args) {
        
        LinkedList<String>nama = new LinkedList<>();
        LinkedList<String>no_bp = new LinkedList<>();
        LinkedList<String>alamat = new LinkedList<>();

        nama.add("Diqzi Aprialdi");
        no_bp.add("2111522026");
        alamat.add("Solok");
        System.out.println("Nama Mahasiswa\t: " +nama);
        System.out.println("Nomor BP\t: " +no_bp);
        System.out.println("Alamat\t\t: " +alamat);
        System.out.println("\n");

        //add()
        System.out.println("=============== MENAMBAH DATA ===============");
        //menambahkan nama
        nama.addFirst("Michel Jordan");
        nama.add(1, "Messi");
        nama.addLast("Tom Cruise");
        System.out.println("Nama Mahasiswa\t: " +nama);
         
        //menambahkan nim
        no_bp.addFirst("2111529000");
        no_bp.add(1, "2111529001");
        no_bp.addLast("2111529002");
        System.out.println("Nomor BP\t: " +no_bp);
  
        //menambahkan alamat 
        alamat.addFirst("Jakarta");
        alamat.add(1, "Medan");
        alamat.addLast("Surabaya");
        System.out.println("Alamat\t\t: " +alamat);
        System.out.println("\n");

        //set()
        System.out.println("=============== MENGGANTI DATA ===============");
        //mengganti data
        nama.set(0, "Ronaldo");
        alamat.set(0, "Palembang");

        System.out.println("Nama Mahasiswa\t: " +nama);;
        System.out.println("Alamat\t\t: " +alamat);
        System.out.println("\n");

        //remove()
        System.out.println("=============== MENGHAPUS DATA MAHASISWA ===============");
        nama.removeFirst();
        no_bp.removeLast();
        alamat.remove(2);

        System.out.println("Nama Mahasiswa\t: " +nama);
        System.out.println("Nomor BP\t: " +no_bp);
        System.out.println("Alamat\t\t: " +alamat);
        System.out.println("\n");

        //isEmpty()
        System.out.println("=============== PENGECEKAN DATA MAHASISWA ===============");

        System.out.println(nama.isEmpty());
        System.out.println(no_bp.isEmpty());
        System.out.println(alamat.isEmpty());
        System.out.println("\n");

        //get()
        System.out.println("=============== MENGAMBIL DATA ===============");

        System.out.println("Nama Mahasiswa\t: " +nama.getFirst());
        System.out.println("Nomor BP\t: " +no_bp.getLast());
        System.out.println("Alamat\t\t: " +alamat.get(1));
        System.out.println("\n");

        //pop()
         System.out.println("\n=============== MENGHAPUS DATA (POP) ===============");

        nama.pop();
        no_bp.pop();
        alamat.pop();

        System.out.println("Nama Mahasiswa\t: " +nama);
        System.out.println("Nomor BP\t: " +no_bp);
        System.out.println("Alamat\t\t: " +alamat);
        System.out.println("\n");

        //push
        System.out.println("=============== MENAMBAH DATA (PUSH) ===============");

        nama.push("Benzema");
        no_bp.push("2111529005");        
        alamat.push("Jogjakarta");
        
        System.out.println("Nama Mahasiswa\t: " +nama);
        System.out.println("Nomor BP\t: " +no_bp);
        System.out.println("Alamat\t\t: " +alamat);
        System.out.println("\n");
    }
}
