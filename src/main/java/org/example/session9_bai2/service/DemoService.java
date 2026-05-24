package org.example.session9_bai2.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    private static final Logger logger = LoggerFactory.getLogger(DemoService.class);


    public void checkDiscountCode(String userId, String code) {
        if (code.equals("VIP")) {
            logger.info("Áp dụng thành công cho user: {}", userId);
        } else if (code.equals("EXPIRED")) {
            logger.warn("Mã giảm giá đã hết hạn: {}", code);
        } else {
            logger.error("Lỗi mất kết nối DB khi check mã: {}", code);
        }
    }
}