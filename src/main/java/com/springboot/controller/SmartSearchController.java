package com.springboot.controller;

import com.springboot.dto.BaseDTO;
import com.springboot.service.SmartSearchService;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.models.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/search")
public class SmartSearchController {

    @Autowired
    SmartSearchService smartSearchService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Map<String,Object>>> getName() {
        List<Map<String,Object>> dto = smartSearchService.getSmartSearchResults();
        return new ResponseEntity<List<Map<String,Object>>>(dto, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getEcho(@PathVariable("id") int id) {
        return new ResponseEntity<String>("String ID is Accepted", HttpStatus.OK);
    }

    @GetMapping("/search/{id}")
    /*@ApiResponses(value = {@ApiResponse(code=200,message="", response=BaseDTO.class)})*/
    public ResponseEntity<BaseDTO> getSearchEcho(@PathVariable("id") int id) {
        return new ResponseEntity<BaseDTO>(new BaseDTO(), HttpStatus.OK);
    }
}
