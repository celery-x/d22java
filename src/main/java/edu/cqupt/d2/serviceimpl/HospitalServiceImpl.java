package edu.cqupt.d2.serviceimpl;

import edu.cqupt.d2.dao.HospitalMapper;
import edu.cqupt.d2.domain.Hospital;
import edu.cqupt.d2.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("hospitalService")
public class HospitalServiceImpl implements HospitalService {
    @Autowired
    private HospitalMapper hospitalMapper;

    public Hospital getHospitalById(String id) {
        // TODO Auto-generated method stub
        return hospitalMapper.selectByPrimaryKey(id);
    }

    public HospitalMapper getHospitalMapper() {
        return hospitalMapper;
    }

    public void setHospitalMapper(HospitalMapper hospitalMapper) {
        this.hospitalMapper = hospitalMapper;
    }

}