package com.example.futbolbackend.Repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.example.futbolbackend.Model.TeamModel;

public interface TeamRepository extends JpaRepositoryImplementation<TeamModel, Long>{
    
}
