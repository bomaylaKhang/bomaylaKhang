package main;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class TuDien_TreeMap {
	private Map<String, String> duLieu = new TreeMap<String, String>();
	
	public String themTu(String tuKhoa, String yNghia) {
		return this.duLieu.put(tuKhoa, yNghia);
	}
	
	public String xoaTu(String tuKhoa) {
		return this.duLieu.remove(tuKhoa);
	}
	
	public String traTu(String tuKhoa) {
		return this.duLieu.get(tuKhoa);
	}
	
	public void inTuKhoa() {
		Set<String> tapHopTuKhoa = this.duLieu.keySet();
		System.out.println(Arrays.toString(tapHopTuKhoa.toArray()));
	}
	
	public int inRaSoLuongTuKhoa() {
		return this.duLieu.size();
	}
	
	public void xoaTatCaTuKhoa() {
		this.duLieu.clear();
	}
	
	
	public static void main(String[] args) {
		TuDien_TreeMap tuDien = new TuDien_TreeMap();
		int luaChon = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("---------------");
			System.out.println("MENU ");
			System.out.println("Tra từ điển Anh - Việt:\n"
					+ "1. Thêm từ (Từ khóa, Ý nghĩa)\n"
					+ "2. Xóa từ\n"
					+ "3. Tìm ý nghĩa của từ khóa ⇒ Tra từ\n"
					+ "4. In ra danh sách từ khóa\n"
					+ "5. Lấy số lượng từ\n"
					+ "6. Xóa tất cả các từ khóa\n"
					+ "0. Thoát khỏi chương trình\n"
					+ "");
			luaChon = sc.nextInt();
			sc.nextLine();
			
			if(luaChon==1) {
				System.out.println("Nhập vào từ khóa: ");
				String tuKhoa = sc.nextLine();
				System.out.println("Nhập vào ý nghĩa: ");
				String yNghia = sc.nextLine();
				tuDien.themTu(tuKhoa, yNghia);
			}else if(luaChon==2 || luaChon==3) {
				System.out.println("Nhập vào từ khóa: ");
				String tuKhoa = sc.nextLine();
				if(luaChon==2) {
					tuDien.xoaTu(tuKhoa);
				}else {
					System.out.println("Ý nghĩa là: "+ tuDien.traTu(tuKhoa));
				}
			}else if(luaChon==4) {
				tuDien.inTuKhoa();
			}else if(luaChon==5) {
				System.out.println("Số lượng từ khóa là: "+ tuDien.inRaSoLuongTuKhoa());
			}else if(luaChon==6) {
				tuDien.xoaTatCaTuKhoa();
			}
		} while (luaChon!=0);
	}
}


