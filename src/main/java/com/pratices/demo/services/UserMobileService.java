package com.pratices.demo.services;

import com.google.zxing.WriterException;
import com.pratices.demo.modle.UserMobileDetailes;
import com.pratices.demo.qrcode.QRCodeGenerator;
import com.pratices.demo.repo.UserMobileRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.io.IOException;

@Service
public class UserMobileService {

    @Autowired
    private UserMobileRepo userMobileRepo;
    @Autowired
    QRCodeGenerator qrCodeGenerator;

    public UserMobileDetailes saveUserWithQRCode(UserMobileDetailes user) throws WriterException, IOException {
        String qrData = user.getEmail(); // Generate QR based on email or any unique field
        byte[] qrCode = QRCodeGenerator.generateQRCode(qrData, 200, 200);
        user.setQrCode(qrCode);
        return userMobileRepo.save(user);
    }
}

