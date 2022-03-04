import java.util.LinkedList;
import java.util.Scanner;



public class Tugas3
{
    public static void main(String[] args) 
    {
        LinkedList<String> data = new LinkedList<String>();
        Scanner input = new Scanner(System.in);  
        
        String nama, no_bp, alamat, dataadd;
        Integer dataindex;

        System.out.println(" ");
        System.out.println("-------------------------------");
        System.out.println("  ---      TUGAS  3       ---  ");
        System.out.println("  ---LinkedList (Tambahan)---  ");
        System.out.println("-------------------------------");
        System.out.println(" ");

        System.out.printf("Inputkan Nama    : ");
        nama = input.nextLine();
        data.add(nama);

        System.out.printf("Inputkan No.BP   : ");
        no_bp = input.nextLine();
        data.add(no_bp);

        System.out.printf("Inputkan Alamat  : ");
        alamat = input.nextLine();
        data.add(alamat);

        System.out.println("-------------------------------");
        System.out.println(" ");

        System.out.println("Nama        : " +nama);
        System.out.println("No.BP       : " +no_bp);
        System.out.println("Alamat      : " +alamat);

        System.out.println("");
        System.out.println(data);
        System.out.println("");

        String PilihanUser;
        boolean lanjutkan = true;

        while(lanjutkan)
        {
            System.out.println("Pilihan : " );
            System.out.println("1. Cek List" );
            System.out.println("2. Tambahkan Data" );
            System.out.println("3. Hapus Data" );
            System.out.println("4. Ubah Data");
            System.out.println("5. Pop/Push Data");
            System.out.println("6. Bersihkan List");
            

            
            System.out.printf("Masukkan pilihan : ");
            PilihanUser = input.nextLine();

                switch(PilihanUser)
                {
                    case "1" :
                    System.out.println("Jumlah List : "+data.size());
                    System.out.println(data);
                    break;

                    case "2" :
                    Boolean lanjutkanadd = true ; 
                        while (lanjutkanadd)
                        {
                            System.out.println("Pilihan : " );
                            System.out.println("1. Tambahkan Data Depan" );
                            System.out.println("2. Tambahkan Data Belakang" );
                            System.out.println("3. Tambahkan Data pada indeks tertentu" );
                 
                            String PilihanUser2;
                            System.out.printf("Pilih metode penambahan : ");
                            PilihanUser2 = input.nextLine();

                            switch(PilihanUser2)
                            {
                                case "1" :
                                System.out.printf("Inputkan Data yang ingin dimasukkan : ");
                                dataadd = input.nextLine();
                                data.addFirst(dataadd);
                                break;

                                case "2" :
                                System.out.printf("Inputkan Data yang ingin dimasukkan : ");
                                dataadd = input.nextLine();
                                data.addLast(dataadd);
                                break;

                                case "3" :
                                System.out.printf("Inputkan Data yang ingin dimasukkan   : ");
                                dataadd = input.nextLine();
                                System.out.printf("Inputkan Indeks yang ingin dimasukkan : ");
                                dataindex = input.nextInt();
                                input.nextLine();
                                data.add(dataindex, dataadd);
                                break;

                                default :
                                    System.out.println("Masukkan Pilihan Yang Benar!");
                            }
                        break;
                        }
                    break;

                    case "3" :
                    Boolean lanjutkanremove = true ; 
                        while (lanjutkanremove)
                        {
                            System.out.println("Pilihan : " );
                            System.out.println("1. Hapus Data Depan" );
                            System.out.println("2. Hapus Data Belakang" );
                            System.out.println("3. Hapus Data pada indeks tertentu" );
             
                            String PilihanUser3;
                            System.out.printf("Pilih metode peghapusan : ");
                            PilihanUser3 = input.nextLine();

                            switch(PilihanUser3)
                            {
                                case "1" :
                                data.removeFirst();
                                System.out.println("Data telah dihapus");
                                break;

                                case "2" :
                                data.removeLast();
                                System.out.println("Data telah dihapus");
                                break;

                                case "3" :
                                System.out.printf("Inputkan data yang ingin dihapus : ");
                                dataadd= input.nextLine();
                                data.remove(dataadd);
                                break;

                                default :
                                    System.out.println("Masukkan Pilihan Yang Benar!");
                            }
                        break;
                        }
                    break;
                    
                    case "4" :
                    System.out.printf("Inputkan Data yang ingin diubah   : ");
                    dataadd = input.nextLine();
                    System.out.printf("Inputkan Indeks yang ingin diubah : ");
                    dataindex = input.nextInt();
                    data.set(dataindex, dataadd);
                    input.nextLine();
                    break;
                    
                    case "5" :
                    Boolean lanjutkapoppush = true ; 
                        while (lanjutkapoppush)
                        {
                            System.out.println("Pilihan : " );
                            System.out.println("1. Push" );
                            System.out.println("2. Pop" );
             
                            String PilihanUser3;
                            System.out.printf("Pilih metode penambahan : ");
                            PilihanUser3 = input.nextLine();

                            switch(PilihanUser3)
                            {
                                case "1" :
                                System.out.printf("Inputkan Data yang ingin di-push : ");
                                dataadd = input.nextLine();
                                data.push(dataadd);;
                                break;

                                case "2" :
                                data.pop();
                                System.out.println("Data telah di-pop ");
                                break;

                                default :
                                System.out.println("Masukkan Pilihan Yang Benar!");
                            }
                        break;
                    }
                    break;

                    case "6" :
                    data.clear();
                    System.out.println("Data dalam List sudah dihapus!");
                    break;

                    default :
                    System.err.println("Tidak ada pilihan");
                }

            System.out.printf("\nApakah Anda ingin melanjutkan [y]? ");
			PilihanUser = input.nextLine();
			lanjutkan = PilihanUser.equalsIgnoreCase("y");
        }
        System.out.println("Terima Kasih");
        System.out.println(" ");
    } 
}
    
    
 