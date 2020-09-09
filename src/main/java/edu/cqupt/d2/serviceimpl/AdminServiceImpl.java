package edu.cqupt.d2.serviceimpl;

import edu.cqupt.d2.dao.AdminMapper;
import edu.cqupt.d2.domain.Admin;
import edu.cqupt.d2.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("adminService")
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;

    public Admin getAdminById(String id) {
        // TODO Auto-generated method stub
        return adminMapper.selectByPrimaryKey(id);
    }


    public AdminMapper getAdminMapper() {
        return adminMapper;
    }

    public void setAdminMapper(AdminMapper adminMapper) {
        this.adminMapper = adminMapper;
    }

}