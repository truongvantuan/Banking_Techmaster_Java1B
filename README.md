# Bài kiểm tra kết thúc module Java Core
Đề bài: Thiết kế ứng dụng ngân hàng mô phỏng các chức năng tạo tài khoản, nạp/rút tiền, tài khoản gửi/vay, tất toán khoản gửi/vay, ...
# Plugins - Tools sử dụng
- Maven : build và quản lý Dependency
- [Plantuml](https://plantuml.com/) : plugin tạo diagram
# Mô tả chức năng, hoạt động ứng dụng
- Lấy code về
```
git clone https://github.com/truongvantuan/Banking_Techmaster_Java1B.git 
```
- compile lại code
```
mvn clean
mvn compiler:compile
```

1. Menu  - chọn chức năng với số tương ứng

![menu](images/1.png)

- Tạo tài khoản: tạo mới tài khoản với tên và số CMND, tài khoản đã có báo "Tài khoản đã được tạo!"

![show info](images/2.png)
- Lịch sử giao dịch: xem thông tin thay đổi tài khoản, tiền nạp/rút, các giao dịch làm biến động số dư.

![log](images/3.png)
2. Mở tài khoản tiết kiệm

Mỗi tài khoản có thể mở nhiều tài khoản tiếp kiệm. Với tùy chọn số tiền gửi, kỳ hạn gửi và số tiền gửi góp vào hàng tháng tiếp theo.

![saving-account](images/4.png)
