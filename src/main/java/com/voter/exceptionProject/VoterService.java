package com.voter.exceptionProject;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
@Service
public class VoterService {
	@Autowired
	VoterRepo vr;

	public String add(Set<Voter> v) {
		// TODO Auto-generated method stub
		
		Set<Voter> s=v.stream()
				
				.filter(x->x.getAge()>=18)
				
				.collect(Collectors.toSet());
		for(Voter w:s) {
			vr.save(w);
			return "for loop saved";
		}
		
		v.forEach(x->{
		if(x.getAge()<18) {
		 throw new AgeNotValid("Age is less than 18",HttpStatus.ACCEPTED);
		}
		return;
		});
		return "Data saved";
		
		

//		for(Voter q:v) {
//			if(q.getAge()>=18) {
//				vr.saveAll(v);
//				return "saved";
//			}
//			else {
//				throw new AgeNotValid("Age is not above 18",HttpStatus.NOT_ACCEPTABLE);
//
//				
//			}
//		}
//		return "saved succly";
//
	}

}
