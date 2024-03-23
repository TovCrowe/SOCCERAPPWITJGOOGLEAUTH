package com.example.futbolbackend.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.futbolbackend.Model.TeamModel;
import com.example.futbolbackend.Service.TeamService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;


@RestController
@RequestMapping("/teams")
public class TeamController {
    private final TeamService teamService;
    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }
    @GetMapping
    public ResponseEntity<List<TeamModel>> getAllTeams(){
        List<TeamModel> teams = teamService.getAllTeams();
        return ResponseEntity.ok(teams);
    }
}


