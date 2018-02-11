package com.aowin.service.impl;

import com.aowin.dao.VenderMapper;
import com.aowin.pojo.Vender;
import com.aowin.service.VenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VenderServiceImpl implements VenderService {

    @Autowired
    VenderMapper venderMapper;

    @Override
    public List<Vender> findAllVenders() {
        return venderMapper.findAllVenders();
    }
}
