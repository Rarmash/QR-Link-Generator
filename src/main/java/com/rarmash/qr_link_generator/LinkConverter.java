package com.rarmash.qr_link_generator;

import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

public class LinkConverter {
    private static final int size = 40;

    public static void convertLink(String url) {
        try {
            QRCodeWriter qrCodeWriter = new QRCodeWriter();
            BitMatrix bitMatrix = qrCodeWriter.encode(url, com.google.zxing.BarcodeFormat.QR_CODE, size, size);

            for (int i = 0; i < size; i++) {
                StringBuilder line = new StringBuilder();
                for (int j = 0; j < size; j++) {
                    if (bitMatrix.get(j, i)) {
                        line.append("██");
                    } else {
                        line.append("  ");
                    }
                }
                System.out.println(line);
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}
