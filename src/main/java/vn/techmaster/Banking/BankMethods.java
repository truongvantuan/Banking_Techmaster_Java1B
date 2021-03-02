package vn.techmaster.Banking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BankMethods {


    /**
     * Hàm tính ngày, tháng giữ 2 khoảng thời dateCreated và now
     * trả về mảng int[2] elapsedTime trong đó elapsedTime[0] = ngày, elapsedTime[1] = tháng
     * Sử dụng để tính tiền khi tất toán tài khoản ngân hàng
     */
    public static int[] getTimeElapsed(Date dateCreated, Date now) {
        int[] elapsedTime = new int[2];
        long timeElapsed = now.getTime() - dateCreated.getTime();
        long totalHours = timeElapsed / 3600000;
        int monthElapsed = (int) totalHours / (30 * 24);
        int dayElapsed = (int) (totalHours - (monthElapsed * 30 * 24)) / 24;
        elapsedTime[0] = dayElapsed;
        elapsedTime[1] = monthElapsed;
        return elapsedTime;
    }

    /**
     * Sử dụng Math.random() tạo ngẫu nhiên chuỗi 13 số
     * định dạng 1681000****** (cho giống format ngân hàng) làm số thẻ ngân hàng
     */
    public static String generateAccNumber() {
        StringBuilder str = new StringBuilder("1681000");
        for (int i = 0; i < 6; i++) {
            str.append((char) ('0' + Math.random() * ('9' - '0' + 1)));
        }
        return str.toString();
    }
    /**
     * Hàm in ra  đầu bảng (head table) lịch sử giao dịch
     */
    public static void printTransactionActivityHead() {
        System.out.printf("%65s", "-------------------------------\n");
        System.out.printf("%58s", "Lịch sử giao dịch\n");
        System.out.printf("%65s", "-------------------------------\n");
        System.out.printf("%20s%15s%15s%15s%35s\n", "Ngày        ", "Loại  ", "Biến động ", "Số dư    ", "Nội dung           ");
    }

    /**
     * Hàm in ra  đầu bảng (head table) thông tin TK tiết kiệm
     */
    public static void printSavingAccountStatementHead() {
        System.out.println("-------------------------------------------");
        System.out.println("        Thông Tin Tài Khoản Tiết Kiệm      ");
        System.out.println("-------------------------------------------");
    }

    /**
     * Hàm in ra menu chính cho chọn chức năng
     */
    public static void printMainMenu() {
        System.out.println("\n");
        System.out.println("                                          MAIN MENU                                      ");
        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.printf("%28s%38s%33s", "Tài Khoản Giao Dịch", "Tài Khoản Tiết Kiệm", "Tài Khoản Vay\n");
        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.printf("%-25s%-23s%-25s%25s", "11: Tạo Tài Khoản", "14: Xem thông tin", "21: Gửi Tiết Kiệm", "31: Vay Tiền\n");
        System.out.printf("%-25s%-23s%-25s%25s", "12: Rút tiền", "15: Lịch sử giao dịch", "22: Tính lãi", "32: Xem thông tin\n");
        System.out.printf("%-25s%-23s%-25s%25s", "13: Nạp tiền", "", "23: Xem thông tin", "33: Tất toán khoản vay\n");
        System.out.printf("%-25s%-23s%-25s%25s", "0: Thoát", "", "24: Tất toán tiền gửi", "34: Tính lãi vay\n");
        System.out.println();
        System.out.print("Chọn chức năng: ");
    }

    /**
     * Hàm trả về định dạng thời gian dd-MM-yyy từ object Date
     * dùng hiển thị ngày tạo tài khoản
     */
    public static String convertDate(java.util.Date date) {
        String format = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.format(date);
    }
    
    /**
     * Hàm trả về định dạng thời gian chi tiết HH:mm:ss dd-MM-yyy từ object Date
     * dùng hiển thị chi tiết ngày giờ thực hiện giao dịch
     */
    public static String convertDetailDate(java.util.Date date) {
        String format = "HH:mm:ss dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.format(date);
    }

    /**
     * Tạo instance Date mong muốn từ String thời gian cho trước
     * dùng định này tạo tài khoản trong quá khứ để test chức năng tất toán
     */
    public static Date parseDate(String date) {
        try {
            return new SimpleDateFormat("HH:mm:ss dd-MM-yyyy").parse(date);
        } catch (ParseException e) {
            return null;
        }
    }
    
    /**
     * Hàm tạm dừng màn hình console để xem thông tin
     */
    public static void pressEnter() {
        System.out.print("Press \"ENTER\" to continue...");
        Scanner input = new Scanner(System.in);
        input.nextLine();
    }
}
