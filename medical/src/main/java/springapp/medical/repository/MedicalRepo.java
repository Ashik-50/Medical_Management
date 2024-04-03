package springapp.medical.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springapp.medical.model.UserDetails;

@Repository
public interface MedicalRepo extends JpaRepository<UserDetails, Integer>{}