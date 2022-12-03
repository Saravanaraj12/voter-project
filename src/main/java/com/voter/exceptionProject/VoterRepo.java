package com.voter.exceptionProject;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface VoterRepo extends CrudRepository<Voter,Integer> {

}
