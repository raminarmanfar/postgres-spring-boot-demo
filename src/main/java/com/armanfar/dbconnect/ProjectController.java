package com.armanfar.dbconnect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProjectController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ProjectRepository projectRepository;

    @GetMapping(value = "/projects")
    public List<Project> getAllProjects() {
//        Iterable<Project> projects = projectRepository.findAll();
//        List<Project> result = new ArrayList<>();
//        projects.forEach(result::add);
//        logger.info("\n\n>>>>>>>>>>>>>>>>>>> {}", result);
        List<Project> projects = new ArrayList<>();
         projectRepository.findAll().forEach(projects::add);
         return projects;
    }
}
