package edu.cqupt.d2.serviceimpl;

import edu.cqupt.d2.dao.ThirdMapper;
import edu.cqupt.d2.domain.Third;
import edu.cqupt.d2.service.ThirdService;
import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Transactional(propagation = Propagation.REQUIRES_NEW)
@Service("thirdService")
public class ThirdServiceImpl implements ThirdService {
    @Autowired
    private ThirdMapper thirdMapper;

    public Third getThirdByUID(String id) {
        // TODO Auto-generated method stub
        return thirdMapper.selectByUID(id);
    }

    public Third getThirdByTID(String id) {
        // TODO Auto-generated method stub
        return thirdMapper.selectByPrimaryKey(id);
    }

    @Override
    public void saveThird(Third third) {
        thirdMapper.InsertThird(third);
        thirdMapper.updateUserThird(third.getThird_Info_uid(),third.getUID());
    }


    public ThirdMapper getThirdMapper() {
        return thirdMapper;
    }

    public void setThirdMapper(ThirdMapper thirdMapper) {
        this.thirdMapper = thirdMapper;
    }

}