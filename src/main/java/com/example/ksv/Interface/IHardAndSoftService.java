
package com.example.ksv.Interface;

import com.example.ksv.Model.HardAndSoft;
import java.util.List;


public interface IHardAndSoftService {
    public List<HardAndSoft>verHardAndSoft();
    public void crearHardAndSoft(HardAndSoft hys);
    public void borrarHardAndSoft(Long id);
    public HardAndSoft buscarHardAndSoft(Long id);
    
}
