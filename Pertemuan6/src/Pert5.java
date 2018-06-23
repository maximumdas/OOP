public class Pert5 {
    public static void main(String []args) {
        int arr[] = new int[10];
        try {
            Pegawai pg = new Pegawai("joko2");
        }catch(Exception e){
            System.err.println(e.getMessage());
        }

        try {
            int a = 10 / 0;//kode yang berpotensi error
            System.out.println("tidak terjadi error");
        }catch(Exception e){
            System.err.println("Terjadi error:"+e.getMessage());//statement yang dieksekusi ketika terjadi error
            //throw(e);
        }
        System.out.println("sukses");
    }
}
