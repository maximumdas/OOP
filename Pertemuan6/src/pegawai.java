class Pegawai {
    private String nama;
    Pegawai(String nama) throws Exception{
        setNama(nama);
    }


    public void setNama(String nama) throws Exception{
        for(char c : nama.toCharArray()) {
            if (Character.isDigit(c)) {
                throw new Exception("Nama tidak boleh mengandung angka");
            }
        }
        if (nama.length()>5)
            throw new Exception("Nama tidak boleh lebih dari 50 karakter");
        this.nama=nama;
    }
}
