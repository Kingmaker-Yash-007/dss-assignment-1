package com.server.application.controller;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import com.server.application.model.ResortData;
import com.server.application.repository.ResortRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;
import java.util.List;

@RestController

@CrossOrigin(origins = "http://localhost:3000")
public class PostController {
    @Autowired
    private ResortRepository resortRepository;

    @ApiIgnore
    @RequestMapping(value="/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }


    @GetMapping("/allPosts")
    public List<ResortData> getAllPosts() {
        return resortRepository.findAll();
    }

    @PostMapping("/post")
    public ResortData addPost(@RequestBody ResortData post) {
        return resortRepository.save(post);
    }
}
