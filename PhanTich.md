# Phân tích: Phân loại Log Levels

- Thành công -> INFO: `logger.info("Áp dụng thành công cho user: {}", userId);`
- Người dùng nhập sai mã/mã hết hạn -> WARN: `logger.warn("Mã giảm giá đã hết hạn: {}", code);`
- Lỗi chết logic/database -> ERROR: `logger.error("Lỗi mất kết nối DB khi check mã: {}", code);`