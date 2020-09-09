package edu.cqupt.d2.service;

import edu.cqupt.d2.domain.Third;

public interface ThirdService {
    public Third getThirdByUID(String uid);

    public Third getThirdByTID(String tid);

    public void saveThird(Third third);


}