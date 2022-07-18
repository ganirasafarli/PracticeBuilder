package com.example.practicebuilder.controller;

import com.example.practicebuilder.dto.UserInfo;
import com.example.practicebuilder.service.BuilderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/builder")
@RequiredArgsConstructor
public class BuilderController {

    private final BuilderService builderService;

    @GetMapping("/improvement/{fin}")
    public ResponseEntity<UserInfo> getData(@PathVariable String fin) {
        return ResponseEntity.ok(builderService.getData(fin));
    }
}
