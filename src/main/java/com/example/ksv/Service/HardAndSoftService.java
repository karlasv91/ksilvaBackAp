
package com.example.ksv.Service;

import com.example.ksv.Interface.IHardAndSoftService;
import com.example.ksv.Model.HardAndSoft;
import com.example.ksv.Repository.HardAndSoftRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HardAndSoftService implements IHardAndSoftService {
    @Autowired HardAndSoftRepository hardAndSoftRepo;

    @Override
    public List<HardAndSoft> verHardAndSoft() {
       List<HardAndSoft> hys = hardAndSoftRepo.findAll();
       return hys;
    }

    @Override
    public void crearHardAndSoft(HardAndSoft hys) {
       hardAndSoftRepo.save(hys);
    }

    @Override
    public void borrarHardAndSoft(Long id) {
       hardAndSoftRepo.deleteById(id);
    }

    @Override
    public HardAndSoft buscarHardAndSoft(Long id) {
       HardAndSoft hys = hardAndSoftRepo.findById(id).orElse(null);
       return hys;
    }
    
    
}
