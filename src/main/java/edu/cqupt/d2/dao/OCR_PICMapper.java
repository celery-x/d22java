package edu.cqupt.d2.dao;

import edu.cqupt.d2.domain.OCR_PIC;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface OCR_PICMapper {

    OCR_PIC selectByPic_ID(double picID);

    void insertPic(OCR_PIC pic);

}