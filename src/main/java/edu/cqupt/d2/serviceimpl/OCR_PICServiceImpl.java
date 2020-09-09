package edu.cqupt.d2.serviceimpl;

import edu.cqupt.d2.dao.OCR_PICMapper;
import edu.cqupt.d2.domain.OCR_PIC;
import edu.cqupt.d2.service.OCR_PICService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("oCR_PICService")
public class OCR_PICServiceImpl implements OCR_PICService {
    @Autowired
    private OCR_PICMapper ocr_picMapper;

    @Override
    public OCR_PIC getOCR_PICById(double id) {
        // TODO Auto-generated method stub
        return ocr_picMapper.selectByPic_ID(id);
    }
    @Override
    public void uploadOCR_PICById(OCR_PIC pic) {
        ocr_picMapper.insertPic(pic);
    }
    public OCR_PICMapper getOCR_PICMapper() {
        return ocr_picMapper;
    }

    public void setOCR_PICMapper(OCR_PICMapper ocr_picMapper) {
        this.ocr_picMapper = ocr_picMapper;
    }

}