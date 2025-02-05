package com.example.futbolbackend.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.futbolbackend.Model.TeamModel;
import com.example.futbolbackend.Repository.TeamRepository;

@Service 
public class TeamService {
    private final TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;    
    }

    public List<TeamModel> getAllTeams() {
        
        return teamRepository.findAll();
    }
    
}
