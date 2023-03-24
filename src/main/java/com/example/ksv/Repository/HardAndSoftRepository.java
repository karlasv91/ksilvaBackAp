
package com.example.ksv.Repository;

import com.example.ksv.Model.HardAndSoft;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HardAndSoftRepository extends JpaRepository<HardAndSoft, Long> {
    
}
