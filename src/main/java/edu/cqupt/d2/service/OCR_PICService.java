package edu.cqupt.d2.service;

import edu.cqupt.d2.domain.OCR_PIC;

public interface OCR_PICService {
    public OCR_PIC getOCR_PICById(double id);

    public void uploadOCR_PICById(OCR_PIC pic);
}