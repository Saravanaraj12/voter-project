package com.voter.exceptionProject;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class VoterController {
	@Autowired
	VoterService vs;
	@PostMapping("/Add")
	public String add(@RequestBody Set<Voter> v) {
		return vs.add(v);
	}

}
