package springapp.medical.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springapp.medical.model.UserDetails;
import springapp.medical.repository.MedicalRepo;

import java.util.List;
import java.util.Optional;

@Service
public class MedicalService {

    @Autowired
    private final MedicalRepo medicalRepo;

    public MedicalService(MedicalRepo medicalRepo) {
        this.medicalRepo = medicalRepo;
    }

    public UserDetails createUserDetails(UserDetails userDetails) {
        return medicalRepo.save(userDetails);
    }

    public UserDetails updateUserDetails(int id, UserDetails userDetails) {
        userDetails.setid(id);
        return medicalRepo.save(userDetails);
    }

    public UserDetails getUserDetailsById(int id) {
        Optional<UserDetails> userDetailsOptional = medicalRepo.findById(id);
        return userDetailsOptional.orElse(null);
    }

    public List<UserDetails> getAllUserDetails() {
        return medicalRepo.findAll();
    }

    public void deleteUserDetails(int id) {
        medicalRepo.deleteById(id);
    }
}