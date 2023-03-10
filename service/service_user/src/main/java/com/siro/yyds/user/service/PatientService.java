package com.siro.yyds.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.siro.yyds.model.user.Patient;

import java.util.List;

/**
 * @author starsea
 * @date 2022-02-05
 */
public interface PatientService extends IService<Patient> {

    /**
     * 获取就诊人列表
     * @param userId
     * @return
     */
    List<Patient> findAllUserId(Long userId);

    /**
     * 根据id获取就诊人信息
     * @param id
     * @return
     */
    Patient getPatientId(Long id);
}
