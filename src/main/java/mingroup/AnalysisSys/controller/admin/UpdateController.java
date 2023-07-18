package mingroup.AnalysisSys.controller.admin;

import mingroup.AnalysisSys.mapper.CollegeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class UpdateController {
    @Autowired
    CollegeMapper collegeMapper;

    @GetMapping("/update/college-update-display-ad")
    protected boolean updateCollegeDisplayAd(String collegeName, boolean displayAd) {
        return collegeMapper.updateDisplayAd(collegeName, displayAd);
    }
}
