package spring_boot_postgres.controller;

import spring_boot_postgres.model.Candidate;
import spring_boot_postgres.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/candidates")
public class CandidateController {

    private final CandidateService candidateService;

    @Autowired
    public CandidateController(CandidateService candidateService) {
        this.candidateService = candidateService;
    }

    @RequestMapping(path = "/summary", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Map<String, List<Candidate>>> candidateSummary() {
        List<Candidate> candidateList = candidateService.findAll();
        return new ResponseEntity<>(Collections.singletonMap("candidates", candidateList), HttpStatus.OK);
    }

}
