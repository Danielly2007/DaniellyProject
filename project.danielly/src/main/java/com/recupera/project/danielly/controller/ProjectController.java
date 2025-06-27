package com.recupera.project.danielly.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.recupera.project.danielly.domain.User;
import com.recupera.project.danielly.service.ProjectService;

@RestController
@RequestMapping("entrar")
public class ProjectController {
	
	@Autowired
    private ProjectService projectService;

	@GetMapping
    public String project() {
        return projectService.project(" professora Fiama");
    }
	
	@PostMapping("/{id}")
    public String projectPost(@PathVariable ("id") String id,@RequestParam(value = "filter", defaultValue = "nenhuma") String filter, @RequestBody User body) {
        return "Bem Vinda " + body.getName() + " " + body.getEmail() + id + filter;
    }

}
