package org.backend.only_beauty.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@CrossOrigin
@RequestMapping(value = "/admin")

public class AdminController {
    @PostMapping("addBeautyItem")
    public ResponseEntity<?> addBeautyItem() {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
