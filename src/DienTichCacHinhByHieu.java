
public class DienTichCacHinhByHieu {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Nhập độ dài cạnh của hình vuông:");//Doan 1
	        double canh = scanner.nextDouble();
	        double dienTichHinhVuong = tinhDienTichHinhVuong(canh);
	        System.out.println("Diện tích của hình vuông là: " + dienTichHinhVuong);
	        
	        System.out.println("Nhập bán kính của hình tròn:");
	        double banKinh = scanner.nextDouble();
	        double dienTichHinhTron = tinhDienTichHinhTron(banKinh);
	        System.out.println("Diện tích của hình tròn là: " + dienTichHinhTron);
	        
	        System.out.println("Nhập chiều dài của hình chữ nhật:");
	        double chieuDai = scanner.nextDouble();
	        System.out.println("Nhập chiều rộng của hình chữ nhật:");
	        double chieuRong = scanner.nextDouble();
	        double dienTichHinhChuNhat = tinhDienTichHinhChuNhat(chieuDai, chieuRong);
	        System.out.println("Diện tích của hình chữ nhật là: " + dienTichHinhChuNhat);
	        
	        scanner.close();
	    }
	    
	    public static double tinhDienTichHinhVuong(double canh) {
	        return canh * canh;
	    }
	    
	    public static double tinhDienTichHinhTron(double banKinh) {
	        return banKinh * banKinh;
	    }
	    
	    public static double tinhDienTichHinhChuNhat(double chieuDai, double chieuRong) {
	        return chieuDai * chieuRong;
	    }
}
