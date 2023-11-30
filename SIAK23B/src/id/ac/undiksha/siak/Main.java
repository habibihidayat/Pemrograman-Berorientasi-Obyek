package id.ac.undiksha.siak;

import id.ac.undiksha.siak.people.Mahasiswa;
import id.ac.undiksha.siak.people.Dosen;


public class Main {
	
	public static void main(String[] args) { //TODO
		
		Mahasiswa ani = new Mahasiswa();
		
		ani.setNim("12345");
		ani.setNama("Ani");
		ani.setAlamat("Singaraja");
		ani.setTanggalLahir("1 Januari 2000");
		ani.setJenisKelamin(true);
		ani.setProdi("Ilmu Komputer");
		
		Dosen andre = new Dosen();
		
		andre.setNidn("445566");
		andre.setNama("Aby");
		andre.setAlamat("Negara");
		andre.setTanggalLahir("25 September 1979");
		andre.setJenisKelamin(false);
		andre.setMatakuliah("Pemrograman Berorientasi Objek");
		
		
		
		System.out.println (ani.getNim());
		System.out.println (ani.getNama());
		System.out.println (ani.getAlamat());
		System.out.println (ani.getTanggalLahir());
		System.out.println (ani.getJenisKelamin());
		System.out.println (ani.getProdi());
		
		
		System.out.println (andre.getNidn());
		System.out.println (andre.getNama());
		System.out.println (andre.getAlamat());
		System.out.println (andre.getTanggalLahir());
		System.out.println (andre.getJenisKelamin());
		System.out.println (andre.getMatakuliah());
		
		
	}
}