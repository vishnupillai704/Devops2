package com.example.firstproject.firstProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.ApiOperation;
@RestController
@RequestMapping("/dynamo")
public class Controller{
   @Autowired
   private DynamoRepository repository;
    @ApiOperation(value="Finds all details of Employee",
            notes="will get you all the details of employee in AWSdynamodb",
            response=Datatype.class)
    @GetMapping("/get/{id}")
    public  Datatype getemployeeid(@PathVariable("id") String id ){

        return repository.getEmployeeId(id);

    }
    @ApiOperation(value="load details of Employee",
            notes="will load details employee in AWSdynamodb",
            response=Datatype.class)
    @PostMapping("/load")
    public Datatype load(@RequestBody Datatype type ) {
        return repository.save(type) ;

    }
    @ApiOperation(value="delete details of Employee",
            notes="will delete details of employee in AWSdynamodb",
            response=Datatype.class)
    @DeleteMapping("/Delete/{id}")
    public  String Delete(@PathVariable("id") String id){
        return  repository.delete(id);
    }



}
