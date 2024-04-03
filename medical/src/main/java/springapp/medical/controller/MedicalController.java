package springapp.medical.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springapp.medical.model.UserDetails;
import springapp.medical.service.MedicalService;

import java.util.List;

@RestController
@RequestMapping("/api/user-details")
public class MedicalController {

    @Autowired
    private final MedicalService userDetailsService;

    public MedicalController(MedicalService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    @PostMapping
    public ResponseEntity<UserDetails> createUserDetails(@RequestBody UserDetails userDetails) {
        UserDetails createdUserDetails = userDetailsService.createUserDetails(userDetails);
        return new ResponseEntity<>(createdUserDetails, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserDetails> updateUserDetails(@PathVariable int id, @RequestBody UserDetails userDetails) {
        UserDetails updatedUserDetails = userDetailsService.updateUserDetails(id, userDetails);
        return new ResponseEntity<>(updatedUserDetails, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDetails> getUserDetailsById(@PathVariable int id) {
        UserDetails userDetails = userDetailsService.getUserDetailsById(id);
        return new ResponseEntity<>(userDetails, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<UserDetails>> getAllUserDetails() {
        List<UserDetails> userDetailsList = userDetailsService.getAllUserDetails();
        return new ResponseEntity<>(userDetailsList, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUserDetails(@PathVariable int id) {
        userDetailsService.deleteUserDetails(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}