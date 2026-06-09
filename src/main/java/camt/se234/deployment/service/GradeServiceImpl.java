package camt.se234.deployment.service;

import camt.se234.deployment.entity.Grade;
import org.springframework.stereotype.Service;

@Service
public class GradeServiceImpl implements GradeService {
    @Override
    public String getGrade(double score) {
        if (score > 85.0) {
            return "A";
        }
        else if (score > 75.0){
            return "B";
        }else if (score > 65.0){
            return "C";
        }else if (score > 50.0) {
            return "D";
        } else
            return "F";
    }
}// This is a test comment to trigger DeepSource scan
